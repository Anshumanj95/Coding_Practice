package com.company;

class cylinders{
    private float radius;
    private float height;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public float area(){
        return (float) (2*Math.PI*radius*height+2*Math.PI*radius*radius);
    }
    public float volume(){
        return (float)(Math.PI*radius*radius*height);
    }
}
public class cylinder {

    public static void main(String[] args) {
        cylinders c1=new cylinders();
        c1.setHeight(2.5f);
        c1.setRadius(3.5f);
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
        System.out.println(c1.area());
        System.out.println(c1.volume());
    }

}
