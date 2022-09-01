package String;

public class Find_Kth_Character_of_Decrypted_String {
    public static char findKth(String str,long k){
        int j=0;
        for (int i=0;i<str.length();i++){
            if (Character.isLetter(str.charAt(i)))
                continue;
            else if (Character.isDigit(str.charAt(i))){
                String s="";
                int len=i-j;
                while (i<str.length() && Character.isDigit(str.charAt(i))){
                    s+=str.charAt(i);
                    i++;
                }
                i--;
                long value=Long.parseLong(s);
                value=value*len;
                if (value>=k){
                    k--;
                    long idx=k%len;
                    idx+=j;
                    return str.charAt((int)idx);
                }
                k-=value;
                j=i+1;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        String str="ab12c3";
        long k=20;
        System.out.println(findKth(str,k));
    }
}
