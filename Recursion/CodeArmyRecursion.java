package Recursion;

public class CodeArmyRecursion {

    // Print Happy birthday
    public static void happyBirthday(int n){
        if(n==0) {
            System.out.println("Happy Birthday!");
            return;
        }
        System.out.print(n + "Days Left For Birthday!!");
        System.out.println();
        happyBirthday(n-1);
    }

    public static void printFunction(int n){
        if(n==0) return;
        printFunction(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
//        happyBirthday(10);
        printFunction(5);
    }
}
