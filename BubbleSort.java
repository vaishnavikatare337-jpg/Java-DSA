import java.util.*;
public class BubbleSort{
    public static void main(String args[]){
        int[] arr = {82,0,-1,77,5,6,8};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void  bubble(int[] arr){
        boolean swapped ;

        for(int i =0; i < arr.length ; i++){
            swapped = false;
            for(int j =1 ; j <arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}