package String;

public class AddBinaryString {
    public static String addThem(String a,String b){
        int n=a.length();
        int m=b.length();
        int carry=0;
        int i=n-1,j=m-1;
        StringBuilder ans=new StringBuilder();
        while (i!=-1||j!=-1 ||carry!=0){
           int x=(i!=-1)?a.charAt(i--)-'0':0;
           int y=(j!=-1)?b.charAt(j--)-'0':0;
            int sum=carry+x+y;
            ans.append(sum%2);
            carry=sum/2;
        }
        j=ans.length()-1;
        while (ans.charAt(j)=='0') {
            ans.deleteCharAt(j);
            j--;
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        String a="1101";
        String b="111";
        System.out.println(addThem(a,b));
    }
}
