package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PossibleWordsWithPhoneDigit
{
    public static ArrayList<String> possibleWords(int[] a,int n){
        ArrayList<String> words=new ArrayList<>(Arrays.asList(("")));
        HashMap<Integer,String> key=new HashMap<>()
        {{
            put(2,"abc");put(3,"def");put(4,"ghi");
            put(5,"jkl");put(6,"mno");put(7,"pqrs");
            put(8,"tuv");put(9,"wxyz");
        }};
        for (int digit:a){
            ArrayList<String> curr=new ArrayList<>();
            for(String word:words){
                for(char c:key.get(digit).toCharArray()){
                    curr.add(word+c);
                }
            }
            words=curr;
        }
        return words;
    }
    public static void main(String[] args) {

    }
}
