package math;

public class ExampleOperatorPresidence {
    public static void main(String[] args) {
        //int result=5+3*2;
        //System.out.println(result);

        //int a=18, b=5;
        //int result1=a/(b+1);
        //System.out.println(result1);

        //increment and decrement operators
        //int in=1;
       // in=in+1;
        //System.out.println(in);
        //int preInc=++in;
        //System.out.println(preInc);
        //int postInc=in++;
        //System.out.println(postInc);
       // System.out.println(in);
       // in++;
        //System.out.println(in);

        //pre-Increment and addition / Post-Increment and addition
        int i1=1;
        int i2=++i1 +i1;
        System.out.println(i1);
        System.out.println(i2);

    }
}
