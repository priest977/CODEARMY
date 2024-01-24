package TwoDArrays;

public class Main {
    public static void main(String[] args) {
        // Addition
//        int arr1[][] = {
//                {2,3},
//                {4,5}
//        };
//        int arr2[][] = {
//                {1,7},
//                {6,9}
//        };
//        additionOfTwoMatrix(arr1,2,2,arr2,2,2);

        // Multiplication
//        int[][] arr1 = {
//                {1,2,3,4},
//                {5,6,7,8}
//        };
//        int [][] arr2 = {
//                {1,2,3,4},
//                {5,6,7,8},
//                {4,3,1,6},
//                {1,2,3,4}
//        };
//        multiplicationOfTwoMatrix(arr1,2,4,arr2,4,4);

        // Transpose of matrix
//        int [][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

//        int [][] ans = transposeOfMatrix(arr,3,3);
//        print2DArray(ans);

//        transposeTheMatrixWithoutCreatingNewMatrix(arr,3,3);
//        print2DArray(arr);

//        rotateMatrixBy90Degree(arr,3,3);
//        print2DArray(arr);

//        int arr[][] = {
//                        {1,2,3},
//                        {4,5,6},
//                        {7,8,9},
//                        {10,11,12}
//                       };

//        boolean ans =  searchElementInArray(arr,7);
//        System.out.println(ans);

//        print2DArray(arr);

        // Take Input from User
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The Rows");
//        int row = sc.nextInt();
//        System.out.println("Enter The Columns");
//        int col = sc.nextInt();
//        int arr[][] = new int[row][col];
//        for (int i = 0; i <row ; i++) {
//            for (int j = 0; j <col ; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        print2DArray(arr);




    }
    // print the 2 d array
    public static void print2DArray(int arr[][]){
        for (int i = 0; i < arr.length ; i++) { // row
            for (int j = 0; j < arr[i].length; j++) { // col ==>  arr[i].length
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Search Element in Array
    public static boolean searchElementInArray(int[][] arr , int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if(arr[i][j]==target)
                    return true;
            }
        }
        return false;

    }
        
    public static void additionOfTwoMatrix(int[][] A, int r1, int c1 , int[][] B, int r2, int c2){
            // Check the condition
            if(r1 != r2 || c1 != c2){
                System.out.println("Wrong Input - Addition Not Possible");
                return;
            }
            // Sum matrix is also the same dimension
            int[][] sum = new int[r1][c1]; // same here as well r1 c1 or r2 c2
            for (int i = 0; i < r2 ; i++) { // r1 or r2
                for (int j = 0; j < c2 ; j++) { // c1 or c2
                    sum[i][j] = A[i][j] + B[i][j];
                }
            }
           print2DArray(sum);
    }

    public static void multiplicationOfTwoMatrix(int[][] a, int r1, int c1 , int [][]b , int r2 , int c2){
            if(c1 != r2){
                System.out.println("Multiplication Not Possible");
                return;
            }
            int[][] mul = new int[r1][c2];
            for (int i = 0; i <r1 ; i++) {
                for (int j = 0; j <c2 ; j++) {
                    for (int k = 0; k < c1; k++) {
                        mul[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            print2DArray(mul);
    }

    public static int[][] transposeOfMatrix(int [][] arr, int r , int c){
            int [][] ans = new int[c][r];
            for (int i = 0; i < c ; i++) {
                for (int j = 0; j < r; j++) {
                    ans[i][j] = arr[j][i];
                }
            }
            return ans;
    }

    public static void transposeTheMatrixWithoutCreatingNewMatrix(int[][] arr, int r , int c){
            for (int i = 0; i < c ; i++) {
                for (int j = i; j < r ; j++) {
                    //Swap the matrix
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
    }

    public static void rotateMatrixBy90Degree(int [][] arr, int r , int c){
            // Transpose the Matrix
            transposeTheMatrixWithoutCreatingNewMatrix(arr,r,c);
            for (int i = 0; i < r; i++) {
                reverseArray(arr[i]);
            }
    }
    public static void spiralMatrixPrint(int [][] matrix , int r , int c){
        int topRow = 0 , bottomRow = r-1 , leftCol = 0 , rightCol = c-1;
        int totalElement = 0;
        while(totalElement < r*c)
        {
            // TopRow --> leftCol to RightCol
            for (int i = topRow; i <= rightCol && totalElement < r*c ; i++) {
                System.out.print(matrix[topRow][i]+ " ");
            }
            topRow++;
            // RightCol--> topRow to BottomRow
            for (int i = topRow; i <= bottomRow && totalElement < r*c ; i++) {
                System.out.print(matrix[i][rightCol] + " ");
            }
            rightCol--;
            // BottomRow --> RightCol to LeftCol
            for (int i = rightCol; i >= leftCol && totalElement < r*c; i--) {
                System.out.print(matrix[bottomRow][i] + " ");
            }
            bottomRow--;
            // LeftCol --> BottomRow to TopRow
            for (int i = bottomRow; i >= topRow && totalElement < r*c; i--) {
                System.out.print(matrix[i][leftCol] + " ");
            }
            leftCol++;
        }
    }
    public static int [][] printSpiralFormWithNNumber(int n ) {
        int [][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int currentElement = 1;
        while (currentElement <= n * n) {
            // TopRow --> leftCol to RightCol
            for (int i = topRow; i <= rightCol && currentElement <= n * n; i++) {
                matrix[topRow][i] = currentElement;
                currentElement++;
            }
            topRow++;
            // RightCol--> topRow to BottomRow
            for (int i = topRow; i <= bottomRow && currentElement <= n * n; i++) {
                matrix[i][rightCol]  = currentElement;
                currentElement++;
            }
            rightCol--;
            // BottomRow --> RightCol to LeftCol
            for (int i = rightCol; i >= leftCol && currentElement <= n * n; i--) {
                matrix[bottomRow][i] = currentElement;
                currentElement++;
            }
            bottomRow--;
            // LeftCol --> BottomRow to TopRow
            for (int i = bottomRow; i >= topRow && currentElement <= n * n; i--) {
                matrix[i][leftCol] = currentElement;
                currentElement++;
            }
            leftCol++;
        }
        return matrix;
    }

    public static void reverseArray(int []arr){
            int start = 0;
            int end = arr.length-1;
            while (start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }

}

