package Maths;

public class LargestNumberPossible {
    public static String largestNumber(int s,int n){
        if(s==0 && n==1)
            return "0";
        if (s==0 && n>1)
            return "-1";
        StringBuilder ans= new StringBuilder();
        for (int i=0;i<n;i++){
            if (s>9){
                ans.append("9");
                s-=9;
            }
            else if (s==0)
                ans.append("0");
            else{
                ans.append(s);
                s-=s;
            }
        }
        if (s>0)
            return "-1";
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(largestNumber(10,2));

    }
}
