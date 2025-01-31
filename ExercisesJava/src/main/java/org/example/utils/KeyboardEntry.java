package org.example.utils;

import java.util.Scanner;

public class KeyboardEntry {
    private static final Scanner scanner = new Scanner(System.in);

    public static int enterInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }

    public static double enterDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a decimal number.");
            scanner.next();
            System.out.print(prompt);
        }
        return scanner.nextDouble();
    }

    public static String enterString(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

    public static String enterLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static boolean enterBoolean(String prompt) {
        System.out.print(prompt + " (true/false): ");
        while (!scanner.hasNextBoolean()) {
            System.out.println("Invalid input. Please enter true or false.");
            scanner.next();
            System.out.print(prompt + " (true/false): ");
        }
        return scanner.nextBoolean();
    }

    public static void close() {
        scanner.close();
    }
}
