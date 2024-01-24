package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class Questions {
    public static void main(String[] args) {
//        String s = "()[]{";
//        System.out.println(validParentheses(s));
//
//        int [] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
//        int [] ans = removeConsicutiveElement(arr);
//        System.out.println(Arrays.toString(ans));

//        int [] arr = {1,3,2,1,8,6,3,4};
//        int [] ans = nextGreaterElement(arr);
//        System.out.println(Arrays.toString(ans));

        int [] arr = {100,80,60,70,60,75,85};
        int [] ans = stockSpanProblemGFG(arr);
        System.out.println(Arrays.toString(ans));
    }

    //20. Valid Parentheses (Leetcode)
    //"()[]{}"
    public static boolean validParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if(st.size()==0)
                {
                    return false;
                }
                else if(st.peek()==')')
                st.pop();
            }
            if (ch == '[') {
                st.push(ch);
            } else {
                if(st.size()==0)
                {
                    return false;
                }
                else if(st.peek()==']')
                    st.pop();
            }
            if (ch == '{') {
                st.push(ch);
            } else {
                if(st.size()==0)
                {
                    return false;
                }
                else if(st.peek()=='}')
                    st.pop();
            }
        }
        if (st.empty()) {
            return true;
        }
        else
            return false;
    }

    public static int[] removeConsicutiveElement(int [] arr){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length ; i++) {
            if(st.size()==0)
            {
                st.push(arr[i]);
            }
            else if(st.peek()!=arr[i])
            {
                st.push(arr[i]);
            }
            else if(st.peek() == arr[i]){
                if(arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int [] res = new int[st.size()];
        for (int i = res.length-1; i >=0 ; i--) {
            res[i] = st.pop();
        }
        return res;
    }

    public static int[] nextGreaterElement(int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int [] res = new int[n];
        st.push(n-1);
        res[n-1] = -1;
        for (int i = n-2; i >=0 ; i--) {
            while (!st.isEmpty()  &&  arr[st.peek()]<=arr[i])
            {
               st.pop();
            }
            if(st.isEmpty())
            {
                res[i] = -1;
            }
            else
            {
                res[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return res;
    }

    // Stock Stack Problem or Previous Smaller Element
    //[100 80 60 70 60 75 85]
    public static int [] stockSpanProblemGFG(int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[n];
        ans[0] = 1;
        st.push(0);
        for (int i = 1; i <=n-1 ; i++) {
            while (!st.isEmpty() && arr[st.peek()]<=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans[i] = 1;
            }
            else
            {
                ans[i] = i-st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}
