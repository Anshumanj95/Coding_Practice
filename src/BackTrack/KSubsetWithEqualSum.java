package BackTrack;

public class KSubsetWithEqualSum {
    public static boolean isPossible(int[] arr,int k){
        int sum=0;
        for (int i:arr)
            sum+=i;
        if (sum%k!=0)
            return false;
        if (arr.length<k)
            return false;
        int tsum=sum/k;
        boolean[] visited=new boolean[arr.length];
        return solve(0,arr,k,tsum,visited,0);
    }
    public static boolean solve(int idx,int[] arr,int k,int tsum,boolean[] visited,int curr){
        if (k==0)
            return true;
        if (curr>tsum)
            return false;
        if (curr==tsum)
            return solve(0,arr,k-1,tsum,visited,0);
        for (int i=idx;i<arr.length;i++){
            if (visited[i])
                continue;
            visited[i]=true;
            if (solve(i+1,arr,k,tsum,visited,curr+arr[i]))
                return true;
            visited[i]=false;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={3,5,2,4,4};
        System.out.println(isPossible(arr,2));
    }
}
