//package week3;
//
//public class Dowhileloop {
//    public static void main(String[]args){
//        int n =69854;
//        for (; n > 0 ;){
//            int rem = n%10;
//            System.out.println(rem);
//            n = n/10;
//        }
//    }
//}


package week3;

import java.util.Scanner;

public class Dowhileloop {

    // jab tak input me y aata rahe print karte rho

public static void main (String[]args){
    int ch ;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println(" or bhai kya haal hai ");
        System.out.println("press y in order to repet ");
        ch = sc.nextLine().charAt(0);

    }while ( ch == 'y');
  }

  }
