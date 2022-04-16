package String;

public class NthNumberMadeOfPrimeDigits {
    //
    //                                      ""
    //          /                |                    |                 \
    //         2                 3                    5                  7
    //     / |  | \           / | |  \             /  | | \          /  | |  \
    //    22 23 25 27        32 33 35 37         52 53 55 57        72 73 75 77
    //   /||\/||\/||\/||\   /||\/||\/||\/||\   /||\/||\/||\/||\   /||\/||\/||\/||\
    //We can notice following :
    //1st. 5th, 9th. 13th, ..... numbers have 2 as last digit.
    //2nd. 6th, 10th. 14th, ..... numbers have 3 as last digit.
    //3nd. 7th, 11th. 15th, ..... numbers have 5 as last digit.
    //4th. 8th, 12th. 16th, ..... numbers have 7 as last digit.
    public static int primeDigits(int n)
    {
        //Your code here
       int rem;
       String ans="";
       while (n>0){
           rem=n%4;
           switch (rem){
               case 1:
                   ans+=2;
                   break;
               case 2:
                   ans+=3;
                   break;
               case 3:
                   ans+=5;
                   break;
               case 0:
                   ans+=7;
           }
           if (n%4==0)
               n--;
           n=n/4;
       }
       StringBuilder str=new StringBuilder(ans).reverse();
       return Integer.parseInt(str.toString());
    }
    public static void main(String[] args) {
        System.out.println(primeDigits(21));

    }
}
