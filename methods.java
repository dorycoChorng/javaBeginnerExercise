

public class methods 
{
    static boolean isDivisible(int n , int m)
    {
        if (n % m == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        boolean result = isDivisible(12,5);
        boolean resul1 = isDivisible(5, 5);

        System.out.printf("Tr: %s TT: %s \n\n",result,resul1);

    }
}