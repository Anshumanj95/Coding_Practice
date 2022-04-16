package com.company;

public class StratEnd {
    public static void main(String[] args){
        String[] strings={"started","starting","ended","ending"};
        for(String string:strings){
            if(string.startsWith("st"))
                System.out.printf("%s\n",string);
        }
        for(String string:strings){
            if(string.startsWith("art",2))
                System.out.printf("%s\n",string);
        }
    }
}
