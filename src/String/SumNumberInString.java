package String;

public class SumNumberInString {
    public static long sum(String str){
        long sum=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                String temp="";
                while((i<str.length()) &&Character.isDigit(str.charAt(i))){
                    temp=temp+str.charAt(i);
                    i++;
                }
                sum=sum+Integer.parseInt(temp);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String s="1and23sew3";
        System.out.println(sum(s));

    }
}
