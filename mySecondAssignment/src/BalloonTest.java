
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arelysalvarezpadilla
 */
public class BalloonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //call a constructor 
        Balloon Balloon1 = new Balloon("redBalloon", 100);
        Balloon Balloon2 = new Balloon("blueBalloon", -50);

        String name;
        int altitude;

        name = Balloon1.getName();
        altitude = Balloon1.getAltitude();

        System.out.println("My Balloon1 " + name
                + " has an altitude of " + altitude + " meters");

        System.out.println("\nMy Balloon2 " + Balloon2.getName()
                + " has an altitude of " + Balloon2.getAltitude()
                + " meters");

        //object 1  ascend 
        Balloon1.ascendTo(250);

        //object 2 adjust atitude 
        Balloon2.adjustAltitude(150);

        System.out.println("\nMy Balloon1 " + Balloon1.getName()
                + " has now an altitude of " + Balloon1.getAltitude() + " meters");

        System.out.println("\nMy Balloon2 " + Balloon2.getName()
                + " has now an altitude of " + Balloon2.getAltitude()
                + " meters");

        //object 1 decrease
        Balloon1.adjustAltitude(-150);

        System.out.println("\nMy Balloon1 " + Balloon1.getName()
                + " has now an altitude of " + Balloon1.getAltitude() + " meters");

        //object 2 ascend to object 1
        int alt1;
        alt1 = Balloon1.getAltitude();

        Balloon2.ascendTo(alt1);

        System.out.println("\nMy Balloon2 " + Balloon2.getName()
                + " is now at " + Balloon2.getAltitude() + " meters");

        //move object 1 to 4 times its altitude
        Balloon1.ascendTo(alt1 * 4);

        System.out.println("\nMy Balloon1 " + Balloon1.getName()
                + " is now at " + Balloon1.getAltitude() + " meters");

        //descending object 2 
        int alt2;
        alt2 = Balloon2.getAltitude();

        Balloon2.descendTo(alt2 - 200);
        System.out.println("\nMy Balloon2 " + Balloon2.getName()
                + " is now at " + Balloon2.getAltitude() + " meters");

    }

}
