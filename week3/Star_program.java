package week3;

import java.util.Scanner;

public class Star_program {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        for (int i =1; i<=n; i++){
            for (int o=1;o<=n; o++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
