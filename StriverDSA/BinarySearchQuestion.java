package StriverDSA;

public class BinarySearchQuestion {
    public static void main(String[] args) {
//        int [] arr = {1,3,5,6};
//        System.out.println(searchInsertPosition(arr,2));
        System.out.println(perfectSquare(12));
    }

    public static int searchInsertPosition(int [] arr , int target){
        int idx = 0;
        while (idx<arr.length){
            if(arr[idx]<target) idx++;
            else break;
        }
        return idx;
    }

    public static int perfectSquare(int n){
        int local = 1;
        while (local*local != n){
            System.out.println(local);
            local++;
            System.out.println(local);
            break;
        }
        return local;

    }
}
