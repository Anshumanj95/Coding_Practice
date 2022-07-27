package Maths;

import java.util.Arrays;

public class MultiPlyString {
    public static String multiply(String num1,String num2){
        if(num1.equals("0")|| num2.equals("0"))
            return "0";
        String sign="";
        if(num1.charAt(0)=='-'){
            sign="-";
            num1=num1.substring(1);
        }
        if(num2.charAt(0)=='-'){
            sign=(sign.equals("-"))?"":"-";
            num2=num2.substring(1);
        }
        System.out.println(num1+" "+num2);
        int n1=num1.length();
        int n2=num2.length();
        int len=n1+n2;
        int[] product=new int[len];
        for (int i=n2-1;i>=0;i--){
            int a=num2.charAt(i)-'0';
            for (int j=n1-1;j>=0;j--){
                int b=num1.charAt(j)-'0';
                int idx=i+j+1;
                int p=a*b+product[idx];
                product[idx]=p%10;
                product[idx-1]+=p/10;
            }
            System.out.println(Arrays.toString(product));
        }
        System.out.println(Arrays.toString(product));
        int start=product[0]!=0?0:1;
        StringBuilder ans=new StringBuilder();
        for (int i=start;i<len;i++)
            ans.append(product[i]);
        return sign+ans.toString();
    }
    public static void main(String[] args) {
        String num1="-4416";
        String num2="-333";
        System.out.println(multiply(num1,num2));
    }
}
