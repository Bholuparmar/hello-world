package week3;

import java.util.Scanner;

public class Notesprogram {


//    /* question 23= accept the ammount from user and print the denomation of inr from
//    largest sum to smaallest
//
//    input ammount
//    output
//    number of 2000 notes
//    number of 5000 notes
//    number of 200  notes
//    number of 100 notes
//    number of 50 notes
//    number of 20 notes
//    number of 10 notes
//    number of 5 notes
//    number of 2 notes
//    number of 1 notes

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your amount : ");
        int amt=sc.nextInt();
        int no2000=0;
        int no500=0;
        int no200=0;
        int no100=0;
        int no50=0;
        int no20=0;
        int no10=0;
        int no5=0;
        int no2=0;
        int no1=0;
        if(amt>=2000){
            no2000=amt/2000;
            amt =amt%2000;
        }if(amt>=500){
            no500=amt/500;
            amt =amt%500;
        }if(amt>=200){
            no200=amt/200;
            amt =amt%200;
        }if(amt>=100){
            no100=amt/100;
            amt =amt%100;
        }if(amt>=50){
            no50=amt/50;
            amt =amt%50;
        }if(amt>=20){
            no20=amt/20;
            amt =amt%20;
        }if(amt>=10){
            no10=amt/10;
            amt =amt%10;
        }if(amt>=5){
            no5=amt/5;
            amt =amt%5;
        }if(amt>=2){
            no2=amt/2;
            amt =amt%2;
        }if(amt>=1){
            no1=amt/1;
            amt =amt%1;
            System.out.println(no2000);
            System.out.println(no500);
            System.out.println(no200);
            System.out.println(no100);
            System.out.println(no50);
            System.out.println(no20);
            System.out.println(no10);
            System.out.println(no5);
            System.out.println(no2);
            System.out.println(no1);
        }

    }
}

