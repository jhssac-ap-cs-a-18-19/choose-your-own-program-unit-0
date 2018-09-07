import java.util.*;
import java.io.*;

public class USDExchangeEBP
{
    static final double USD_EUR = 0.86;
    static final int USD_YEN = 100;
    static final double USD_RUB = 68.88;

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many USD do you have?... ");

        int dollars = in.nextInt();

        System.out.println("EUR: " + (double) dollars * USD_EUR);
        System.out.println("YEN: " + dollars * USD_YEN);
        System.out.println("RUB: " + (double) dollars * USD_RUB);

    }
}