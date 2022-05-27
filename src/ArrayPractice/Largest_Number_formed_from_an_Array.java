package ArrayPractice;

import java.util.Arrays;

public class Largest_Number_formed_from_an_Array {
    public static String largestNumber(String[] arr){
        StringBuilder ans=new StringBuilder();
        Arrays.sort(arr,(a,b)-> (a+b).compareTo(b+a)>0?-1:1);
        for (String s:arr)
            ans.append(s);
        return ans.toString();
    }
    public static void main(String[] args) {
        String[] arr={"3","30","34","5","9"};
        System.out.println(largestNumber(arr));
    }
}
