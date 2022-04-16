package Greedy;

import java.util.Arrays;

public class ChoseAndSwap {
    public static String choseAndSwap(String s){
        int[] left=new int[26];
        Arrays.fill(left,-1);
        for (int i=s.length()-1;i>=0;i--)
            left[s.charAt(i)-'a']=i;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char st='a';
            while (st<ch){
                if (left[st-'a']!=-1 && left[st-'a']>i){
                    String temp1=s.replaceAll(String.valueOf(ch),"A");
                    System.out.println(temp1);
                    String temp2=temp1.replaceAll(String.valueOf(st),String.valueOf(ch));
                    System.out.println(temp2);
                    return temp2.replaceAll("A",String.valueOf(st));
                }
                st+=1;
            }
        }
        return s;

    }
    public static void main(String[] args) {
        String s="ccad";
        System.out.println(choseAndSwap(s));
    }
}
