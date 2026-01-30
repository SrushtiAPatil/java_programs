import java.lang.StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); 

        System.out.println("Initial StringBuilder");
        System.out.println("Length  : " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        sb.append("Hello");

        System.out.println("\nAfter appending 'Hello'");
        System.out.println("Length  : " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        sb.append(" Java Programming Language");

        System.out.println("\nAfter appending long string");
        System.out.println("Length  : " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}
