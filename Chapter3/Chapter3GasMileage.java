import java.util.Scanner;

public class Chapter3GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int miles;
        int gallons;
        int totalMiles = 0;
        int totalGallons = 0;

        System.out.println("Enter miles driven (-1 to quit): ");
        miles = scanner.nextInt();

        while (miles != -1) {
            System.out.println("Enter gallons used: ");
            gallons = scanner.nextInt();

            totalMiles += miles;
            totalGallons += gallons;

            double tripMpg = (double) miles / gallons;
            double totalMpg = (double) totalMiles / totalGallons;

            System.out.printf("This trip's MPG: %.2f%n", tripMpg);
            System.out.printf("Combined MPG so far: %.2f%n", totalMpg);

            System.out.println("\nEnter miles driven (-1 to quit): ");
            miles = scanner.nextInt();
        }
        scanner.close();
    }
}
