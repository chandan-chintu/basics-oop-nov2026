package classes.and.objects;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello all, welcome to Spring 1 module!!");

        Student student1 = new Student();
        System.out.println("student1 before assigning values is : "+student1);

        //assigning values
        student1.id=101;
        student1.name="Ajay K";
        student1.grade="7th grade";
        student1.email="ajay@gmail.com";
        student1.dob="12/12/2015";

        System.out.println("student1 after assigning values is : "+student1);

        // parameterized constructor
        Student student2 = new Student(123,"Vijay","vijay@gmail.com","12/12/2012","8th grade");
        System.out.println("student2 is : "+student2);

        //static examples
        Demo d1 = new Demo();
        System.out.println("aaa is : "+d1.aaa);
        System.out.println("bbb is : "+Demo.bbb);

        d1.demo1();
        Demo.demo2();

        // final example
         final int abc =200;
        int pqr = 300;

        System.out.println("abc and pqr is : "+abc+"---"+pqr);
        //abc =500; // cannot change as it is final variable and it is fixed
        pqr=900;

        final String DELIVERED ="Delivered";

        // once order completed
        String orderStatus = DELIVERED;
    }
}
