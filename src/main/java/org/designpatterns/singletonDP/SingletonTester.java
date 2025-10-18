package org.designpatterns.singletonDP;

public class SingletonTester {
    public static void main(String[] args) {
      //  new Samosa();
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());

        BasicSingleton basicSingleton1 = BasicSingleton.getInstance();
        System.out.println(basicSingleton1.hashCode());
        BasicSingleton basicSingleton2 = BasicSingleton.getInstance();
        System.out.println(basicSingleton2.hashCode());
        BasicSingleton basicSingleton3 = BasicSingleton.getInstance();
        System.out.println(basicSingleton3.hashCode());
        BasicSingleton basicSingleton4 = BasicSingleton.getInstance();
        System.out.println(basicSingleton4.hashCode());
    }

    }

