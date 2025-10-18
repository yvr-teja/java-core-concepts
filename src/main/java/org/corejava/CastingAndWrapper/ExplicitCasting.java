package CastingAndWrapper;

public class ExplicitCasting {
    public static void main(String[] args) {
        double a = 10.5;    // double type
        int b = (int) a;    // explicitly converting double to int (narrowing)
        byte c = (byte) b;  // explicitly converting int to byte (narrowing)

        System.out.println("double: " + a);
        System.out.println("int: " + b);
        System.out.println("byte: " + c);
    }
}
