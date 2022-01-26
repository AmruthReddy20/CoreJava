package JavaAssignments.Assignment6;

public class OverLoadingConstructors {
    public OverLoadingConstructors(){
      this("Hello!!!");
    }
    public OverLoadingConstructors(String str){
        System.out.print(str);
    }
    public static void main(String[] args) {
      OverLoadingConstructors o=new OverLoadingConstructors();
    }
}

