package com.joelfyan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int counter = 1;

        Scanner scanner = new Scanner(System.in);

        while(counter <= 10) {
            System.out.println("Enter number #" + counter);

            if(scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            }
            else {
                System.out.println("Invalid input");
            }
            scanner.nextLine(); // handle 'enter'
        }

        System.out.println("Sum of input is " + sum);

        scanner.close();
    }
}
