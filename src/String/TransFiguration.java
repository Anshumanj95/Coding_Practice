package String;

public class TransFiguration {
    public static int transfigure(String A,String B){
        int[] freq=new int[256];
        for (char ch:A.toCharArray())
            freq[ch-'0']++;
        for (char ch:B.toCharArray())
            freq[ch-'0']--;
        for (int x:freq){
            if (x!=0)
                return -1;
        }
        // if operation is to take any charter at index i and then add it at front
        int i=A.length()-1;
        int j=B.length()-1;
        int count=0;
        while (i>=0 && j>=0){
            if (A.charAt(i)==B.charAt(j)) {
                i--;
                j--;
            }
            else {
                count++;
                i--;
            }
        }
        return count;
    }
    public static int MinimumCostToConvert(String A,String B){
        int[] freq=new int[256];
        for (char ch:A.toCharArray())
            freq[ch-'0']++;
        for (char ch:B.toCharArray())
            freq[ch-'0']--;
        for (int x:freq){
            if (x!=0)
                return -1;
        }
        // if operation is to take any charter at index i and then add it at end
        int i=0;
        int j=0;
        int count=0;
        while (i<A.length() && j<B.length()){
            if (A.charAt(i)==B.charAt(j)) {
                i++;
                j++;
            }
            else {
                count++;
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(transfigure("ABC","BCA"));

    }
}
