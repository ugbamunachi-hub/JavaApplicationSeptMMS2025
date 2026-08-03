
package Chapter8;

    public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(11, 28, 2024);
        System.out.println("Testing daily increment increments:");
        for (int i = 0; i < 5; i++) {
            System.out.println(date);
            date.nextDay();
        }

        System.out.println("\na) Testing incrementing into next month:");
        Date endOfMonth = new Date(5, 30, 2024);
        for (int i = 0; i < 3; i++) {
            System.out.println(endOfMonth);
            endOfMonth.nextDay();
        }

        System.out.println("\nb) Testing incrementing into next year:");
        Date endOfYear = new Date(12, 30, 2024);
        for (int i = 0; i < 3; i++) {
            System.out.println(endOfYear);
            endOfYear.nextDay();
        }
    }
}
