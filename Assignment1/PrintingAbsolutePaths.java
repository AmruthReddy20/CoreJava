package JavaAssignments.Assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintingAbsolutePaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        File f=new File("/Home");
        File[] list=f.listFiles(); // list of files in home directory
        while(true) {
            System.out.println("Enter the Regular Expression( Enter ### to stop ):");
            String reg = sc.next();
            if (reg.equals("###"))
                break;
            Pattern p=Pattern.compile(reg);
            for(File file:list){
                Matcher m=p.matcher(file+"");
                if(m.matches())  // matching regular expression
                    System.out.println(file.getAbsolutePath());
            }
        }
    }
}
