import java.util.*;

public class Search2D {
    public static void main(String args[]){
        int[][]arr = {
            {2,4,6,8},{1,3,5,7,9},{11,22,33,44}
        };
        int target = 3;
        int ans[] = search(arr,target);
        System.out.print(Arrays.toString(ans));
    }
    static int[] search(int [][]arr,int target){
        for(int i =0; i<arr.length ; i++){
            for(int j =0; j <arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};

                }
            }
        }
        return new int[]{-1,-1};
       
    }

    
}
