package stack;
import java.util.Scanner;
import java.util.Stack;

public class balancedParenthesis {
    public static boolean isMatch(char a,char b){
        return ((a=='('&&b==')')||(a=='{'&&b=='}')||(a=='['&&b==']'));
    }
    public static boolean balance(String s){
        Stack<Character> stack=new Stack<>();
        //use both but preferred ArrayDeque in single thread environment.
       // Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='('||x=='{'||x=='['){
                stack.push(x);
            }
            else{
                if(stack.isEmpty())
                    return false;
                else if(!isMatch(stack.peek(),x))
                    return false;
                else
                    stack.pop();
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(balance(str))
            System.out.println(str+" has balanced Parenthesis");
        else
            System.out.println(str+" has not balanced Parenthesis");

        StringBuilder s=new StringBuilder();

    }
}
