package week3;

public class Whileloop35 {
    public static void main(String[]args){
        int range = 12 ,i = 1;
        while (i<=range){
            if (i % 3 == 0 || i % 5 == 0 ){
                System.out.println(i);
            }
            i++;
        }
    }
}
