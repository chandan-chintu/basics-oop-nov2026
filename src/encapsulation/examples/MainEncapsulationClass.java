package encapsulation.examples;

public class MainEncapsulationClass {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();

        teacher1.setId(101);
        teacher1.setName("Deepika");
        teacher1.setEmail("deepika@gmail.com");
        teacher1.setSalary(30000.00);
        teacher1.setQualification("Msc");

        System.out.println("teacher1 is : "+teacher1);

        System.out.println("teacher1 name is : "+teacher1.getName());
        System.out.println("teacher1 email is : "+teacher1.getEmail());
        System.out.println("teacher1 salary is : "+teacher1.getSalary());
    }
}
