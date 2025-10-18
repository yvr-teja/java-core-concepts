package Methods;

//import java.sql.SQLOutput;

public class DiffStaticAndNormalMethod {
    static void staticMethod()
    {
        System.out.println("static method");
    }
    void normalMethod()
    {
        System.out.println("Normal method");
    }

    public static void main(String[] args) {
        staticMethod();
        DiffStaticAndNormalMethod diffStaticAndNormalMethod=new DiffStaticAndNormalMethod();
        diffStaticAndNormalMethod.normalMethod();
        System.out.println("Main Method");
    }
}
