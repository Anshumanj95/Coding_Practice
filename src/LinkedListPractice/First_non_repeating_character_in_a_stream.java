package LinkedListPractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class First_non_repeating_character_in_a_stream {
    public static String FirstNonRepeating(String s){
        StringBuilder ans=new StringBuilder();
        int[] repCh=new int[26];
        Deque<Character> q=new ArrayDeque<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (repCh[ch-'a']==0)
                q.add(ch);
            repCh[ch-'a']++;
            while (!q.isEmpty() && repCh[q.peek()-'a']!=1)
                q.poll();
            ans.append(q.isEmpty()?'#':q.peek());
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String stream="aabc";
        System.out.println(FirstNonRepeating(stream));
    }
}
