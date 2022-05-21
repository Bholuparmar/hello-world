//package week3;
//
//import java.util.Scanner;
//
//public class Reasturant {
//    public static void amin(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char ch;
//        int cost = 0;
//        System.out.println("which cuisine would you like ");
//        System.out.println("enter 1 of indian cuisine \n enter to for italian cuisine \n enter 3 for chinese cuisine");
//        int s = sc.nextInt();
//        if (s == 1) {
//            System.out.println("what would you like to eat \n 1- butter panner masala with kulcha \n 2- pav bhaji \n 3- masala dosa");
//            int I = sc.nextInt();
//            if (I == 1 || I == 2 || I == 3) cost = cost + 100;
//        }
//        if (s == 2) {
//            System.out.println("what would you like to eat \n1- sapgaheti \n2- napoletana pizza \n 3- risotto ");
//            int t = sc.nextInt();
//            if (t == 1 || t == 2 || t == 3) cost = cost + 100;
//
//        }
//        if (s == 3) {
//            System.out.println("what would you like to eat \n 1-dumpling \n 2 - octopus \n3- chamgadad(covid)");
//            int c = sc.nextInt();
//            if (c == 1 || c == 2 || c == 3) cost = cost + 100;
//        }
//        System.out.println("enter y to order more /or/anything else to stop ");
//        ch = sc.next().charAt(0);
//
//
//    }while(ch=='y');
//    System.out.println("total ammount :" + cost);
//}
//
