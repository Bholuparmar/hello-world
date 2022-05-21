package week3;

import java.util.Scanner;

public class Question38 {
    public static void main(String[]srgs){
        Scanner sc= new Scanner(System.in);
        System.out.println("press 1 for Addition/n press 2for subs");
        int ch = sc.nextInt();
        if (ch==1){
            System.out.println("enter two numbers to be added");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("op="+(a+b));
        }
    }
}