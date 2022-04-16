package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RamsonNote {
    public static void checkMagazine(List<String> magazine, List<String> note) {
        HashMap<String,Integer> map1=new HashMap<>();
        for (String i:magazine)
            map1.put(i,map1.getOrDefault(i,0)+1);
        System.out.println(map1);
        for (String i:note){
            if (map1.containsKey(i) && map1.get(i)>0){
                map1.replace(i,map1.get(i)-1);
            }
            else{
                System.out.println("No");
                return;
            }
            System.out.println(map1);
        }
        System.out.println("Yes");

    }
    public static void main(String[] args) {
        List<String> maganize=new ArrayList<>(Arrays.asList("two","times","three","is","not","four"));
        List<String> note=new ArrayList<>(Arrays.asList("two","times","two","four"));
        checkMagazine(maganize,note);

    }
}
