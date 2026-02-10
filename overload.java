
public class overload
{
    static double distance(double x , double y)
    {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    static double calculateArea (double x , double y)
    {
        double radius = distance(x,y);
        return Math.PI * Math.pow(radius,2);
    }
    public static void main(String[] args)
    {
        double calculate = calculateArea(12,56);
        double rad = distance(12,56);

        System.out.printf("CalculateArea: %.2f && rad: %.2f \n\n",calculate,rad);
    }
}