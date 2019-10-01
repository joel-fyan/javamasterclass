public class Main {
    private static final String INVALID_VALUE = "Invalid value";

    public static void main(String[] args) {
        System.out.println("Duration -1 minutes and 2 seconds: " + getDurationString(-1L, 2L)); // Expect "Invalid value"
        System.out.println("Duration 1 minute and -1 seconds: " + getDurationString(1L, -1L)); // Expect "Invalid value"
        System.out.println("Duration 1 minute and 60 seconds: " + getDurationString(1L, 60L)); // Expect "Invalid value"
        System.out.println("Duration 27 minutes and 21 seconds: " + getDurationString(27L,21L)); // Expect "00h 27m 21s"
        System.out.println("Duration 121 minutes and 24 seconds: " + getDurationString(121L,24L)); // Expect "02h 01m 24s"

        System.out.println("Duration -1 seconds: " + getDurationString(-1L)); // Expect "Invalid value"
        System.out.println("Duration 60 seconds: " + getDurationString(60L)); // Expect "00h 01m 00s"
        System.out.println("Duration 21 seconds: " + getDurationString(21L)); // Expect "00h 00m 21s"
        System.out.println("Duration 121 seconds: " + getDurationString(121L)); // Expect "00h 02m 01s"
        System.out.println("Duration 3741 seconds: " + getDurationString(3741L)); // Expect "01h 02m 21s"
    }

    private static String getDurationString(long minutes, long seconds)
    {
        if(minutes < 0L || seconds < 0L || seconds > 59L){
            return INVALID_VALUE;
        }

        long hours = minutes / 60L;
        long remainingMinutes = minutes % 60L;

        return getFormattedValue(hours, "h") + " " + getFormattedValue(remainingMinutes, "m") + " " + getFormattedValue(seconds, "s");
    }

    private static String getDurationString(long seconds)
    {
        if(seconds < 0L){
            return INVALID_VALUE;
        }

        long minutes = seconds / 60L;
        long remainingSeconds = seconds % 60L;

        return getDurationString(minutes, remainingSeconds);
    }

    private static String getFormattedValue(long value, String unit)
    {
        String formattedValue = value + unit;

        if(value < 10)
        {
            formattedValue = "0" + formattedValue;
        }

        return formattedValue;
    }
}
