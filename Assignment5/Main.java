package JavaAssignments.Assignment5;

public class Main {
    public static void main(String[] args) {
        data d=new data();
       d.print();
       d.printLocalVariables();
       singleton s=singleton.staticMethod("Hello");
       s.printString();
    }
}
