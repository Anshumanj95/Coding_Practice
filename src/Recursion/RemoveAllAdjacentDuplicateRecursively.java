package Recursion;

public class RemoveAllAdjacentDuplicateRecursively {
    public static String removeAll(String s){
       if (s.length()<=1)
           return s;
       StringBuilder str=new StringBuilder();
       for (int i=0;i<s.length()-1;i++){
           if (s.charAt(i)==s.charAt(i+1)){
               int j=i+1;
               while (j<s.length() && s.charAt(i)==s.charAt(j)) j++;
               i=j-1;
           }
           else
               str.append(s.charAt(i));
       }
       if (s.charAt(s.length()-2)!=s.charAt(s.length()-1))
           str.append(s.charAt(s.length()-1));
       if (s.length()==str.length())
           return s;
       return removeAll(str.toString());
    }
    public static void main(String[] args) {
        System.out.println(removeAll("abccbccba"));

    }
}
