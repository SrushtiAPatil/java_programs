import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String name;
    double price;
    int quantity;

    Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }
}

public class GroceryBilling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Item Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            items.add(new Item(name, price, quantity));
        }

        double totalBill = 0;

        System.out.println("\n----- BILL -----");
        for (Item item : items) {
            double itemTotal = item.getTotal();
            System.out.println(item.name + " = " + itemTotal);
            totalBill += itemTotal;
        }

        System.out.println("Total Bill: " + totalBill);

        if (totalBill > 1000) {
            double discount = totalBill * 0.10;
            totalBill -= discount;
            System.out.println("Discount Applied: " + discount);
        }

        System.out.println("Final Amount: " + totalBill);

        sc.close();
    }
}