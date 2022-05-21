package week3;

public class Forloop34 {
    public static void main(String[]args){
        int range = 12, even=0, odd = 0;
        for (int i = 1 ; i <=range; i++ ){
            if (i%2==0){
                even = even+i;
            }
            else{
                odd = odd+i;
            }
        }
        System.out.println("even" + even);
        System.out.println("odd" + odd);
    }
}
