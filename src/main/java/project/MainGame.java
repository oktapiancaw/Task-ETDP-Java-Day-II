package project;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Knight dragonKnight = new Knight(80, 12, "Abraham");
        Knight robotKnight = new Knight(100, (int)(Math.random()*(40)+1), "Robot");
        Player bambang = new Player(dragonKnight);
        Scanner input = new Scanner(System.in);
        String action;

        System.out.println("Welcome to Fight game!");
        while(true){
            if(robotKnight.healthHero <= 0){
                System.out.println("Your Win!");
                System.out.println("Thank you For playing");
                System.exit(0);
            }
            System.out.println("=============================");
            System.out.println("==== Your Enemy is Robot ====");
            System.out.println("=============================");
            System.out.println("Your health: " + dragonKnight.healthHero);
            System.out.println("Enemy health: " + robotKnight.healthHero);
            System.out.println("\n");
            mainMenu();
            action = input.nextLine();

            switch (action) {
                case "1":
                    int knightPower = bambang.attackEnemy();
                    robotKnight.attacked(knightPower);
                    break;
                case "2":
                    bambang.usePotion();
                    break;
                case "3":
                    System.exit(0);
                    break;
            }
            int enemyPower = robotKnight.attack();
            dragonKnight.attacked(enemyPower);
        }

    }
    public static void mainMenu(){
        System.out.println("Your action :");
        System.out.println("1. Attack");
        System.out.println("2. Heal");
        System.out.println("3. Flee");
        System.out.println("Select :");
    }
}
