public class RecursionRemoveA{
    public static void main(String[] args){
        System.out.println(skip(" ","baccad"));


    }
    static String skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return " ";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
           return skip(p,up.substring(1));
        }else{
            return ch+skip(p+ch,up.substring(1));
        }

    }
}