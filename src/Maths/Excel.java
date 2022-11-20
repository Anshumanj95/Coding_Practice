package Maths;

public class Excel {
    public static String titleName(int n){
        String ans="";
        while (--n>=0){
            ans=(char)('A'+n%26)+ans;
            n/=26;
        }
        return ans;
    }
    public static int columnNumber(String col){
        int ans=0;
        for (char ch:col.toCharArray()){
            int temp=ch-'A'+1;
            ans=ans*26+temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=28;
        System.out.println(titleName(28));
        String col="AB";
        System.out.println(columnNumber(col));
    }
}
