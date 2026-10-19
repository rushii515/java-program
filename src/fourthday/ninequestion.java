package fourthday;

public class ninequestion {
    String mobile = " Apple";
    String brand = " apple";
    String model = " Indian";
    int price = 2500;

    void mobile() {
        System.out.println(" Mobile name :" + mobile);
    }

    void brand() {
        System.out.println(" Mobile Brand : " + brand);
    }

    void model() {
        System.out.println(" Mobile model : " + model);
    }

    int price() {
        return price;
    }

    static void main(String[] args) {
        ninequestion m = new ninequestion();
        m.mobile();
        m.brand();
        m.model();
        System.out.println(" Mobile price is : " + m.price());
    }
}