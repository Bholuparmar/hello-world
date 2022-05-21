package week3;

import java.util.Scanner;

public class Array__ {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        System.out.println("enter " +n + " integer numbers ");
        int arr [] = new int[n];
        boolean a = true ;
        for (int i = 0 ; i <arr.length;i++){
            arr [i] = sc.nextInt();
        }
        for (int i =0 ; i< arr.length/2 ; i++){
            if (arr[i] == arr[arr.length-1-i]){
                a= true;

            }
            else {
                a= false;
                break;
            }
        }
        System.out.println(a ? "its palindrome " : " not a palindrome ");
    }
}
