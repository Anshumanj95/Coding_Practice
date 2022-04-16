package Contest;

import java.util.Arrays;
import java.util.Scanner;

public class TheOneOnTheLastNight {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int k=sc.nextInt();
        char[] str=n.toCharArray();
        Arrays.sort(str);
        int st=1;
        while(k>=1 && str[0]!='9'){
            for(int i=0;i<str.length;i++){
                if(k<1)
                    break;
                if(str[i]=='9')
                    break;
                while(str[i]<(st+'0') &&k>=1){
                    str[i]= (char) (str[i]+1);
                    k--;
                }
            }
            st++;
        }
        long ans=1;
        for(int i=0;i<str.length;i++){
            ans*=(str[i]-'0');
        }
        System.out.println(ans);

    }
}
