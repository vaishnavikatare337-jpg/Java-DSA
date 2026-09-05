import java.util.*;
public class isArmstrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(armstrong(num));

    }
    static boolean armstrong(int n){
        int original = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum+ rem*rem*rem;
        }
       return sum == original;
     
    }
}
