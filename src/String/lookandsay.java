package String;

public class lookandsay {
//    1
//    11 ek baar ek
//    21 do baar ek
//    1211 ek baar do ek baar ek
//    111221 ek baar ek ek baar do do baar ek
    public static String lookAndSay(int n){
        if(n==1)
            return "1";
        if(n==2)
            return "11";
        String ans=lookAndSay(n-1);
        StringBuilder nr=new StringBuilder();
        int count=1;
        for(int i=1;i<ans.length();i++){
            if(ans.charAt(i)!=ans.charAt(i-1)){
                nr.append(count);
                nr.append(ans.charAt(i-1));
                count=1;
            }
            else
                count++;
            if(i==ans.length()-1){
                nr.append(count);
                nr.append(ans.charAt(i));
            }
        }
        return nr.toString();
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(lookAndSay(5));
    }
}
