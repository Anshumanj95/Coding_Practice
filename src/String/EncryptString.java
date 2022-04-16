package String;

public class EncryptString {
    public static String Encrypt(String s){
        StringBuilder sb=new StringBuilder();
        int count=1;
        int i=s.length()-1;
        while (i>=0){
            if (i-1>=0 && s.charAt(i)==s.charAt(i-1))
                count++;
            else {
                sb.append(Integer.toHexString(count)).append(s.charAt(i));
                count=1;
            }
            i--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="aaaaaaaaaaa";
        System.out.println(Encrypt(s));

    }
}
