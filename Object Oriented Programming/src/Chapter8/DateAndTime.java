
package Chapter8;

public class DateAndTime {
    private Date date;
    private Time2 time;

    public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
        date = new Date(month, day, year);
        time = new Time2(hour, minute, second);
    }

    public void tick() {
        int oldHour = time.getHour();
        time.tick();
        if (time.getHour() == 0 && oldHour == 23) {
            date.nextDay();
        }
    }

    public void incrementMinute() {
        int oldHour = time.getHour();
        time.incrementMinute();
        if (time.getHour() == 0 && oldHour == 23) {
            date.nextDay();
        }
    }

    public void incrementHour() {
        int oldHour = time.getHour();
        time.incrementHour();
        if (time.getHour() == 0 && oldHour == 23) {
            date.nextDay();
        }
    }

    public String toUniversalString() {
        return date.toString() + " " + time.toUniversalString();
    }

    @Override
    public String toString() {
        return date.toString() + " " + time.toString();
    }
}
