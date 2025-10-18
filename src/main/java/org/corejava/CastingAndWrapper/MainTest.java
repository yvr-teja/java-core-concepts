package org.corejava.CastingAndWrapper;

public class MainTest {
    public static void main(String[] args) {
/*        Animal cat=new Cat();
        Cat catOnly =new Cat();
        catOnly.makeSoundMeow();*/

        ConA conA=new ConA();
        System.out.println("ConA-->"+conA.NameA+"--"+conA.AgeA);
      /*  conA.NameA="Prasad";
        conA.AgeA="29";*/
        ConA conA2=new ConA("Satish","27");
        System.out.println("ConA-->"+conA2.NameA+"--"+conA2.AgeA);

    }
}
