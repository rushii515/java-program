package sixday;

class student{

    int age;
    double marks;
    String name ;
    student(){
        age =21;
         marks= 57.5;
         name = "Om ";
    }
    student(int age, double marks, String name){
        this.age=age;
        this.marks=marks;
        this.name=name;
    }
    void disply(){
        System.out.println(" Student name : "+name);
        System.out.println(" Student marks: "+marks);
        System.out.println(" Studnet Age: " +age);
    }
}
public class fourthquestion {
    static void main(String[] args) {
        student s1= new student(21, 57.33,"rushikesh");
        student s2= new student();

        System.out.println("First Student :  ");
        s1.disply();

        System.out.println("\n Second Student: ");
        s2.disply();

    }

}
