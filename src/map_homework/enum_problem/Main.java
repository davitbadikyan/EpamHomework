package map_homework.enum_problem;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Printing all months");
        Months months[] = Months.values();
        for (Months month : months) {
            System.out.println(month);
        }
        System.out.println("\n" + "Number of days in declared month: " + Months.MARCH.getNumberOfDays());
        System.out.println("\n" + "Holidays in declared month: " + Arrays.toString(Months.APRIL.getHolidays()));
        System.out.println("Is March 8 a public holiday? " + checkPublicHolidays("March 8"));
        System.out.println("Is March 21 a public holiday? " + checkPublicHolidays("March 21"));
    }

    public static boolean checkPublicHolidays(String holiday) {
        Months months[] = Months.values();
        for (Months month : months) {
            if(Arrays.toString(month.getHolidays()).contains(holiday)){
                return true;
            }
        }
        return false;
    }
}

