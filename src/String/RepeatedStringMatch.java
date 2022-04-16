package String;

public class RepeatedStringMatch {
    public static int check(String A,String B){
       int count=1;
       int len=A.length();
       for (int i=0;i<(B.length()/len)+2;i++){
           if (A.contains(B))
               return count;
           else{
               A+=A.substring(0,len);
               count++;
           }
       }
       return -1;
    }
    public static void main(String[] args) {
        String A="aa";
        String B="a";
        System.out.println(check(A,B));

    }
}
