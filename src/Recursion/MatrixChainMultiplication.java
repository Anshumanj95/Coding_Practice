package Recursion;

public class MatrixChainMultiplication {
    public static int matrixChain(int[] arr,int i ,int j){
        if(i+1==j)
            return 0;
        int res=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            res=Math.min(res,matrixChain(arr,i,k)+matrixChain(arr,k,j)+arr[i]*arr[k]*arr[j]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={2,1,3,4};
        System.out.println(matrixChain(arr,0,arr.length-1));
    }
}
