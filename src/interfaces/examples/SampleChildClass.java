package interfaces.examples;

public class SampleChildClass implements SampleInterface, DemoInterface{
    @Override
    public void sample1() {
        System.out.println("a is : "+SampleInterface.a);
        System.out.println("b is : "+SampleInterface.b);
        System.out.println("c is : "+SampleInterface.c);
        System.out.println("d is : "+SampleInterface.d);
        System.out.println("e is : "+SampleInterface.e);
        System.out.println("sample1 implementation inside sample child class");
    }

    @Override
    public void sample2() {
        System.out.println("sample2 implementation inside sample child class");
    }

    @Override
    public void sample3() {
        System.out.println("sample3 implementation inside sample child class");
    }

    @Override
    public void general() {

    }
}
