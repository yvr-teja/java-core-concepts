package TopicWisePrograms.OOPs.Encapsulation;

public class BikeRunner {
    public static void main(String[] args) {
        
        Bike charanBike=new Bike();
        Bike raviBike= new Bike();
/* 
        charanBike.setSpeed=200;
        raviBike.speed=180;
        System.out.println(charanBike.speed);
        System.out.println(raviBike.speed);
*/
        charanBike.setSpeed(200);
        //raviBike.setSpeed(180); 
        
        
    }
}
