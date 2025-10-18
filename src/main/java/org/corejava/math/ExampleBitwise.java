package math;

public class ExampleBitwise {
    public static void main(String[] args) {
        //computers understands --> O's and 1's
        int a=5;
       // System.out.println(Integer.toBinaryString(a));
        // Bitwise operands can we used only on--> byte, short, int, long
        //and Operator  &
        //or Operator   |
        //xor operator  ^
        //not       ~
        //left shift    <<
        //right shift   >>
        //unsigned right shift  >>>

        int b=a&4;
        System.out.println(b);

    }
}
