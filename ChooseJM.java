import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class ChooseJM {
    public static void main(String [] args) {
        System.out.println("Welcome to the kliff Kalculator!!\nWhat Planet are you on? Earth, Moon, Mars, or the Sun");
        Scanner in = new Scanner(System.in);
        String planet = in.next();
        final double AEARTH = 9.8;
        final double AMOON = 1.625;
        final double ASUN = 273.7;
        final double AMARS = 3.8;
        //double timeTB;
        //double velocityAB;

        if (!planet.equals("Earth")) {
            if (!planet.equals("Moon")) {
                if (!planet.equals("Mars")) {
                    if (!planet.equals("Sun")) {
                        System.out.println("WHAT'R YA DOIN BOI??? AINT NOBODY GOT TIME FOR THAT PLANET!");
                        System.exit(0);
        }
        }
        }
        }

        System.out.println("How High is this cliff in whole feet?");
        int height0 = in.nextInt();
        final double FEET_PER_METER = 3.28;
        double height = (double)height0/FEET_PER_METER;
        final double MPH_P_MS = .447;
        double timeTB = 0;
        double velocityM = 0;
        double velocityI = 0;

        if (planet.equals("Earth")) {
            timeTB = (Math.sqrt(2*(double)height/AEARTH));
            velocityM = Math.sqrt(2*AEARTH*height);
            velocityI = Math.sqrt(2*AEARTH*height)/.447;
        } else {
            System.out.print("You would already be dead.");
            System.exit(0);
        }

/*
        if (planet.equals("Mars")) {
            timeTB = Math.sqrt(2*height/AEARTH);
            velocityAB = Math.sqrt(2*AEARTH*height);
        }

        if (planet.equals("Moon")) {
            timeTB = Math.sqrt(2*height/AEARTH);
            velocityAB = Math.sqrt(2*AEARTH*height);
        }

        if (planet.equals("Sun")) {
            timeTB = Math.sqrt(2*height/AEARTH);
            velocityAB = Math.sqrt(2*AEARTH*height);
        }
*/
        System.out.println("On "+planet+", you will reach the water in "+ timeTB+" seconds,");
        System.out.println("traveling at "+ velocityM +" meters per second, or "+velocityI+" mph.");
    }
}