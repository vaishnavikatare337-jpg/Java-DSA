import java.util.*;
public class MissingNum{
    public static void main(String args[]){
        int arr[] = {4,0,2,1};
        System.out.println(missingNum(arr));

    }
    public static int missingNum(int arr[]){
        int i = 0;
        //cycle sort
        while(i < arr.length ){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                Swap(arr,i,correct);

            }else{
                i++;
            }
        }
        //search for missing num
        for(int index = 0 ; index < arr.length; index ++){
            if(arr[index] != index){
                return index;
            }
        }
        //case 2
        return arr.length;
    }
    static void Swap(int arr[] ,int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}