package Java8;

@java.lang.FunctionalInterface
interface Parent{
     default void sayBye(){
        System.out.println("Byeee!");
    }
void sayHello();
}

class Child implements Parent{
     @Override
    public void sayHello(){
         System.out.println("Hello Interface!");
     }
}

// Interview Question
interface A{
    default void sayHello(){
        System.out.println("A Say Hello!");
    }
}

interface B{
    default void sayHello(){
        System.out.println("B Say Hello!");
    }
}
public class DefaultMethod implements B {
//    public static void main(String[] args) {
//        Child c = new Child();
//        c.sayHello();
//        c.sayBye();
//    }

    public static void main(String[] args) {
        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.sayHello();
    }
    @Override
    public void sayHello(){
        B.super.sayHello();
    }
}
