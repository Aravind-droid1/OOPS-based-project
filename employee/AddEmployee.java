package employee;
import java.util.*;

public class AddEmployee {
    public AddEmployee(Scanner sc,List<Employee> details){
        if(true){
            Employee emp = new Employee();
            System.out.println("Enter Employee Details:");
            System.out.println("Employee Id:");
            emp.addEmpId(sc.nextInt());
            System.out.println("Employee Name:");
            emp.addEmpName(sc.next());
            System.out.println("Join Date:");
            emp.addJoinDate(sc.next());
            System.out.println("Designation Code (e/c/k/r/m):");
            emp.addDesignationCode(sc.next().charAt(0));
            System.out.println("Department:");
            emp.addDepartment(sc.next());
            System.out.println("Basic Salary:");
            emp.addBasic(sc.nextInt());
            System.out.println("HRA:");
            emp.addHRA(sc.nextInt());
            System.out.println("IT:");
            emp.addIT(sc.nextInt());
            details.add(emp);
        }
    }
}
