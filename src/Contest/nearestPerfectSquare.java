package Contest;

public class nearestPerfectSquare {
    static int N=(int)10e7+2;
    static int[] squares=new int[N];
    public static void square(){
        for(int i=0;i<N;i++){
            squares[i]=i*i;
        }
    }
    public static long find(int n) {
        long value=(long)Math.floor(Math.sqrt(n));
        long low;
        long high;
        if(value*value==n){
           low=(value-1)*(value-1);

        }
        else{
            low=value*value;
        }
        high=(value+1)*(value+1);
        long lowDiff=n-low;
        long highDiif=high-n;
        if(lowDiff==highDiif){
            return Math.max(low,high);
        }
        return (lowDiff<highDiif)?low:high;
    }
    public static void main(String[] args) {
        System.out.println(find(100));

    }
}
