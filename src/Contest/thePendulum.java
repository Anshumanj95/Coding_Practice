package Contest;

import java.util.*;

public class thePendulum {
    public static ArrayList<Integer> pendulum(ArrayList<Integer> arr){
        Collections.sort(arr);
        ArrayDeque<Integer> a=new ArrayDeque<>();
        int t=0;
        for(int i=0;i<arr.size();){
            if(t==0){
                a.offerFirst(arr.get(i));
                i++;
                if(i<arr.size()){
                    a.offerFirst(arr.get(i));
                    i++;
                }
                t=1;
            }
            else{
                a.offerLast(arr.get(i));
                i++;
                if(i<arr.size()){
                    a.offerLast(arr.get(i));
                    i++;
                }
                t=0;
            }
        }
        arr.clear();
        arr.addAll(a);
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(5);
        pendulum(arr);
        System.out.println(arr);
    }
}
