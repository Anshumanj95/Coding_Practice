package String;

public class BinaryArray {
    public static int noOfSub(String s){
        int count=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='1')
               count++;
       }
        return (count*(count-1)/2);
    }
    public static void main(String[] args) {
        String s="1111";
        System.out.println(noOfSub(s));

    }
}
