package DynamicProgramming;

/*
We can write summation of all substrings on basis of digit at which they are ending in that case,
Sum of all substrings = sumofdigit[0] + sumofdigit[1] + sumofdigit[2] … + sumofdigit[n-1]  where n is length of string.

Where sumofdigit[i] stores sum of all substring ending at ith index digit, in above example,

Example: num = "1234"

sumofdigit[0] = 1 = 1

sumofdigit[1] = 2 + 12  = 14

sumofdigit[2] = 3 + 23  + 123 = 149

sumofdigit[3] = 4 + 34  + 234 + 1234  = 1506

Result = 1670

Now we can get the relation between sumofdigit values and can solve the question iteratively. Each sumofdigit can be represented in terms of previous value as shown below,

For above example,

sumofdigit[3] = 4 + 34 + 234 + 1234

           = 4 + 30 + 4 + 230 + 4 + 1230 + 4

           = 4*4 + 10*(3 + 23 +123)

           = 4*4 + 10*(sumofdigit[2])

In general,

sumofdigit[i] = (i+1)*num[i] + 10*sumofdigit[i-1]
 */

public class Sum_of_all_substrings_of_a_number {
    public static long sumSubstring(String s){
        int n=s.length();
        if(n==0)
            return 0;
        long[] dp=new long[n];

        dp[0]=s.charAt(0)-'0';
        long ans=dp[0];
        for(int i=1;i<n;i++){
            dp[i]=(((long) (i + 1) *(s.charAt(i)-'0'))+(dp[i-1]*10)%1000000007);
            ans=(ans+dp[i])%1000000007;
        }
        return ans%1000000007;
    }
    public static void main(String[] args) {
        System.out.println(sumSubstring("1234"));

    }
}
