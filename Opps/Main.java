package Opps;

public class Main {
    public static void main(String[] args) {
        // Creating Object
//        Student student = new Student();
//        student.name = "Nafish";
//        student.percentage = 76.3;
//        student.setRollNo(76);
//        System.out.println(student.getRollNo());

        // After making the constructor we can set the value of all the atribute like this
//        Student student = new Student("Nafish",30,92.1);
////        System.out.println(student.name);
////        System.out.println(student.rollNo);
////        System.out.println(student.percentage);
//        System.out.println(student.noOfStudent);
//
//        Student student1 = new Student("Rishabh",39,54.1);
//        System.out.println(student1.name);
//        System.out.println(student1.rollNo);
//        System.out.println(student1.percentage);
//        System.out.println(student.noOfStudent);


        // Inheritance
//        InheritanceParentBoxClass box = new InheritanceParentBoxClass();
        InheritanceChildClass box = new InheritanceChildClass();
        InheritanceChildClass box1 = new InheritanceChildClass(6.8,8.9,4.9);
    }

}
