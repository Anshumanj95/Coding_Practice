package BackTrack;

public class PremuteStringDoesNotConatinAB {
    public static void premute(String str,int l,int r){
        if(l==r){
            //for naive approach just add one condition here if(!str.contains("AB")) then print else ignore
            System.out.print(str+" ");
            return;
        }
        else{
            for(int i=l;i<=r;i++){
                if(isSafe(str,l,i,r)){
                    str=new String(swap(str,i,l));
                    premute(str,l+1,r);
                    str=new String(swap(str,i,l));
                }
            }
        }
    }
    public static char[] swap(String str,int i,int j){
        char[] ch=str.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return ch;
    }
    public static boolean isSafe(String str,int l,int i,int r){
        if(l!=0 && str.charAt(l-1)=='A'&& str.charAt(i)=='B')
            return false;
        if(r==(l+1) &&str.charAt(i)=='A'&& str.charAt(l)=='B')
            return false;
        return true;
    }
    public static void main(String[] args) {
        String str="ABC";
        premute(str,0,str.length()-1);

    }
}
