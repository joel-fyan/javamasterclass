public class Main {
    public static void main(String[] args) {
        System.out.println("Summer and temp 10.  Is cat playing? " + isCatPlaying(true, 10)); // Expect false, temp not in range 25-45
        System.out.println("Not summer and temp 36.  Is cat playing? " + isCatPlaying(false, 36)); // Expect false, temp not in range 25-35
        System.out.println("Not summer and temp 35.  Is cat playing? " + isCatPlaying(false, 35)); // Expect true, temp in range 25-35
        System.out.println("Summer and temp 40.  Is cat playing? " + isCatPlaying(true, 40)); // Expect true, temp in range 25-45
    }

    private static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = 35;
        int lowerLimit = 25;

        if(summer)
        {
            upperLimit = 45;
        }

        return temperature >= lowerLimit && temperature <= upperLimit;
    }
}
