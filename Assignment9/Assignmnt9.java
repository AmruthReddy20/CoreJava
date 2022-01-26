package JavaAssignments.Assignment9;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
public class Assignmnt9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
         if(check(str))
             System.out.print("The string begins with a capital letter and ends with a period");
         else
             System.out.print("The string doesnt begin with a capital letter or ends with a period");
    }

    private static boolean check(String str) {
        Pattern p=Pattern.compile("^[A-Z].*\\.$");
        Matcher m=p.matcher(str);
       return m.matches();
    }
}