package week3;

import java.util.Scanner;

public class Q40 {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        int num = sc .nextInt();
        int num2= num;
        int reverse = 0;
        while (num2>0){
            int c= num2%10;
            reverse=reverse *10+c;
            num2/=10;

        }
        if (num==reverse){
            System.out.println(num + " is pallindromic no");

        }
        else System.out.println("not");
    }
}
