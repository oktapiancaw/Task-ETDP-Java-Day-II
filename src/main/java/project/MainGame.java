package project;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Mage dragonKnight = new Mage(80, 12, "Abraham", "Fire");
        Knight robotKnight = new Knight(100, (int)(Math.random()*(40)+1), "Robot");
        Player bambang = new Player(dragonKnight);
        Scanner input = new Scanner(System.in);
        String action;

        System.out.println("Welcome to Fight game!");
        while(true){
            if(robotKnight.healthHero <= 0){
                endGame(true);
            }
            if(dragonKnight.healthHero <= 0){
                endGame(false);
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
                    if(robotKnight.healthHero <= 0){
                        endGame(true);
                    }
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
            if((int)(Math.random()*(5)+0) >= 4){
                robotKnight.heal();
            }
        }

    }
    public static void mainMenu(){
        System.out.println("Your action :");
        System.out.println("1. Attack");
        System.out.println("2. Heal");
        System.out.println("3. Flee");
        System.out.println("Select :");
    }
    public static void endGame(boolean isWin){
        if(isWin){
            System.out.println("Your Win!");
            System.out.println("Thank you For playing");
            System.exit(0);
        }else{
            System.out.println("You Lose!");
            System.out.println("See you next time!");
            System.exit(0);
        }
    }
}
