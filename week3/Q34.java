package week3;

import java.util.Scanner;

public class Q34 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddsum = 0;
        int evensum = 0;
        for (int i =0; i<=n; i ++){
            if (i%2 == 0){
                evensum=evensum+1;

            }else oddsum+= i;
        }
        System.out.println("odd some " + oddsum);
        System.out.println("even some " + evensum);
    }
}
