
import java.util.*;

public class lambda2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Amit", "Priya", "Rohit");

        names.sort((a, b) -> a.compareTo(b));

        names.forEach(System.out::println);
    }
}