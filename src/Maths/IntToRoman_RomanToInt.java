package Maths;

import java.util.HashMap;

public class IntToRoman_RomanToInt {
    public static int RomanToInt(String roman){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n=roman.length();
        int ans=map.get(roman.charAt(n-1));
        for (int i=n-2;i>=0;i--){
            if (map.get(roman.charAt(i))>=map.get(roman.charAt(i+1)))
                ans+=map.get(roman.charAt(i));
            else
                ans-=map.get(roman.charAt(i));
        }
        return ans;
    }
    public static String IntToRoman(int num){
        int[] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();
        for (int i=0;i< value.length;i++){
            while (num>=value[i]){
                num-=value[i];
                sb.append(roman[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int num=1994;
        String roman=IntToRoman(num);
        System.out.println(roman);
        System.out.println(RomanToInt(roman));
    }
}
