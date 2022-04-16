package hash;

import java.util.*;

public class SortByFrequency {
    public static ArrayList<Integer> sort(int[] arr){
        Map<Integer,Integer> freqMap = new HashMap<>();
        for (int ele : arr)
            freqMap.put( ele , freqMap.getOrDefault(ele,0)+1 );

        Map<Integer,Integer> sortedFreqMap = freqMap.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue
                (Comparator.reverseOrder()).thenComparing(Map.Entry.comparingByKey())).collect
                (java.util.stream.Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap:: new));

        ArrayList<Integer> sortedList = new ArrayList<>();
        sortedFreqMap.forEach((key,value) ->
        {   for (int f=1; f<=value; f++)
            sortedList.add( key );
        });
        return sortedList;
    }
    public static void main(String[] args) {

    }
}
