package sixday;

class Student {
    private int age = 21;
    public String name = "rushikesh";
    protected double marks = 34.54;


    void display() {
        System.out.println(" Student age is" + age);
        System.out.println(" Student Name is : "+name);
        System.out.println(" Student Marks is: " +marks);
    }
}
public class firstquestion {
    static void main(String[] args) {
        Student s= new Student();
        s.display();
    }
}
