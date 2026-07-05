//6.18java
import java.util.Scanner;

public class AirlineReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[11]; // Indices 1-5: First Class, 6-10: Economy

        while (true) {
            System.out.println("\nPlease type 1 for First Class");
            System.out.println("Please type 2 for Economy");
            System.out.print("Choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                assignSeat(seats, 1, 5, "First Class", choice, input);
            } else if (choice == 2) {
                assignSeat(seats, 6, 10, "Economy", choice, input);
            }
        }
    }

    public static void assignSeat(boolean[] seats, int start, int end, String section, int originalChoice, Scanner input) {
        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                seats[i] = true;
                displayBoardingPass(i, section);
                return;
            }
        }

        System.out.printf("The %s section is full.%n", section);
        System.out.print("Is it acceptable to be placed in the alternative section? (1 for Yes, 2 for No): ");
        int changeChoice = input.nextInt();

        if (changeChoice == 1) {
            if (originalChoice == 1) {
                findAlternativeSeat(seats, 6, 10, "Economy");
            } else {
                findAlternativeSeat(seats, 1, 5, "First Class");
            }
        } else {
            System.out.println("Next flight leaves in 3 hours.");
        }
    }

    public static void findAlternativeSeat(boolean[] seats, int start, int end, String section) {
        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                seats[i] = true;
                displayBoardingPass(i, section);
                return;
            }
        }
        System.out.println("Sorry, the entire plane is full. Next flight leaves in 3 hours.");
    }

    public static void displayBoardingPass(int seatNum, String section) {
        System.out.println("\n--- BOARDING PASS ---");
        System.out.printf("Section: %s%n", section);
        System.out.printf("Seat Number: %d%n", seatNum);
        System.out.println("---------------------\n");
    }
}
