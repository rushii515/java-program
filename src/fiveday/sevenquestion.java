package fiveday;

abstract class employe{
    abstract double calculateSalary();
}

class fullTimeEmploye extends employe{

    @Override
    double calculateSalary(){
        return 710000;
    }

}

class PartTimeEmpoye extends  employe{
    int hours;
    double rate;
    PartTimeEmpoye(int hours, double rate){
        this.hours=hours;
        this.rate=rate;
    }

    @Override
    double calculateSalary() {
        return hours*rate;
    }
}
public class sevenquestion {

    static void main(String[] args) {


        fullTimeEmploye f = new fullTimeEmploye();
        System.out.println(" EMploye full time work Salary  : "+f.calculateSalary());

        PartTimeEmpoye p= new PartTimeEmpoye(23,200);
        System.out.println(" Employe Part time work salary : " +p.calculateSalary());

    }
}
