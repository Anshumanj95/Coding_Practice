package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaximumFrequencyStack {
    static class FreqStack {
        Map<Integer,Integer> freq;
        Map<Integer, Stack<Integer>> group;
        int mostFreq;
        public FreqStack() {
            freq=new HashMap<>();
            group=new HashMap<>();
            mostFreq=0;
        }
        public void push(int val) {
            int currFreq=freq.getOrDefault(val,0)+1;
            freq.put(val,currFreq);
            mostFreq=Math.max(currFreq,mostFreq);
            group.computeIfAbsent(currFreq,z->new Stack<>()).push(val);
        }
        public int pop() {
            int popped=group.get(mostFreq).pop();
            freq.put(popped,freq.get(popped)-1);
            if (group.get(mostFreq).size()==0)
                mostFreq--;
            return popped;

        }
    }
    public static void main(String[] args) {
        FreqStack freqStack=new FreqStack();
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(4);
        freqStack.push(5);
        freqStack.pop();
        freqStack.pop();
        freqStack.pop();
        freqStack.pop();
    }
}
