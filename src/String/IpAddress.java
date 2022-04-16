package String;

import java.util.Scanner;

public class IpAddress {
    public static boolean Valid(String s){
        if(s.length()-s.replace(".","").length()!=3)
            return false;
        String[] ip=s.split("\\.");
        if(ip.length!=4)
            return false;
        for(int i=0;i<ip.length;i++){
            if(ip[i].isEmpty())
                return false;
            for(int j=0;j<ip[i].length();j++){
                if(!Character.isDigit(ip[i].charAt(j)))
                    return false;
            }
            if(ip[i].charAt(0)=='0'&&ip[i].length()>1)
                return false;
            if(Integer.parseInt(ip[i])<0||Integer.parseInt(ip[i])>255)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        System.out.println(Valid(ip));
    }
}
