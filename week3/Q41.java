package week3;

import java.util.Scanner;

public class Q41 {
    public static void  main (String[]args ){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int num2 =num;
        int sum =0;
        while (num2!=0){
            int a = num2%10;
            sum = (int) (sum+Math.pow(a,3));
            num2/=10;

        }
        if (sum==num) System.out.println(num+"is armstrong no.");
        else System.out.println("not is armstrong no ");
    }
}
