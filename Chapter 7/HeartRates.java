//7.22java
import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName; this.lastName = lastName; this.birthMonth = birthMonth; this.birthDay = birthDay; this.birthYear = birthYear;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getFirstName() { return firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getLastName() { return lastName; }
    public void setBirthMonth(int birthMonth) { this.birthMonth = birthMonth; }
    public int getBirthMonth() { return birthMonth; }
    public void setBirthDay(int birthDay) { this.birthDay = birthDay; }
    public int getBirthDay() { return birthDay; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }
    public int getBirthYear() { return birthYear; }

    public int calculateAge() { return 2026 - birthYear; }
    public int getMaximumHeartRate() { return 220 - calculateAge(); }
    public String getTargetHeartRateRange() {
        int maxRate = getMaximumHeartRate();
        return (int)(maxRate * 0.50) + " - " + (int)(maxRate * 0.85) + " bpm";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: "); String fName = input.nextLine();
        System.out.print("Enter Last Name: "); String lName = input.nextLine();
        System.out.print("Enter Birth Month (1-12): "); int month = input.nextInt();
        System.out.print("Enter Birth Day (1-31): "); int day = input.nextInt();
        System.out.print("Enter Birth Year (yyyy): "); int year = input.nextInt();

        HeartRates person = new HeartRates(fName, lName, month, day, year);
        System.out.printf("%n--- Health Summary Data ---%n");
        System.out.printf("Name: %s %s%n", person.getFirstName(), person.getLastName());
        System.out.printf("DOB: %d/%d/%d%n", person.getBirthMonth(), person.getBirthDay(), person.getBirthYear());
        System.out.printf("Age: %d years old%n", person.calculateAge());
        System.out.printf("Max Heart Rate: %d bpm%n", person.getMaximumHeartRate());
        System.out.printf("Target Heart Rate Range: %s%n", person.getTargetHeartRateRange());
    }
}
