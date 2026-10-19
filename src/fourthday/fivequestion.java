package fourthday;

public class fivequestion {
    String title= " The Mindiset";
    String author= " Vaibhav kharat";
    int price= 456;

    void Book(){
        System.out.println(" Book Title is : " +title);
        System.out.println(" Book author is " +author);
        System.out.println( " Book price is : " +price);
    }

    static void main(String[] args) {
        fivequestion b= new fivequestion();
        b.Book();
    }

}
