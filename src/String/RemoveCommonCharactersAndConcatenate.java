package String;

public class RemoveCommonCharactersAndConcatenate {
    public static String removeCommon(String a,String b){
        StringBuilder s=new StringBuilder();
        for(char c:a.toCharArray()){
            if(b.indexOf(c)==-1)
                s.append(c);
        }
        for(char c:b.toCharArray()){
            if(a.indexOf(c)==-1)
                s.append(c);
        }
        return s.toString().length()==0?"-1":s.toString();
    }
    public static void main(String[] args) {

    }
}
