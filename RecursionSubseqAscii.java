public class RecursionSubseqAscii{
    public static void main(String args[]){
        SubseqAscii("","abc");

    }
    static void SubseqAscii(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        SubseqAscii(p+ch, up.substring(1));
        SubseqAscii(p, up.substring(1));
        SubseqAscii(p+(ch +0), up.substring(1));
    }

}
