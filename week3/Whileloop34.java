package week3;

public class Whileloop34 {
    public static void main(String[]args){
        int range = 12,even= 0, odd= 0 , i = 1;
        while(i<= 12){
            if (i % 2 == 0){
                even=even+i;

            }
            else {
                odd = odd+1;
            }
            i++;
        }
        System.out.println("even" + even);
        System.out.println("odd"+ odd);
    }
}
