import java.util.*;
import java.io.*;
public class myProgBobby {
    public static void main(String[] args) {
        //declare vars
        int baseCost;
        String itemName;
        final double caTax = 1.075;
        double whatTax;
        //Scanner
        Scanner in = new Scanner(System.in);
        System.out.print("What are you trying to buy?\n");
        itemName = in.nextLine();
        System.out.print("How much does it cost?\n");
        baseCost = in.nextInt();
        System.out.print("What is your tax rate?\n");
        whatTax = in.nextDouble();
        double caCost = ((double) baseCost * caTax);
        double infidelCost = ((double) baseCost * whatTax);
        System.out.print("In California, your " + itemName + " costs $" + caCost + ".\n");
        System.out.print("In your inferior sales tax land, your " + itemName + " costs $" + infidelCost + ".\n");
        System.out.print("The price difference is $" + (caCost - infidelCost) + ".\n");
    }
}