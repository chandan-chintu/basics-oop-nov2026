package polymorphsim.examples;

public class MainPolymorphismExample {
    public static void main(String[] args) {
        // method overloading example

        PerformSum ps = new PerformSum();
        ps.sum(2,3);
        ps.sum(4,5,6);
        ps.sum(2.34,5);
        ps.sum(5.67f,7);
        ps.sum(5.66,2.34);
        ps.sum(5.23f,3.44f);
        ps.sum(4.35f,4.33);
    }
}
