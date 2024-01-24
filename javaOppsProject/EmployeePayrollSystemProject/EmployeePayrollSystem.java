package javaOppsProject.EmployeePayrollSystemProject;

import java.util.ArrayList;

public class EmployeePayrollSystem {
    ArrayList<Employee> employeeArrayList;

    public EmployeePayrollSystem() {
        employeeArrayList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeArrayList.add(employee);
    }

    // So in future if Employee are left the company so we have remove that employee in out employeelist
    // with the help of id , name or any instance variable we have declared in your list
    public void removeEmployee(int id){
        Employee employeeToRemove = null; // jaise hm declared krte hai int x = 0; starting main waise hi wha pr Employee hai
        for(var employee1:employeeArrayList){
            if(employee1.getId()==id){
                employeeToRemove = employee1;
                break;
            }
        }
        if(employeeToRemove != null){
            employeeArrayList.remove(employeeToRemove);
        }
    }

    public void displayEmployeeList(){
        for(var employee : employeeArrayList){
            System.out.print(employee+ " ");
        }
        System.out.println();
    }

}
