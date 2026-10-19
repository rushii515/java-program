package sevenday;

class Employee{
    private String name;
    int id;

    Employee( String name, int id){
        this.name=name;
        System.out.println(" Employe name: "+name);
        System.out.println(" Employe Id : "+id);
    }
}

    class Manager extends Employee{

        Manager(String name, int id) {
            super(name,id);

        }
    }
public class fivequestion {
    static void main(String[] args) {
        Manager m= new Manager("Asif",542);
    }
}
