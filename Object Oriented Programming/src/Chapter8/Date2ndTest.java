
package Chapter8;


public class Date2ndTest {
    public static void main(String[] args) {
        Date d1 = new Date(6, 14, 1992);
        Date d2 = new Date(5, 14, 1992);
        Date d3 = new Date(2, 16, 1992);

        System.out.println("Constructor 1 Format (MM/DD/YYYY): " + d1.toMMDDYYYYString());
        System.out.println("Constructor 2 Format (Month DD, YYYY): " + d2.toMonthDayYearString());
        System.out.println("Constructor 3 Format (DDD YYYY): " + d3.toDDYYYYString());
    }
}  

