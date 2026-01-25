import java.util.ArrayList;
import java.util.Scanner;

public class TodoListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> taskList = new ArrayList<>();
        int option = 0;

        while (option != 5) {
            System.out.println("\nTo-Do List:");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Delete Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            try {
                option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1:
                        System.out.print("Enter the task: ");
                        taskList.add(sc.nextLine());
                        System.out.println("Task added successfully!");
                        break;

                    case 2:
                        System.out.print("Enter task number to update: ");
                        int u = sc.nextInt();
                        sc.nextLine();
                        if (u > 0 && u <= taskList.size()) {
                            System.out.print("Enter new task: ");
                            taskList.set(u - 1, sc.nextLine());
                            System.out.println("Task updated!");
                        } else {
                            System.out.println("Invalid task number!");
                        }
                        break;

                    case 3:
                        System.out.print("Enter task number to delete: ");
                        int d = sc.nextInt();
                        sc.nextLine();
                        if (d > 0 && d <= taskList.size()) {
                            taskList.remove(d - 1);
                            System.out.println("Task deleted!");
                        } else {
                            System.out.println("Invalid task number!");
                        }
                        break;

                    case 4:
                        if (taskList.isEmpty()) {
                            System.out.println("No tasks available!");
                        } else {
                            for (int i = 0; i < taskList.size(); i++) {
                                System.out.println((i + 1) + ". " + taskList.get(i));
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number!");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
