
package Chapter8;

public class DateAndTimeTest {
    public static void main(String[] args) {
        DateAndTime dt = new DateAndTime(12, 31, 2024, 23, 59, 59);
        System.out.println("Initial Date and Time:");
        System.out.println(dt.toUniversalString());

        dt.tick();
        System.out.println("\nAfter 1 second tick (Roll over to next year):");
        System.out.println(dt.toUniversalString());
    }
}
