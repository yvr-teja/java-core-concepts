package TopicWisePrograms.OOPs.Encapsulation;

public class Bike {
    //Behaviour
    //Method
    //Input -int speed
    //Output - void
    //Input method name- setSpeed
    //Output method name- getSpeed 

    private int speed; //member variable 

    public void setSpeed(int speed){// local variable
        System.out.println("method speed : "+speed);
        System.out.println("class Instance speed : "+this.speed);
        this.speed=speed;
        System.out.println("class Instance speed after updated : "+this.speed);
    }

    void start(){
        System.out.println("Bike started");
    }

}
