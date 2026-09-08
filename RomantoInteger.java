import java.util.*;
class RomanToInteger{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int curr =0;
        int pre =0;

        for(int i = s.length()-1;i>=0;i--){
            int value;
            switch(s.charAt(i)){
                 case 'I':
                 value = 1;
                 break;
                 case 'V':
                 value = 5;
                 break;
                 case'X':
                 value = 10;
                 break;
                 case'L':
                 value = 50;
                 break;
                 case 'C':
                 value = 100;
                 break;
                 case 'D':
                 value = 500;
                 break;
                 case 'M':
                 value = 1000;
                 break;
                 default:
                 value = 0;
            }
            if(value < pre){
                curr = curr -value;
            }else{
                curr = curr + value;
            }
            pre = value;
        }
        System.out.println(curr);
        sc.close();
    }
}