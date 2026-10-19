package sevenday;

interface Playable{
    void play();

}
class Football implements Playable{
   public void play(){
        System.out.println(" Football player is 7 ");
    }
}

class Circket implements Playable{
     public void play(){
        System.out.println(" Circket player is 11");

    }
}

public class eightquestion {
    static void main(String[] args) {
        Football f= new Football();
        f.play();
        Circket c= new Circket();
        c.play();

    }
}
