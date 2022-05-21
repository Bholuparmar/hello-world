package week3;

import java.util.Scanner;

public class Arr__Q75 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr [] = {250,25,20,10,5};
        int smallElement = arr[0];
        for (int i=0; i<arr.length;i++){
            if (arr[i]<smallElement) smallElement=arr[i];

        }
        System.out.println("the smaller element is " + smallElement);
    }

}
