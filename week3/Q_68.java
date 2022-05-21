package week3;

public class Q_68 {
    public static void main (String[]args){
        int n=6;
        int first = 0,second =1;
        System.out.print(first + " " + second + " ");
        for (int i=3; i<=n; i++){
            int third = first + second ;
            System.out.print(third + " ");
            first = second;
            second = third ;
        }
    }
}
