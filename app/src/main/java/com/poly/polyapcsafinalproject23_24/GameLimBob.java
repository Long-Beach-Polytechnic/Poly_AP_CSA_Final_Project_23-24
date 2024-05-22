package com.poly.polyapcsafinalproject23_24;

import java.util.Scanner;
public class GameLimBob extends GameActivity {

    private Worker player;

    public void run()
    {
        createPlayer();
        runWorker();
    }

    private void createPlayer()
    {
        Util.clearConsole();
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        player = new Worker(name);
    }

    private void runWorker()
    {
        beginWorker();
        while (player.getHoursWorked() < 15 && player.getMoneySaved() < 4_000)
        {
            displayStats();
            chooseOption();
        }
        endOfWorker();
    }

    private void beginWorker()
    {

    }

    private void displayStats()
    {
        Util.clearConsole();
        String text =
                player.getName() +
                        "\nHours Worked:\t\t" + player.getHoursWorked() +
                        "\nMoney Saved:\t" + player.getMoneySaved() +
                        "\nMoney Earned:\t" + player.getMoneyEarned()+
                        "\nMoney Spend:\t" + player.getMoneySpent();
        System.out.println(text);
        Util.pauseConsole();
    }

    private void chooseOption()
    {
        String text = """
      What do you want to do?
      1. Working
      2. Earn Money
      3. Spend money
      """;
        System.out.println(text);
        int option = Util.enterInt(1,3);
        if (option == 1)
        {
            player.hoursWorking();
        }
        else if (option == 2)
        {
            player.earnMoney();
        }
        else if (option == 3)
        {
            player.moneySpent();
        }

    }

    private void endOfWorker()
    {

        if (player.getMoneyEarned() >= 5_000)
        {
            System.out.println("oh damnn your bank is full!");
        }
        if (player.getHoursWorked() >= 15)
        {
            System.out.println("You passed out because you worked too much.");
        }
        if (player.getMoneySaved() < 1_500 || player.getMoneySpent() < 1_500)
        {
            System.out.println("You are a spender");
        }
        Util.pauseConsole();
        Util.clearConsole();
        System.out.println("Congradulations, you saved " + player.getMoneySaved() + " money!");
        Util.pauseConsole();
        System.out.println("Try again?\n1. Yes\n2. No, I save too much");
        int option = Util.enterInt(1,3);
        if (option == 1)
        {
            player = new Worker(player.getName());
            runWorker();
        }
    }

}