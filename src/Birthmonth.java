import java.util.Scanner;

public class Birthmonth {
    public static void main(String[] args) {
        // 1. Ask the user for their birth month
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your birth month (1-12): ");

        if (in.hasNextInt()) {
            int month = in.nextInt();
            // 2. If input is between 1 and 12, print the month
            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                // 3. Otherwise, display an error message
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
