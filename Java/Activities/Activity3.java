package Activities;

public class Activity3 {

    public static void main(String[] args) {
        
        Age A = new Age(1000000000);

        System.out.println("Age on earth : "+ A.earthAge());
        System.out.println("Age on Mercury :"+ A.mercuryAge());
        System.out.println("Age on Venus : "+ A.VenusAge());
        System.out.println("Age on Mars : "+ A.MarsAge());
        System.out.println("Age on Jupiter : "+ A.JupiterAge());
        System.out.println("Age on Saturn : "+ A.SaturnAge());
        System.out.println("Age on Uranus : "+ A.UranusAge());
        System.out.println("Age on Neptune : "+ A.NeptuneAge());

    }
}
