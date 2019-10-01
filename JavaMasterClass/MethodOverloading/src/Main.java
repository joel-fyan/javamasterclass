public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Booger", 500);
        System.out.println("New score is " + newScore );

        int anotherScore = calculateScore(75);
        System.out.println("New score is " + anotherScore );

        int yetAnotherScore = calculateScore();
        System.out.println("New score is " + yetAnotherScore );

        double centimeters = calcFeetAndInchesToCentimeters(4d, 3d);
        System.out.println("4 feet 3 inches is " + centimeters);

        centimeters = calcFeetAndInchesToCentimeters(51d);
        System.out.println("51 inches is " + centimeters);
    }

    private static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    private static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    private static int calculateScore() {
        System.out.println("Unnamed player scored no points");
        return 0;
    }

    private static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }

        System.out.println("Feet " + feet + " and inches " + inches);
        return 2.54d * (feet * 12 + inches);
    }

    private static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0d) {
            return -1;
        }

        double feet = (int)(inches / 12d);
        System.out.println("Feet " + feet);

        double remainingInches = (int)(inches % 12d);
        System.out.println("Remaining inches " + remainingInches);

        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
