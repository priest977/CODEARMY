package Pattern;

public class Main {
    public static void main(String[] args) {
        printPattern(4);

    }
//
//                1
//                1 2
//                1 2 3
//                3 2 1
//                2 1
//                1
    public static void printPattern(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1 ; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
