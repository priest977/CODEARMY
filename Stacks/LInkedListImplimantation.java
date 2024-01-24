package Stacks;

public class LInkedListImplimantation {
    public static class Node{ // User defined data type
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class LLStack{ // user define data structure
        Node head = null;
        int size = 0;

        // Method
        //1. push
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
        }

        //2.peek
        int peek(){
            return head.data;
        }

        //3. pop
        int pop(){
            int temp = head.data;
            head = head.next;
            return temp;
        }

        //2.Display
        void display(){
            Node temp = head;
            while (temp != null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.display();

    }
}
