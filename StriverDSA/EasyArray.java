package StriverDSA;

import javax.swing.text.AttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class EasyArray {
    public static void main(String[] args) {
//        int [] arr = {1, 2, 2, 3 ,3 ,3 ,4, 4, 5, 5 };
//        System.out.println(largestElementInArray(arr));
//        int ans[] = secondMax(arr);
//        System.out.println(Arrays.toString(ans));
//        System.out.println(checkArraySortedOrNot(arr));
//        System.out.println(removeDublicateFromSortedArray(arr));

//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(2);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        int ans = removeDublicate(arr);
//        System.out.println(ans);

//        int [] arr = {0,1,0,3,12};
////        movesZeroAtEndMaintainElementOrder(arr);
//        movesZeroAtEndWithoutMaintainElementOrder(arr);
//        System.out.println(Arrays.toString(arr));

//        int [] arr = {9,6,4,2,3,5,7,0,1};
//        System.out.println(missingElement(arr));

//        int [] arr = {1,1,0,1,1,1};
//        System.out.println(maxConsecutiveOnes(arr));

//        int [] arr = {4,1,2,1,2};
//        System.out.println(findNumberAppersOnce(arr));

        String str = "bzyadeaf";
        System.out.println(findRepeatingElementOptimeApproch(str));
//        System.out.println(findRepeatingElement(str));
        
    }

//    Largest Element in the Array
    public static int largestElementInArray(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }

    public static int[] secondMax(int [] arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>=max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax)
                smax = arr[i];
        }
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<=min)
            {
                smin = min;
                min = arr[i];
            }
            else if(arr[i]<smin)
                smin = arr[i];
        }
        return new int[]{smax,smin};
    }

    public static int checkArraySortedOrNot(int [] arr){
        int idx = 0;
        while (idx<arr.length-1)
        {
            if(arr[idx+1]>=arr[idx])
                idx++;
            else
                return 0;
        }
        return 1;
    }

    public static int removeDublicateFromSortedArray(int [] arr){
        int counter = 1;
        int idx = 0;
        while (idx<arr.length-1){
            if(arr[idx+1]==arr[idx]){
                idx++;
            }
            else {
                counter++;
                idx++;
            }
        }
        return counter;
    }

    public static int removeDublicate(ArrayList<Integer> arr){
        HashSet<Integer> settt = new HashSet<>(arr);
        return settt.size();
    }

    //1. Moves zero at end Maintain the order
    public static void movesZeroAtEndMaintainElementOrder(int [] arr){
        int i = 0;
        for (int j = 0; j < arr.length ; j++) {
            if(arr[j] != 0)
            {
                swap(arr,i,j);
                i++;
            }
        }
    }

    public static void movesZeroAtEndWithoutMaintainElementOrder(int [] arr){
        int i = 0;
        int j = arr.length-1;
        while (i<j)
        {
            if(arr[i] == 0)
            {
                swap(arr,i,j);
                i++;
                j--;
            }
            i++;
        }
    }

    public static void swap(int [] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int missingElement(int [] arr){
        int n = arr.length;
        int sum1 = (n*(n+1))/2; // first sum all the number between 1 to n
        int sum2 = 0;
        for (int i = 0; i <n ; i++) {
            sum2 += arr[i];
        }
        return sum1-sum2;
    }

    public static int maxConsecutiveOnes(int [] arr){
        int counter = 0;
        int secondCounter = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==1)
            {
                counter++;
            }
            else
            {
                secondCounter = counter;
                counter = 0;

            }
        }
        if(counter >= secondCounter)
        {
            secondCounter = counter;
        }
        return secondCounter;
    }

    //xor (^) basically used to 1^1=0 and 0^1==1
    public static int findNumberAppersOnce(int [] arr){
        int xor = 0;
        for (int i = 0; i <arr.length ; i++) {
            xor = xor^arr[i];
        }
        return xor;
    }

    public static int findRepeatingElement(String str){
        for (int i = 0; i <str.length() ; i++) {
            int ch = str.charAt(i);
            for (int j =i+1; j < str.length() ; j++) {
                int chr = str.charAt(j);
                if(ch == chr)
                    return i;
            }
        }
        return -1;
    }

    public static int findRepeatingElementOptimeApproch(String str){
 //       ArrayList<Character> list = new ArrayList<>();
        HashMap<Character , Integer> list = new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(list.containsKey(ch)){
                return list.get(ch);
            }
            else {
                list.put(ch , i);
            }
        }
        return -1;
    }


}
