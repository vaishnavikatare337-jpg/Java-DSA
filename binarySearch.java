import java.util.*;

public class binarySearch {
    public static void main(String args[]){
        int array[] = {14,26,22,43,44,70};
        int target = 44;
        int answer = sorting(array,target);
        System.out.println(answer);
    }
    static int sorting(int arr[], int num){
        int start = 0;
        int end = arr.length -1;
        int mid = start + (end-start)/2;
        while(start <= end){
            if (num <arr[mid] ){
                end = mid--;
            }
            if(num > arr[mid]){
                start = mid ++;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
