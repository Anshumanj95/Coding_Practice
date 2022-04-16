package Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prime {
    static boolean[] prime = new boolean[(int) 10e6 + 2];

    public static void sieveOfEratosthenes(int n) {

        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i*i <= n; i++) {
//            if (prime[i]) {
//                System.out.println(i);
                for (int j = 2 * i; j <= n; j += i) {
                    prime[j] = false;
                }
            //}
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static long fastPower(long a, long b, int n) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = (res * a) % n;
            }
            a = (a * a) % n;
            b = b >> 1;
        }
        return res;
    }

    public static int power(int a, int b) {
        if (b == 0)
            return 1;
        return power(a, b - 1) * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            sieveOfEratosthenes(r);
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = l; i <= r; i++) {
                if (prime[i])
                    ans.add(i);
            }
            System.out.println(ans);
//            if(ans.size()==0){
//                System.out.println(-1);
//            }
//            else{
//                System.out.println(ans.get(ans.size()-1)-ans.get(0));
//            }
//        }
//        //System.out.println(gcd(24, 72));
//        System.out.println(power(22,12));
            //System.out.println(fastPower(2,5,100));]
//        System.out.println(fastPower(3,4,100));


        }
    }
}

