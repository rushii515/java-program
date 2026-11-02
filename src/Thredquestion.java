
class Practice13 extends Thread{
    public void run(){
        while (true){
            System.out.println("Good Morning!");
        }
    }
}

class Practice13b extends Thread{
    public void run(){
        while (true){

            try {
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(" Welcome");
        }
    }
}
public class Thredquestion {
    static void main(String[] args) {
        Practice13 p= new Practice13();
        Practice13b b= new Practice13b();

//p.setPriority(6);
//b.setPriority(9);

        System.out.println(p.getPriority());
        System.out.println(b.getPriority());

        System.out.println(b.getState());
        System.out.println(Thread.currentThread().getState());
//        p.start();
//        b.start();
    }
}
