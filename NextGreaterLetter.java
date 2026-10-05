public class NextGreaterLetter { 
    //exact same for ceiling of number
    //ignore the target = char we are finding

    public static void main(String args[]){
        char[] arr ={'c','f','j'};
        char target = 'e';
        char ans = next_greater_letter(arr,target);
        System.out.println(ans);
    }
    public static char next_greater_letter(char[] letter, char target){
        int s = 0;
        int e = letter.length -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(target < letter[mid]){
                e = mid -1;
            }else {
                s = mid +1;
            }
        }
        return letter[s % letter.length ];
    }

}
