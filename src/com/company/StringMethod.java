package com.company;

public class StringMethod {
    public static void main(String[] args){
        String s1="hello there";
        char[] charArray=new char[5];
        System.out.printf("s1:%s\n",s1);
        System.out.println(s1.length());
        for(int i=s1.length()-1;i>=0;i--)
            System.out.print(s1.charAt(i));
        s1.getChars(0,5,charArray,0);
        for(char chara:charArray)
            System.out.print("  "+chara);
    }
}
