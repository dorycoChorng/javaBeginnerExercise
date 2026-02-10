public class binary
{
    public static void binNum(int x)
    {
        if (x > 0 )
        {
            binNum(x/2);
            System.out.println(x%2);
        }
    }
    public static void main(String[] args)
    {
        binNum(55);
    }
}