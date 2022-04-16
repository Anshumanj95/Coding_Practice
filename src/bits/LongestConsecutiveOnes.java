package bits;

public class LongestConsecutiveOnes {
    public static int maxConsecutiveOnes(int n){
        int ans=0;
        while (n!=0){
            ans++;
            n=(n &(n<<1));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(maxConsecutiveOnes(14));

    }
}
