package HashSet;

import java.util.HashSet;

public class Questions {
    public static void main(String[] args) {
//        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 1, 9};
//        System.out.println(longestConsicutiveElementHelp(arr));

        int [] arr = {2,1,1,3,2,3};
        System.out.println(containMaxElementInTable(arr));

    }

    public static int longestConsicutiveElementSelf(int[] arr) {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(i);
        }
        int counter = 0;
//        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if (list.contains(temp + 1)) {
                counter++;
            }
        }
        return counter;
    }

    public static int longestConsicutiveElementHelp(int[] arr) {
        HashSet<Integer> list = new HashSet<>();
        for(int ans : arr) list.add(ans);
        int maxLength = 0;
        for(int nums : list){
            if(!list.contains(nums-1)){
                int currNum = nums;
                int currLength = 1;
                while (list.contains(currNum+1)){
                    currLength++;
                    currNum++;
                }
                maxLength = Math.max(currLength,maxLength);
            }
        }
        return maxLength;
    }

    public static int containMaxElementInTable(int [] arr){
        int counter = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            if(set.contains(arr[i])){
                set.remove(arr[i]);
            }
            else {
                set.add(arr[i]);
                counter = Math.max(counter, set.size());
            }
        }
        return counter;
    }
}
