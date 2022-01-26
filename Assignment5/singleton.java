package JavaAssignments.Assignment5;

public class singleton {
    String str;
    public static singleton staticMethod(String s){
       // str=s; cannot initialize non static member from static context
       singleton obj=new singleton();
        obj.str=s;
        return obj;
    }
    public  void printString(){
        System.out.println("class member stringVar: "+str);
    }
    public static void main(String[] args) {
        singleton s=staticMethod("abc");
        s.printString();
    }
}