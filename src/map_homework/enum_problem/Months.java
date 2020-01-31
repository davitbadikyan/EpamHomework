package map_homework.enum_problem;

import java.util.Arrays;

public enum Months {
    JANUARY(new String[]{"January 1", "January 28"}, 2, 31),
    FEBRUARY(new String[]{"February 23"}, 1, 28),
    MARCH(new String[]{"March 8"}, 1, 31),
    APRIL(new String[]{"April 7", "April 24"}, 2, 30),
    MAY(new String[]{"May 1", "May 9", "May 28"}, 3, 31),
    JUNE(new String[]{"June 1"}, 1, 30),
    JULY(new String[]{"July 5"}, 1, 31),
    AUGUST(new String[]{}, 0, 31),
    SEPTEMBER(new String[]{"September 21"}, 1, 30),
    OCTOBER(new String[]{}, 0, 31),
    NOVEMBER(new String[]{}, 0, 30),
    DECEMBER(new String[]{"December 7", "December 31"}, 2, 31);


    private final String[] holidays;
    private final int numberOfHolidays;
    private final int numberOfDays;

    Months(String[] holidays, int numberOfHolidays, int numberOfDays) {
        this.holidays = holidays;
        this.numberOfHolidays = numberOfHolidays;
        this.numberOfDays = numberOfDays;
    }


    public String[] getHolidays() {
        return holidays;
    }

    public int getNumberOfHolidays() {
        return numberOfHolidays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}
