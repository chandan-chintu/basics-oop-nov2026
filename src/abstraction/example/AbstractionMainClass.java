package abstraction.example;

public class AbstractionMainClass {
    public static void main(String[] args) {

        //AbstarctionDemo abstarctionDemo = new AbstarctionDemo();
        //we cannot create object for abstract classes, we have to create object for child classes and use them

        AbstractionChildClass abstractionChildClass = new AbstractionChildClass();
        abstractionChildClass.demo1();
        abstractionChildClass.demo2();
        abstractionChildClass.demo3();
        abstractionChildClass.demo4();
    }
}
