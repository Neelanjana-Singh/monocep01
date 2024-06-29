package com.techlabs.model;

import java.util.Scanner;

public class TreasureIsland {

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Treasure Island. Your mission is to find the treasure.");
        System.out.println("Left or right?");
        String direction = scanner.nextLine();

        if (direction.equals("Left")) {
            leftPath(scanner);
        } else if (direction.equals("right")) {
            System.out.println("Fall into a hole. Game over.");
        }

        scanner.close();
    }

    private static void leftPath(Scanner scanner) {
        System.out.println("Swim or wait?");
        String action = scanner.nextLine();

        if (action.equals("wait")) {
            chooseDoor(scanner);
            return;
        }

        System.out.println("Attacked by trout. Game over.");
    }

    private static void chooseDoor(Scanner scanner) {
        System.out.println("Which door?");
        System.out.println("1)Red 2)Blue 3)Yellow 4)Anything else");
        String door = scanner.nextLine();

        if (door.equals("Yellow")) {
            System.out.println("You win!");
            return;
        }

        if (door.equals("Blue")) {
            System.out.println("Eaten by beasts. Game over.");
            return;
        }

        if (door.equals("Red")) {
            System.out.println("Burned by fire. Game over.");
            return;
        }

        System.out.println("Game over.");
    }
}
