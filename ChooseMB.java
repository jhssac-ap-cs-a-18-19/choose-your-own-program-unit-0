import java.util.Scanner;

public class ChooseMB
{
    public static void main(String[] args)
    {
        final double ACCEL_OF_GRAVITY_EARTH = 9.8;
        final double ACCEL_OF_GRAVITY_MARS = 3.71;
        double force;
        double mass;
        Scanner in = new Scanner(System.in);

        System.out.print("What is the mass (kg)? ");
        mass = in.nextDouble();
        System.out.println("Your net force on Earth is:");
        System.out.println((double) mass * ACCEL_OF_GRAVITY_EARTH + "N");
        System.out.println("Your net force on Mars is:");
        System.out.println((double) mass * ACCEL_OF_GRAVITY_MARS + "N");
    }
}