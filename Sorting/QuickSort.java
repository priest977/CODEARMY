package Sorting;

import java.util.Arrays;

public class QuickSort {
    static int partitionIndex(int [] arr , int start , int end){
        int pivot = arr[start];
        int count = 0;
        for (int i = start+1; i <= end ; i++) {
            if(arr[i]<=pivot)
                count++;
        }
        int pi = start+count;
        swap(arr,start,pi);
        //rearrange the element
        int i = start , j = end;
        while (i < pi && j > pi ){
            while (arr[i]<=pi) i++;
            while (arr[j]>pi) j--;
            if(i < pi && j > pi){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pi;
    }

    static void quickSort(int [] arr , int start , int end){
        //base case
        if(start >= end) return;
        int pi = partitionIndex(arr,start,end);
        quickSort(arr,start,pi-1);
        quickSort(arr,pi+1,end);
    }

    static void swap(int [] arr , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {7,13,8,5,10,2,4};
//        System.out.println(partitionIndex(arr,0,arr.length-1));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
