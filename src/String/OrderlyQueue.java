package String;

import java.util.Arrays;

public class OrderlyQueue {
    public static String orderlyQueue(String s,int k){
        if (k>1){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
        else{
            String ans=s;
            for (int i=0;i<s.length();i++){
                s=s.substring(1)+s.substring(0,1);
                if (ans.compareTo(s)>0)
                    ans=s;
            }
            return ans;
        }
    }
    public static void main(String[] args) {

    }
}
