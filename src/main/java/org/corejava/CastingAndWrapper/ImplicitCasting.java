package CastingAndWrapper;

//byte → short → int → long → float → double
public class ImplicitCasting {
    public static void main(String[] args) {
        byte a = 10;    // byte type
        int b = a;      // byte is automatically converted to int (widening)
        double c = b;   // int is automatically converted to double (widening)

        System.out.println("byte: " + a);
        System.out.println("int: " + b);
        System.out.println("double: " + c);
    }
}
