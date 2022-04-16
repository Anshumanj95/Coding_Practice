package Contest;

public class MakeThemOne {
    static void makeThemOne(int[][] arr,int r,int c)
    {
        //Your code here
        int[] rows=new int[r];
        int[] cols=new int[c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==1)
                {
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(rows[i]==1)
                {
                    arr[i][j]=1;
                }
                if(cols[j]==1)
                {
                    arr[i][j]=1;
                }
            }
        }



        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr={{0,0,0},{0,0,1}};
        makeThemOne(arr,arr.length,arr[0].length);

    }
}
