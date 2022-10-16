package ArrayPractice;

import java.util.ArrayList;
import java.util.Collections;

public class AddTwoNumberByArray {
    public ArrayList<Integer> addArrays(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i=A.size()-1;
        int j=B.size()-1;
        int carry=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i>=0 || j>=0 || carry==1){
            int a=(i<0)?0:A.get(i);
            int b=(j<0)?0:B.get(j);
            int sum=a+b+carry;
            ans.add(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        Collections.reverse(ans);
        return ans;

    }
    public static void main(String[] args) {

    }
}
