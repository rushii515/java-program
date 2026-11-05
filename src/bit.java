public class bit {
    static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitMask= 1<<pos;

//        if((bitMask &n)==0){
//            System.out.println(" bit was zero");
//        }else{
//            System.out.println(" bit is one");
//        }

       int newNumber= bitMask |n;
        System.out.println(newNumber);
    }
}
