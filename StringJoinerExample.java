import java.util.*;

public class StringJoinerExample {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("=====User-DOJ=====");

        java.util.StringJoiner sj1 = new java.util.StringJoiner("/");


        sj1.setEmptyValue("DOJ details not available...");

        System.out.println(sj1.toString());

        System.out.println("Enter the date:");
        sj1.add(s.nextLine());

        System.out.println("Enter the month:");
        sj1.add(s.nextLine());

        System.out.println("Enter the year:");
        sj1.add(s.nextLine());

        System.out.println("USER-DOJ : " + sj1.toString());

        s.close();
    }

}
