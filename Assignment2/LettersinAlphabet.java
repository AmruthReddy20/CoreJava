package JavaAssignments.Assignment2;
import java.util.Scanner;
public class LettersinAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isContainsAllLetters(s.toCharArray()));
    }
    static  boolean isContainsAllLetters(char[] alpha){
        boolean ch[]= new boolean[26];
        for(char character:alpha){
            if (character>= 'a' && character <= 'z'){
                ch[character-'a']=true;
            }
           else {
                ch[character-'A']=true;
            }
        }
        for(boolean b:ch){
            if(!b)
                return false;
        }
        return true;
    }
}

// Time Complexity : O(n) :- Always iterates through the length of string
// Space Complexity : O(1) :- No extra space used which increases with input size