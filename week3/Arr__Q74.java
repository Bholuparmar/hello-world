package week3;

import java.util.Scanner;

public class Arr__Q74 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int []arr = {5,2,4,8,4};
        int graterElement= 0;
        graterElement= arr[1];
        for (int i = 1;i<arr.length;i++ ){
            if (arr[i]>graterElement){
                graterElement=arr[i];
            }
        }
        System.out.println(graterElement);
    }
}
