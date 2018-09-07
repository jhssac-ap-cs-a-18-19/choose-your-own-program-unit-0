import java.util.*;
import java.io.*;
public class myMilkshakeCB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int BOX_TO_SINGLES = 13;
        final double PRICE_PER_BOX = 14.33;
        final double SERVICE_COST = 30.00;
        int numBox;
        String partyName;
        double finalPrice;
        int numNutz;
        System.out.println("Welcome to Party Planning Simulator!");
        System.out.println("What is the name of your party?");
        partyName = in.nextLine();
        System.out.println("How many boxes of doughnuts would you like to order?");
        numBox = in.nextInt();
        numNutz = numBox * BOX_TO_SINGLES;
        finalPrice = (double) numBox * PRICE_PER_BOX + SERVICE_COST;
        System.out.println("You are ordering "+numNutz+" doughnuts for your party, "+"\""+partyName+".\"");
        System.out.printf("This party will cost $%.2f.\n", finalPrice);
        System.out.println("Thank you for doing business with us!  Have fun at "+partyName+"!");
    }
}