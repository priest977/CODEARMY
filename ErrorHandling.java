public class ErrorHandling {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5};
//        try {
//            System.out.println(arr[8]);
//        }catch (Exception wrong){
//            System.out.println(wrong);
//        }finally {
//            System.out.println("The block is executed sucessfully");
//        }
        age(14);
    }

    static void age(int age){
        if(age<18){
            throw new ArithmeticException("Access Denied You are Under Age");
        }else {
            System.out.println("Access Succesfull You are above 18");
        }
    }
}
