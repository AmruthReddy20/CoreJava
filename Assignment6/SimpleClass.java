package JavaAssignments.Assignment6;

public class SimpleClass {
    public  SimpleClass(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        SimpleClass[] array=new SimpleClass[3];
     // They are not printed if array is not initialized
        array[0]=new SimpleClass("Hello");
        array[1]=new SimpleClass("Hello 1");
        array[2]=new SimpleClass("Hello 2");
        // After initialization they are printed
    }
}
