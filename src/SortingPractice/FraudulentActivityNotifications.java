package SortingPractice;

import java.util.ArrayList;
import java.util.List;

public class FraudulentActivityNotifications {
    public static int activityNotifications(List<Integer> e, int d) {
        // Write your code here
        int sent=0;
        if(d>=e.size()-1)
            return 0;
        ArrayList<Integer> arr=new ArrayList<>(d);
        for(int i=0;i<d;i++){
            arr.add(i,e.get(i));
        }
        System.out.println(arr);
        System.out.println(arr.size());
        for(int i=d;i<e.size()-1;i++){
            int median=0;
            if(arr.size()%2==0)
                median=arr.get(arr.size()/2)+arr.get((arr.size()-1)/2);
            else
                median=arr.get(arr.size()/2);
            if(e.get(d)>=2*median)
                sent++;
            arr.remove(0);
            arr.add(arr.size(),e.get(i));
            System.out.println(arr);

        }
        return sent;

    }
    public static void main(String[] args) {
        List<Integer> e=new ArrayList<>();
        e.add(10);
        e.add(20);
        e.add(30);
        e.add(40);
        e.add(50);
        System.out.println(activityNotifications(e,3));

    }
}
