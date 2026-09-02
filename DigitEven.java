import java.util.*;
public class DigitEven{
    public static void main(String args[]){
        int num = 12347;
        digits(num);
    }
  
    static void digits(int num ){ 
        int count =0;
        while(num > 0){
            num = num/10;
            count ++;
        }
        
        if(count % 2 ==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        
    }
}
