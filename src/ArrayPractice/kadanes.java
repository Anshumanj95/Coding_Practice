package ArrayPractice;

public class  kadanes {
    public static int KandanesAlgo(int[] arr){
        int max_so_far=arr[0];
        int max_end_here=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            max_end_here=Math.max(max_end_here+arr[i],arr[i]);
            max_so_far=Math.max(max_end_here,max_so_far);
        }
        return max_so_far;
    }
    public static void startAndEndIndex(int[] arr){
        int curr=0;
        int maxSum=Integer.MIN_VALUE;
        int s=0,start=0,end=0;
        for (int i=0;i<arr.length;i++){
            curr+=arr[i];
            if (curr>maxSum){
                maxSum=curr;
                start=s;
                end=i;
            }
            if (curr<0){
                curr=0;
                s=i+1;
            }
        }
        System.out.println(maxSum+" "+start+" "+end);
    }
    static String maxSum(String w,char[] x,int[] b, int n) {
        //code here
        int s = 0, start = 0, end = 0;
        int maxSum = 0;
        int curr = 0;
        for (int i = 0; i < w.length(); i++) {
            curr+=ascii(x,w.charAt(i),b);
            if (curr > maxSum) {
                maxSum = curr;
                start = s;
                end = i;
            }
            if (curr < 0) {
                curr = 0;
                s = i + 1;
            }
        }
        return w.substring(start, end + 1);
    }
    public static int ascii(char[] x,char c,int[] b){
        for(int i=0;i<b.length;i++){
            if(x[i]==c)
                return b[i];
        }
        return c;
    }
    public static void main(String[] args) {
//        int[] arr={-4,-2,-3,-1};
//        int[] arr2={97,98,-1000,100,101};
//        System.out.println(KandanesAlgo(arr));
//        startAndEndIndex(arr2);
        String s="dbfbsdbf ";
        char[] x={'b','s'};
        int[] b={-100,45};
        System.out.println(maxSum(s,x,b,x.length));

    }
}
