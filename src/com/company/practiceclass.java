package com.company;
class employees{
    int salary;
    String name;
    public int getsalary(){

        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
}
class square{
    int side;
    public int area(){

        return side*side;
    }
    public int perimeter(){

        return 4*side;
    }
}
class rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
class circle{
    float radius;
    public float area(){
        return (float) (3.14*radius*radius);
    }
    public float circumference(){

        return (float)(2*3.14*radius);
    }
}
class anshuman{
    public void run(){
        System.out.println("Anshuman is running");
    }
    public void eat(){
        System.out.println("Anshuman is eating");
    }
    public void miss(){
        System.out.println("Anshuman is missing someone");
    }

}

public class practiceclass {
    public static void main(String[] args) {

        employees e1=new employees();
        employees e2=new employees();
        e1.salary=20000;
        e1.setname("Anoop");
        System.out.println(e1.getname()+"\n"+e1.getsalary());
        e2.salary=300000;
        e2.setname("Ansh");
        System.out.println(e2.getname()+"\n"+e2.getsalary());
        square fig1=new square();
        fig1.side=5;
        System.out.println(fig1.area());
        System.out.println(fig1.perimeter());
        rectangle fig2=new rectangle();
        fig2.length=3;
        fig2.breadth=4;
        System.out.println(fig2.area());
        System.out.println(fig2.perimeter());
        circle c1 =new circle();
        c1.radius=  3.5f;
        System.out.println(c1.area());
        System.out.println(c1.circumference());
        anshuman a=new anshuman();
        a.eat();
        a.miss();
        a.run();
    }
}
