package toc;

import java.util.Scanner;

public class Experiment12 {
    static char[] s;
    public static void q0(int i)
    {
        System.out.print("q0->");
        if (s[i] == 'a'){
            s[i]='X';
            q1(i+1);
        }
        else if (s[i]=='Y'){
            q4(i+1);
        }
        else{
            System.out.println("Not Accepted");
            return;
        }
    }

    public static void q1(int i)
    {
        System.out.print("q1->");
        if (s[i] == 'a'){
            q1(i+1);
        }
        else if (s[i] == 'Y'){
            q1(i+1);
        }
        else if (s[i] == 'b'){
            s[i]='Y';
            q2(i+1);
        }
        else{
            System.out.println("Not Accepted");
            return;
        }
    }

    public static void q2(int i)
    {
        System.out.print("q2->");
        if (s[i] == 'b'){
            q2(i+1);
        }
        else if (s[i] == 'Z'){
            q2(i+1);
        }
        else if (s[i] == 'c'){
            s[i]='Z';
            q3(i-1);
        }
        else{
            System.out.println("Not Accepted");
            return;
        }
    }

    public static void q3(int i)
    {
        System.out.print("q3->");
        if (s[i] == 'a'){
            q3(i-1);
        }
        else if (s[i] == 'b'){
            q3(i-1);
        }
        else if (s[i] == 'Y'){
            q3(i-1);
        }
        else if (s[i] == 'Z'){
            q3(i-1);
        }
        else if (s[i] == 'X'){
            q0(i+1);
        }
        else{
            System.out.println( "Not Accepted");
            return;
        }
    }

    public static void q4(int i)
    {
        System.out.print("q4->");
        if (i == s.length){
            q5(i-1);
        }
        else if (s[i] == 'Y'){
            q4(i+1);
        }
        else if (s[i]=='Z'){
            q4(i+1);
        }
        else{
            System.out.println("Not Accepted");
            return;
        }
    }

    public static void q5(int i){
        System.out.println("q5 ");
        if (i==s.length-1)
            System.out.println("Accepted");
        return;
    }

    public static void main(String[] args) {
        System.out.println("Enter String");;
        Scanner sc=new Scanner(System.in);
        s=sc.next().toCharArray();
        q0( 0);
    }
}
