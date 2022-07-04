package ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class onePlus {
    public static ArrayList<Integer> plus(ArrayList<Integer> a){
        int carry=0;
        while(a.size()>1&&a.get(0)==0)
            a.remove(0);
        for(int i=a.size()-1;i>=0;i--){
            int num=a.get(i);
            a.remove(i);
            if(num==9){
                a.add(i,0);
                carry=1;
            }
            else{
                a.add(i,num+1);
                carry=0;
                break;
            }
        }
        if(carry==1){
            a.add(0,1);
        }
        return a;
    }
    // use method used in linkedList for same question
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(0);
        a.add(1);
        a.add(3);
        a.add(4);
        System.out.println(plus(a));
    }
}
