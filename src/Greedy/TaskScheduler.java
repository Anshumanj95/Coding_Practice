package Greedy;

import java.util.Arrays;

public class TaskScheduler {
    public static int leastTime(char[] tasks,int n){
        int[] freq=new int[26];
        for (char ch:tasks)
            freq[ch-'A']++;
        Arrays.sort(freq);
        int chunks=freq[25]-1;
        int ideal_spot=chunks*n;
        for (int i=24;i>=0;i--)
            ideal_spot-=Math.min(chunks,freq[i]);
        return ideal_spot<0?tasks.length:tasks.length+ideal_spot;
    }
    public static void main(String[] args) {
        char[] tasks={'A','A','A','A','A','A','B','C','D','E','F','G'};
        int n=2;
        System.out.println(leastTime(tasks,n));
    }
}
