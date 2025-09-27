import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter pickup date: ");
        String pickupDate = input.nextLine();

        System.out.println("Enter number of days: ");
        int days = input.nextInt();

        System.out.println("Do you want an electric toll tag for $3.95/day? (yes/no) ");
        boolean tollTag = input.next().equals("yes");

        System.out.println("Do you want GPS for $2.95/day? (yes/no)");
        boolean gps = input.next().equals("yes");

        System.out.println("Do you want roadside assistance for $3.95/day? (yes/no)");
        boolean roadSideAssistance = input.next().equals("yes");

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        double baseRate = 29.99;
        double tollRate = 3.95;
        double gpsRate = 2.95;
        double roadsideRate = 3.95;

        //Basic car rental rate

        double basicCarRental = days * baseRate;

        //Options cost

        //if statement solution
        double optionsCost = 0;

        if (tollTag) {
             optionsCost = tollRate * days;
        }
        if (gps) {
             optionsCost = gpsRate * days;
        }
        if (roadSideAssistance) {
             optionsCost = roadsideRate * days;
        }

        //Ternary operator solution

        //double optionsCost = (tollTag ? days * tollRate : 0) + (gps ? days * gpsRate : 0) + (roadSideAssistance ? days * roadsideRate :0);
                            //condition ? valueIfTrue : valueIfFalse

        //Underage Fee

        double underageFee = 0;

        if (age < 25) {
              underageFee = 0.30 * basicCarRental;
        }

        //Total

        double total = basicCarRental + optionsCost + underageFee;

        //Display
        System.out.println("Pickup Date: " + pickupDate);
        System.out.printf("Basic car rental cost is: $%.2f%n", basicCarRental);
        System.out.printf("Options Cost is: $%.2f%n", optionsCost);
        System.out.printf("Underage fee is: $%.2f%n", underageFee);
        System.out.printf("Your total is: $%.2f%n", total);
    }
}
