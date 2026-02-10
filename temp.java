import java.util.Scanner;


public class temp {
    public static void main(String[] args)
    {
        /*
        File for creating the temperature
        F = C * 9/5 + 32
        Program converts a temperature from Celsius to Fahreneit (Read double value) --> result as one decimal place

         */

        double celsius , farenheit;
        Scanner answer = new Scanner(System.in);
        System.out.println("[DEBUG]: Scanner Successful! on the input...");

        // Ask and answer
        System.out.print("Enter the Celsius: ");
        celsius = answer.nextDouble();
        System.out.println("[DEBUG]: Get answer successfully!...");

        farenheit = (celsius * 9/5)+32;
        System.out.printf("%.1f C = %.1f F \n",celsius,farenheit);
        System.out.println("[DEBUG]: Get the result Successfully ...");
    }
}                                                                                                                                                                                                                                                                                                                                 