import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

public class practice {
    static void main(String[] args) {

//         ps Q1
        ArrayList ar= new ArrayList();
        ar.add("Student1");
        ar.add("Student2");
        ar.add("Student3");
        ar.add("Student4");
        ar.add("Student5");
        ar.add("Student6");
        ar.add("Student7");
        ar.add("Student8");
        ar.add("Student9");
        ar.add("Student10");

        for(Object o: ar){
            System.out.println(o);
        }


//         ps Q3

        Calendar c= Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + ":" + (c.get(Calendar.MINUTE) + ":" + (Calendar.SECOND)));
//        Ps Q5
        HashSet<Integer> s= new HashSet<>();
        s.add(5);
        s.add(15);
        s.add(56);
        s.add(75);
        s.add(56);
        s.add(58);

        System.out.println(s);


    }
}
