

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> taskList = new ArrayList<>(); 
        int option; 

        do {
            System.out.println("\nTo-Do List:");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Delete Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            option = sc.nextInt();
            sc.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Enter the task: ");
                    String enteredTask = sc.nextLine();
                    taskList.add(enteredTask);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.print("Enter the task number to update: ");
                    int updateIndex = sc.nextInt();
                    sc.nextLine(); 
                    if (updateIndex > 0 && updateIndex <= taskList.size()) {
                        System.out.print("Enter the new task: ");
                        String newTask = sc.nextLine();
                        taskList.set(updateIndex - 1, newTask); 
                        System.out.println("Task updated successfully!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;

                case 3:
                    System.out.print("Enter the task number to delete: ");
                    int deleteIndex = sc.nextInt();
                    sc.nextLine(); 
                    if (deleteIndex > 0 && deleteIndex <= taskList.size()) {
                        taskList.remove(deleteIndex - 1);
                        System.out.println("Task deleted successfully!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;

                case 4:
                    System.out.println("\nYour To-Do List:");
                    if (taskList.isEmpty()) {
                        System.out.println("No tasks added yet!");
                    } else {
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println((i + 1) + ". " + taskList.get(i));
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a valid option!");
            }
        } while (option != 5);
    }
}
