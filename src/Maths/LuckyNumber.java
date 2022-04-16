package Maths;

public class LuckyNumber {
    public static boolean lucky(int n){
        for (int i=2;i<=n;i++){
            if (n%i==0)
                return false;
            else
                n=n-n/i;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(lucky(19));

    }
}
