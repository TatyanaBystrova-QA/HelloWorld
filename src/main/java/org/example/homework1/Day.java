package org.example.homework1;

public enum Day {
    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

    private final String rusName;

    Day(String rusName) {
        this.rusName = rusName;
    }

    public String getRusName() {
        return this.rusName;

    }

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}
