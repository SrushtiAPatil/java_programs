import java.io.*;

public class BankTransaction {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("transactions.txt", true);
        fw.write("Deposit: 5000\n");
        fw.write("Withdraw: 1200\n");
        fw.write("Deposit: 3000\n");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("transactions.txt"));
        String line;

        System.out.println("Transaction History:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
