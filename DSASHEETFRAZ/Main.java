package DSASHEETFRAZ;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int arr[] = {4,2,3,1,5};
//        int ans[] = twoSum(arr,5);
//        System.out.println(Arrays.toString(ans));

//        int arr[] = {1,2,3,4};
//        System.out.println(maxProfit(arr));
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(1);
//        list.add(-2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        movesZeroToEnd(list);
//        int arr[] = {7,1,5,3,6,4};
//        System.out.println(bestTimeBuyAndSellStock(arr));
//        System.out.println(bestTimeBuyAndSellStockII(arr));

        int arr[] = {1,2,3};
//        completeSum(arr);
        int ans[] = completeSum(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int arr[], int target) {
        int i = 0;
        int j = i+1;
        while (j < arr.length) {
            if (arr[i] + arr[j] == target)
                return new int[]{i, j};
            else
               // i++;
                j++;
        }
        return new int[]{0, 0};
    }

    // Best Time To Buy and sell Stock

    // First we need to calculate min stock
    public static int minStock(int arr[]){
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<ans)
                ans = arr[i];
        }
        return ans;
    }

    // Second we need to Calculate the max stock
    public static int maxStock(int arr[]){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>ans)
                ans = arr[i];
        }
        return ans;
    }

    // Third we need to calculate the max profit
    public static int maxProfit(int arr[]){
        int buy = minStock(arr);
        int sell = maxStock(arr);
        int profit;
        return profit = sell-buy;
    }

//    public static void movesZeroToEnd(ArrayList<Integer> list){
//        int temp = 0 ;
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i)==0){
//               list.contains(i);
//            }
//        }
//        System.out.println(list);
//    }
    public static void movesZeroToEnd(int arr[]){
        int temp = arr[arr.length-1] ;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0){
               arr[i] = arr[i+1];
               temp = arr[i];

            }
        }
    }
    public static int  bestTimeBuyAndSellStock(int arr[]){
        int min = arr[0];
        int profit = 0;
        for(int i = 1; i < arr.length ; i++){
            int diff = arr[i]-min;
            profit = Math.max(profit , diff);
            min = Math.min(min , arr[i]);
        }
        return profit;
    }
    public static int bestTimeBuyAndSellStockII(int arr[]){
            int profit = 0;
            for(int i=1;i<arr.length;i++) {
                if(arr[i] > arr[i-1]) {
                    profit += arr[i] - arr[i-1];
                }
            }
            return profit;
        }

    public static int[] completeSum(int arr[]){
        int ans [] = new int[arr.length];
        int sum = 0;
        int k = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
            ans[k] = sum;
            k++;
        }
        return ans;
    }

}
