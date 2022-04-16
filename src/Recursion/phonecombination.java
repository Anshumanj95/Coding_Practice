package Recursion;

public class phonecombination {
    static String[] keypadarray={"","./","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void keypad(String s,String ans){
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=s.charAt(0);
        String code=keypadarray[ch-'0'];//char change into int or index of array by subtract it by 0
        String ros=s.substring(1);
        for(int i=0;i<code.length();i++){
            keypad(ros,ans+code.charAt(i));
        }

    }
    public static void main(String[] args) {
        keypad("23","");
    }
}
