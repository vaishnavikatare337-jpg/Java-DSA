import java.util.*;
public class FibonacciRecursion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
        sc.close();
    }
    static int fibo(int n ){
        //base condition
        if(n < 2){
            return n;
        }else{
            return fibo(n-1) + fibo(n-2);

        }
    }
}