 import java.util.Scanner;

public class Classwork3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine(); // clears the scanner buffer

        System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);

        input.close();
    }
}