import java.util.*;
public class isArmstrong{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(armstrong(num));
        scanner.close();

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
