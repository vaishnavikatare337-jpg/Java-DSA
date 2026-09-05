import java.util.*;
public class SearchInString{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String name = sc.next();
        char target = sc.next().charAt(0);
        sc.close();
        System.out.println(search(name,target));
    }
    static int search(String str , char target){
        if(str.length() == 0){
            return -1;
        }
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return i; 
            }
        }
        return -1;
     
    }
    
    
}
