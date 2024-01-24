package Stacks;

import java.util.Stack;

public class StackBasicOperations {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
//        displayReverseRecursion(st);
//        displayStackRecursively(st);
//          pushElementAtBottom(st);
        removeAtBottom(st);

//***********************************// Basic Operations ****************************************
    // 1.Reverse the stack
//        Stack<Integer> reverse = new Stack<>();
//        while (st.size()>0)
//        {
//            reverse.push(st.pop());
//        }
//        System.out.println(reverse);

        // 2. Insert the Element at Any Index
//        Stack<Integer> temp = new Stack<>();
//        int idx = 2;
//        int element = 7;
//        while (st.size()>idx)
//        {
//            temp.push(st.pop());
//        }
//        st.push(element);
//        while (temp.size() > 0)
//        {
//            st.push(temp.pop());
//        }
//        System.out.println(st);
    }

    public static void displayReverseRecursion(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+ " ");
        displayReverseRecursion(st);
        st.push(top);
    }

    public static void displayStackRecursively(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        displayStackRecursively(st);
        System.out.print(top+ " ");
        st.push(top);
    }

    public static void pushElementAtBottom(Stack<Integer> st){
        int element = 7;
        if(st.size()==0){
            st.push(element);
            System.out.print(element+ " ");
            return;
        }
        int top = st.pop();
        pushElementAtBottom(st);
        System.out.print(top+ " ");
        st.push(top);
    }

    public static void removeAtBottom(Stack<Integer> st){
        int idx = 3;
        if(st.size()==idx)
        {
            st.pop();
            return;
        }
        int top = st.pop();
        removeAtBottom(st);
        System.out.print(top + " ");
        st.push(top);
    }

}
