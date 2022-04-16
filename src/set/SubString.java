package set;

import java.util.*;

public class SubString {
    public static int Substring(String str){
        int count=0;
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub=str.substring(i,j);
                if(!h.contains(sub)){
                    h.add(sub);
                    System.out.print(sub+" ");
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="abc";
        System.out.println(Substring(s));
    }
}
