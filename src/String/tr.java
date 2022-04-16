package String;

import java.util.Arrays;
import java.util.Locale;

public class tr {
    public static void main(String[] args) {
//        String str1="sjijoifjojooiAsdHJIsds";
//        System.out.println(str1.toUpperCase());
//        String number="234577432";
//        char temp[]=number.toCharArray();
//        Arrays.sort(temp);
//        for(int i= temp.length-1;i>=0;i--){
//            System.out.print(temp[i]+" ");
        //revesre an string
        String str1="sjijoifjojooiAsdHJIsds";
        char[] ans=str1.toCharArray();
        String ansn="";
        char[] temp=new char[ans.length];
        for(int i=0;i< temp.length-1;i++){
            temp[i]=ans[ans.length-1-i];
        }
        ansn=String.valueOf(temp);
        System.out.println(ansn);

//        String a="asvfsaaghaa";
//        char[] a1=a.toCharArray();
//        char[] frequency=new char[26];
//        for(int i=0;i<26;i++){
//            frequency[i]=0;
//        }
//        for(int i=0;i<a1.length;i++){
//            frequency[a1[i]-'a']++;
//        }
//        char ans='a';
//        int maxF=0;
//        for(int i=0;i<26;i++){
//           if(frequency[i]>=maxF){
//               maxF=frequency[i];
//               ans= (char) (i+'a');
//           }
//        }
//        System.out.println(maxF+" "+ans);
    }
}