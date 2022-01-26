package JavaAssignments.Assignment5;

public class data {
    int val;
    char character;
    public void print(){
        System.out.println("integer variable: "+val);
        System.out.println("character variable: "+character);
        // There is default initialization for instance variables
    }
    public void printLocalVariables() {
        int localVar1, localVar2;

/*
        System.out.println("integer variable: "+localVar1);
        System.out.println("character variable: "+localVar2);
      Local variables have to be initialized in java . There is no default value for these in java.

 */
    }
      public static  void main(String[] args){
            data obj=new data();
            obj.print();
            obj.printLocalVariables();
        }
}