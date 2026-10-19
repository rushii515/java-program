package fiveday;

public class firstquestion {
    private String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static void main(String[] args) {
        firstquestion p= new firstquestion();
        p.setName("Rushikesh");
        p.setAge(21);

        System.out.println(" Name is " +p.getName());
        System.out.println(" Age is : " +p.getAge());

    }
}
