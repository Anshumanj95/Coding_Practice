package lab;

abstract class shape{
    int dimension1;
    int dimension2;
    abstract public int area();
    abstract public int perimeter();
}
class circle1 extends shape{
    int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int area(){
        return (int)Math.PI*radius*radius;
    }
    public int perimeter(){
        return (int) (2*Math.PI*radius);
    }
}
class rectangle1 extends shape{
    int length;
    int breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class abstract_class {
    public static void main(String[] args) {
        circle1 c1=new circle1();
        rectangle1 r1=new rectangle1();
        c1.setRadius(4);
        r1.setLength(3);
        r1.setBreadth(5);
        System.out.println("Area of circle is:"+c1.area());
        System.out.println("Circumference of circle is :"+c1.perimeter());
        System.out.println("Area of rectangle is:"+r1.area());
        System.out.println("Perimeter of rectangle is:"+r1.perimeter());
    }
}
