public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Booger", 500);
        System.out.println("New score is " + newScore );

        int anotherScore = calculateScore(1000);
        System.out.println("Another score is " + anotherScore);
    }

    private static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    private static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
}
