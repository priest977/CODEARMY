package StriverDSA;

import java.util.Arrays;

public class MediumQuestion{

    public static int printMaxNumberEncounter(int [] arr){
        int maxNumber = 0;
        for (int i = 0; i <arr.length ; i++) {
            int counter = 0;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[j]==arr[i]) counter++;
            }
            if(counter>maxNumber)
                maxNumber = counter;
        }
        return maxNumber;
    }

    public static int [] rearrangeTheElement(int [] arr){
        int [] positiveElement = new int[arr.length/2];
        int [] negativeElement = new int[arr.length/2];
        int idxp = 0;
        int idxn = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>=0){
                positiveElement[idxp] = arr[i];
                idxp++;
            }
            else {
                negativeElement[idxn] = arr[i];
                idxn++;
            }
        }
        idxp = 0;
        idxn = 0;
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = positiveElement[idxp];
            idxp++;
            i++;
            arr[i] = negativeElement[idxn];
            idxn++;

        }
        return arr;
    }

    public static int maxSumCount(int [] arr , int target){
        int maxSum = 0;
        int counter = 0;
        int maxCounter = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (maxSum == target) {
                maxSum = 0;
                if(counter>maxCounter){
                    maxCounter = counter;
                    counter = 0;
                }
            }
            else if (arr[i] == target) {
                counter++;
                if(counter>maxCounter){
                    maxCounter = counter;
                    counter = 0;
                }
            }
            else {

                maxSum+= arr[i];
                counter++;
            }

        }
        return maxCounter;
    }
    public static void main(String[] args) {
//        int [] arr = {2,2,1,1,1,2,2};
//        System.out.println(printMaxNumberEncounter(arr));
//        int [] arr = {3,1,-2,-5,2,-4};
//        int [] ans = rearrangeTheElement(arr);
//        System.out.println(Arrays.toString(ans));

        int [] arr = {1,2,3,1,1,1,1,1};
        System.out.println(maxSumCount(arr,5));
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
    }

}
