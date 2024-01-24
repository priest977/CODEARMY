package Java8;

interface F{
    static void sayHello(){
        System.out.println("F say Hello !!!");
    }
    static void sayBye(){
        System.out.println("F say bye !!!");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        // By calling the static method inside the main ,method we can use the direct interface name by using dot operator
        // the static method cannot be override
        F.sayHello();
        F.sayBye();
//        sayHello();
    }
    static void sayHello(){
        System.out.println("F say Hello");
    }
}
