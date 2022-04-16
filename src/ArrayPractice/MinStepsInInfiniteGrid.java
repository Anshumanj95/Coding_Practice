package ArrayPractice;

import java.util.ArrayList;
// logic is move first daigonal then if we are reach at last point or your any coordinate same as destination then move acc. to given point either vertical or horizontal
//dx=x2-x1 dy=y2-y1
// answer is =daigonal steps+reaming one =min(dx,dy)+abs(dx-dy)=max(dx,dy);
public class MinStepsInInfiniteGrid {
    public static int minSteps(ArrayList<Integer> a,ArrayList<Integer> b){
        if(a.size()!=b.size())
            return 0;
        int dx,dy;
        int steps=0;
        for(int i=0;i<a.size()-1;i++){
            dx=Math.abs(a.get(i+1)-a.get(i));
            dy=Math.abs(b.get(i+1)-b.get(i));
            steps+=Math.max(dx,dy);
        }
        return steps;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(1);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(2);
        b.add(2);
        System.out.println(minSteps(a,b));

    }
}
