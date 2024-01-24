package Queue;

import Stacks.LInkedListImplimantation;

public class LinkedListImplementation {
  static class  Node{
       int data;
       Node next;

       public Node(int data, Node next) {
           this.data = data;
           this.next = next;
       }
   }
    static class LLQueue{
       Node head = null;
       void add(int x){
           Node temp = new Node(x , null);
           temp.next = head;
           head = temp;
       }

       int remove(){
           int temp = head.data;
           head = head.next;
           return temp;
       }

       int peek(){
           return head.data;
       }

       void display(){
           Node temp = head;
           while (temp != null){
               System.out.print(temp.data + " ");
               temp = temp.next;
           }
           System.out.println();
       }


   }

    public static void main(String[] args) {
        LLQueue queue = new LLQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.display();
    }
}
