package week3;

import java.util.Scanner;

public class Q46_2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        for (int i =1 ; i<=num; i++){
            for (int j = 1; j<=1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
