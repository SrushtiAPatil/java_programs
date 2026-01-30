
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1.Add  2.View  3.Delete  4.Exit");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> deleteStudent();
            }
        } while (choice != 4);
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        students.add(new Student(id, name, age));
        System.out.println("Student Added!");
    }

    static void viewStudents() {
        for (Student s : students) {
            System.out.println("Student Id :"+s.id + " " +"Student Name :"+ s.name + " " +"Student age :"+ s.age);
        }
    }

    static void deleteStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        students.removeIf(s -> s.id == id);
        System.out.println("Deleted if existed");
    }
}
