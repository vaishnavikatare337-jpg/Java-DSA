public class Ceiling {
    public static void main(String args[]){
        int[] arr ={ -18,-12,0,2,15,16,22,45,89};
        int target = 22;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target){
        int s = 0;
        int e = arr.length -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(target < arr[mid]){
                e = mid -1;
            }else if(target > arr[mid]){
                s = mid +1;
            }else{
                return mid + 1;
            }
        }
        return -1;
    }

}
