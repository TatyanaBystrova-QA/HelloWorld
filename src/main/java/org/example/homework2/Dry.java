package org.example.homework2;

import static org.example.homework2.Day.SATURDAY;
import static org.example.homework2.Day.SUNDAY;

public class Dry {
    public static void main(String[] args) {
        System.out.println(isWeekend("saturday"));
        String[] week = {"Saturday", "Sunday"};
        System.out.println(weekendCount(week));
        System.out.println(weekdayCount(week));
    }

    public static boolean isWeekend(String dayName) {
        return dayName.equalsIgnoreCase(SATURDAY.name()) || dayName.equalsIgnoreCase(SUNDAY.name());
    }

    public static int weekendCount(String[] days) {
        int count = 0;
        for (String day : days) {
            if (isWeekend(day)) {
                count++;
            }
        }
        return count;
    }

    public static int weekdayCount(String[] days) {
        return days.length - weekendCount(days);

    }
}
