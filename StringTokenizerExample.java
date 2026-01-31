
import java.util.*;

public class StringTokenizerExample {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = s.nextLine();

        System.out.println("Enter the delimiter:");
        String del = s.nextLine();

       java.util.StringTokenizer ob = new java.util.StringTokenizer(str, del);

        System.out.println("Count of Tokens : " + ob.countTokens());
        System.out.println("====Tokens====");

        while (ob.hasMoreTokens()) {
            String tk = ob.nextToken();
            System.out.println(tk);
        }

        s.close();
    }
}
