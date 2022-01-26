package JavaAssignments.Assignment10;

public class MainClass {
    public static void main(String[] args) {
        SList list=new SList();
        SListIterator sListIterator = list.iterator();
        for(int i=10;i<=20;i++){
            sListIterator.append(i);
        }
        sListIterator.display();
        sListIterator.remove(2);
        sListIterator.display();
//  CapGemini - 4
//  wipro -  3.5
//  cognizant - 4  - 25k joining bonus

    }
}