package Activities;

public class Activity1 {

    public static void main(String[] args) {
        Car M = new Car();

        M.color="red";
        M.transmission="manual";
        M.make=2023;

        M.displayCharacteristics();
        M.accelarate();
        M.brake();
    }
}
