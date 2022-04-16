package String.Pattren;

public class RollingHash {
    public static void find(String s,String pat){
        if(pat.length()>s.length())
            System.out.println(-1);
        else{
            boolean flag=false;
            int hash1=0;
            int hash2=0;
            for(int i=0;i<pat.length();i++){
                hash1+=pat.charAt(i)-'a'+1;
                hash2+=s.charAt(i)-'a'+1;
            }
            if(hash1==hash2){
                System.out.println(s.substring(0,pat.length())+" "+0);
                flag=true;
            }
            for (int i=1;i+pat.length()-1<s.length()&& i<s.length();i++){
                hash2+=((s.charAt(i+pat.length()-1)-'a')+1)-(s.charAt(i-1)-'a'+1);
                if(hash1==hash2){
                    System.out.println(s.substring(i,i+pat.length())+" "+i);
                    flag=true;
                }
            }
            if(!flag)
                System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        String s="bacdaabaa";
        String pat="ab";
        find(s,pat);

    }
}
