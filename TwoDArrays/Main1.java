package TwoDArrays;

import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) {
            String s = "abcabcbb";
             int res = maxSubStringlength(s);
        System.out.println(res);
    }
    public static int maxSubStringlength(String s){
        // Check the true condition
        if(s == null || s.length()== 0)
            return 0;
        int maxLength = 0;
        int start = 0;
        HashMap<Integer , Character> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(hashMap.containsKey(c)){
                start = Math.max(start,hashMap.get(c)+1);
            }
            hashMap.put(i, c);
            maxLength = Math.max(maxLength,i-start+1);
        }
            return maxLength;
    }
}
