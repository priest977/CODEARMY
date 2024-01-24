package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       int arr [] = {2,1,0,2,1,0};
//       int ans[] = sort012(arr);
//        System.out.println(Arrays.toString(ans));

//        int [] arr = {7,9,3,8,6,0};
//        greaterElement(arr);

        int [] arr = {0,1,2,3,4,5,6,7,8,9};
        findSubArray(arr,3);

      // Take user Input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size : ");
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(maxSum(arr,3));

     //   System.out.println(lowerstNumber(arr));
     //   System.out.println(maxElement(arr));
     //   System.out.println(findElement(arr,76));
     //   rightRotateArray(arr);
     //   rotateKStepsArray(arr,3);
    // rotateArrayByUsingReversal(arr,3);
//        reverseArrayNewArray(arr);
//        System.out.println(Arrays.toString(arr));
    }

    // 1. find the lowest number in Array

    public static int lowerstNumber(int arr[]){
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans)
                ans = arr[i];
        }
        return ans;
    }

    // find the maxmimum element in Array
    public static int maxElement(int arr[]){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>ans)
                ans = arr[i];
        }
        return ans;
    }

    public static int findElement(int arr[], int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }

    public static void rightRotateArray(int arr[]){
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    public static void rotateKStepsArray(int arr[] , int k){
        k = k % arr.length;
        for (int i = 0; i < k; i++) {
            rightRotateArray(arr);
        }
    }

    public static void rotateArrayByUsingReversal(int arr[], int k ){
        k = k % arr.length;
        int nk = arr.length-k;
        reverseArray(arr, 0 , nk-1);
        reverseArray(arr, nk , arr.length-1);
        reverseArray(arr, 0 , arr.length-1);
    }

    public static void reverseArray(int arr[], int i , int j){
        while (i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArrayNewArray(int arr[]){
        int temp [] = new int[arr.length];
        int i = arr.length-1 ;
        int j = 0;
        while (i>=0){
            temp[j] = arr[i];
            i--;
            j++;
        }
    }

  public static int maxSum(int arr[], int size){
        int ans = 0;
       for (int i = 0; i <arr.length ; i++) {
           int sum = 0;
           for (int j = i; j <= i+size ; j++) {
               sum += arr[j];
           }
           if(ans <= sum)
               ans = sum;
       }
       return ans;
   }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] sort012(int [] arr){
        int [] ans = new int[arr.length];
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==0) count0++;
            else if(arr[i] == 1) count1++;
            else count2++;
        }
        for (int i = 0 ; i < count0 ; i++){
            ans [i] = 0;
        }
        for (int i = count0 ; i < count0+count1 ; i++){
            ans [i] = 1;
        }
        for (int i = count0+count1 ; i < count0+count1+count2 ; i++){
            ans [i] = 2;
        }
        return ans;
    }

    public static void greaterElement(int [] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i] + " ");
                i++;
            } else {
                i++;
            }
        }
    }
    public static void findSubArray(int [] arr , int size){
        for (int i = 0; i <arr.length-size ; i++) {
            for (int j = i;j<size;j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

}
