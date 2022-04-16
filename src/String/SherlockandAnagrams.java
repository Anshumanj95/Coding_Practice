package String;

import java.util.ArrayList;

public class SherlockandAnagrams {
    public static int countAnagram(String s){
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for (int j=1;j<=s.length()-i;j++){
                String sub=s.substring(i,i+j);
                list.add(sub);
            }
        }
        int count=0;
        for (int i=0;i<list.size();i++){
            String curr=list.get(i);
            for(int j=i+1;j<list.size();j++){
                if(isAnagram(list.get(j),curr))
                    count++;
            }
        }
        return count;
    }
    public static boolean isAnagram(String a,String b){
        if(a.length()!=b.length())
            return false;
        int[] arr=new int[26];
        for (int i=0;i<a.length();i++)
            arr[a.charAt(i)-'a']++;
        for (int i=0;i<b.length();i++)
            arr[b.charAt(i)-'a']--;
        for (int i=0;i<26;i++) {
            if (arr[i] != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="abba";
        System.out.println(countAnagram(s));
    }
}
