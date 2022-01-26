package JavaAssignments.Assignment10;

public class SListIterator {
    Node root;
    void append(int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
        }
        else{
            Node temp=root;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    void remove(int position){
        int cnt=0;
        Node temp=root;
        while(cnt<position-1){
            temp=temp.next;
            cnt++;
        }
        temp.next=temp.next.next;
    }
    void display(){
        Node temp=root;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println();
    }
}