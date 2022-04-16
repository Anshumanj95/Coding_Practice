package String;

import java.util.HashMap;

public class Smallest_window_in_a_string_containing_all_the_characters_of_another_string {
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<p.length();i++){
            h.put(p.charAt(i),h.getOrDefault(p.charAt(i),0)+1);
        }
        int count=h.size();
        int i=0,j=0,max=Integer.MAX_VALUE,n=s.length();
        String ans="-1";
        while(j<=n){
            if(count!=0){
                if(j<n &&h.containsKey(s.charAt(j))){
                    h.replace(s.charAt(j),h.get(s.charAt(j))-1);
                    if(h.get(s.charAt(j))==0){
                        count--;
                    }
                }
                j++;
            }else if(j<=n){
                if((j-i)<max){
                    max=j-i;
                    ans=s.substring(i,j);
                }
                if(h.containsKey(s.charAt(i))){
                    h.replace(s.charAt(i),h.get(s.charAt(i))+1);
                    if(h.get(s.charAt(i))==1){
                        count++;
                    }
                }
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="timetopractice";
        String p="toc";
        System.out.println(smallestWindow(str,p));

    }
}
