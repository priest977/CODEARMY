package Arrays;

public class CheckPurposeObject {
    int [] arr;
    int target;

    public CheckPurposeObject(int[] arr, int target) {
        this.arr = arr;
        this.target = target;
    }
    public int linearSearch(){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,34,5};
        CheckPurposeObject object = new CheckPurposeObject(arr,1);
        System.out.println(object.linearSearch());
//        System.out.println(linearSearch(arr,3));

    }
}
