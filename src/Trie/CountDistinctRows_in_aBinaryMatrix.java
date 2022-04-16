package Trie;

public class CountDistinctRows_in_aBinaryMatrix {
    //int this Trie node class we don't have is end because length of every row is same
    //we use size 2 because matrix contains only 1 and 0
    static class TrieNode{
        TrieNode[] child=new TrieNode[2];
        TrieNode(){
            child[0]=null;
            child[1]=null;
        }
    }
    public static boolean insert(TrieNode root,int row,int[][] mat,int n){
        TrieNode curr=root;
        boolean flag=false;
        for (int i=0;i<n;i++){
            int index=mat[row][i];
            if(curr.child[index]==null){
                curr.child[index]=new TrieNode();
                flag=true;
            }
            curr=curr.child[index];
        }
        return flag;
    }
    public static int count(int[][] mat){
        TrieNode root=new TrieNode();
        int res=0;
        int m=mat.length;
        int n=mat[0].length;
        for (int row=0;row<m;row++){
            if (insert(root,row,mat,n))
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat={{1,1,1,1},{1,0,0,1},{1,0,1,0},{1,1,1,1}};
        System.out.println(count(mat));
    }


}
