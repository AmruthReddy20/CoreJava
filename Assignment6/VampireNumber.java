package JavaAssignments.Assignment6;
import java.util.*;
public class VampireNumber {
    private static boolean findFactors(long originalNumber, long factor1, long factor2)
    {
        if(Long.toString(factor1).endsWith("0") && Long.toString(factor2).endsWith("0")) return false;
        int originalNumberLength = numberOfDigits(originalNumber);
        if(numberOfDigits(factor1) != originalNumberLength / 2 || numberOfDigits(factor2) != originalNumberLength / 2) return false;
        byte[] originalNumberBytes = Long.toString(originalNumber).getBytes();
        byte[] factorBytes = (Long.toString(factor1) + Long.toString(factor2)).getBytes();
        Arrays.sort(originalNumberBytes);
        Arrays.sort(factorBytes);
        return Arrays.equals(originalNumberBytes, factorBytes);
    }
    private static int numberOfDigits(long num)
    {
        return Long.toString(Math.abs(num)).length();
    }
    public static void main(String[] args)
    {
        HashSet<Long> vampireNumbers = new HashSet<Long>();
        for(long number = 10; vampireNumbers.size() <= 99; number++ )
        {
            if((numberOfDigits(number) % 2) != 0)
            {
                number = number * 10 - 1;
                continue;
            }
            for(long i = 2; i <= Math.sqrt(number) + 1; i++)
            {
                if(number % i == 0)
                {
                    long j = number / i;
                    //checking if i and j are correct vampire numbers for number in findFactors method
                    if(findFactors(number, i, j) && i <= j)
                    {
                        vampireNumbers.add(number);
                        System.out.println(number + ": [" + i + ", " + j +"]");
                    }
                }
            }
        }
    }
}