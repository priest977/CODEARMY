package LinkedList;

public class Main {
    // Creating Node
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;

        }
    }
    public static void main(String[] args) {
//        Node node1 = new Node(4);
//        Node node2 = new Node(3);
//        Node node3 = new Node(5);

        LinkedList ll = new LinkedList();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        System.out.println(ll.size);
        ll.printLinkedList();

        ll.removeAtFirst();
        System.out.println(ll.size);
        ll.printLinkedList();
//
//        ll.addFirst(1);
//        ll.printLinkedList();


    }
}
