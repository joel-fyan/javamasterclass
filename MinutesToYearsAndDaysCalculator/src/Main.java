public class Main {
    public static void main(String[] args) {
        printYearsAndDays(525600); // Expect "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); // Expect "525600 min = 2 y and 0 d"
        printYearsAndDays(561600); // Expect "525600 min =  1 y and 25 d"
    }

    private static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long hours = minutes / 60L;
        long days = hours / 24L;
        long years = days / 365L;
        long remainingDays = days % 365L;

        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }
}
