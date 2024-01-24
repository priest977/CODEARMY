package Java8;

interface Employee{
    String getName();
}

class SoftwareEngineer implements Employee{
    @Override
    public String getName() {
        return "Software Engineer";
    }
}
public class LambdaExpressionUse {
    public static void main(String[] args) {
//        Employee se = () ->"Nafish Software Engineer!";
//        System.out.println(se.getName());
//
//        Employee ed = () ->"Architure Software Engineer!";
//        System.out.println(ed.getName());


        // here we are using thread in java
        Runnable re = () ->{
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello " + i);
            }
        };
        re.run();
    }
}
