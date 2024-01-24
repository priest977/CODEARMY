package javaOppsProject.EmployeePayrollSystemProject;

public class FullTimeEmployee extends Employee {
    double monthlySalary;
    public FullTimeEmployee(String name, int id , double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    @Override
   public double calculateSalary() {
        return monthlySalary;
    }
}
