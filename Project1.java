package JavaAssignments.CoreJava;
import  java.util.*;
public class Project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
       a=sc.nextDouble();
       b=sc.nextDouble();
       c=sc.nextDouble();
        double avg=(a+b+c)/3.0;
        System.out.println("Average of three nums : " + avg);
    }
}

