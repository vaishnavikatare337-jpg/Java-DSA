public class RecursionRemove3 {
    public static void main(String[] args){
        System.out.println(skipAppNotApple("lmnappleisappnotfound"));

    }
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") || up.startsWith("not")){
            return skipAppNotApple( up.substring(3));
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }


    }
}
