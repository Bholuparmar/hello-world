package week3;

import java.util.Scanner;

public class Array___Q_72 {

    // accept size n from user and create a n size array the token n input
   // print the sum of all elements in the array in the following mannner
   // 10 + 20 + 30 = 60
   public static void main (String[]args){
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[5];
       System.out.println("enter 5 value ");
       for (int i = 0; i< arr.length;i++){
           arr[i]= sc.nextInt();
       }
       for (int i = 0; i< arr.length;i++){
           System.out.println(arr[i] + " ");
       }
   }
}
