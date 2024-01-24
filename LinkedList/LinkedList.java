package LinkedList;

public class LinkedList {
    Node head;
    Node tail;
    int size;
    LinkedList(){
        this.size = 0;
    }

     static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void addLast(int data){
        Node node = new Node(data, null);
        if(this.tail == null){
            this.tail = this.head = node;
        }
        else{
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public void addFirst(int data){
         Node node = new Node(data,null);
         if(this.head == null){
             this.head = this.tail = node;
         }
         else{
             this.head.next = node;
             this.head = node;
             node.next= null;
         }
        this.size++;
    }

    public Node removeAtFirst(){
         if(this.head == null){
             System.out.println("Invalid We cant Remove Because the linkedList are Empty ");
             return  null;
         }
         Node temp = this.head;
         this.head = this.head.next;
         temp.next = null;
         this.size--;
         return temp;
    }



    public void printLinkedList(){
        Node node = this.head;
        while (node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println();
    }
}
