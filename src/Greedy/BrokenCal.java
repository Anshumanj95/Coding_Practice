package Greedy;

public class BrokenCal {
    // instead of move from start to target move from target to start
    // instead using multiplication and subtraction use division and addition
    public static int calculate(int start,int target){
        int i=0;
        while (target>start){
            i++;
            if (target%2==1)
                target++;
            else
                target/=2;
        }
        return i+start-target;
    }
    public static void main(String[] args) {
        System.out.println(calculate(5,8));
    }
}
