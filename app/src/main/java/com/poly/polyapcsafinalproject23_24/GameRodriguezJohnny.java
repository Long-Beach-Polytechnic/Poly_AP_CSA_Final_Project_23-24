package com.poly.polyapcsafinalproject23_24;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;


import java.util.ArrayList;

public class GameRodriguezJohnny extends GameActivity {

    //create variables up here
    private TextView tvGame;
    private ImageView ivMain;
    private Button btn1, btn2, btn3, btn4;
    private boolean isWon;
    private int numLives;

    @Override
    protected void run() {
        setContentView(R.layout.activity_rodriguezjohnny_main);

        tvGame = findViewById(R.id.tv_game);


        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

    }
    protected void onCreate(Bundle savedInstanceState){
    }

    private RodriguezJohnnyFarmer player;
    private ArrayList<RodriguezJohnnyCrop> crops = new ArrayList<RodriguezJohnnyCrop>();

    private int daysSurvived;

    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary
    public void run()
    {
        daysSurvived = 0;
        Scanner scan = new Scanner(System.in);

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
        player = new RodriguezJohnnyFarmer(name);
    }

    private void displayStats()
    {

        System.out.println("name:\t\t\t\t" + player.getName());
        System.out.println("health:\t\t\t\t" + player.getHealth());
        System.out.println("poisoned Status:\t" + player.isPoisoned());
        System.out.println("Days Survived:\t" + daysSurvived);

    }

    private void chooseOptions()
    {
        System.out.println("\nWhat would you like to do today on your farm, " + player.getName() + "?");
        System.out.println("1. Plant a Crop \n2. Eat a crop \n3. nothing");

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


        if (crops.size() < 3)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("What crop would you like to plant today?");
            String name = scan.nextLine();
            System.out.println("Is this crop a vegetable or a fruit?");
            String category = scan.nextLine();

            int daysOld = (int) (0 + Math.random() * 6);
            boolean isRipe = (daysOld > 5);
            RodriguezJohnnyCrop crop = new RodriguezJohnnyCrop(name,category,isRipe, daysOld, 20);
            crops.add(crop);
            daysSurvived ++;

        }
        else
        {
            System.out.println("You decide to plant a crop but you do not have any more space to plant it, you wasted time! You lose 20 health");
            daysSurvived ++;
            player.addHealth(-20);


        }



    }

    private void viewCrops()
    {
        if(crops.size() > 0)
        {

            System.out.println("These are your crops!");
            for (int i=0; i<crops.size(); i++)
            {
                System.out.println("Crop " + (i+1) + ": " + crops.get(i).getName());

            }


        }
        else
        {

            System.out.println("You have no crops in your farm right now!");


        }
    }


    private void eat()
    {

        System.out.println("Which do you want to eat?");
        for (int i=0; i<crops.size(); i++)
        {
            System.out.println("Crop " + (i+1) + ": " + crops.get(i).getName());
        }

        RodriguezJohnnyCrop currentCrop = crops.get(option);
        crops.remove(option);


        if (currentCrop.isRipe())
        {
            player.addHealth(20);
            player.setPoisoned(false);
            System.out.println("The Crop was ready to eat, You gain 20 health!");
            daysSurvived ++;

        }
        else
        {
            player.addHealth(-20);
            player.setPoisoned(true);
            System.out.println("Oh no! The crop was not ready to eat, You lose 20 health!");
            daysSurvived ++;

        }

    }

    private void nothing()
    {

        System.out.println("You decide to do nothing for the day (lazy) your farmer starves, You lose 20 health");
        daysSurvived ++;
        player.addHealth(-20);




    }

    private void gameOver()
    {
        System.out.println(TextColor.GREEN + player.getName() + " Has died from hunger on his farm. Game Over!" + TextColor.RESET);
        System.out.println(player.getName() + " survived " + daysSurvived + " days!");

        run();


    }


}
