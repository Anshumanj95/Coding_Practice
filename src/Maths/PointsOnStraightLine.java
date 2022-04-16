package Maths;

import java.util.HashMap;
import java.util.Map;

public class PointsOnStraightLine {
    public static int count(int[] X,int[] Y,int n){
        int ans=0;
        Map<Double,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                    int x1=X[i];
                    int y1=Y[i];
                    int x2=X[j];
                    int y2=X[j];
                    if (x1==x2)
                        map.put(Double.MAX_VALUE,map.getOrDefault(Double.MAX_VALUE,0)+1);
                    else{
                        double m=(double)(y2-y1)/(x2-x1);
                        map.put(m,map.getOrDefault(m,0)+1);
                        ans= java.lang.Math.max(ans,map.get(m));
                    }
                }
            }
        return ans;
    }
    public int mostBalloons(int N, int arr[][]) {
        // Code here
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int x1 = arr[i][0], y1 = arr[i][1];
            Map<Double, Integer> map = new HashMap<>();
            int count = 0;
            for (int j = 0; j < N; j++) {
                int x2 = arr[j][0];
                int y2 = arr[j][1];
                if (x1 == x2 && y1 == y2) {
                    count++;
                    continue;
                }
                double m = (double) (y2 - y1) / (x2 - x1);
                map.put(m, map.getOrDefault(m, 0) + 1);
            }
            for (double z : map.keySet())
                ans = java.lang.Math.max(ans, count + map.get(z));
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] x={1,3,5,4,2,1};
        int[] y={1,2,3,1,3,4};
        System.out.println(count(x,y,x.length));

    }
}
