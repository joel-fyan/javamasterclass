public class Main {
    public static void main(String[] args) {
        System.out.println("Duration -1 minutes and 2 seconds: " + getDurationString(-1, 2)); // Expect "Invalid value"
        System.out.println("Duration 1 minute and -1 seconds: " + getDurationString(1, -1)); // Expect "Invalid value"
        System.out.println("Duration 1 minute and 60 seconds: " + getDurationString(1, 60)); // Expect "Invalid value"
        System.out.println("Duration 27 minutes and 21 seconds: " + getDurationString(27,21)); // Expect "0h 27m 21s"
        System.out.println("Duration 121 minutes and 24 seconds: " + getDurationString(121,24)); // Expect "2h 1m 24s"

        System.out.println("Duration 60 seconds: " + getDurationString(60)); // Expect "0h 1m 0s"
        System.out.println("Duration 21 seconds: " + getDurationString(21)); // Expect "0h 0m 21s"
        System.out.println("Duration 121 seconds: " + getDurationString(121)); // Expect "0h 2m 1s"
        System.out.println("Duration 3741 seconds: " + getDurationString(3741)); // Expect "1h 2m 21s"
    }

    private static String getDurationString(int minutes, int seconds)
    {
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid value";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return getFormattedValue(hours) + "h " + getFormattedValue(remainingMinutes) + "m " + getFormattedValue(seconds) + "s";
    }

    private static String getDurationString(int seconds)
    {
        if(seconds < 0){
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    private static String getFormattedValue(int value)
    {
        return String.format("%02d", value);
    }
}
