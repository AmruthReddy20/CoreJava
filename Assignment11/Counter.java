package JavaAssignments.Assignment11;
import java.io.*;
import java.util.*;
public class Counter {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            File input=new File(args[0]);
            File output=new File("Assignment11/file2.txt");
            Scanner scan=new Scanner(input);
            PrintWriter pw=new PrintWriter(output);
            Map<Character,Integer> h=new HashMap<>();
            while(scan.hasNextLine()){
               String str= scan.nextLine();
                for(char i:str.toCharArray()){
                    h.put(i,h.getOrDefault(i,0)+1);
                }
            }
            for(char c:h.keySet()){
                pw.println(c+"->"+h.get(c));
            }
            scan.close();
            pw.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}