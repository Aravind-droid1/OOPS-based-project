package employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeDetail {
    public EmployeeDetail(Scanner sc, List<Employee> details) {
        System.out.println("Enter Employee ID to view details:");
        int find=sc.nextInt();
        boolean found=false;
        for(Employee i:details){
            if(i.getEmpNo() == find){
                System.out.println("Employee Details:");
                System.out.println("Emp No:"+i.getEmpNo());
                System.out.println("Emp Name:"+i.getEmpName());
                System.out.println("Department:"+i.getDepartment());
                System.out.println("Designation:"+i.getDesignation());
                System.out.println("Salary:"+i.getSalary());
                found=true;
                break;
            }
        }
        if(found==false){
            System.out.println("Employee not found with ID: " + find);
        }
    }
}
