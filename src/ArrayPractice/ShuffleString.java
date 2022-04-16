package ArrayPractice;

import java.util.Arrays;

public class ShuffleString {
    public static String shuffle(String s,int[] indices){
        char[] arr=new char[s.length()];
        for (int i=0;i<indices.length;i++){
            arr[indices[i]]=s.charAt(i);
        }

        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,2,1,3};
        System.out.println(shuffle("codeleet",arr));

    }
}
