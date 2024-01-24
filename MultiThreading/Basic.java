package MultiThreading;

// First way to create the thread by using extending the thread
public class Basic extends Thread {
    @Override
    public void run(){
        System.out.println("Thread is Running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }





    public static void main(String[] args) {
        Basic  basic = new Basic(); // creating the single thread
        // Start is basically used for starting the thread
        basic.start();
        Basic basic1 = new Basic(); // here creating multiple thread with single task
        basic1.start();
//        basic.sleep(2000);
        int a = 5;
        int b = 3;
        System.out.println(a+b);
    }

}
