public class BoxingUnboxing {

    public static void main(String[] args) {

        byte b = 10;
        Byte bObj = Byte.valueOf(b);

        short s = 20;
        Short sObj = Short.valueOf(s);

        int i = 30;
        Integer iObj = Integer.valueOf(i);

        long l = 1000L;
        Long lObj = Long.valueOf(l);

        float f = 10.5f;
        Float fObj = Float.valueOf(f);

        double d = 99.99;
        Double dObj = Double.valueOf(d);

        char c = 'A';
        Character cObj = Character.valueOf(c);

        boolean flag = true;
        Boolean flagObj = Boolean.valueOf(flag);

        System.out.println("Manual Boxing using valueOf() completed");
    }
}
