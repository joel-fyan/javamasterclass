import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentMin = 0;
        int currentMax = 0;

        System.out.println("Enter number: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {

            currentMin = scanner.nextInt();
            currentMax = currentMin;

            scanner.nextLine();

            while (true) {
                System.out.println("Enter number: ");
                hasNextInt = scanner.hasNextInt();

                if (hasNextInt) {
                    int value = scanner.nextInt();

                    if (value < currentMin) {
                        currentMin = value;
                    }

                    if (value > currentMax) {
                        currentMax = value;
                    }

                    scanner.nextLine(); // capture enter
                } else {
                    break;
                }
            }
        }
        System.out.println("Current min is " + currentMin);
        System.out.println("Current max is " + currentMax);

        scanner.close();
    }
}