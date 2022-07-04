package Interviewbit.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumber {
    public static ArrayList<Integer> addOne(ArrayList<Integer> num){
        int carry=0;
        while (num.size()>1 && num.get(0)==0)
            num.remove(0);
        for (int i = num.size()-1; i >=0 ; i--) {
            int curr=num.get(i);
            num.remove(i);
            if (curr==9){
                num.add(i,0);
                carry=1;
            }
            else{
                num.add(i,curr+1);
                carry=0;
                break;
            }
        }
        if (carry==1)
            num.add(0,1);
        return num;
    }
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        number.add(9);
        number.add(9);
        number.add(9);
        System.out.println(addOne(number));
    }
}
