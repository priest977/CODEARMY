package Recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Nafish");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The Number : ");
//        int n = sc.nextInt();
     //   printIncreasingNumber(n);
      //  printDecreasingNumber(n);
      //  System.out.println(factorialIterative(n));
      //  System.out.println(factorialRecursive(n));
      //  System.out.println(fibonachiSeries(n));

        // Print ist 10 fibonachi number
//        for (int i = 0; i <=n ; i++) {
//            System.out.println("First : " + i +  " : Fib Series : "+fibonachiSeries(i));
//        }

    //    System.out.println(sumOfDigit(n));
//        System.out.println(calculatePower(5,4));

   //     multipleNumsKTimes(12,5);
     //   multipleNumsKTimesRecursively(5,4);
//        System.out.println(seriesSumWithAlternateSign(4));
//        System.out.println(seriesSumWithSameSign(4));
  //      greatestCommonDivisor(24,15);
//        System.out.println(greatestCommonDivisorIterativeSecondApproach(24,15));
//        System.out.println(greatestCommonDivisorRecursiveSecondApproach(24,15));
//        int arr[] = {1,2,3};

    //    printArrayByUsingRecursion(arr,0);
//        printReverseArrayByUsingRecursion(arr,0);
//        System.out.println(printMaxElementInArray(arr,0));
//        System.out.println(printMinElementInArray(arr,0));

//        System.out.println(sumOfElementInArray(arr,0));

        int arr[] = {1,2,3,4,5,6};
        System.out.println(linerSearchRecursively(arr,54,arr.length,0));


    }

    public static void printIncreasingNumber(int n){
        // Base Case
        if(n==1){
            System.out.println(n);
            return;
        }
        // Recursive Work
        printIncreasingNumber(n-1);

        // Self Work
        System.out.println(n);
    }

    public static void printDecreasingNumber(int n){
        // Base case
        if(n==1){
            System.out.println(n);
            return;
        }
        // Self Work
        System.out.println(n);

        // Recursive Work
        printDecreasingNumber(n-1);
    }

    public static int factorialIterative(int n){
        int ans = 1;
        for (int i = 1; i <=n ; i++) {
            ans *= i;
        }
        return ans;
    }

    public static int factorialRecursive(int n){
        if(n==1)
            return 1;
        int ans = factorialRecursive(n-1);
        return ans*n;
    }

    public static int fibonachiSeries(int n){
        // Base Case
        if(n==0 || n==1) return n;
        // Recursive Work
        int prev = fibonachiSeries(n-1);
        int prevPrev = fibonachiSeries(n-2);
        // Self Work
        return prev+prevPrev;
    }

    public static int fibonachiSeriesSortCode(int n){
        // Base Case
        if(n==0 || n==1) return n;
        return fibonachiSeriesSortCode(n-1)+fibonachiSeriesSortCode(n-2);
    }

    public static int sumOfDigit(int n){
        // Base Case
        if(n >= 0 && n <= 9) return n;
//        int smallAns = sumOfDigit(n/10);
//        return smallAns+n%10;

        // Small Code
        return sumOfDigit(n/10)+n%10;
    }

    public static int calculatePower(int p , int q){
        if(q==0) return 1;
        return calculatePower(p,q-1)*p;
    }

    public static void multipleNumsKTimes(int nums , int k){
        int ans = 1;
        for (int i = 1; i <=k ; i++) {
            ans = nums* i ;
            System.out.println(ans);
        }
    }

    public static void multipleNumsKTimesRecursively(int nums , int k){
            // Base Case
          if(k==1){
              System.out.println(nums);
              return;
          }
          //Recursive Work
        multipleNumsKTimesRecursively(nums,k-1);

          // Self Work
        System.out.println(nums*k);
    }


    // Series Sum With Alternate Sign Eg ==> n = 5 => 1-2+3-4+5 = 3
    public static int seriesSumWithAlternateSign(int n){
        if(n == 0) return 0;
        if(n % 2 == 0) // if n i even than we will do the min
            return seriesSumWithAlternateSign(n-1) - n;
        else // if n is odd so we wll do the plus
            return seriesSumWithAlternateSign(n-1) + n;
    }

    public static int seriesSumWithSameSign(int n){
        if(n == 0) return 0;
        return seriesSumWithSameSign(n-1)+n;
    }

   public static void greatestCommonDivisor(int x , int y){
        int ans = 0;
       for (int i = x; i >=1 ; i--) {
           if(x%i==0 && y%i==0)
               ans = i;
           if(ans > 1)
               System.out.println(ans);
       }
   }

   public static int greatestCommonDivisorIterativeSecondApproach(int x , int y){
        while (x % y !=0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
   }

   public static int greatestCommonDivisorRecursiveSecondApproach(int x , int y){
        if (y == 0) return x;
        // By Using Euclid's Algorithm
        return greatestCommonDivisorRecursiveSecondApproach(y,x%y);
   }

   public static void printArrayByUsingRecursion(int arr[] , int idx){
        if(idx == arr.length) return;
       System.out.println(arr[idx]);
      printArrayByUsingRecursion(arr,idx+1);
   }

    public static void printReverseArrayByUsingRecursion(int arr[] , int idx){
        if(idx == arr.length) return;
        printReverseArrayByUsingRecursion(arr,idx+1);
        System.out.println(arr[idx]);
    }

    public static int printMaxElementInArray(int arr[] , int idx){
        //Base case
        if(idx == arr.length-1) return arr[idx];
        // Recursive Work
        int max = printMaxElementInArray(arr,idx+1);
        //Self Work
        return Math.max(arr[idx],max);
    }

    public static int printMinElementInArray(int arr[] , int idx){
        //Base case
        if(idx == arr.length-1) return arr[idx];
        // Recursive Work
        int max = printMaxElementInArray(arr,idx+1);
        //Self Work
        return Math.min(arr[idx],max);
    }

    public static int sumOfElementInArray(int arr[] , int idx){
        if(idx == arr.length-1) return arr[idx];

        // Long Take for taking one extra parameter(That is also Correct)

//        int ans = sumOfElementInArray(arr,idx+1);
//        return ans+arr[idx];

        // Short Code (That is also Correct)
        return sumOfElementInArray(arr,idx+1) + arr[idx];
    }

    public static boolean linerSearchRecursively(int arr[] , int target , int n , int idx){
        if(idx >= n) return false;
        if(arr[idx]== target) return true;
        return  linerSearchRecursively(arr,target,n,idx+1);
    }
}
