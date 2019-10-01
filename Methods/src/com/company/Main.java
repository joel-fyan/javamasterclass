package com.company;

public class Main {

    public static void main(String[] args) {

        String p1 = "Player 1";
        int score = calculateScore(true, 800, 5, 100);
        System.out.println(p1 + " scored " + score);

        int highScorePosition = calculateHighScorePosition(score);
        displayHighScorePosition(p1, highScorePosition);

        String p2 = "Player 2";
        score = calculateScore(true, 10, 3, 0);
        System.out.println(p2 + " scored " + score);

        highScorePosition = calculateHighScorePosition(score);
        displayHighScorePosition(p2, highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Booger", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Bin", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Bash", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Bork", highScorePosition);
    }

    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            return score + (levelCompleted * bonus);
        }
        return -1;
    }

    private static int calculateHighScorePosition(int playerScore)
    {
        int position = 4;

        if(playerScore >= 1000) {
            position = 1;
        }
        if(playerScore >= 500) {
            position = 2;
        }
        if(playerScore >= 100) {
            position = 3;
        }

        return position;
    }

    private static void displayHighScorePosition(String playerName, int position)
    {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }
}
