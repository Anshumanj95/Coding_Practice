package String.Pattren;

public class RabinKrabMethod {
    static final int d=256;
    static final int q=101;
    public static void search(String txt,String pat){
        int n=txt.length();
        int m=pat.length();
        //Compute (d^(M-1))%q
        int h=1;
        for(int i=1;i<m;i++)
            h=(h*d)%q;
        //Compute p and t
        int p=0,t=0;
        for(int i=0;i<m;i++){
            p=(p*d+pat.charAt(i))%q;
            t=(t*d+txt.charAt(i))%q;
        }

        for(int i=0;i<=n-m;i++){
            //Check for hit
            if(p==t){
                boolean flag=true;
                for(int j=0;j<m;j++){
                    if(pat.charAt(j)!=txt.charAt(i+j)){
                        flag=false;
                        break;
                    }
                }
                if(flag)
                    System.out.print(i+" ");
            }
            //Compute ti+1 using ti
            if(i<n-m){
                t=((d*(t-txt.charAt(i)*h))+txt.charAt(i+m))%q;
                //if t is become negative then -a%b==-a+b%b
                if(t<0)
                    t=t+q;
            }
        }

    }
    public static void main(String[] args) {
        String txt="abdbsklkllsabc";
        String pat="i";
        search(txt,pat);

    }
}
