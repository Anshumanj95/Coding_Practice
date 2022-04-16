package com.company;
class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("I am attending my online class");
            System.out.println("I am not happy");
            i++;}
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<20) {
            System.out.println("I am using Instagram");
            System.out.println("I am happy");
            i++;
        }
    }
}
public class runable {
    public static void main(String[] args) {
        MyThreadRunnable1 r1=new MyThreadRunnable1();
        Thread t1=new Thread(r1);
        MyThreadRunnable2 r2=new MyThreadRunnable2();
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
    }
}
