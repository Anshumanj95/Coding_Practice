package Trie;

public class RenamingCites {
    /*
    Some cities are going to be renamed and accordingly name of their railway stations will also change. Changing the name of railway station should also result in changed station code. Railways have an idea that station code should be the shortest prefix out of all railway stations renamed prior to this. If some city has same name, then prefix will be the name with suffix as the count of occurence of that city prior to this and including this, seperated with spaces.

Given N renamed cities consisting of lowercase alphabets only. The task is to generate a station ID for all the stations.
     */
    static class TrieNode{
        TrieNode[] child=new TrieNode[26];
        int freq=0;
    }
    public static void check(String[] arr,int n)
    {
        //Your code here
        TrieNode root=new TrieNode();
        for(int i=0;i<n;i++){
            String s=insert(root,arr[i]);
            System.out.println(s);
        }
    }
    public static String insert(TrieNode root, String str){
        String prefix="";
        boolean flag=false;
        TrieNode curr=root;
        for(int i=0;i<str.length();i++){
            int index=str.charAt(i)-'a';
            if(curr.child[index]==null){
                curr.child[index]=new TrieNode();
                if(!flag){
                    prefix=prefix+str.charAt(i);
                }
                flag=true;
            }
            else{
                prefix=prefix+str.charAt(i);
            }
            curr=curr.child[index];
        }
        curr.freq++;
        if(curr.freq>1){
            prefix=prefix+" "+String.valueOf(curr.freq);
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] arr={"shimla","safari","jammu","delhi","jammu","dehradun"};
        check(arr,arr.length);
    }
}
