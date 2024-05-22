package com.poly.polyapcsafinalproject23_24;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;
import java.util.ArrayList;

public class GameRodriguezJohnny extends GameActivity {

    //create variables up here

    private Farmer player;
    private ArrayList<Crop> crops = new ArrayList<Crop>();

    private int daysSurvived;

    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary
    public void run()
    {
        daysSurvived = 0;
        Scanner scan = new Scanner(System.in);
        Util.clearConsole();
        System.out.println("Farming Simulator");
        String art = TextColor.YELLOW +  """
      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠋⠀⠀⠀⠀⠀
      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀⠀⠀⠀
      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣶⡀⠀⠀⠀
      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⡛⢻⣷⡀⠀⠀
      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⠃⢸⣿⡇⠀⠀
      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⡟⢀⣿⣿⠃⠀⠀
      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⡿⠁⣼⣿⡏⠀⠀⠀
      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⠟⢀⣾⣿⡟⠀⠀⠀⠀
      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣿⠟⢁⣴⣿⣿⠋⠀⠀⠀⠀⠀
      ⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣿⣿⠿⠋⣁⣴⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀
      ⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣿⣿⡿⠟⠋⣁⣴⣾⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀
      ⠀⠀⢠⣾⣿⣿⣿⣿⠿⠟⠋⣁⣤⣶⣿⣿⡿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
      ⠀⠀⠈⠉⢉⣁⣤⣴⣶⣾⣿⣿⠿⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
      ⠀⠀⠀⠀⠉⠉⠛⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀
      """ + TextColor.RESET;
        System.out.println(art);

        System.out.println(TextColor.GREEN + "You are a farmer, and you will have to grow crops you grow in order to survive..."+ TextColor.RESET);
        Util.pauseConsole();
        createCharacter();
        farm();
    }

    private void farm()
    {
        Scanner scan = new Scanner(System.in);

        while (player.getHealth() > 0)
        {
            displayStats();
            chooseOptions();
            viewCrops();
            daysSurvived ++;
        }
        gameOver();




    }

    private void createCharacter()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        player = new Farmer(name);
    }

    private void displayStats()
    {
        Util.clearConsole();
        System.out.println("name:\t\t\t\t" + player.getName());
        System.out.println("health:\t\t\t\t" + player.getHealth());
        System.out.println("poisoned Status:\t" + player.isPoisoned());
        System.out.println("Days Survived:\t" + daysSurvived);

    }

    private void chooseOptions()
    {
        System.out.println("\nWhat would you like to do today on your farm, " + player.getName() + "?");
        System.out.println("1. Plant a Crop \n2. Eat a crop \n3. nothing");
        int choice = Util.enterInt(1,3);
        if(choice == 1)
        {
            plant();
        }
        else if (choice == 2)
        {
            eat();
        }
        else if (choice == 3)
        {
            nothing();
        }
    }


    private void plant()
    {
        Util.clearConsole();

        if (crops.size() < 3)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("What crop would you like to plant today?");
            String name = scan.nextLine();
            System.out.println("Is this crop a vegetable or a fruit?");
            String category = scan.nextLine();

            int daysOld = (int) (0 + Math.random() * 6);
            boolean isRipe = (daysOld > 5);
            Crop crop = new Crop(name,category,isRipe, daysOld, 20);
            crops.add(crop);
            daysSurvived ++;
            Util.pauseConsole();
        }
        else
        {
            System.out.println("You decide to plant a crop but you do not have any more space to plant it, you wasted time! You lose 20 health");
            daysSurvived ++;
            player.addHealth(-20);

            Util.pauseConsole();
        }



    }

    private void viewCrops()
    {
        if(crops.size() > 0)
        {
            Util.clearConsole();
            System.out.println("These are your crops!");
            for (int i=0; i<crops.size(); i++)
            {
                System.out.println("Crop " + (i+1) + ": " + crops.get(i).getName());
                Util.pauseConsole();
            }


        }
        else
        {
            Util.clearConsole();
            System.out.println("You have no crops in your farm right now!");
            Util.pauseConsole();

        }
    }


    private void eat()
    {
        Util.clearConsole();
        System.out.println("Which do you want to eat?");
        for (int i=0; i<crops.size(); i++)
        {
            System.out.println("Crop " + (i+1) + ": " + crops.get(i).getName());
        }
        int option = Util.enterInt(1,crops.size()) - 1;
        Crop currentCrop = crops.get(option);
        crops.remove(option);
        Util.pauseConsole();

        if (currentCrop.isRipe())
        {
            player.addHealth(20);
            player.setPoisoned(false);
            System.out.println("The Crop was ready to eat, You gain 20 health!");
            daysSurvived ++;
            Util.pauseConsole();
        }
        else
        {
            player.addHealth(-20);
            player.setPoisoned(true);
            System.out.println("Oh no! The crop was not ready to eat, You lose 20 health!");
            daysSurvived ++;
            Util.pauseConsole();
        }

    }

    private void nothing()
    {
        Util.clearConsole();
        System.out.println("You decide to do nothing for the day (lazy) your farmer starves, You lose 20 health");
        daysSurvived ++;
        player.addHealth(-20);
        Util.pauseConsole();



    }

    private void gameOver()
    {
        System.out.println(TextColor.GREEN + player.getName() + " Has died from hunger on his farm. Game Over!" + TextColor.RESET);
        System.out.println(player.getName() + " survived " + daysSurvived + " days!");
        Util.pauseConsole();
        run();


    }


}
