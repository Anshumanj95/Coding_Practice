package ArrayPractice;

public class Check_if_array_is_sorted_and_rotated {
    public static boolean sortedRotated(int[] arr){
        int x=0,y=0;
        for (int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1])
                x++;
            else
                y++;
        }
        if(x==1||y==1){
            if(arr[0]>arr[arr.length-1])
                x++;
            else
                y++;
        }
        return x == 1 || y == 1;
    }
    public static void main(String[] args) {
        int[] arr={3,4,1,2};
        System.out.println(sortedRotated(arr));
    }
}
