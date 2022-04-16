package Trie;

import java.util.Arrays;

public class TrieClass {
    static class trieNode{
        trieNode[] child=new trieNode[26];
        boolean isEnd;
        trieNode(){
            Arrays.fill(child,null);
        }
    }
    static trieNode root;
    public static boolean search(String str){
        trieNode curr=root;
        for (int i=0;i<str.length();i++){
            int index=str.charAt(i)-'a';
            if(curr.child[index]==null)
                return false;
            curr=curr.child[index];
        }
        return curr.isEnd;
    }
    public static void insert(String str){
        trieNode curr= root;
        for (int i=0;i<str.length();i++){
            int index=str.charAt(i)-'a';
            if(curr.child[index]==null)
                curr.child[index]=new trieNode();
            curr=curr.child[index];
        }
        curr.isEnd=true;
    }
    public static trieNode delete(trieNode root,String str,int i){
        if(root==null)
            return null;
        if(i==str.length()){
            root.isEnd=false;
            if(isEmpty(root)){
                root=null;
            }
            return root;
        }
        int index=str.charAt(i)-'a';
        root.child[index]=delete(root.child[index],str,i+1);
        if(isEmpty(root)&& !root.isEnd){
            root=null;
        }
        return root;
    }
    public static boolean isEmpty(trieNode root){
        for (int i=0;i<26;i++){
            if (root.child[i]!=null)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        root=new trieNode();
        insert("and");
        insert("bat");
        insert("bad");
        insert("cat");
        insert("cut");
        System.out.println(search("ba"));
        System.out.println(search("bad"));
        delete(root,"bad",0);
        System.out.println(search("bad"));
    }
}
