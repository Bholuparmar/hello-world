package week3;

public class Forloop33 {
    public static void main(String[]args){
        int num = 6, k=0;
        for (int i =1 ; i<num ; i ++){
            if (num% i ==0){
                k = k+1;

            }
        }
        if (k== num){
            System.out.println("yes it is ");
        }
        else {
            System.out.println("no is not a perfect no.");
        }
    }
}
