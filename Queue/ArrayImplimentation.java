package Queue;

public class ArrayImplimentation {
   public static class Queue{
       int [] arr = new int[100];
       int idx = 0;
       int firstIdx =0;
        void add(int x){
            arr[idx] = x;
            idx++;
        }
        int remove(){
            if(idx == 0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int top = arr[firstIdx];
            arr[firstIdx] = 0;
            firstIdx++;
            return top;
        }

        int peek(){
            return arr[firstIdx];
        }

        void display(){
            for (int i = 0 ; i < idx; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

   }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.peek());

    }
}
