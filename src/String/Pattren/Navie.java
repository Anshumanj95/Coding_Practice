package String.Pattren;

public class Navie {
    public static void search(String txt,String pat){
        int n=txt.length();
        int m=pat.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(pat.charAt(j)!=txt.charAt(i+j))
                    break;
            }
            if(j==m)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        String txt="abcabcabcd";
        String pat="abcd";
        search(txt,pat);
    }
}
