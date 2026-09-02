import java.util.*;
public class ReverseArray{
    public static void main(String args[]){
        int []arr = {4,5,6,7,8,9,10};
        int left =0;
        int right = arr.length -1;
        while (left < right ){
            int temp = arr[left];
            arr [left] = arr [right];
            arr [right] = temp;
            left++;
            right--;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }

    }



}