package Stacks;
import java.util.*;
public class StackImplimantation {
    public static void main(String[] args) {
        // It is Similarly for ArrayList
        Stack<Integer> st = new Stack<>();
        // Push means add krna jaise ArrayList TwoDArrays.Main.Main add() method use krte hai
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);

        // Direct Print Without Applying Loop Similar to ArrayList
//        System.out.println(st); //[1, 2, 3, 4, 5, 6]

        // Pop means delete krna
        //Note==> stack hmesa topmost ko ki posh ya pop krta hai
//        st.pop();
//        System.out.println(st); //[1, 2, 3, 4, 5]

        //peek stack ke topmost main jo usko utha lega C++ main top bolte hai peeek ko

        // ist way
//        int ans =  st.peek();
//        System.out.println(ans); // 5

        //2nd way
//        System.out.println(st.peek()); // 5

        // size
//        System.out.println(st.size()); // 5

        // How To take input from user
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size : ");
//        int size = sc.nextInt();
//        for(int i = 0 ; i < size ; i++){
//            int input = sc.nextInt();
//            st.push(input);
//        }
//        System.out.println(st);

//***********************************// Basic Operations ****************************************

        //Reverse the stack
//        Stack<Integer> rt = new Stack<>();
//        while (st.size()>0){
//            int x = st.peek();
//            rt.push(x);
//            st.pop();
//        }
//        System.out.println(rt);

        // OR

//        while (st.size()>0){
//            rt.push(st.pop());
//        }
////        System.out.println(rt);
//
//        // Reverse the stack in same order
//        Stack<Integer> so = new Stack<>();
//        while (rt.size()>0){
//            so.push(rt.pop());
//        }
//        System.out.println(so);
//    }

        // Insert at Element at any Index
        int idx = 2;
        int element = 7;


    }

}
