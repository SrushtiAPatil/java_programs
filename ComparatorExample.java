import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Amit", 85));
        list.add(new Student("Priya", 95));

        list.sort((s1, s2) -> s2.marks - s1.marks);

        for (Student s : list) {
            System.out.println(s.name + " - " + s.marks);
        }
    }
}