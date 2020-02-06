package map_homework.enum_problem;

public enum Months {
    JANUARY(new int[]{1, 28}, 31),
    FEBRUARY(new int[]{23}, 28),
    MARCH(new int[]{8}, 31),
    APRIL(new int[]{7, 24}, 30),
    MAY(new int[]{1, 9, 28}, 31),
    JUNE(new int[]{1}, 30),
    JULY(new int[]{5}, 31),
    AUGUST(new int[]{}, 31),
    SEPTEMBER(new int[]{21}, 30),
    OCTOBER(new int[]{}, 31),
    NOVEMBER(new int[]{}, 30),
    DECEMBER(new int[]{7, 31}, 31);


    private final int[] holidays;
    private final int numberOfDays;

    Months(int[] holidays, int numberOfDays) {
        this.holidays = holidays;
        this.numberOfDays = numberOfDays;
    }


    public int[] getHolidays() {
        return holidays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}
