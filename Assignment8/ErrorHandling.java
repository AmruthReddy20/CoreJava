package JavaAssignments.Assignment8;

public class ErrorHandling {
    public static void main(String[] args) {
        try {
            method();
        }
        catch (Exception e){  // Exception handles all types of Exceptions
           e.printStackTrace();
        }
        finally {
            System.out.println("Finally Clause is Excecuted");
        }
    }

    private static void method() {
         int k=5/0;
         /*Since I'm dividing an integer with 0
          * it should throw ArithmeticException
          */
        int arr[] ={1,2,3,4,5};
        /* My array has only 5 elements but we are trying to
         * display the value of 8th element. It should throw
         * ArrayIndexOutOfBoundsException
         */
        System.out.println(arr[7]);
        String str="abc";
        System.out.println(str.charAt(4));
        /* My string length is 3 but Iam accessing 4 th index
           so it shows string index out of bounds Exception
         */
    }

}
