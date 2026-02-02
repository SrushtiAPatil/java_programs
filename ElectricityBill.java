class ElectricityBill {
    public static void main(String[] args) {
        int units = 280;
        double bill;

        if (units <= 100)
            bill = units * 2;
        else if (units <= 300)
            bill = (100 * 2) + ((units - 100) * 3);
        else
            bill = (100 * 2) + (200 * 3) + ((units - 300) * 5);

        System.out.println("Electricity Bill: ₹" + bill);
    }
}
