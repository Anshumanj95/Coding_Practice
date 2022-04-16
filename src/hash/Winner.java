package hash;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Winner {
    public static String[] findWinner(String[] arr,int n){
        HashMap<String,Integer> h=new HashMap<>();
        for(String s:arr){
            h.put(s,h.getOrDefault(s,0)+1);
        }
        String[] ans=new String[2];
        int max=0;
        String win="";
        for(Map.Entry<String,Integer> e : h.entrySet())
        {
            if(e.getValue()>max){
                max=e.getValue();
                win=e.getKey();
            }
            else if(e.getValue()==max&&(win.compareTo(e.getKey())>0))
                    win=e.getKey();
            }
        ans[0]=win;
        ans[1]=Integer.toString(max);
        return ans;

    }
    public static void main(String[] args) {
        String[] votes = {"john","johnny","jackie","johnny","john",
                "jackie","jamie","jamie","john","johnny","jamie",
                "johnny","john"};
        System.out.println(Arrays.toString(findWinner(votes, votes.length)));
    }
}
