package map_homework.enum_problem;

import map_homework.enum_problem.exceptions.NegativeOrZeroDeclarationException;
import map_homework.enum_problem.exceptions.NoDeclaredMonthException;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Printing all months");
        Months[] months = Months.values();
        for (Months month : months) {
            System.out.println(month);
        }
        System.out.println("\n" + "Number of days in declared month: " + Months.MARCH.getNumberOfDays());
        System.out.println("\n" + "Holidays in declared month: " + Arrays.toString(Months.APRIL.getHolidays()));
        System.out.println(checkPublicHolidays(Months.MARCH, 8));
    }

    public static boolean checkPublicHolidays(Months month, int day) {
        if (month == null) {
            throw new NoDeclaredMonthException("Declared month is wrong");
        } else if (day <= 0 || day > 31) {
            throw new NegativeOrZeroDeclarationException("Declared day is wrong");
        } else {
            int[] holidays = month.getHolidays();
            for (int checkingDay : holidays) {
                if (checkingDay == day) {
                    return true;
                }
            }
            return false;
        }
    }
}
