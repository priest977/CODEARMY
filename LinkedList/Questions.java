package LinkedList;

public class Questions {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(1);
        Node f = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        boolean ans = palindromeLinkedList(a);
        System.out.println(ans);
//
//        printLinkedList(a);
//        Node ans = reverseLinkedListIteratively(a);
//        printLinkedList(ans);

//        printLinkedList(a);
//        Node ans = reverseLinkedListRecursively(a);
//        printLinkedList(ans);


//        Node ans = deleteMiddle(a);
//        System.out.println(ans.data);

//        Node ans = findMiddle(a);
//        System.out.println(ans.data);
//
//        Node ans = findingIntersectionOfTwoLinkedList(a1,a);
//        System.out.println(ans.data);

//        int size = calculateSizeOfLL(a);
//        System.out.println(size);

//        Node temp = findNthNodeFromEnd(a,3);
//        System.out.println(temp.data);

        Node temp = slowAndFastApproachFindNthNodeFromEnd(a,3);
        System.out.println(temp.data);

//        Node delete = removeNthNodeFromEnd(a,3+1);
//        System.out.println(delete.data);

//        Node delete = slowAndFastApproachRemoveNthNodeFromEnd(a,3);
//        System.out.println(delete.data);


    }

    public static int calculateSizeOfLL(Node head) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public static Node findNthNodeFromEnd(Node head, int idx) {
        int size = calculateSizeOfLL(head);
        int index = size - idx + 1;
        Node temp = head;
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static Node slowAndFastApproachFindNthNodeFromEnd(Node head, int idx) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static Node removeNthNodeFromEnd(Node head, int idx) {
        Node find = findNthNodeFromEnd(head, 3 + 1);
        Node temp = head;
        while (temp != find) {
            temp = temp.next;

        }
        temp.data = temp.next.data;
        temp.next = null;
        return temp;
    }

    public static Node slowAndFastApproachRemoveNthNodeFromEnd(Node head, int idx) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < idx; i++) {
            fast = fast.next;
        }
        // For deeleting the head so that the main reason here i am applying the check
        if (fast == null) {
            head = head.next;
            return head;
        }
        // hm fast ko tail tak le jaa rhe
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static Node findingIntersectionOfTwoLinkedList(Node headA, Node headB) {
        // Calculate the size of both the linked list
        Node tempA = headA;
        int sizeA = 0;
        int sizeB = 0;
        Node tempB = headB;
        while (tempA != null) {
            tempA = tempA.next;
            sizeA++;
        }
        while (tempB != null) {
            tempB = tempB.next;
            sizeB++;
        }
        tempA = headA;
        tempB = headB;
        if (sizeA > sizeB) {
            int steps = sizeA - sizeB;
            for (int i = 0; i < steps; i++) {
                tempA = tempA.next;
            }
        } else {
            int steps = sizeB - sizeA;
            for (int i = 0; i < steps; i++) {
                tempB = tempB.next;
            }
        }
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }

    public static Node findMiddle(Node head) {
        Node slow = head, fast = head;
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        // Even Case
        if (size % 2 == 0) {
            while (fast != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        // Odd Case
        else {
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

    public static Node deleteMiddle(Node head) {
        if (head.next == null) return null;
        Node slow = head, fast = head;
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        temp = head;
        //Even Delete
        if (size % 2 == 0) {
            while (fast != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            while (temp.next != slow) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return slow;
        }
        // Odd Delete
        else {
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            while (temp.next != slow) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return slow;
        }
    }

    public static boolean cyclicNode(Node head) {
        Node slow = head, fast = head;
        // For single node
        if (head.next == null) return false;
        // for multi Node
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static Node mergeTwoSortedLinkedList(Node list1, Node list2) {
        Node ans = new Node(100);
        Node countAns = ans;
        Node temp1 = list1;
        Node temp2 = list2;
        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                Node a = new Node(temp1.data);
                countAns.next = a;
                countAns = a;

            } else {
                Node a = new Node(temp2.data);
                countAns.next = a;
                countAns = a;
            }
        }
        if (temp1 == null) {
            countAns.next = temp2;
        } else {
            countAns.next = temp1;
        }

        return ans.next;

    }

    public static Node mergeTwoSortedLinkedListWithoutUseExtraSpace(Node list1, Node list2) {
        Node ans = new Node(100);
        Node temp = ans;
        Node temp1 = list1;
        Node temp2 = list2;
        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null){
            temp.next = temp2;
        }
        else {
            temp.next = temp1;
        }
        return ans.next;
    }

    public static Node reverseLinkedListRecursively(Node head){
        if(head.next == null) return head;
        Node newHead = reverseLinkedListRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static Node reverseLinkedListIteratively(Node head){
        Node curr = head;
        Node prev = null;
        Node agla = null;
        while (curr != null)
        {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }

    public static boolean palindromeLinkedList(Node head){
        //1. Find left Medium
        // Base case
        Node slow = head;
        Node fast = head;
//        if(fast.next == null) return slow;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // Reverse Linkedlist
        Node end = slow.next;
        Node prev = null;
        Node agla = null;
        while (end != null){
            agla = end.next;
            end.next = prev;
            prev = end;
            end = agla;
        }
        prev.next = slow;
        Node start = head;
        Node check = prev;
        while (start != slow && check != slow){
            if(start.data != check.data) return false;
            start = start.next;
            check = check.next;
        }
        return true;
    }

    public static void printLinkedList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

//    public static Node AddTwoNumberLeetCode(Node l1 , Node l2){
//        Node temp1 = l1;
//        Node temp2 = l2;
//        Node res = new Node(100);
//        Node temp = res;
//        while (temp1 != null && temp2!=null){
//            temp.next =  (temp1.data+temp2.data)%10;
//           temp1 = temp1.next;
//           temp2 =  temp2.next;
//           temp =  temp.next;
//        }
//        return res.next;
//    }
}
