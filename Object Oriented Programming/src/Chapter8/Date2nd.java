/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter8;

/**
 *
 * @author HP USER
 */
public class Date2nd {
    
    private int month;
    private int day;
    private int year;

    private static final String[] monthNames = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    private static final int[] daysPerMonth = {
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public Date2nd(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date2nd(String monthName, int day, int year) {
        this.year = year;
        this.day = day;
        this.month = 1;
        for (int i = 1; i < monthNames.length; i++) {
            if (monthNames[i].equalsIgnoreCase(monthName)) {
                this.month = i;
                break;
            }
        }
    }

    public Date2nd(int dayOfYear, int year) {
        this.year = year;
        int targetDay = dayOfYear;
        this.month = 1;

        while (month <= 12) {
            int days = daysPerMonth[month];
            if (month == 2 && isLeapYear(year)) {
                days = 29;
            }

            if (targetDay <= days) {
                this.day = targetDay;
                break;
            }
            targetDay -= days;
            month++;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    private int getDayOfYear() {
        int totalDays = 0;
        for (int i = 1; i < month; i++) {
            totalDays += daysPerMonth[i];
            if (i == 2 && isLeapYear(year)) {
                totalDays += 1;
            }
        }
        return totalDays + day;
    }

    public String toMMDDYYYYString() {
        return String.format("%02d/%02d/%d", month, day, year);
    }

    public String toMonthDayYearString() {
        return String.format("%s %d, %d", monthNames[month], day, year);
    }

    public String toDDYYYYString() {
        return String.format("%03d %d", getDayOfYear(), year);
    }
}


