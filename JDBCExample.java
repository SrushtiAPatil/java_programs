
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCExample {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";

        Connection con = DriverManager.getConnection(url, user, pass);
        System.out.println("Connected Successfully");
        con.close();
    }
}