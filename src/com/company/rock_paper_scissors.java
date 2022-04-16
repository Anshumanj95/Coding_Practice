package com.company;


import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {
        Random rand=new Random();
        System.out.println("lets play Rock,Paper and Scissor with Computer\nThe winner of the game is decided by no.of round who win more" +
                "\nonly 3 round you having");
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\tNotation of Game\n\t0 stands for Rock\n\t1 stands for Paper\n\t2 stands for scissor");
        int you_win=0;
        int computer_win=0;

        int i=1;
        do {
            System.out.println("Round:"+i);
            System.out.println("Computer's Turn:");
            int R= rand.nextInt(3);
            System.out.print("Yours Turn:");
            int Y=sc.nextInt();
            if (R==0 && Y==1) {
                System.out.println("You win");
                System.out.println("Rock and paper=paper");
                you_win++; }
            else if(R==0 && Y==2){
                System.out.println("Computer wins");
                System.out.println("Rock and scissor=Rock");
                computer_win++;}
            else if(R==0 &&Y==0)
                System.out.println("Tie");
            else if(R==1 && Y==0){
                System.out.println("Computer win");
                System.out.println("Paper and Rock=Paper");
                computer_win++;}
            else if(R==1 && Y==2){
                System.out.println("You win");
                System.out.println("Paper and scissor=scissor");
                you_win++;}
            else if(R==1 &&Y==1)
                System.out.println("Tie");
            else if(R==2 && Y==0){
                System.out.println("You win");
                System.out.println("scissor and Rock=Rock");
                you_win++;}
            else if(R==2 && Y==1){
                System.out.println("Computer win");
                System.out.println("scissor and paper= scissors");
                computer_win++;}
            else if(R==2 && Y==2)
                System.out.println("Tie");
            else
                System.out.println("Enter correct value");
            i++;
        }while(i<4);
        if(computer_win>you_win)
            System.out.println("Computer Win the match");
        else if(you_win>computer_win)
            System.out.println("You Win the match");
        else
            System.out.println("Game is Tied");

    }
}
