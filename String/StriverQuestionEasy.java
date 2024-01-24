package String;

import java.util.*;

public class StriverQuestionEasy {
    public static void main(String[] args) {
//        String input = "(()())(())(()(()))";
//        String ans = removeOuterParenthesis(input);
//        System.out.println(ans);
//
//        String input = "the sky is blue";
//        System.out.println(reverseWordInString(input));

//        String[] str = {"flower", "flow", "flight"};
//        System.out.println(longestCommonPrefix(str));

        String str = "abcde";
        String goal = "abced";
        System.out.println(rotationOfString(str,goal));

    }

    public static String removeOuterParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        java.lang.StringBuilder ans = new java.lang.StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                if (!stack.isEmpty()) {
                    ans.append(str.charAt(i));
                }
                stack.push(str.charAt(i));
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    ans.append(str.charAt(i));
                }
            }
        }
        return ans.toString();
    }

    public static String reverseWordInString(String str) {
        String ans = "";
        java.lang.StringBuilder ans1 = new java.lang.StringBuilder();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                ans1.append(ch);
            } else {
                ans1.reverse();
                ans += ans1;
                ans += " ";
                ans1 = new java.lang.StringBuilder();
            }
        }
        ans1.reverse();
        ans += ans1;
        return ans;
    }

//    public static String largestOddNumberInString(String str){
//        String ans = "";
//        for (int i = 0; i <str.length() ; i++) {
//           char ch = str.charAt(i);
//           if(ch %2 != 0){
//               ans += ch;
//           }
//        }
//        String ans1 = ans;
//        if(ans1 %2 == 0){
//
//        }
//    }

//    public static String longestCommonPrefix(String[] arr){
//        String ans = "";
//        int idx = 0;
//        for (int i = 0; i <arr[0].length() ; i++) {
//            char ch = arr[0][i];
//            boolean ans1 = true;
//            for (int j = 1; j <arr.length ; j++) {
//                if(arr[j].length()<i || ch != arr[j][i]){
//                    ans1 = false;
//                    break;
//                }
//            }
//            if(ans1 == false) break;
//            else ans += ch;
//
//        }
//        return ans;
//    }

    public static String longestCommonPrefix(String [] arr){
        Arrays.sort(arr);
        String str1 = arr[0];
        String str2 = arr[arr.length-1];
        int idx = 0;
        while (idx < str1.length() && idx<str2.length()){
            if(str1.charAt(idx) == str2.charAt(idx))
                idx++;
            else break;
        }
        if(idx == 0) return "";
        else return str1.substring(0 , idx);
    }

    public static String rotationOfStringOneTime(String str ){
        String ans = "";
        char ch = str.charAt(str.length()-1);
        ans += ch;
        for (int i = 0; i<=str.length()-2;i++){
            ans += str.charAt(i);
        }
        return ans;
    }
    public static boolean rotationOfString(String str , String goal ){
        if(str.length() != goal.length()) return false;
        String ans = str;
        int i =0;
        while (ans != goal && i!= str.length() ){
            ans = ans.charAt(ans.length()-1)+ans.substring(0,ans.length()-1);
            if(ans.equals(goal)) return true;
            i++;
        }
        return false;
    }
}
