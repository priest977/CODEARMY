package Opps;

public class InheritanceChildClass extends InheritanceParentBoxClass {
    public InheritanceChildClass() {
    }

    public InheritanceChildClass(double length, double height, double weight) {
        super(length, height, weight); // That is the constructor of parent call so that the reason the constructor are using super keyword to use the properties of parent class
    }
}
