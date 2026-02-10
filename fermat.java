/*
Description:
- Fermat's Last Theorem says that there are no integers a,b, and c such that (a^n) + (b^n) = (c^n) 
except when n <= 2
* Write a method named check fermat that take 4 int: a,b,c,n
* if n > 2 && a^n + b^n = c^n --> Holy smokes, Fermat was wrong!
* Otherwise, No, that doesnt work
 */

import java.util.Scanner;

public class fermat
{
    // Function for checkFermat
    public static void checkFermat(double a, double b , double c , double n)
    {
        double sumNum = Math.pow(a,n) + Math.pow(b,n);
        double equalNum = Math.pow(c,n);

        // Conditions
        if ( n > 2 && sumNum == equalNum)
        {
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else{
            System.out.println("No, that doesnt work");
        }

    }
    // Main function
    public static void main(String[] args)
    {
        Scanner numPow = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter the first number: ");
            double a = numPow.nextDouble();
            System.out.print("Enter the second number: ");
            double b = numPow.nextDouble();
            System.out.print("Enter the third number: ");
            double c = numPow.nextDouble();
            System.out.print("Enter the power: ");
            long m;
            double n = numPow.nextDouble();
            checkFermat(a, b, c, n);
        }
    }
}