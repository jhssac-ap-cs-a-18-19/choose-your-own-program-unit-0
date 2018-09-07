import java.util.Scanner;

public class Jt {
    public static void main(String[] args) {
        String name;
        int vinitial;
        int time;
        final double gravity = -9.8;


        System.out.println("Final Velociy of and Object Calculator!");

        Scanner in = new Scanner(System.in);

        System.out.print("What is your name?");
        name = in.next();

        System.out.print("What is your initial velocity?");
        vinitial = in.nextInt();

        System.out.print("What is the total time it takes to reach the final velocity?");
        time = in.nextInt();

        double vfinal = (double) vinitial + ((gravity) * (time));

        System.out.println(name + " " + "your final velocity is...");
        System.out.println(vfinal);

    }
}





