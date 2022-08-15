package graph;

import java.util.*;

public class Word_ladder {
    public static int minLadderLen(String start, String end, List<String> wordList){
        HashSet<String> set=new HashSet<>(wordList);
        if (!set.contains(end))
            return 0;
        Queue<String> q=new ArrayDeque<>();
        Set<String> visited=new HashSet<>();
        q.add(start);
        visited.add(start);
        int count=1;
        while (!q.isEmpty()){
            int size= q.size();
            for (int i=0;i<size;i++){
                String word=q.poll();
                if (word.equals(end))
                    return count;
                for (int j=0;j<word.length();j++){
                    for (int k='a';k<='z';k++){
                        char[] arr=word.toCharArray();
                        arr[j]=(char) k;
                        String str=new String(arr);
                        if (set.contains(str)&&!visited.contains(str)){
                            q.add(str);
                            visited.add(str);
                        }
                    }
                }
            }
            count++;
        }
        return 0;

    }
    public static void main(String[] args) {
        String start="hit";
        String end="cog";
        List<String> wordList=new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        System.out.println(minLadderLen(start,end,wordList));

    }
}
