package Recursion;


public class Ways {
    public static int ways(int n,int m){//inO(N*M)
        if(n==1||m==1){
            return 1;
        }
        return ways(n-1,m)+ways(n,m-1);
    }
    public static int waysinN(int n,int m){//inO(N)
        if(n==1||m==1){
            return 1;
        }
        n=n-1;
        m=m-1;
        return (Factorial.factorial(m+n))/(Factorial.factorial(m)*Factorial.factorial(n));
    }
    public static void main(String[] args) {
        int ans=ways(5,5);
        System.out.println(ans);
        System.out.println(waysinN(3,3));
    }
}
