import java.lang.*;
class ThreadA extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("i="+(-1*i));
        }
        System.out.println("ThreadA is running");
    }
}
class ThreadB extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i=" + (2 * i));
        }
        System.out.println("ThreadB is running");
    }
}
class ThreadC extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i=" + (2 * i-1));
        }
        System.out.println("ThreadC is running");
    }
}

public class Threadex1 {
    public static void main(String args[]){
        ThreadA a=new ThreadA();
        ThreadB b=new ThreadB();
        ThreadC c=new ThreadC();
        a.start();
        b.start();
        c.start();
    }
}
