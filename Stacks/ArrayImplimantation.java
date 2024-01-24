package Stacks;

public class ArrayImplimantation {
    public static class Stack{
        int [] arr = new int[100];
        int idx = 0;

        // Method to create push
        void push(int x){
            if(isFull())
            {
                System.out.println("Stack is Full!");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        // Peek
        int peek(){
            if(idx == 0)
            {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[idx-1];
        }

        // Pop
        int pop(){
            if(idx == 0)
            {
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0; // deleteing the elemment in java by default the element are present is zero
            idx--;
            return top;
        }

        //Display
        void display(){
            for (int i = 0; i < idx ; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        //size
        int size(){
            return idx;
        }

        //IsEmpty
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }

        //IsFull
        boolean isFull(){
            if (idx == arr.length) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display(); // 1 2 3
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();
        System.out.println(st.size());
    }



}
