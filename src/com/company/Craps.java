package com.company;

import java.util.Random;

public class Craps {
    static final Random ran= new Random();
    enum Status{CONTINUE,WON,LOST};
    static final int se=2;
    static final int t=3;
    static final int s=7;
    static final int y=11;
    static final int b=12;
    public static void main(String[] args){
        int mypoint=0;
        Status gameStatus;
        int sumofdice=rolldice();
        switch (sumofdice)
        {
            case s:
            case y:
                gameStatus=Status.WON;
                break;
            case se:
            case t:
            case b:
                gameStatus=Status.LOST;
                break;
            default:
                gameStatus=Status.CONTINUE;
                mypoint=sumofdice;
                System.out.printf("Point is %d\n",mypoint);
                break;

        }
        while(gameStatus==Status.CONTINUE)
        {
            sumofdice=rolldice();
            if(sumofdice==mypoint)
                gameStatus=Status.WON;
            else
                if(sumofdice==s)
                    gameStatus=Status.LOST;

        }
        if(gameStatus==Status.WON)
            System.out.println("Player wins");
        else
            System.out.println("Player losses");
    }
    public static int rolldice(){
        int die1=1+ ran.nextInt(6);
        int die2=1+ ran.nextInt(6);
        int sum=die1+die2;
        System.out.printf("Player rolled %d+%d=%d\n",die1,die2,sum);
        return sum;
    }
}
