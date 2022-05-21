package week3;

public class Star__d {
    public static void main(String[]args){
        int n = 5;
        for (int i = 1 ; i<= n; i++){
            for (int j=1; j<=i;j++){
                System.out.print(j + 64 + " ");
            }
            System.out.println();
        }
    }
}
