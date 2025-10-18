package basic.java.course;

public class TypesOfMethods {
    //Type1- No return type with no Arguments
    static void addTwoNumbers()
    {//void - null, it will return nothing
       int a =5;
       int b=10;
        System.out.println(a+b);
    }

    //Type-2 Return Type with no argument
    static int subStract(){
        int a =20;
        int b=30;
        return a-b;
    }
    static String getName(){
        String name="Ravi Teja";
        return name;
    }

    //Type-3 No Return Type with argument
    static void detailsOfPerson(String name,String age){
        System.out.println("Name-->"+name+"  Age-->"+age);
    }

    //Type-4 No Return Type with argument
    static int sumOfTwoNumbers(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
       // addTwoNumbers();

       //int result = subStract();
        //System.out.println(subStract());

        //System.out.println(getName());
       // detailsOfPerson("Sai Santhosh","30");

        int a=sumOfTwoNumbers(20,30);
        System.out.println(a);

    }
}
