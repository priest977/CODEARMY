package Arrays;

public class KadanesAlgorithm {
    public static void main(String[] args) {

//        int arr[] = {3,4,-2,5,8,20,-10,8};
//        printSubArray(arr);
//        System.out.println(divideSubArrayWithEqualSumBruteForce(arr));
//        System.out.println(divideSubArrayWithEqualSumBruteForce2(arr));

        int arr[] = {4,-6,2,8};
//        System.out.println(maxSumOfSubArray(arr));
        System.out.println(maxSumOfSubArrayKadashAlgo(arr));
    }


    // Print all the subArray
    public static void printSubArray(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    // Divide  Array in 2 SubArray with equal sum  Complexicity(0n2)
    public static boolean divideSubArrayWithEqualSumBruteForce(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            int sum1 = 0 , sum2 = 0;
            for (int j = 0; j <=i ; j++) {
                sum1 += arr[j];
            }
            for (int j = i+1; j < arr.length ; j++) {
                sum2 += arr[j];
            }
            if(sum1==sum2) return true;
        }
        return false;
    }

    // (0n) ==> Complexcity
    public static boolean divideSubArrayWithEqualSumBruteForce2(int arr[]){
       int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int prefix = 0;
        for (int i = 0; i < arr.length-1 ; i++) {
            prefix += arr[i];
            int ans = sum-prefix;
            if(ans==prefix) return true;
        }
        return false;
    }

    public static int maxSumOfSubArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            int prefix = 0;
            for (int j = i; j <arr.length; j++) {
                prefix += arr[j];
               maxSum= Math.max(maxSum,prefix);
            }
        }
        return maxSum;
    }

    public static int maxSumOfSubArrayKadashAlgo(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix = 0;
        for (int i = 0; i <arr.length ; i++) {
            prefix += arr[i];
            maxSum = Math.max(maxSum,prefix);
            if(prefix<0)
                prefix = 0;
        }
        return maxSum;
    }
}
