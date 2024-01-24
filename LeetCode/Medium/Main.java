package LeetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int arr[] = {0,2};
//        System.out.println(maximumProductSubArray152(arr));
//        System.out.println(containerMostWater(arr));

//        int []res = productOfArrayItSelf238(arr);
//        System.out.println(Arrays.toString(res));

//        int []res = productOfArrayItSelf238OptimseCode(arr);
//        System.out.println(Arrays.toString(res));

//        int arr[] = {3,4,5,1,2};
//        System.out.println(findMinimumInRotatedSortedArray(arr));

//        int [] arr = {11,13,15,17};
//        System.out.println(findMinInSortedArrayAscendingOrder(arr));

        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(findMinElementInRotatedSortedArrayByUsingBinarySearch(arr));
    }
    public static int containerMostWater(int [] arr){
        int start = 0;
        int end = arr.length-1;
        int max = 0;
        while (start < end)
        {
            int min = Math.min(arr[start], arr[end]);
            max = Math.max(max , min*(end-start));
            if(arr[start]< arr[end]) start++;
            else end--;
        }
        return max;
    }

//    public static ArrayList<Integer> threeSum(int [] arr){
//        // Sort the array By using bubble sort
//        for (int i = arr.length; i >=11 ; i--) {
//            for (int j = 1; j < i ; j++) {
//                if(arr[j]<arr[j-1]){
//                    int temp = arr[j];
//                    arr[j] =  arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }
//
//    }

    public static int[] productOfArrayItSelf238(int [] arr){
        int [] ans = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length ; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    product *= 1;
                }
                else {
                    product *= arr[j];
                }
            }
            ans[k] = product;
            k++;
        }
        return ans;
    }

    public static int[] productOfArrayItSelf238OptimseCode(int  []arr){
        // Calculate the Prefix Product from start
        int [] prefixProductFromStart = new int[arr.length];
        prefixProductFromStart[0] = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            prefixProductFromStart[i] = prefixProductFromStart[i-1]*arr[i];
        }

        // Calculate prifix product from end
        int [] prefixProductFromEnd = new int[arr.length];
        prefixProductFromEnd[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2 ; i>=0 ; i--){
            prefixProductFromEnd[i] = prefixProductFromEnd[i+1]*arr[i];
        }

        // Calculate product with the help of prefixProductFromStart and prefixProductFromEnd
        int [] ans = new int[arr.length];
        ans[0] = prefixProductFromEnd[1];
        ans[arr.length-1] = prefixProductFromStart[arr.length-2];
        for (int i = 1; i < arr.length-1 ; i++) {
            ans[i] = prefixProductFromStart[i-1] * prefixProductFromEnd[i+1];
        }
        return ans;
    }

    public  static int maximumProductSubArray152(int [] arr){
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        for (int i = 0; i < arr.length ; i++) {
            prefix *= arr[i];
            max = Math.max(max , prefix);
            if(prefix == 0 || prefix < 0)
                prefix = 1;
        }
        return max;
    }

    public static int findMinimumInRotatedSortedArray(int [] arr){
        int start = 0;
        int end = arr.length-1;
        int min = Integer.MAX_VALUE;
        while (start < end){
            if(arr[start]<arr[end]){
                start++;
            }
            else {
                min = Math.min(arr[start] , arr[end]);
                end--;
            }
        }
        return min;
    }

    public static int findMinInSortedArrayAscendingOrder(int [] arr){
        int start = 0;
        int end = arr.length-1;
        int min = Integer.MAX_VALUE;
        while (start< end ){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[start]){
                min = Math.min(arr[mid], arr[start]);
                return min;
            }
        }
        return -1;
    }

    public static int findMinElementInRotatedSortedArrayByUsingBinarySearch(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end)
        {
           int mid = start + (end-start)/2;
           if(arr[mid]>arr[end]) start = mid+1;
           else end = mid;
        }
        return arr[start];

        //**************************************************************************
//        int start = 0;
//        int end = arr.length-1;
//        while (start <= end){
//            int mid = start + (end-start)/2;
//            int previos = (mid-1) % arr.length;
//            int next =  (mid+1) % arr.length;
//            if(arr[mid]<previos && arr[mid]<next) {
//                return arr[mid];
//            } else if (arr[mid]>arr[end]) {
//                start = mid+1;
//            }
//            else
//                end = mid;
//        }
//        return -1;
    }





}
