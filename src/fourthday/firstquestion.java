package fourthday;

import javax.xml.namespace.QName;

public class firstquestion {


        String name= "rushii";
        int age= 21;
        double marks= 87.3;



    void display(){
        System.out.println(" Student name :  " +name);
        System.out.println(" Student age : " +age);
        System.out.println(" Student marks " +marks);

    }


   public static void main(String[] args) {
firstquestion s= new firstquestion();
s.display();
    }
}
