package week3;

import java.util.Scanner;

public class Q29 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        do {
            int temp = n%10;
            System.out.println(temp);
            n= n/10;
        }while (n>0);
        System.out.println(n);
    }
}
