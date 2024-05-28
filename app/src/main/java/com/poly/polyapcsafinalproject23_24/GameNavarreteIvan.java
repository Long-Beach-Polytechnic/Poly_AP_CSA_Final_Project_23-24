package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class
public class GameNavarreteIvan extends GameActivity {

    // instance variables
    // variables you plan to use throughout the adventure
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private Scanner scan;
    private int numLives;
    // private Player player; (optional)

    public void run() {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        // initialize number of lives
        numLives = 5;
        // create a scanner object for user input
        scan = new Scanner(System.in);

        // create a player object (optional)
        // player = new Player(...)

        // display project title and description

        tvTitle.setText("OG FORTNITE MAP - SOLOS EDITION");
        tvSubtitle.setVisibility("Try to get a Victory Royale");


        start();
    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }
    private void start() {
        // start adventure here

        tvTitle.setText("Fortnite OG MAP - SOLOS EDITION");

        tvStoryText.setText("\nIts time, lets go!\nWhere would you like to land?");

        System.out.println("1. Salty Springs\n2. Pleasant Park\n3. Tilted Towers");

        setAllBtnsVisible();
        btn1.setText("Salty Springs");
        btn2.setText("Pleasant Park");
        btn3.setText("Tilted Towers");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saltySprings();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pleasantPark();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tiltedTowers();
            }
        });
    }

    private void saltySprings() {

        tvStoryText.setText("\n You decided to go to Salty Springs");

        tvStoryText.setText(" What house do you want to land at?");

        btn1.setText("Brick house ");
        btn2.setText("Blue house");
        btn3.setVisibility(View.INVISIBLE);
    }

    private void brickHouse() {

        tvStoryText.setText("\n You've decided to land brick, you get contested, you have a shotgun");

        tvStoryText.setText(" Which of the following do you do?");

        btn1.setText("Fight the player ");
        btn2.setText("Hide until they leave");
        btn3.setVisibility(View.INVISIBLE);
    }

    private void fight() {

        tvStoryText.setText("\n You fight the player and kill him, you made it out of Salty Springs alive");

        tvStoryText.setText(" How do you want to get to the safe zone?");
        System.out.println("1. Sprint to zone\n2. Take a rift and glide to zone");

        btn1.setText(" Sprint to zone");
        btn2.setText("Take a rift and glide to zone");
        btn3.setVisibility(View.INVISIBLE);

    }

    private void hide() {

        tvStoryText.setText("\n You decide to hide");

        tvStoryText.setText(" A player finds you and 200 pumps your face you died.");

        defeat();
    }

    private void sprint() {

        tvStoryText.setText("\n You decide to sprint to the safe zone all the way in Haunted hills");

        tvStoryText.setText(" You died to storm.");

        tvStoryText.setText("Think next time");

        defeat();
    }

    private void rift() {

        tvStoryText.setText("\n You rift to zone, there is 1 player left");

        tvStoryText.setText(" You kill him with a shotgun! VICTORY ROYALE");

        tvStoryText.setText(" YOUR PARENT ARE FINALLY PROUD OF YOU");

        start();
    }

    private void blueHouse() {

        tvStoryText.setText(
                "\nYou've decided to land blue house, you loot the whole house and have a blue tactical shotgun and gray AR with 50 shield");

        tvStoryText.setText(" Which of the following do you do?");

        btn1.setText(" Fight the rest of the players at salty");
        btn2.setText("Rift to Dusty Divot to continue looting.");
        btn3.setVisibility(View.INVISIBLE);
    }

    private void clearSalty() {

        System.out.println("\n You killed 3 players but were low hp.");

        System.out.println(" You get third partied after the third kill");

        System.out.println(" A controller player sprays into your box and kills you.");

        defeat();
    }

    private void rotateDusty() {

        System.out.println(
                "\n While gliding to Dusty Divot you get headshot sniped mid air by a pro player and he dances on you");

        System.out.println("You get mad and brake your monitor.");

        System.out.println("LOSER");

        defeat();
    }

    // Pleasant Path
    private void pleasantPark() {

        System.out.println("\n You decided to land at Pleasant Park but what house do you want to land at?");
        System.out.println("1. Dog house \n2. Modern house");


        if (choice == 1) {
            dogHouse();
        } else if (choice == 2) {
            modernHouse();
        }
    }

    private void dogHouse() {

        System.out.println(
                "\nYou've decided to land at dog house, two people landed with you, you picked up a bolt action sniper.");

        System.out.println("Which of the following do you do now?");
        System.out.println("1. Go to the gas station for more loot\n2. Try to no scope the two players");


        if (choice == 1) {
            gasStation();
        } else if (choice == 2) {
            noScope();
        }
    }

    private void gasStation() {

        System.out.println("\n You go to the gas station, a chest luckily spawned");

        System.out.println("YOU GOT A PURPLE PUMP FROM THE CHEST and MINIS!");

        System.out.println("What do you do now?");
        System.out.println("1. Run away and hide until few people are left standing\n2. Fight everyone left at Pleasant");


        if (choice == 1) {
            runHide();
        } else if (choice == 2) {
            youVsPleasant();
        }
    }

    private void noScope() {

        System.out.println("\n You decide to no scope the other players");

        System.out.println("YOU DIE BACK TO THE LOBBY LOSER");

        defeat();
    }

    private void runHide() {

        System.out.println(
                "\n You decide to run and hide from the players, while looking for a place to hide you encounter a bush, you decide to hide in it.");

        System.out.println(" While hiding in the bush someone saw your big head and sniped you.");

        defeat();
    }

    private void youVsPleasant() {

        System.out.println(
                "\n You wipe all of the players in Pleasant, you now have all the best loot, Scar, chug jug, you name it.");

        System.out.println(" Which of the following do you do now?");
        System.out.println("1. Push the 10 remaining players left\n2. Camp in your 1x1 waiting for players to die.");


        if (choice == 1) {
            push();
        } else if (choice == 2) {
            camp();
        }
    }

    private void camp() {

        System.out.println("\n You decide to camp in your 1x1");

        System.out.println(" you get focused by the lobby and every player remaining wants you dead. YOU DIE");

        defeat();
    }

    private void push() {

        System.out.println("\n You decide to Push everyone in the lobby because your good at the game.");

        System.out.println("you kill 5 out of the 10 players remaining and get the VICTORY ROYALE.");

        start();
    }

    private void modernHouse() {

        System.out.println("\n You decided to land modern house.");

        System.out.println(
                "\n You looted all of modern, you have 50 shield, a gray AR, and a green pump, you want to push the guy in basement house. Which of the following do you do now?");
        System.out
                .println("1. Go to the roof and wait for him to come out.\n2. Go inside the basement and try to kill him");


        if (choice == 1) {
            roof();
        } else if (choice == 2) {
            basement();
        }
    }

    private void roof() {

        System.out.println("\n You decide to wait on top of the roof for the player to come out.");

        System.out.println("\n You got sniped by a player at tree house.");

        defeat();
    }

    private void basement() {

        System.out.println("\n You decide to push the guy in the basement");

        System.out.println("\n You got 200 pumped by a purple pump, YOU DIED");

        defeat();
    }

    private void defeat() {
        // run method when defeated

        // lose a life
        numLives--;

        // clear console, display text, etc
        System.out.println("You lost the game, ready up to continue playing solos.");

        // determine if player gets to play again
        if (numLives > 0) {
            // if you still have lives, return to start()
            start();
        } else {
            // print game over message
            System.out.println("GAME OVER");
        }

    }

    // Tilted Path
    private void tiltedTowers() {

        System.out.println("\n You decided to land at Tilted Towers");

        System.out.println(" Where in Tilted do you want to land?");
        System.out.println("1. Clock Tower \n2. Garage");


        if (choice == 1) {
            clockTower();
        } else if (choice == 2) {
            garage();
        }
    }

    private void clockTower() {

        System.out.println("\n You decide to land at Clock Tower, You get both chests.");

        System.out.println(" You now have 50 shield from the big pot and a Green SMG.");

        System.out.println("Which of the following do you do now?");
        System.out.println("1. Loot Pawn Shop \n2. Loot the Park");


        if (choice == 1) {
            pawnShop();
        } else if (choice == 2) {
            lootPark();
        }
    }

    private void garage() {

        System.out.println("\n You decided to land at garage.");

        System.out.println(" Someone lands with you.");

        System.out.println(" You didn't get the chest...");

        System.out.println("YOU DIED BACK TO THE LOBBY!");

        defeat();
    }

    private void pawnShop() {

        System.out.println("\n You decide to rotate to Pawn Shop.");

        System.out.println("\n You loot both chests that spawned.");

        System.out.println(" You now have 100 shield, minis, a blue pump and a Green SMG.");

        System.out.println("\n You have to go Pee IRL...");

        System.out.println("Which of the following do you do now?");
        System.out.println("1. Hide in a cone a go pee \n2. keep playing");


        if (choice == 1) {
            pee();
        } else if (choice == 2) {
            holdIt();
        }
    }

    private void lootPark() {

        System.out.println("\n You decided to land at garage.");

        System.out.println(" Someone lands with you.");

        System.out.println(" You didn't get the chest...");

        System.out.println("YOU DIED BACK TO THE LOBBY!");

        defeat();
    }

    private void pee() {

        System.out.println("\n You decide to go pee IRL...");

        System.out.println("\n Someone came and killed you");

        System.out.println("\n You didn't win the game but you feel better rather than holding it.");

        start();
    }

    private void holdIt() {

        System.out.println("\n You decided to Hold it in.");

        System.out.println(" While fighting someone you have to go so bad.");

        System.out.println(" You pee your pants");

        System.out.println(" You Died and you peed yourself.");

        defeat();
    }

}