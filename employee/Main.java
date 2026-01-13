package employee;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> details = new ArrayList<>();

        while(true){
            System.out.println("Welcome to Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");
            switch (sc.nextInt()) {
                case 1:
                    new AddEmployee(sc, details);
                    System.out.println("Employee added successfully.");
                    break;
                case 2:
                    if (details.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        new EmployeeDetail(sc, details);
                    }
                    break;
            
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
