package javaOppsProject.EmployeePayrollSystemProject;

public class PartTimeEmployee extends Employee {

    double partTimeSalary;

    public PartTimeEmployee(String name, int id, double partTimeSalary) {
        super(name, id);
        this.partTimeSalary = partTimeSalary;
    }
    @Override
   public double calculateSalary() {
        return partTimeSalary;
    }
}
