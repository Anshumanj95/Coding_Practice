package set.TreeSet;

import java.util.ArrayList;
import java.util.TreeSet;

public class CeilingOnRigth {
    public static void ceil(int[] arr){
        TreeSet<Integer> t=new TreeSet<>();
        int[] res=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            Integer ceil=t.ceiling(arr[i]);
            if(ceil==null)
                res[i]=-1;
            else
                res[i]=ceil;
            t.add(arr[i]);
        }
        for(int e:res)
            System.out.print(e+" ");

    }
    public static void main(String[] args) {
        int[] arr={100,50,30,60,55,32};
//        ceil(arr);
        String s="fdfdfd";
        TreeSet<String> t=new TreeSet<>();
        for(int i=0;i<s.length();i++){
            t.add(s.substring(i,i+1));
        }
        StringBuilder s1= new StringBuilder();
        for(String e:t)
            s1.append(e);
        System.out.print(s1.toString());
    }
}
