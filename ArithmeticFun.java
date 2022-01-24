package General;

public class ArithmeticFun
{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int result=+b;
        int diff=a-b;
        int pro=a*b;
        int quo=a/b;
        int rem=a%b;
        System.out.println("result is "+result);
        System.out.println("difference is "+diff);
        System.out.println("Product is "+ pro);
        System.out.println("Quotient is "+quo);
        System.out.println("remainder is "+rem);
        result++;
        System.out.println("result is "+result);
        result--;
        System.out.println("result is "+result);
        result*=2;
        System.out.println("result is "+result);
    }
}
