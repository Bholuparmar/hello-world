package week3;

import java.util.Scanner;

public class Day9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of in three suject one by one");
        System.out.println("enter the markes in maths : ");
        double maths =sc.nextDouble();
        System.out.println("enter the marks of computer: ");
        double computer = sc.nextDouble();
        System.out.println(" enter the marks of english: ");
        double english = sc.nextDouble();
        double totalmarks = maths + english + computer;
        double percantaeg = totalmarks/3;
        System.out.println(" total marks is " + totalmarks);
        System.out.println(" the percanteg of total marks = " + percantaeg );

    }
}

