package bits;

public class oneOddOccur {
    public static int find(int[] arr){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        return xor;
    }
    // same logic use for finding missing number between 1 to n+1 and in given range
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,5,3,5,5};
        System.out.println(find(arr));
    }
}
