package com.techlabs.model;

import java.util.Random;
import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String player1 = getPlayerName(scanner, "player1");
        String player2 = getPlayerName(scanner, "player2");

        int[] result1 = playGame(player1, scanner, random);
        int[] result2 = playGame(player2, scanner, random);

        printResult(player1, result1);
        printResult(player2, result2);

        printWinner(player1, result1, player2, result2);

        scanner.close();
    }

    private static String getPlayerName(Scanner scanner, String playerNumber) {
        System.out.print("Enter Name of " + playerNumber + " -> ");
        return scanner.nextLine();
    }

    private static int[] playGame(String player, Scanner scanner, Random random) {
        int score = 0;
        int turns = 0;
        boolean stop = false;

        System.out.println(player + " Starts playing ->");

        while (!stop && turns < 300) {
            turns++;
            int pageNumber = random.nextInt(300) + 1;
            int turnScore = pageNumber % 7;

            displayTurnInfo(turns, pageNumber, turnScore, score);

            

            if (pageNumber % 7 == 0 || !continuePlaying(scanner)) {
                stop = true;
            }
        }

        displayFinalScore(player, score, turns);
        return new int[]{score, turns};
    }

    private static void displayTurnInfo(int turns, int pageNumber, int turnScore, int score) {
        System.out.println("Turn -> " + turns);
        System.out.println("Page Number Generated -> " + pageNumber);
        System.out.println("Score : " + turnScore);
        score += turnScore;
        System.out.println("Total Score : " + score);
    }

    private static boolean continuePlaying(Scanner scanner) {
        System.out.print("Continue playing -> y/n -> ");
        String continuePlaying = scanner.next();
        return continuePlaying.equals("y");
    }

    private static void displayFinalScore(String player, int score, int turns) {
        System.out.println(player + " Total Score: " + score + " in " + turns + " turns\n");
    }

    private static void printResult(String player, int[] result) {
        System.out.println(player + " Total Score: " + result[0] + " in " + result[1] + " turns");
    }

    private static void printWinner(String player1, int[] result1, String player2, int[] result2) {
        if (result1[0] > result2[0]) {
            System.out.println(player1 + " is the winner.");
        } else if (result2[0] > result1[0]) {
            System.out.println(player2 + " is the winner.");
        } else {
            if (result1[1] < result2[1]) {
                System.out.println(player1 + " is the winner.");
            } else if (result2[1] < result1[1]) {
                System.out.println(player2 + " is the winner.");
            } else {
                System.out.println("The game is a draw.");
            }
        }
    }
}
