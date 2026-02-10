import java.util.Scanner;

public class time {
    public static void main(String[] args)
    {
        Scanner inputs = new Scanner(System.in);
        System.out.println("[DEBUG]: Scanner Successfully and ready to extract the prompt...");
        int hr , min ,sec,secPer , minPer;
        System.out.print("Enter the total number of seconds: ");
        secPer = inputs.nextInt();
        System.out.println("[DEBUG]: Get the amounts of second in the variable SEC sucessfully...");

        // The calculation
        sec = secPer % 60;
        System.out.println("[DEBUG]: Successfully on the seconds...");
        // Minutes
        minPer = secPer / 60;
        System.out.println("[DEBUG]: Complete total minutes successfully...");
        // Minutes
        min = minPer % 60;
        System.out.println("[DEBUG]: Minute left successfully and transfer to Hours...");
        // Hour
        hr = minPer/60;
        System.out.println("[DEBUG]: Hour successfully...");

        // Print the result
        System.out.printf("%d hours %d minutes %d seconds \n",hr,min,sec);
        
    }
}