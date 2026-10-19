package sixday;

class Employe{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class secondquestion {

    static void main(String[] args) {
        Employe e= new Employe();
  e.setSalary(2000);
        System.out.println(" Employe Salary : "+e.getSalary());

    }
}
