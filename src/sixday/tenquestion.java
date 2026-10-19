package sixday;

class person{
    String name;
    int age;

    person( String name, int age){
        this.name=name;
        this.age=age;

    }
    void display(){
        System.out.println("Person name: "+name);
        System.out.println("Person Age:"+age);
    }

    void work(){
        System.out.println(" Person performs daily activities");
    }
}

class Studentt extends person{
    String course;

   Studentt(String name, int age, String course) {
       super( name, age);
       this.course= course;
   }

   @Override
   void display(){
       super.display();
       System.out.println(" Cource : " +this.course);
   }
   @Override
   void work(){
       System.out.println(" Student studies and practies coding..");

   }

}


public class tenquestion {
    static void main(String[] args) {
        person p= new person("Rahul",22);
        Studentt s= new Studentt("Rushikesh", 21,"AILM");

        System.out.println(" Person Detailss......");
        p.display();
        p.work();


        System.out.println(" Student Details......");
        s.display();
        s.work();
    }
}
