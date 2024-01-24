package Java8;

@java.lang.FunctionalInterface
interface FunctionalInterface {
    //Only one abstract method are here in
    void sayHello();
   default void sayBye(){
       System.out.println("Say Bye!");
   }

   static void sayNothing(){
       System.out.println("Say Nothing!");
   }
}


class Testing implements FunctionalInterface {
    public static void main(String[] args) {
        Testing testing = new Testing();
        testing.sayBye();
        testing.sayHello();
        FunctionalInterface.sayNothing();
    }

    @Override
    public void sayHello() {
        System.out.println("Say Hello!");
    }

}



