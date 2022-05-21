package week3;

public class Arr__Q {
    public static void main (String[]args){
        int arr [] = {1,2,1,3,4,5,5};
        boolean isSorted = true;
        for (int i= 1; i< arr.length-1;i++){
            if (!(arr[i] <= arr[i+1])){
                isSorted= false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
