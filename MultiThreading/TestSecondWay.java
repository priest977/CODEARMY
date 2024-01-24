package MultiThreading;

// Second way to create Thread by using Runnable Interface
public class TestSecondWay implements Runnable{
//   public void run(){
//        System.out.println("By Using Interface");
//    }

   synchronized public void run(){
        for (int i =0;i<5;i++){
            System.out.println("Nafish");
        }
    }

    public static void main(String[] args) {
        Runnable testSecondWay = new TestSecondWay();
        Thread thread = new Thread(testSecondWay);
        thread.start();
        for (int i =0;i<5;i++){
            System.out.println("Rishabh");
        }

//        Runnable re = () ->{
//            Thread thread = new Thread(re);
//            re.run();
//        };
//        re.start();
    }
}
