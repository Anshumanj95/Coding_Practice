package com.company;
import java.util.Scanner;

public class hotleBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Punjabi_Paneer = 160, Butter_Paneer_Masala = 180, Matar_Paneer = 150, Dum_Aalo = 140, Mix_Veg = 130, Dal_Tadka = 120;
        int Tava_roti = 5, Tandoori_Roti = 7, Butter_tandoori = 10, lacha_Paratha = 25;
        int Gulab_jaamun = 15, Kajar_halwa = 60, Papad = 10, Salad = 30;
        int sum = 0;
        String order = "";
        boolean quit = false;
        System.out.println("What is your Good name Sir! ");
        String s = sc.next();
        System.out.println("Welcome to Punjabi Restaurant  " + s);
            System.out.println("\t\t\tMenu");
            String[] Sabzi = {"1.Punjabi Paneer\t 160", "2.Butter Paneer Masala\t 180", "3.Matar Paneer\t 150", "4.Dum Aalo\t 140", "5.Mix Veg\t 130", "6.Dal Tadka\t 120"};
            for (String a : Sabzi)
                System.out.println(a);
            String[] roti = {"7.Tava roti\t 5", "8.Tandoori Roti\t 7", "9.Butter tandoori\t 10", "10.lacha Paratha\t 25"};
            for (String b : roti)
                System.out.println(b);
            String[] Sweet = {"11.Gulab jaamun\t 15", "12.Kajar halwa\t 60", "13.Papad\t 10", "14.Salad\t 30","15.quit"};
            for (String c : Sweet)
                System.out.println(c);
            do{
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Punjabi Paneer");
                    sum = sum + Punjabi_Paneer;
                    order = order.concat("Punjabi Paneer\n");
                    break;
                case 2:
                    System.out.println("Butter Paneer Masala");
                    sum = sum + Butter_Paneer_Masala;
                    order = order.concat("Butter Paneer Masala\n");
                    break;
                case 3:
                    System.out.println("Matar Paneer");
                    sum = sum + Matar_Paneer;
                    order = order.concat("Matar Paneer\n");
                    break;
                case 4:
                    System.out.println("Dum Aalo");
                    sum = sum + Dum_Aalo;
                    order = order.concat("Dum Aalo\n");
                    break;
                case 5:
                    System.out.println("Mix Veg");
                    sum = sum + Mix_Veg;
                    order = order.concat("Mix Veg\n");
                    break;
                case 6:
                    System.out.println("Dal Tadka");
                    sum = sum + Dal_Tadka;
                    order = order.concat("Dal Tadka\n");
                    break;
                case 7:
                    System.out.println("Tava roti");
                    sum = sum + Tava_roti;
                    order = order.concat("Tava roti\n");
                    break;
                case 8:
                    System.out.println("Tandoori Roti");
                    sum = sum + Tandoori_Roti;
                    order = order.concat("Tandoori Roti\n");
                    break;
                case 9:
                    System.out.println("Butter tandoori");
                    sum = sum + Butter_tandoori;
                    order = order.concat("Butter tandoori\n");
                    break;
                case 10:
                    System.out.println("lacha Paratha");
                    sum = sum + lacha_Paratha;
                    order = order.concat("lacha Paratha\n");
                    break;
                case 11:
                    System.out.println("Gulab jaamun");
                    sum = sum + Gulab_jaamun;
                    order = order.concat("Gulab jaamun\n");
                    break;
                case 12:
                    System.out.println("Kajar halwa");
                    sum = sum + Kajar_halwa;
                    order = order.concat("Kajar halwa\n");
                    break;
                case 13:
                    System.out.println("Papad");
                    sum = sum + Papad;
                    order = order.concat("Papad\n");
                    break;
                case 14:
                    System.out.println("Salad");
                    sum = sum + Salad;
                    order = order.concat("Salad\n");
                    break;
                case 15:
                    quit = true;
                    break;
            }
        } while (!quit);
        System.out.println("Your order are:"+order);
        int nocharge=sum;
        System.out.println("Without tax:"+nocharge);
        double tip=0.10;
        double Cgst=0.05;
        double Sgst=0.05;
        double Total_bill=sum+sum*tip+sum*Cgst+sum*Sgst;
        System.out.println("Total bill:"+Total_bill);
        System.out.println("Thankyou for visting");
    }
}

