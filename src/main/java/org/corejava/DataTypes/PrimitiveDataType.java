package DataTypes;

class PrimitiveDataType {
    public static void main(String[] args) {
        //byte
        byte dtByteMinVar =-128; //Byte.MIN_VALUE; // -128
        byte dtByteMaxVar =127;  //Byte.MAX_VALUE; // 127
        System.out.println("byte can store min"+dtByteMinVar +"to"+dtByteMaxVar);

        //short
        short minShort =-32768; // Short.MIN_VALUE; // -32768
        short maxShort =32767;  //Short.MAX_VALUE; // 32767
        System.out.println("short can store min"+minShort +"to"+maxShort);

        //int
        int minInt =-2147483648; // Interger.MIN_VALUE;
        int maxInt =2147483647;  // Interger.MAX_VALUE;
        System.out.println("int can store min"+minShort +"to"+maxShort);

        //long
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("long can store min"+minLong +"to"+maxLong);

        //float
        float minFloat = Float.MIN_VALUE;
        float a = 10.234567543f;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("long can store min"+minFloat +"to"+maxFloat+" and A is value= "+a);

        //double
        double minDouble = Float.MIN_VALUE;
        double b = 10.2345675431234d;
        double maxDouble = Float.MAX_VALUE;
        System.out.println("double can store min"+minFloat +"to"+maxFloat+" and A is value= "+b);

        //boolean true/false
        boolean conditionA= true;
        boolean conditionB= false;
        System.out.println("boolean can stores two values  "+conditionA +" and "+conditionB);

        //char
        char ch = 'a';
        System.out.println("ch is value= "+ch);
    }
}
