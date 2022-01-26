package JavaAssignments.Assignment7;
interface I1{
    public void m1();
    public void m2();
}
interface I2{
    public void m3();
    public void m4();
}
interface I3{
    public void m5();
    public void m6();
}
interface combine extends I1,I2,I3{
    public void method();
}
class ConcreteClass{
    public void methodinConcreteClass(){
         System.out.println("Iam a concrete class Method")
    }
}
class ImplementationClass extends  ConcreteClass implements  combine {
    @Override
    public void m1() {
        System.out.println("");
    }
    @Override
    public void m2() {

    }
    @Override
    public void m3() {

    }
    @Override
    public void m4() {

    }
    @Override
    public void m5() {

    }
    @Override
    public void m6() {

    }

    @Override
    public void method() {

    }
}
public class InterfaceImplementation  implements  {
    public static void main(String[] args) {

    }
}
