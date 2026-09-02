import java.util.*;

public class SearchNums{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = {10,22,44,32,81};
        int ans = LinearSearch(arr,num);
        System.out.println("The index is:");
        System.out.println(ans);
        sc.close();
    }
    static int LinearSearch(int arr[],int target){
        for(int i =0; i < arr.length ; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
    
}