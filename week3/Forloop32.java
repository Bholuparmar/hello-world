package week3;

public class Forloop32 {
    public static void main (String[] args){
        int num = 12, k = 0;
        for (int i = 1 ; i<= num; i++){
            if (num%i==0){
                k=k+i;

            }
        }
        System.out.println(k);
    }
}
