package ArrayPractice;

import java.util.ArrayList;

public class KthRowOfPascal {
    public static ArrayList<Integer> kthRow(int k){
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        for (int i=1,j=k;i<=k;i++,j--){
            int c=((ans.get(i-1)*j)/i);
            ans.add(c);
        }
        return ans;
    }
    // first k row of pascal triangle
    public ArrayList<ArrayList<Integer>> solve(int k) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(k==0)
            return ans;
        ArrayList<Integer> first=new ArrayList<>();
        first.add(1);
        ans.add(first);
        for(int i=1;i<k;i++){
            ArrayList<Integer> curr=new ArrayList<>();
            curr.add(1);
            for(int a=1,b=i;a<=i;a++,b--){
                int c=((curr.get(a-1)*b)/a);
                curr.add(c);

            }
            ans.add(curr);
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(kthRow(4));
    }
}
