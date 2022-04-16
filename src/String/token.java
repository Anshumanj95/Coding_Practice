package String;

import java.util.Scanner;

public class token {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        if(s.length()>0) {
            String[] token = s.split("[!,?._'@\\s]+");
            System.out.println(token.length);
            for (int i = 0; i < token.length; i++) {
                System.out.println(token[i]);
            }
        }
        else
            System.out.println(0);
    }
}
