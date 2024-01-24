package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Main1 {
    public static void main(String[] args) {
        // 2 5 3 4 8
//        int c = 0;
//        List<Integer> ans = Arrays.asList(2,5,3,4,8);
////        int max = ans.stream().mapToInt(c -> c).max().orElseThrow(NoSuchElementException::new);
//        int min = ans.stream().mapToInt(c -> c).min().orElseThrow(NoSuchElementException::new);
//        System.out.println(min);

        // [1,2,4,6]
        // 3 , 5
//        int arr[] = {1,2,4,6};
//        for (int i = 0; i <arr.length-1 ; i++) {
//            if(arr[i] != arr[i+1]-1)
//                System.out.println(arr[i]+1);
//        }

        int[] original = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;
        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }
    // Wissen Technology Interview question
    public static List<int[]> splitArray(int[] array, int splitSize) {
        List<int[]> list = new ArrayList<>();
        int t;
        int i=0;
        int[] arr;
        int rem = array.length%splitSize;
        if(rem==0)
            t = array.length/splitSize;
        else
            t = array.length/splitSize + 1;
        int r =1;
        while(r<=t){
            if(rem ==0){
                arr = new int[splitSize];
            }
            else if(rem!=0 && r==t){
                arr = new int[rem];
            }
            else{
                arr = new int[splitSize];
            }
            int j=0;
            while(i<splitSize*r && i<array.length){
                arr[j++] = array[i];
                i++;
            }
            list.add(arr);
            r++;
        }
        return list;
    }


}
