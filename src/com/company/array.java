package com.company;


public class array {
    public static void main(String[] args) {
        /*
        float[] floats = new float[5];
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < floats.length; i++) {
            float f = sc.nextFloat();
            floats[i] = f;
            sum = sum + f;
        }
        System.out.println(sum);
        boolean inArray = false;
        float key = sc.nextFloat();
        for (float elements : floats) {
            if (key==elements) {
                inArray = true;
                break;
            }
        }
        if (inArray)
            System.out.println("the value is present");
        else
            System.out.println("not in array");


        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] result = {{0,0,0}, {0,0,0}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }


        int [] arr={12,4,6,455,7,8,5,1};

        int l=Math.floorDiv(arr.length,2);
        int temp;
        for(int i=0;i<l;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;


        }
        for(int element:arr)
            System.out.print(element+" ");
        System.out.println();
        int max=0;
        for(int e:arr){
            if(e>max)
                max=e;
        }
        System.out.print(max+" ");
        int min=Integer.MAX_VALUE;
        for(int e:arr){
            if(e<min)
                min=e;
        }
        System.out.print(min);

         */
        int [] arr={1,2,3,4,5};
        boolean isSorrted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorrted=false;
            }
        }
        if(isSorrted)
            System.out.println("Sorted Array");
        else
            System.out.println("Unsorted Array");

    }
}