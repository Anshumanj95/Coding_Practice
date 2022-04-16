package Queue;

public class FirstCircularTour {
    //O(n) ans O(1) space
    public static int CircularTour(int[] petrol,int[] distance){
        int start=0;
        int curr_petrol=0;
        int prev_petrol=0;
        for(int i=0;i<petrol.length;i++){
            curr_petrol+=(petrol[i]-distance[i]);
            if(curr_petrol<0){
                start=i+1;
                prev_petrol+=curr_petrol;
                curr_petrol=0;
            }
        }
        return (curr_petrol+prev_petrol>=0)?start:-1;
    }
    public static int naive(int[] petrol,int[] distance){
        for(int start=0;start<petrol.length;start++){
            int end=start;
            int curr_petrol=0;
            while (true){
                curr_petrol+=(petrol[end]-distance[end]);
                if(curr_petrol<0)
                    break;
                end=(end+1)%petrol.length;
                if(end==start)
                    return start;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] petrol={50,10,60,100};
        int[] distance={30,20,100,10};
        System.out.println(naive(petrol,distance));
    }
}
