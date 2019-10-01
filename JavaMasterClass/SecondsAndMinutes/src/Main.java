public class Main {
    public static void main(String[] args) {
        System.out.println("Duration -1 minutes and 2 seconds: " + getDurationString(-1, 2)); // Expect "Invalid value"
        System.out.println("Duration 1 minute and -1 seconds: " + getDurationString(1, -1)); // Expect "Invalid value"
        System.out.println("Duration 1 minute and 60 seconds: " + getDurationString(1, 60)); // Expect "Invalid value"
        System.out.println("Duration 121 minutes and 24 seconds: " + getDurationString(121,24)); // Expect "2h 1m 24s"
    }

    private static String getDurationString(int minutes, int seconds)
    {
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid value";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
