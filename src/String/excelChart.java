package String;

public class excelChart {
    public static void main(String[] args) {
        String s="";
        int N=51;
        while(--N>=0){
            s=(char)('A'+N%26)+s;
            N/=26;
        }
        System.out.println(s);
    }
    }
