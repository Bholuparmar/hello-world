package week3;

import java.util.Scanner;

public class Q46_3 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (char ch='A'; ch<('A'+n);ch++){
            for (char p= 'A';p<=ch;p++){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
