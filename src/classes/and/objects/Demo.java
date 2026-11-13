package classes.and.objects;

public class Demo {

    public int aaa =100; // non-static variable - this requires object
    public static int bbb = 200; // static variable - this does not requires object

    public void demo1(){ // if non static method then we can use both static and non static variables/methods inside it
        aaa=300;
        bbb=700;
        System.out.println("non-static method demo1 - inside Demo class");
    }

    public static void demo2(){// if static method then we can use only static variables/methods inside it
        // aaa=400; since it is non static we cannot use here
        bbb=700;
        System.out.println("static method demo2 - inside Demo class");
    }
}
