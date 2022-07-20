package String;

public class LongestPalindromeByConcatenatingTwoLetterWords {
    public static int longestPalindrome(String[] words){
        int[][] counter=new int[26][26];
        int ans=0;
        for (String s:words){
            int a=s.charAt(0)-'a';
            int b=s.charAt(1)-'a';
            if (counter[b][a]>0){
                ans+=4;
                counter[b][a]--;
            }
            else
                counter[a][b]++;
        }
        for (int i=0;i<26;i++){
            if (counter[i][i]>0){
                ans+=2;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] words={"ab","ty","yt","lc","cl","ab"};
        System.out.println(longestPalindrome(words));
    }
}
