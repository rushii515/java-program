package fourthday;

public class fourthquestion {
    String name= " Sai";
    int rollnumber= 315;
    double marks=90.55;

    void student(){
        System.out.println(" Student name :  " +name);
        System.out.println(" Student rollnumber: " +rollnumber);
        System.out.println(" Studnet marks : " +marks);
    }

    static void main(String[] args) {
        fourthquestion s= new fourthquestion();
        s.student();
    }
}
