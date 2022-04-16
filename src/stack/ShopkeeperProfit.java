package stack;

import java.util.*;

public class ShopkeeperProfit {
    public static int profit(ArrayList<Integer> arr){
        int n=arr.size();
        Deque<Integer> s=new ArrayDeque<>();
        s.push(arr.get(n-1));
        int res=arr.get(n-1);
        for(int i=n-2;i>=0;i--){
            if(!s.isEmpty()&&s.peek()<arr.get(i))
                s.pop();
            System.out.print(res+" ");
            res+=s.isEmpty()?arr.get(i):s.peek()-arr.get(i);

            s.push(arr.get(i));
        }
        System.out.println();
        return res;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        int ans=profit(arr);
        System.out.println(ans);
    }
}
