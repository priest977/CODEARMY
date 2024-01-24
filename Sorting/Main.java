package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {8, 12, 1, 6, 5, 2};
//       // selectionSort(arr);
//        bubbleSort(arr);
//          insertionSort(arr);
//        System.out.println(Arrays.toString(arr));

//        int a[] = {1,3,5,7};
//        int b[] = {2,4,6,8};
//        System.out.println(Arrays.toString(mergerTwoSortedArray(a,b)));


        //1. Selection Sort
    }
    public static void selectionSort(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            int minIndex = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[minIndex])
                    minIndex = j;
            }
            swap(arr,i,minIndex);
        }
    }

    // 2 . Bubble Sort
     public static void bubbleSort(int arr[]){
         for (int i = arr.length-1; i >=1 ; i--) {
             for (int j = 1; j <=i ; j++) {
                 if(arr[j]<arr[j-1])
                     swap(arr,j,j-1);
             }
         }
     }

     public static void insertionSort(int arr[]){
         for (int i = 1; i < arr.length; i++) {
             for (int j = i; j > 0 ; j--) {
                 if(arr[j]<arr[j-1]){
                     swap(arr,j,j-1);
                 }
                 else
                     break;
             }
         }
     }

     public static int[] mergerTwoSortedArray(int a[], int b[]){
        int ans[] = new int[a.length+b.length];
        int ansi = 0;
        int ai = 0;
        int bi = 0;
        while (ai<a.length && bi<b.length){
            if(a[ai]<b[bi]){
                ans[ansi] = a[ai];
                ai++;
                ansi++;
            }
            else {
                ans[ansi] = b[bi];
                bi++;
                ansi++;
            }
        }
        while (ai<a.length){
            ans[ansi] = a[ai];
            ai++;
            ansi++;
        }
        while (bi<b.length){
            ans[ansi] = b[bi];
            bi++;
            ansi++;
        }
        return ans;
     }

     

    public static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
    }
}
