package classes.and.objects;

public class Student {

    public int id;
    public String name;
    public String email;
    public String dob;
    public String grade;

    public Student() { // this is default constructor - this is automatically created whenever a class is created, if we add it manually class will not create it
    }

    public Student(int id, String name, String email, String dob, String grade) { // parameterized constructor
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.grade = grade;
    }

    //convert the object into string form
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
