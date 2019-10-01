public class Main {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020)); // 31 since Jan has 31 days
        System.out.println(getDaysInMonth(2, 2020)); // 29 since feb in 2020 is leap year
        System.out.println(getDaysInMonth(2, 2018)); // 28 since feb in 2018 is not leap year
        System.out.println(getDaysInMonth(-1, 2020)); // -1 month is invalid
        System.out.println(getDaysInMonth(1, -2020)); // -1 year is invalid
    }

    private static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if(isLeapYear(year))
                {
                    return 29;
                }
                return 28;
            default:
                return 30;
        }
    }

    private static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        }

        return year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0));
    }
}
