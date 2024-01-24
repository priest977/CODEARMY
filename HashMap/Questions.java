package HashMap;

import java.util.*;

public class Questions {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,1,1,4};
//        System.out.println(countMaxFrequency(arr));

//        String s1 = "abb";
//        String s2 = "cdd";
//        System.out.println(isomorphicString(s1 , s2));
////        System.out.println(checkAnagram(s1,s2));
//
//        int [] arr = {3,2,4};
//        int [] ans = twoSum(arr,6);
//        System.out.println(Arrays.toString(ans));

//        int [] arr = {15,-2,2,-8,1,10};
//        System.out.println(maxSubArrayWithZeroSum(arr));

        int [] arr = {1,2,3,1,1,1,1};
        System.out.println(longestSubArrayWithKSum(arr,3));
    }
     public static int countMaxFrequency(int [] arr){
         Map<Integer , Integer> freq = new HashMap<>();
         for(var frq : arr){
             if(!freq.containsKey(frq)){
                 freq.put(frq , 1);
             }
             else
                 freq.put(frq , freq.get(frq) + 1);
         }
         int maxFreq = Integer.MIN_VALUE;
         int ansKey = Integer.MIN_VALUE;
         for(var key : freq.entrySet()){
             if(key.getValue() > maxFreq){
                 maxFreq = key.getValue();
                 ansKey = key.getKey();
             }
         }
         return ansKey;
     }

     public static boolean checkAnagram(String s1 , String s2){
         if(s1.length() != s2.length()) return false;
         Map<Character , Integer> list = new HashMap<>();
         for (int i = 0; i < s1.length() ; i++) {
             char ch = s1.charAt(i);
             if(!list.containsKey(ch)){
                 list.put(ch , 1);
             }
             else list.put(ch , list.get(ch)+1);
         }
         for (int i = 0; i <s2.length() ; i++) {
             char ch1 = s2.charAt(i);
             if(!list.containsKey(ch1)) return false;
             else list.put(ch1 , list.get(ch1)-1);
         }
         for(var e : list.values()){
             if(e != 0) return false;
         }
         return true;
     }

     public static boolean isomorphicString(String s1 , String s2){
        Map<Character , Character> list = new HashMap<>();
         for (int i = 0; i < s1.length() ; i++) {
             char s1ch = s1.charAt(i);
             char s2ch = s2.charAt(i);
             if(list.containsKey(s1ch)) {
                 if(list.get(s1ch) != s2ch) return false;
             }
             else if(list.containsValue(s2ch)) return false;
             else list.put(s1ch , s2ch);
         }
         return true;
     }

     public static int[] twoSum(int [] arr , int target){
        Map<Integer , Integer> list = new HashMap<>();
         for (int i = 0; i < arr.length ; i++) {
             int contain = target-arr[i];
             if(list.containsKey(contain)) return new int[]{list.get(contain) , i};
             else list.put(arr[i],i);
         }
         return new int[]{-1,-1};
     }

     public static int maxSubArrayWithZeroSum(int [] arr){
        int sum = 0;
        int maxSum = 0;
        Map<Integer , Integer> list = new HashMap<>();
         for (int i = 0; i <arr.length ; i++) {
             sum+=arr[i];
             if(list.containsKey(sum)) {
                 int temp = i-list.get(sum);
                 if(temp>maxSum)
                     maxSum = temp;
             }
             else list.put(sum , i);
         }
         return maxSum;
     }

     public static int longestSubArrayWithKSum(int [] arr, int target){
        int count = 0;
        int prefix = 0;
        int maxSum = 0;
         for (int i = 0; i < arr.length ; i++) {
             prefix += arr[i];
             count++;
             if(prefix == target){
                 if(count >= maxSum)
                 {
                     maxSum= count;
                 }
                 count = 0;
                 prefix = 0;
             }
         }
         return maxSum;
     }

//     public static int longestSubArrayWithKSumHashMap(int [] arr , int target){
//        int sum = 0;
//        int count = 0;
//        Map<Integer , Integer> list = new HashMap<>();
//         for (int i = 0; i <arr.length ; i++) {
//             sum += arr[i];
//             count++;
//             if(sum == target){
//
//                 list.put(sum ,i);
//             }
//         }
//     }

}
