interface MathOperation {
    int operate(int a, int b);
}

public class lambda {
    public static void main(String[] args) {

        MathOperation multiply = (a, b) -> {
            System.out.println("Multiplying...");
            return a * b;
        };

        System.out.println(multiply.operate(4, 5));
    }
}