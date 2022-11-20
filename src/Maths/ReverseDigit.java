package Maths;

public class ReverseDigit {
    public static int reverse(int num){
        boolean neg=num<0;
        num=Math.abs(num);
        long ans=0;
        while (num!=0){
            ans=ans*10+num%10;
            num/=10;
        }
        if (ans>Integer.MAX_VALUE)
            return 0;
        if (neg)
            return -(int)ans;
        return (int)ans;
    }
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
    }

}
