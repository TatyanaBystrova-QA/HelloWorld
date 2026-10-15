package org.example.homework4;

import java.math.BigInteger;

public class Prakticheskoe4 {
    public static void main(String[] args) {
        System.out.println("WeekDay " + isWeekend("Sunday"));
        System.out.println("WeekNumber " + isWeekend(6));
        System.out.println("WeekChek " + checkWeekend("Sunday"));
        System.out.println("Group " + determineGroup(5));
        System.out.println("Factorial " + factorial(50));
    }

    public static int isWeekend(String weekday) {
        switch (weekday) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                return 5;
            case "Saturday":
            case "Sunday":
                return 3;
            default:
                return 0;
        }
    }

    public static boolean isWeekend(int weekDayNumber) {
        if (weekDayNumber < 6) {
            return (false);
        } else {
            return (true);
        }
    }

    public static String checkWeekend(String weekday) {
        boolean isWeekend = weekday.equals("Saturday") || weekday.equals("Sunday");
        return isWeekend ? "Ура, выходной!" : "Надо ещё поработать";
    }

    public static int determineGroup(int age) {
        if (age >= 7 && age <= 13) {
            return (1);
        } else if (age >= 14 && age <= 17) {
            return (2);
        } else if (age >= 18 && age <= 65) {
            return (3);
        } else {
            return -1;
        }
    }

    public static BigInteger factorial(int value) {
        BigInteger fac = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
            System.out.println(fac);
        }
        return fac;
    }
}

