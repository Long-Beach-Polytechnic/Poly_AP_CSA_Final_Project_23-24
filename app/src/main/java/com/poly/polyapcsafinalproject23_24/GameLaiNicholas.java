package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;

public class GameLaiNicholas extends GameActivity {

    private TextView tvTitle, tvSubtitle, tvStoryText;

    private ImageView ivStory;

    private Button btn1, btn2, btn3;

    private boolean isWon;
    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)


    @Override
    protected void run()
    {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("CHRISTMAS ADVENTURE");
        //initialize number of lives
        numLives = 3;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        start();
    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }

    private void start()
    {
        //start adventure here
        Util.clearConsole();
        System.out.println("CHRISTMAS ADVENTURE");

        System.out.println("\nIts Christmas, let's go have fun!");
        Util.pauseConsole();
        System.out.println("\nWhere would you like to go?");
        System.out.println("1. Go to the North Pole\n2. Go Ice Skating\n3. Go See Christmas Lights");
        int choice = Util.enterInt(1, 3);

        if (choice == 1)
        {
            goToNorthPole();
        }
        else if (choice == 2)
        {
            goIceSkating();
        }
        else if (choice == 3)
        {
            goSeeChristmasLights();
        }
    }

    private void goToNorthPole()
    {
        Util.clearConsole();
        System.out.println("You decide to go to the North Pole.");
        System.out.println("1. Go see Santa\n2. Encounter a polar bear");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            goSeeSanta();
        }
        else if (choice == 2)
        {
            encounterPolarBear();
        }
    }

    private void goSeeSanta()
    {
        Util.clearConsole();
        System.out.println("\nSanta asks what you want for Christmas?");
        System.out.println("1. He reaches in his bag and hand you a present\n2. It's evil Santa and he kills you");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            santaHandsYouPresent();
        }
        else if (choice == 2)
        {
            defeat();
        }
    }

    private void santaHandsYouPresent()
    {
        Util.clearConsole();
        System.out.println("Santa turns around with the present, what happens next?");
        System.out.println("1. Santa give you what you want\n2. Santa says your bad and tosses you intop the cold ocean");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            santaGivesYouWhatYouWant();
        }
        else if (choice == 2)
        {
            santaTossesYouInTheColdOcean();
        }
    }

    private void santaTossesYouInTheColdOcean()
    {
        Util.clearConsole();
        System.out.println("You get tossed in the ocean and freeze to death");
        Util.pauseConsole();
        defeat();
    }

    private void santaGivesYouWhatYouWant()
    {
        Util.clearConsole();
        System.out.println("Santa gives you what you want, you WIN!");
        Util.pauseConsole();
        numLives++;
        start();
    }

    private void encounterPolarBear()
    {
        Util.clearConsole();
        System.out.println("1.The polar bear is hungry, he chases you down and eats you. You lose.\n2. You wake the polar bear from his nap, now he is angry and eats you. You Lose.");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            defeat();
        }
        else if (choice == 2)
        {
            defeat();
        }
    }

    private void goIceSkating()
    {
        Util.clearConsole();
        System.out.println("\nHow would you like to get in?");
        System.out.println("1. Pay $15\n2. Sneak in without paying");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            pay15();
        }
        else if (choice == 2)
        {
            sneakIn();
        }
    }

    private void pay15()
    {
        Util.clearConsole();
        System.out.println("\nYou pay $15 and get into the ice skating rink, go get your skates!");
        System.out.println("1. Go get your skates\n2. They don't have enough skates, you lose");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goGetSkates();
        }
        else if (choice == 2)
        {
            defeat();
        }
    }

    private void goGetSkates()
    {
        Util.clearConsole();
        System.out.println("\nYou ask for your skates in your size, what happens next?");
        System.out.println("1. They give you your skates\n2. They don't have your size, you lose.");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            getSkatesYourSize();
        }
        else if (choice == 2)
        {
            defeat();
        }
    }

    private void getSkatesYourSize()
    {
        Util.clearConsole();
        System.out.println("\nNow your skating, what happens next?");
        System.out.println("1. You skate like a pro, have fun!\n2. The skates make your feet burn, you lose.");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            skateLikeAPro();
        }
        else if (choice == 2)
        {
            defeat();
        }
    }

    private void skateLikeAPro()
    {
        Util.clearConsole();
        System.out.println("You skate so good they give you a medal, YOU WIN!");
        Util.pauseConsole();
        numLives++;
        start();
    }

    private void sneakIn()
    {
        Util.clearConsole();
        System.out.println("\nYou sneak into the rink without paying, what happens next?");
        System.out.println("1. Security catches you and throws you out, you lose.\n2. Everyone sees and they collectively kick you out, you lose.");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            defeat();
        }
        else if (choice == 2)
        {
            defeat();
        }
    }

    private void goSeeChristmasLights()
    {
        Util.clearConsole();
        System.out.println("\nWould you like to see lights inside or outside?");
        System.out.println("1. Go Outside\n2. Go Inside");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goOutside();
        }
        else if (choice == 2)
        {
            goInside();
        }
    }

    private void goOutside()
    {
        Util.clearConsole();
        System.out.println("\nYou go outside, what happens next?");
        System.out.println("1. It leads into a forest! Follow it!\n2. The lights outside don't work, you lose.");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            followForest();
        }
        else if (choice == 2)
        {
            defeat();
        }
    }

    private void followForest()
    {
        Util.clearConsole();
        System.out.println("\nYou follow the forest, what happens next?");
        System.out.println("1. You see beautiful lights, you look at lights for almost an hour!\n2. The forest catches on fire from the lights, you lose");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            lookAtLights();
        }
        else if (choice == 2)
        {
            defeat();
        }
    }

    private void lookAtLights()
    {
        Util.clearConsole();
        System.out.println("You have a great night looking at lights and you go home happy, You WIN");
        Util.pauseConsole();
        numLives++;
        start();
    }

    private void goInside()
    {
        Util.clearConsole();
        System.out.println("\nYou go inside, what happens next?");
        System.out.println("1. The light catch on fire and you die, you lose.\n2. The light don't work, you get mad and you go home, you lose.");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            defeat();
        }
        else if (choice == 2)
        {
            defeat();
        }
    }




    //run method when defeated
    private void defeat()
    {

        //lose a life
        numLives--;

        //clear console, display text, etc
        Util.clearConsole();
        System.out.println("Careful before you lose too many lives!");
        Util.pauseConsole();


        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else
        {
            //print game over message
            System.out.println("GAME OVER");
        }

    }
}
