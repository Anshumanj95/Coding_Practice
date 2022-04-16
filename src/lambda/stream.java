package lambda;

import java.util.*;

public class stream {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9};
        ArrayList<Integer> al=new ArrayList<>();
        al.add(89);
        al.add(23);
        al.add(21);
        al.add(43);
        Collections.sort(al);
        for(Integer s:al){
            System.out.print(s+" ");
        }
        System.out.println();
        Collections.reverse(al);
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);


//        int sum=Arrays.stream(arr).sum();
//        System.out.println(sum);
//        double avg=Arrays.stream(arr).average().getAsDouble();
//        System.out.println(avg);
//        int max= Arrays.stream(arr).filter(x->x%2!=0).max().getAsInt();
//        System.out.println(max);
//       Scanner sc=new Scanner(System.in);
//        int s=sc.nextInt();
//        sc.nextLine();
//        String s1=sc.nextLine();
//        System.out.println(s1+" "+s);
    }
}
