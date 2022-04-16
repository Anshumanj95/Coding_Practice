package String;

public class StringToInteger {
    public static int convert(String s){
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>57||s.charAt(i)<48)&&s.charAt(i)!=45)
                return -1;
        }
        int p=1;
        int sum=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!='-'){
                sum=sum+(s.charAt(i)-'0')*p;
                p=p*10;
            }
        }
        if(s.charAt(0)=='-')
            return -sum;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(convert("123"));

    }
}
