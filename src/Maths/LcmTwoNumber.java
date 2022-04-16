package Maths;

public class LcmTwoNumber {

    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b , a%b);
    }

    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

    // Driver method
    public static void main(String[] args)
    {
        int a = 15, b = 20;
        System.out.println("LCM of " + a +
                " and " + b +
                " is " + lcm(a, b));
    }
}
