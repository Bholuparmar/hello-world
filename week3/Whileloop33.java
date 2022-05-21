package week3;

public class Whileloop33 {
    public static void main(String[]args){
        int num = 12, k= -0,i =1;
        while(num% i == 0){
            k = k + i;
            i++;

        }
        if (k== num ){
            System.out.println("yes it is ");
        }
        else{
            System.out.println("no it is not a perfect no.");
        }
    }
}
