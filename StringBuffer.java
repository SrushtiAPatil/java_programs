
import java.util.Scanner;

public class StringBuffer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("Enter initial string: ");
        sb.append(sc.nextLine());

        int choice;

        do {
            System.out.println("\n--- StringBuilder Operations ---");
            System.out.println("1. Append");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Reverse");
            System.out.println("5. Display String");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    sb.append(sc.nextLine());
                    System.out.println("After Append: " + sb);
                    break;

                case 2:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter text to insert: ");
                    sb.insert(pos, sc.nextLine());
                    System.out.println("After Insert: " + sb);
                    break;

                case 3:
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    sb.delete(start, end);
                    System.out.println("After Delete: " + sb);
                    break;

                case 4:
                    sb.reverse();
                    System.out.println("After Reverse: " + sb);
                    break;

                case 5:
                    System.out.println("Current String: " + sb);
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
