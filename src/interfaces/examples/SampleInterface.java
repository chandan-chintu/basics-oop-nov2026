package interfaces.examples;

public interface SampleInterface {

    public int a =100; // public static final int a=100;
    public static int b=200; // public static final int b=200;
    public final int c=300; // public static final int c=300;
    int d=400; // public static final int =400;
    public static final int e=500;

    //    private int pqr=600; not allowed
//    protected int xyz=800; not allowed

    public void sample1();//public abstract void sample1();
    public abstract void sample2();
    void sample3();// public abstract void sample3();

    private void sample4(){
        System.out.println("I am private method and here to give info like blueprint");
    }

    public void general();
}
