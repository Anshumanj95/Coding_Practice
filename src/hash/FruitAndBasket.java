package hash;

import java.util.HashMap;

public class FruitAndBasket {
    public static int findMaxFruits(String str,int n){
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0;
        for (int i=0,j=0;j<n && i<n;){
            char ch=str.charAt(j);
            if (map.size()<2){
                map.put(ch,map.getOrDefault(ch,0)+1);
                j++;
            }
            else if(map.size()==2){
                if (map.containsKey(ch)){
                    map.put(ch,map.getOrDefault(ch,0)+1);
                    j++;
                }
                else{
                    char chI=str.charAt(i);
                    map.put(chI,map.get(chI)-1);
                    i++;
                    if (map.get(chI)==0){
                        map.remove(chI);
                        map.put(ch,1);
                        j++;
                    }
                }
            }
            int curr=0;
            for (int val:map.values())
                curr+=val;
            ans=Math.max(ans,curr);
        }

        return ans;
    }
    public static void main(String[] args) {
        String str="DEADDC";
        System.out.println(findMaxFruits(str,str.length()));
    }
}
