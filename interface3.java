interface FoodOrder {
    void placeOrder();

    void cancelOrder();
}

class DineInOrder implements FoodOrder {

    public void placeOrder() {
        System.out.println("Dine-in order placed");
    }

    public void cancelOrder() {
        System.out.println("Dine-in order cancelled");
    }
}

class TakeAwayOrder implements FoodOrder {

    public void placeOrder() {
        System.out.println("Take-away order placed");
    }

    public void cancelOrder() {
        System.out.println("Take-away order cancelled");
    }
}

public class interface3 {

    public static void main(String[] args) {

        FoodOrder order;

        order = new DineInOrder();
        order.placeOrder();
        order.cancelOrder();

        order = new TakeAwayOrder();
        order.placeOrder();
        order.cancelOrder();
    }
}
