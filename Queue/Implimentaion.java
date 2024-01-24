package Queue;

import java.util.*;

public class Implimentaion {
    public static void main(String[] args) {
        //Queue<Integer> queue = new Queue<>();
        // We cannot write like this because queue are not object it is interface
        // So we can Impliment queue with the help of linkedlist or ArrayDeque both are objects
//        Queue<Integer> queue1 = new ArrayDeque<>();
        Queue<Integer> queue2 = new LinkedList<>();
        // Adding the element in queue
        queue2.add(1);
        queue2.add(2);
        queue2.add(3);
        queue2.add(4);
        queue2.add(5);
//        System.out.println(queue2.size()); // 5
//        System.out.println(queue2); // [1, 2, 3, 4, 5]
//
//        // These two methods are removing the element in queue
//        queue2.remove();
//        // or
//        queue2.poll();
//        System.out.println(queue2); // [3, 4, 5]
//
//        // size
//        System.out.println(queue2.size()); // 3
//
//        // peek or element
//        System.out.println(queue2.peek()); // 3
//        System.out.println(queue2.element()); // 3

        // Print all the element in queue with the help of extra queue
        Queue<Integer> helper = new LinkedList<>();
        while (!queue2.isEmpty()) {
            System.out.println(queue2.peek());
            helper.add(queue2.poll());
        }
        // Adding all the element again in original queue
        while (!helper.isEmpty()){
            queue2.add(helper.poll());
        }

        // All the element in reverse order

    }
}
