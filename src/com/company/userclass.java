package com.company;
class students{
    int rollno;
    String name;
    public void printinfo(){
        System.out.println("My name is "+name);
        System.out.println("My roll.no is "+rollno);
    }
}

public class userclass {
    public static void main(String[] args) {
        students s1=new students();
        students s2=new students();
        students s3= new students();
        s1.name="Anshuman Jain";
        s1.rollno=23;
        s2.name="Vijay";
        s2.rollno=40;
        s3.name="yash";
        s3.rollno=41;
        s1.printinfo();
        s2.printinfo();
        s3.printinfo();
    }
}
