package Java8;

interface PrincipalEmployee{
    String salary();
//    String designation();
}

// That is called Anonymous Inner class
//public class AnonymousInnerClass {
//    public static void main(String[] args) {
//        PrincipalEmployee principalEmployee = new PrincipalEmployee() {
//            @Override
//            public String salary() {
//                return "1000";
//            }
//
//            @Override
//            public String designation() {
//                return "Software Engineer";
//            }
//        };
//        System.out.println(principalEmployee.salary());
//        System.out.println(principalEmployee.designation());
//
//    }
//}

class LocalAndInstanceVariable{
    public void doSomething(){
        PrincipalEmployee principalEmployee = ()->{
            return "100";
        };
        System.out.println(principalEmployee.salary());
    }
}

//class SoftwareEngineer1 implements PrincipalEmployee{
//    @Override
//    public String salary() {
//        return "100";
//    }
//
//    @Override
//    public String designation() {
//        return "Software Engineer";
//    }
//}
public class AnonymousInnerClass {
    public static void main(String[] args) {
//        PrincipalEmployee principalEmployee = new SoftwareEngineer1();
//        System.out.println(principalEmployee.salary());
//        System.out.println(principalEmployee.designation());

    }
}
