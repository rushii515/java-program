package sixday;

class Rectangle{
    int length;
    int breadth;

   Rectangle(int length, int breadth){
       this.length=length;
       this.breadth=breadth;
   }

   int calculateArea(){
       return length*breadth;

   }
}

public class thirdquestion {
    static void main(String[] args) {
        Rectangle r = new Rectangle(12, 45);
        System.out.println("Length:"+r.length);
        System.out.println(" Breadth: "+r.breadth);
        System.out.println("Area "+r.calculateArea());

    }
}
