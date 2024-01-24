package javaOppsProject.EmployeePayrollSystemProject;

public class Main {
    public static void main(String[] args) {
    EmployeePayrollSystem employeePayrollSystem = new EmployeePayrollSystem();
    FullTimeEmployee employee1 = new FullTimeEmployee("Nafish",1,6574.0);
    PartTimeEmployee employee2 = new PartTimeEmployee("Rishabh", 2,645.0);
    PartTimeEmployee employee3 = new PartTimeEmployee("Alim", 3,645.0);
    employeePayrollSystem.addEmployee(employee1);
    employeePayrollSystem.addEmployee(employee2);
    employeePayrollSystem.addEmployee(employee3);
    System.out.println("Working Employee in your Company!");
    employeePayrollSystem.displayEmployeeList();
    System.out.println("Removing Employee in your Company!");
    employeePayrollSystem.removeEmployee(2);
    System.out.println("New Joinee Employee in your Company!");
    employeePayrollSystem.displayEmployeeList();
    }
}
