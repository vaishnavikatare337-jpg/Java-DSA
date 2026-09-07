import java.util.*;
public class CycleSort{
    public static void main(String args[]){
        int[] arr = {1,2,5,4,3,2};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void cycle(int []arr){
        int i =0;
        while(i < arr.length){
            int corrected = arr[i] - 1;
            if(arr[i] != arr[corrected]){
                swap(arr,i,corrected);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}
