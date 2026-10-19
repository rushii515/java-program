package fourthday;

public class tenquestion {
    double radius=3;

    void circle( ){
        System.out.println( " circle Area is " +Math.PI*radius*radius);
    }

    static void main(String[] args) {
        tenquestion t= new tenquestion();
        t.circle();
    }
}
