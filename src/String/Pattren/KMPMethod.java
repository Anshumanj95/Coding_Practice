package String.Pattren;

public class KMPMethod {
    public static void search(String txt,String pat){
        int n=txt.length();
        int m=pat.length();
        int[] lps=LpsArray.lpsArray(pat);
        int i=0,j=0;
        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                System.out.print(i-j+" ");
                j=lps[j-1];
            }
            else if(i<n && txt.charAt(i)!=pat.charAt(j)){
                if(j==0){
                    i++;
                }
                else{
                    j=lps[j-1];
                }
            }
        }
    }
    public static void main(String[] args) {
        String txt="abbabshdhdbababcdw";
        String pat="ab";
        search(txt,pat);

    }
}
