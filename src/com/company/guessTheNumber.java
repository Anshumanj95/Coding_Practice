package com.company;

import java.util.Random;
import java.util.Scanner;

class game{
    private int noOfGuess=0;
    public int random;
    public int input;

    public int getNoOfGuess() {
        return noOfGuess;
    }

    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    public game(){
        Random rand1=new Random();
        random=rand1.nextInt(100);
    }
    public void takeUserInput(){
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
    }
    boolean isCorrect(){
        noOfGuess++;
        if(input==random) {
            System.out.println("You guess the correct number that computer generated. The number is:"+random);
            System.out.println("you win this game in "+getNoOfGuess()+" number of guess");
            return true;
        }
        else if(input>random){
            System.out.println("Too High...");
        }
        else if(input<random) {
            System.out.println("Too Low...");
        }
        return false;
    }
//    public void isCorrect() {
//
//        int i=1;
//        do  {
//            takeUserInput();
//            setNoOfGuess(i);
//            if (input > random) {
//                System.out.println("Number is smaller than you enter.Try again");
//            }
//            else if(input<random) {
//                System.out.println("Number is greater than you enter.Try again");
//            }
//            else {
//                System.out.println("You guess the correct number that computer generated. The number is:"+random);
//                System.out.println("you win this game in "+getNoOfGuess()+" number of guess");
//            }
//            i++;
//
//        }while (input != random && i<Integer.MAX_VALUE);
//    }

}

public class guessTheNumber {
    public static void main(String[] args) {

        game gameplay = new game();
        boolean b=false;
        while (!b){
            gameplay.takeUserInput();
            b=gameplay.isCorrect();
        }
        }
    }



