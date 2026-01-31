import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Employees: ");
        int num = sc.nextInt();

        Employee ob[] = new Employee[num];

        for (int i = 0; i < ob.length; i++) {
            ob[i] = new Employee();

            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            ob[i].id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            ob[i].name = sc.nextLine();

            System.out.print("Enter Employee Designation: ");
            ob[i].designation = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            ob[i].bsal = sc.nextDouble();

            ob[i].calculateSalary(); 
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < ob.length; i++) {
            System.out.println(ob[i]);
        }

        sc.close();
    }
}
