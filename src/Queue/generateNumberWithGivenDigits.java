package Queue;
import java.util.*;
// function to generate n number with given digits in increasing order
public class generateNumberWithGivenDigits {
    static ArrayList<String> generate(int n){
        ArrayList<String> ans=new ArrayList<>();
        Queue<String> q=new ArrayDeque<>();
        q.offer("5");
        q.offer("6");
        for(int i=0;i<n;i++){
        String curr=q.poll();
        ans.add(curr);
        q.offer(curr+"5");
        q.offer(curr+"6");
    }
    return ans;
}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<String> ans=generate(n);
        System.out.println(ans);
    }
}
