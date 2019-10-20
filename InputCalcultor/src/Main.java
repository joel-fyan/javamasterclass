import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        int sum = 0;
        double count = 0d;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                sum += scanner.nextInt();
                count++;

                scanner.nextLine();
            }
            else {
                break;
            }
        }

        if(count == 0) {
            count++;
        }

        long avg = Math.round((sum/count));

        System.out.println("SUM = " + sum + " AVG = " + avg );

        scanner.close();
    }
}
