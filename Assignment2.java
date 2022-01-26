package JavaAssignments.CoreJava;

public class Assignment2 {
    public static void main(String[] args) {
        try {
            ExceptionsMethod();
        }
        catch(Exception e){
            System.out.println("Exception is Found ");
        }
        finally {
            System.out.println("Excecuting  Finally clause");
        }
    }
  public static void ExceptionsMethod(){
        int a=12/0; // Arithmetic Exception
      String str1=null;
      System.out.print(str1.charAt(0)); // Null Pointer Exception
      String str2 = "This is like chipping "; // length is 22
      char c = str2.charAt(24); // accessing 25th element
      System.out.println(c);  // StringIndexOutOfBoundsException
  }
}
