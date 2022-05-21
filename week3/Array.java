package week3;

public class Array {
    public static void main (String[]args){
        int arr [] = {1,4,2,56,21,45,59,96,31};
        int max = arr[0];
        int index =0;
        for (int i =1;i<arr.length;i++){
            if (arr [i] > max ){
                max = arr[i];
                index=i;
            }
        }
        System.out.println("maximum element = " + max + " found at index = " + index);
    }
}
