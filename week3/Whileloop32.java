package week3;

public class Whileloop32 {
    public static void main(String[]args){
        int num = 6, i=1, sum=0;
        while(num>i){
            if (num%i==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
