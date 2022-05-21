import java.util.Scanner;

public class DAY4 {

        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);   //STDN
            System.out.println("apna gender batao m / f");
            char gender = sc.nextLine().charAt(0);
            if (gender=='M' || gender =='m') {
                System.out.println("Hello sir");
            }else if (gender == 'F' || gender == 'f' ) {
                System.out.println("hello ma'am");
            }else{
                System.out.println("out of range");
            }

        }
    }

