package TopicWisePrograms.OOPs.ObjectCreation;

public class MotorBikeRunner {
    
    public static void main(String[] args) {
        
        MotorBike hero= new MotorBike();
        MotorBike bajaj=  new MotorBike();

        hero.start();
        bajaj.start();

        hero.speed=100;
        bajaj.speed=200;

        System.out.println(hero.speed);
        System.out.println(bajaj.speed);

        hero.speed=20;
        bajaj.speed=0;
        
        System.out.println(hero.speed);
        System.out.println(bajaj.speed);

    }
}
