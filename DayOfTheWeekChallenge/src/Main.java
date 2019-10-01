public class Main {
    public static void main(String[] args) {
        
        System.out.println("================");
        System.out.println("Switch Version");
        System.out.println("================");
        
        printDayOfTheWeek(0); // Expected Sunday
        printDayOfTheWeek(1); // Expected Monday
        printDayOfTheWeek(2); // Expected Tuesday
        printDayOfTheWeek(3); // Expected Wednesday
        printDayOfTheWeek(4); // Expected Thursday
        printDayOfTheWeek(5); // Expected Friday
        printDayOfTheWeek(6); // Expected Saturday
        printDayOfTheWeek(7); // Expected Invalid day

        System.out.println("================");
        System.out.println("If-Else Version");
        System.out.println("================");
        printDayOfTheWeekWithIf(0); // Expected Sunday
        printDayOfTheWeekWithIf(1); // Expected Monday
        printDayOfTheWeekWithIf(2); // Expected Tuesday
        printDayOfTheWeekWithIf(3); // Expected Wednesday
        printDayOfTheWeekWithIf(4); // Expected Thursday
        printDayOfTheWeekWithIf(5); // Expected Friday
        printDayOfTheWeekWithIf(6); // Expected Saturday
        printDayOfTheWeekWithIf(7); // Expected Invalid day
    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
    
    private static void printDayOfTheWeekWithIf(int day) {

        if (day ==0) {
            System.out.println("Sunday");
        }
        else if (day ==1) {
            System.out.println("Monday");
        }
        else if (day ==2) {
            System.out.println("Tuesday");
        }
        else if (day ==3) {
            System.out.println("Wednesday");
        }
        else if (day ==4) {
            System.out.println("Thursday");
        }
        else if (day ==5) {
            System.out.println("Friday");
        }
        else if (day ==6) {
            System.out.println("Saturday");
        }
        else {
            System.out.println("Invalid day");
        }
    }
}
