public class LongestCommonPrefix{
    public static void main(String args[]){
        String[] strs = {"Flower" , "Flow", "Fluet", "Flask"};
        String ans = longestCommonPrefix(strs);
        System.out.println(ans);

    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int words = 1; words <strs.length; words++){
            int i = 0;

            for( ;i < prefix.length() && i < strs[words].length(); i++){
                 if(prefix.charAt(i) != strs[words].charAt(i)){
                   
                   break;
                 }

            } 
            prefix = prefix.substring(0,i);
           
        }
        return prefix;

        
    }
}