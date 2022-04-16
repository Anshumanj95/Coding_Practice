package com.company;
class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<20){
        System.out.println("I am attending my online class");
        System.out.println("I am not happy");
        i++;}
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<20) {
            System.out.println("I am using Instagram");
            System.out.println("I am happy");
            i++;
        }
    }
}
public class thread {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        MyThread1 t3=new MyThread1();
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getId());
        t3.start();
        t2.start();
        System.out.println(t1.getState());
    }
}
