package stack;

public class Count_theReversals {
    /*
    Given a string S consisting of only opening and closing curly brackets '{' and '}', find out the minimum number of reversals required to      convert the string into a balanced expression.
    A reversal means changing '{' to '}' or vice-versa.
1. Whenever we get open brackets, add them.
2.Whenever we get closing brackets and we have open ones available, just remove extra open brackets you have.
3.When we don't have enough opening brackets ,(c=0) then reverse the closing bracket we encountered immediately.
4.In the end, u may have some open brackets indicated by ‘c’. Example: c=3, then we can think of resultant as {{{ , we can notice that no reversal can fix this, so return -1 when c is odd. When c is even, example c=4, {{{{ => {{}} it can be changed this way by reversing half of the open brackets. so add c/2 to the result.
     */
    public static int countReverse(String s){
        int open=0;
        int res=0;
        for (char ch:s.toCharArray()){
            if(ch=='{')
                open++;
            else{
                if(open==0){
                    res++;
                    open++;
                }
                else
                    open--;
            }
        }
        if (open%2==1)
            return -1;
        res+=open/2;
        return res;
    }
    public static void main(String[] args) {
        String s="}{{}}{{{";
        System.out.println(countReverse(s));
    }
}
