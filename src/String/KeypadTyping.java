package String;

public class KeypadTyping {
    public static String keypad(String s){
        int[] arr={2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
        StringBuilder ans= new StringBuilder();
        for (int i=0;i<s.length();i++)
            ans.append(arr[s.charAt(i) - 'a']);
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(keypad("geeksforgeeks"));
    }
}
