package week3;

import java.util.Scanner;

public class Star_Q70 {
    public static void amin (String[]args ){
        System.out.println("enter two number");
        Scanner sc = new Scanner(System.in);
        int num  = sc .nextInt();
        int first = 0, second =1;
        System.out.println(first + " " + second + " ");
        for ( int i = 3; i<= num ; i++){
            int third = first + second ;
            System.out.println(third + " ");
            first = second ;
            second = third;
        }
    }
}
