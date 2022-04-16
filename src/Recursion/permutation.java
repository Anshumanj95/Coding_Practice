package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation {
    static List<String> res=new ArrayList<>();
    public static List<String> per(String s,String ans) {
        if (s.length() == 0) {
            res.add(ans);
        }
        else {
            boolean[] alpha = new boolean[26];
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                String ros = s.substring(0, i) + s.substring(i + 1);
                if (!alpha[ch - 'A'])
                    res=per(ros,ans+ch);
                alpha[ch - 'A'] = true;
            }
        }
        return res;
    }
    public static void permute(String s,int i){
        if(i==s.length()-1){
            System.out.print(s+" ");
            return;
        }
        else {
            for (int j = i; j <s.length(); j++) {
                s = swap(s, i, j);
                permute(s, i + 1);
                s = swap(s, i, j);
            }
        }

    }
    public static String swap(String s, int i, int j){
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    static void dataTypes(int a, float b, double c, long l, byte d){

        double p = c/b;//c/b
        double q = b/a;//b/a
        double r = c/a;//c/a
        double m = r+l;//r+l
        int s = a/d;//a/d

        //Printing all the results
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);

    }
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        // your code here
        Arrays.sort(a);
        int temp=a[n-1];
        int[] arr=new int[temp+1];
        for(int i=0;i<n;i++){
                arr[a[i]]++;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==f)
                count++;
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        String a="ABC";
        List<String> res=per(a,"");
        for(int i=0;i< res.size();i++){
            System.out.print(res.get(i)+" ");
        }
//        Scanner sc=new Scanner(System.in);
//        dataTypes(1,2,3,5, (byte) 127);
//        int[] arr={1,2,4,2,4};
//        countSpecials(arr,arr.length,2);

        //permute(a,0);

    }
}
