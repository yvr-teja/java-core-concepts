package org.java8andlater.Lambda;

public class FunctionalLambdaMain {

    public static void main(String[] args) {
        //before java 8
        FunctionalLambda withAnnoymouseInnerclass = new FunctionalLambda() {
            @Override
            public void sum(int a, int b) {
                int sumup = a + b;
                System.out.println(sumup);
            }
        };
        withAnnoymouseInnerclass.sum(20,30);

       //after Java 8 with lambda expression
        FunctionalLambda usingLambdaExp = (a,b) -> System.out.println(a+b);
        usingLambdaExp.sum(20,60);
    }
}
