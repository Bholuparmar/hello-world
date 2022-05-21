package week3;

import java.util.Scanner;

public class Q30 {
    public static void main (String[]args ){
        Scanner SC = new Scanner(System.in);
        System.out.println("enter no.");
        int n= SC.nextInt();
        int sum = 0;
        while (n!=0){
         int temp = n%10;
         sum +=temp ;
         n/=10;
        }
        System.out.println(sum);
    }
}
