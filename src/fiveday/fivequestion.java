package fiveday;

class shaper{
    double area(){
        return 0;
    }
}

class circle extends shaper{
    double radius;

    circle(double radius){
        this.radius=radius;
    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
}
class rectange extends shaper{
    double length;
    double width;

    rectange(double length, double width){
        this.length=length;
        this.width=width;
    }
    @Override
    double area(){
        return length*width;
    }
}
public class fivequestion {

    static void main(String[] args) {
        circle c= new circle(5);
        rectange r= new rectange(23, 34);

        System.out.println(" circle area is : " +c.area());
        System.out.println(" Rectange are is : " +r.area());
    }
}
