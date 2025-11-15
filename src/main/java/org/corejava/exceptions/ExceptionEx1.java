package org.corejava.exceptions;

public class ExceptionEx1 {
    public static void main(String[] args) {

                int a = 0; // initialize 'a'
                try {
                    // Simulate error: trying to parse "Test" to an integer
                    a = 5/0;
                }
                catch (IllegalArgumentException ex) {
                    throw new NumberFormatException("Satish ravi Teja");
                }
                catch (ArithmeticException ex) {
                    throw new NumberFormatException(" number can be divided by zero");
                }
                catch (Exception e) {
                    System.out.println("Caught Exception: " + e.getMessage());
                }
                finally {
                    a = 10;
                    System.out.println("Finally block executed, a = " + a);
                }

    }
}
