public class AutoboxingUnboxing{

    public static void main(String[] args) {

       
        byte b = 1;      
        Byte bObj = b;
        short s = 2;       
        Short sObj = s;
        int i = 3;         
        Integer iObj = i;
        long l = 100L;    
        Long lObj = l;
        float f = 5.5f;   
        Float fObj = f;
        double d = 9.9;   
        Double dObj = d;
        char c = 'A';     
        Character cObj = c;
        boolean flag = true; 
        Boolean flagObj = flag;

       
        byte b1 = bObj;
        short s1 = sObj;
        int i1 = iObj;
        long l1 = lObj;
        float f1 = fObj;
        double d1 = dObj;
        char c1 = cObj;
        boolean flag1 = flagObj;

        System.out.println("Autoboxing and Autounboxing completed");
    }
}
