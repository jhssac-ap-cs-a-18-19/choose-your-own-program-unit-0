import java.io.*;
import java.util.*;
import java.lang.Math;

public class CoinConverterEBP
{
    static int doubloons = 0;
    static int goldCoins = 0;
    static int silverCoins = 0;
    static int copperCoins = 0;

    static int doubloonsRate = 10;
    static int goldCoinsRate = 10;
    static int silverCoinsRate = 10;
    static int copperCoinsRate = 10;

    static int doubloonY = 0;
    static int goldY = 0;
    static int silverY = 0;
    static int copperY = 0;


    public static void main(String args[])
    {
        // Prints Title
        System.out.println("\n\t~Welcome to Coin Converter!~\n");

        coinStart();
        coinCount();

        for(int i = 0; i < 10; i++)
        {
            line();
            System.out.println("It is day " + i);
            coinExchange();

        }

        // The game Ends!
        System.out.println("Your days of buying and selling coins have come to an end!\n\tGAME OVER");
    }


    // Gives the player new coins
    public static void coinStart()
    {
        goldCoins = (int)(Math.random() * 3) + 1;
        silverCoins = (int)(Math.random() * 15) + 1;
        copperCoins = (int)(Math.random() * 99) + 1;
    }


    // Prints the amount of coins
    public static void coinCount()
    {
        System.out.println("You have " + doubloons + " doubloons, " + + goldCoins + " gold coins, " + silverCoins + " silver coins, and " + copperCoins + " copper coins!");
    }


    // Changes the coin conversion rates
    public static void coinExchange()
    {
        for(int i = 0; i < 4; i++)
        {
            int change = (int)(Math.random() * 2 * (i + 1)) + 1 - (2 * (i + 1) / 2);

            if(i == 0) doubloonsRate += change;
            else if(i == 1) goldCoinsRate += change;
            else if(i == 2) silverCoinsRate += change;
            else if(i == 3) copperCoinsRate += change;
        }

        System.out.println("Doubloon: " + goldCoinsRate + " Gold Coins!");
        System.out.println("Gold: " + silverCoinsRate + " Silver Coins!");
        System.out.println("Silver: " + copperCoinsRate + " Copper Coins!");
    }


    // Player buys or sells coins, up to three actions
    public static void action()
    {
        for(int i = 0; i < 3; i++)
        {
            System.out.println("You have " + i + " action(s) left today.");


        }
    }


/* ******** Quality of life stuff *************************************************************************** */

    // Prints a line to make actions more distinct
    public static void line()
    {
        System.out.println("*****************************************************");
    }
}