package Greedy;

public class Largest_number_with_given_sum {
    public static String number(int n,int sum){
        if(sum>n*9)
            return "-1";
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<n;i++){
            if(sum>9){
                ans.append("9");
                sum-=9;
            }
            else{
                ans.append(sum);
                sum=0;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        int n=5;
        int sum=12;
        System.out.println(number(n,sum));
    }
}
