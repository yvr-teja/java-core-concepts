package CastingAndWrapper;

public class WrapperClasses {
    public static void main(String[] args) {
        //Integer
        int num1 = 7;
        Integer varIntObj= new Integer(num1); //Boxing
        Integer varIntObj1= num1; //Auto-Boxing

        int num2=varIntObj1.intValue();
//        System.out.println(varIntObj);
//        System.out.println(varIntObj1);
       // System.out.println(num2);

        //String to int
        String str = "12";
        int value=Integer.valueOf(str);
        System.out.println(value);
        System.out.println(value*2);

    }
}
