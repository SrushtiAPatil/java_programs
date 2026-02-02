class FoodItem {
    String name;
    int price;

    FoodItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    FoodItem item;
    int quantity;

    Order(FoodItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    int calculateBill() {
        return item.price * quantity;
    }

    void showOrder() {
        System.out.println("\n--- ORDER DETAILS ---");
        System.out.println("Item     : " + item.name);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total ₹  : " + calculateBill());
    }
}

public class FoodOrderSystem {
    public static void main(String[] args) {

        
        FoodItem pizza = new FoodItem("Pizza", 250);
        FoodItem burger = new FoodItem("Burger", 120);

        System.out.println("MENU");
        System.out.println("1. " + pizza.name + " - ₹" + pizza.price);
        System.out.println("2. " + burger.name + " - ₹" + burger.price);

       
        String selectedItem = "Pizza";
        int quantity = 2;

        Order order;

        if (selectedItem.equals("Pizza")) {
            order = new Order(pizza, quantity);
        } else {
            order = new Order(burger, quantity);
        }

        order.showOrder();
        System.out.println("\nThank you for ordering!");
    }
}
