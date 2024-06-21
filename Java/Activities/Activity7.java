package Activities;

class Bike implements BicycleParts, BicycleOperations {
 int speed=0;
    public void applyBrake(int decrement){
       speed = speed - decrement;
        System.out.println("Brake by:"+ speed);
    }
    public void speedUp(int increment){

        speed = speed + increment;
        System.out.println("Speed by:"+ speed);
    }

} 
public class Activity7 {
public static void main(String[] args) {
    Bike bike = new Bike();
   
    
    bike.applyBrake(3);
    bike.speedUp(4);
}

}
