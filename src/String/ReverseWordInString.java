package String;

public class ReverseWordInString {
    public static void reverseString(String s){
        char[] str=s.toCharArray();
        int start=0;
        for(int end=0;end<str.length;end++){
            if(str[end]==' '){
                reverse(str,start,end-1);
                start=end+1;
            }
        }
        reverse(str,start,str.length-1);
        //reverse(str,0,str.length-1);
        System.out.println(str);
    }

    public static void reverse(char[] str,int start,int end){
        while(start<=end){
            char temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        String s="welcome to world";
        reverseString(s);

    }
}
