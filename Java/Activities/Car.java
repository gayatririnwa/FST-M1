package Activities;
public class Car {

String color;
String transmission;
int make;
int tyres;
int doors;

public Car(){
    tyres=4;
    doors=4;
}
 public void displayCharacteristics(){
    System.out.println("Color of the car"+ this.color);
    System.out.println("Car transmission:" + this.transmission);
    System.out.println("Car make:"+ this.make);
    System.out.println("Car tyres" + this.tyres);
    System.out.println("Car doors" + this.doors);
 }
public void accelarate(){
    System.out.println("Car is moving forward.");
}
public void brake() {
    System.out.println("Car has stopped.");
}
}
