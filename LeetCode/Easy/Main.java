package LeetCode.Easy;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
            String str = "leetcodce";
            System.out.println(ckeckPangram(str));
    }

    // String

    public static String defengingOfIPAddress(String str){
            int index = 0;
            String ans = "";
            while (index < str.length()){
                if(str.charAt(index) == '.'){
                    ans = ans+"[.]";
                    index++;
                }
                else
                {
                    ans += str.charAt(index);
                    index++;
                }
            }
            return ans;
    }

    //Check String is pangram
    public static boolean ckeckPangram(String str){
//        HashMap<Character , Integer> map = new HashMap<>();
//        for (int i = 0; i <str.length() ; i++) {
//            map.put(str.charAt(i),1);
//        }
//        if(map.size() == 26) return true;
//        return false;

        // Second Solution
        int [] ans = new int[26];
        int index = 0;
        for (int i = 0; i < str.length() ; i++) {
            index = str.charAt(i)-'a';
            ans[index] = 1;
        }
        for (int i = 0; i < ans.length ; i++) {
            if(ans[i] == 0) return false;
        }
        return true;
    }

//    public static String longestPalindrome(String str){
//        ArrayList<Integer> lower = new ArrayList<>();
//        ArrayList<Integer> upper = new ArrayList<>();
//        for (int i = 0; i < str.length() ; i++) {
//            if(str.charAt(i)>='a')
//            {
//                Integer i1 = lower.get(str.charAt(i) - 'a')++;
//            }
//        }
//    }
}
