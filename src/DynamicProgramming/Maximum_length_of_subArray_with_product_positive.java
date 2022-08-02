package DynamicProgramming;

public class Maximum_length_of_subArray_with_product_positive {
    public static int getMaxLen(int[] arr){
        int pos=0,neg=0;
        int ans=0;
        for (int x:arr){
            if (x==0){
                pos=0;
                neg=0;
            }
            else if (x>0){
                pos++;
                neg=(neg>0)?1+neg:0;
            }
            else {
                int temp=pos;
                pos=(neg>0)?1+neg:0;
                neg=1+temp;
            }
            ans=Math.max(ans,pos);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={9,5,8,2,-6,4,-3,0,-2,-5};
        System.out.println(getMaxLen(arr));
    }
}
