package String;

public class ValidShuffle {
    public static boolean checkLength(String first,String second,String result){
        return first.length()+second.length()== result.length();
    }
    public  static  boolean isValidShuffle(String first,String second,String result){
        int[] count=new int[256];
        for (char ch:first.toCharArray())
            count[ch]++;
        for (char ch:second.toCharArray())
            count[ch]++;
        for (char ch:result.toCharArray())
            count[ch]--;
        for (int i=0;i<256;i++){
            if (count[i]!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String first="XY";
        String second="12";
        String[] results = {"1111", "Y1X2", "Y21XX"};
        for (String result:results){
            if (checkLength(first,second,result) && isValidShuffle(first,second,result))
                System.out.println(result+" is valid of "+first+" and "+second);
            else
                System.out.println(result+" is not valid of "+first+" and "+second);
        }
    }
}
