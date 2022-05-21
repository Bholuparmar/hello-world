package week3;

public class Forloop {
    public static void main(String[]args){
        int num =12, k =0;
        for (int i = 1; i<=num; i++ ){
            if (num%i==0){
                k=k+1;

            }
        }
        System.out.println(k);
    }
}
