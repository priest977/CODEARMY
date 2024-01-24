package Arrays;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
//    int arr[] = {1,0,1,0,1,0};
//    movesZeroBruteForce(arr);
//        movesZeroTwoPointer(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));

//        int arr[] = {2,7,11,15,27};
//        int ans[] = twoSumTwoPinterApproach(arr,22);
//        System.out.println(Arrays.toString(ans));

//        int arr[] = {5,10,3,2,50,80};
//        int ans [] = pairOfDiffTwoPointerApproach(arr,45);
//        System.out.println(Arrays.toString(ans));


        int arr[] = {2,5,1,2,8};
        System.out.println(findDublicate(arr));
    }

    public static void movesZeroBruteForce(int arr[]){
        int count0 = 0 ;
        int count1 = 0;
        // First count the zero and 1 all the array
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0) count0++;
            else {
                count1++;
            }
        }
        // Print All zero
        for (int i = 0; i <count0 ; i++) {
            arr[i] = 0;
        }
        // Print all one
        for (int i = count0; i <arr.length ; i++) {
            arr[i] = 1;
        }
    }

    public static void movesZeroTwoPointer(int arr[] , int start , int end){
        while (start < end){
            if(arr[start] == 0) start++;
            else {
                if(arr[end]==0){
                    swap(arr,start,end);
                    start++;
                    end--;
                }
                else {
                    end--;
                }
            }
        }
    }

    public static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] twoSumTwoPinterApproach(int arr[] , int target){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            if(arr[start]+arr[end]==target) return new int[]{start,end};
            else if (arr[start]+arr[end]>target) {
                end--;
            }
            else {
                start++;
            }
        }
        return new int[]{0,0};
    }

    public static int[] pairOfDiffTwoPointerApproach(int arr[] , int diff){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            if(arr[start]>arr[end]){
                if(arr[start]-arr[end]==diff)
                    return new int[] {start,end};
                else if (arr[start]-arr[end]>diff) {
                    end--;
                }
            }
            if(arr[start]<arr[end]){
                if(arr[end]-arr[start]==diff)
                    return new int[] {start,end};
                else if (arr[end]-arr[start]<diff) {
                    start++;
                }
            }

        }
        return new int[]{0,0};
    }

    public static boolean findDublicate(int arr[]){
        int start = 0 ;
        int end = arr.length-1;
        while (start<end){
            if(arr[start]==arr[end])
                return true;
            else {
                start++;
                end--;
            }
        }
        return false;
    }
}
