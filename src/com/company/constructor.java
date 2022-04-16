package com.company;

class sports{
    private int id;
    private String sportname;
    public sports(){
         id=0;
        sportname=" ";
    }
    public sports(int i,String n){
        id=i;
        sportname=n;
    }
    public sports(String n){
        sportname=n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return sportname;
    }
}
public class constructor {
    public static void main(String[] args) {
        sports person1=new sports();
        sports person2=new sports(23,"Football");
        sports person3=new sports("Cricket");
        System.out.println(person1.getId()+" "+person1.getName());
        System.out.println(person2.getId()+" "+person2.getName());
        System.out.println(person3.getId()+" "+person3.getName());


    }
}
