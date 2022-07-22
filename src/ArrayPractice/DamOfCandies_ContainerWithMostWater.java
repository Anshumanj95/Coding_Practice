package ArrayPractice;

public class DamOfCandies_ContainerWithMostWater {
    public static int MaxArea(int[] arr,int n){
        int l=0;
        int r=n-1;
        int ans=0;
        while (l<r){
            int curr=Math.min(arr[l],arr[r]);
            ans=Math.max(ans,curr*(r-l-1)); // in container with most water (r-l) in place of(r-l-1)
            if (arr[l]<arr[r])
                l++;
            else
                r--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,4,6,5};
        System.out.println(MaxArea(arr,arr.length));
    }
}
