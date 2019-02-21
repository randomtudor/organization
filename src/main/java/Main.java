import java.io.IOException;
import java.util.*;
import Organization.Organization;
import Organization.Employee;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        new Organization();

        while (true) {
            System.out.println("Enter value 1 for adding employee: ");
            System.out.println("Enter value 2 for getting employee: ");
            System.out.println("Enter value 3 for removing employee: ");
            System.out.println("Enter value 4 to update details of an employee: ");
            System.out.println("Enter value 5 to show all employee: ");
            System.out.println("Enter value 0 for exit.");

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    Organization.addEmployee();
                    break;
                case 2:
                    System.out.println("Enter name of employee: ");
                    Organization.getEmployee(in.next());
                    break;
                case 3:
                    System.out.println("Enter the name of the employee you want to be removed");
                    Organization.removeEmployee(in.next());
                    break;
                case 4:
                    System.out.println("Enter the name of the employee you want to update");
                    Organization.updateEmployee(in.next());
                    break;
                case 5:
                    Organization.showEmployees();
                    break;
                case 0:
                    System.out.println("Bye.");
                    return;
            }
        }
    }
}
