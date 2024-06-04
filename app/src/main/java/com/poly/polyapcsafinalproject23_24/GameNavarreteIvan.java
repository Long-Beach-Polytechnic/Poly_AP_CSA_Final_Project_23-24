package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameNavarreteIvan extends GameActivity {

    // instance variables
    // variables you plan to use throughout the adventure
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;
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
        tvSubtitle.setText("Try to get a Victory Royale");


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
        isWon = false;

        tvTitle.setText("Fortnite OG MAP - SOLOS EDITION");

        tvStoryText.setText("\nIts time, lets go!\nWhere would you like to land?");

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

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {brickHouse();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {blueHouse();
            }
        });

    }

    private void brickHouse() {

        tvStoryText.setText("\n You've decided to land brick, you get contested, you have a shotgun");

        tvStoryText.setText(" Which of the following do you do?");

        btn1.setText("Fight the player ");
        btn2.setText("Hide until they leave");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {fight();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {hide();
            }
        });
    }

    private void fight() {

        tvStoryText.setText("\n You fight the player and kill him, you made it out of Salty Springs alive");

        tvStoryText.setText(" How do you want to get to the safe zone?");
       tvStoryText.setText("1. Sprint to zone\n2. Take a rift and glide to zone");

        btn1.setText(" Sprint to zone");
        btn2.setText("Take a rift and glide to zone");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {sprint();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {rift();
            }
        });

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

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {clearSalty();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {rotateDusty();
            }
        });
    }

    private void clearSalty() {

       tvStoryText.setText("\n You killed 3 players but were low hp.");

       tvStoryText.setText(" You get third partied after the third kill");

       tvStoryText.setText(" A controller player sprays into your box and kills you.");

        defeat();
    }

    private void rotateDusty() {

       tvStoryText.setText(
                "\n While gliding to Dusty Divot you get headshot sniped mid air by a pro player and he dances on you");

       tvStoryText.setText("You get mad and brake your monitor.");

       tvStoryText.setText("LOSER");

        defeat();
    }

    // Pleasant Path
    private void pleasantPark() {

       tvStoryText.setText("\n You decided to land at Pleasant Park but what house do you want to land at?");

        btn1.setText(" Dog house");
        btn2.setText("Modern house");
        btn3.setVisibility(View.INVISIBLE);
    }

    private void dogHouse() {

       tvStoryText.setText(
                "\nYou've decided to land at dog house, two people landed with you, you picked up a bolt action sniper.");

       tvStoryText.setText("Which of the following do you do now?");

        btn1.setText("Go to the gas station for more loot");
        btn2.setText("Try to no scope the two players");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {dogHouse();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {modernHouse();
            }
        });
    }

    private void gasStation() {

       tvStoryText.setText("\n You go to the gas station, a chest luckily spawned");

       tvStoryText.setText("YOU GOT A PURPLE PUMP FROM THE CHEST and MINIS!");

       tvStoryText.setText("What do you do now?");

        btn1.setText("Run away and hide until few people are left standing");
        btn2.setText("Fight everyone left at Pleasant");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {runHide();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {noScope();
            }
        });
    }

    private void noScope() {

       tvStoryText.setText("\n You decide to no scope the other players");

       tvStoryText.setText("YOU DIE BACK TO THE LOBBY LOSER");

        defeat();
    }

    private void runHide() {

       tvStoryText.setText(
                "\n You decide to run and hide from the players, while looking for a place to hide you encounter a bush, you decide to hide in it.");

       tvStoryText.setText(" While hiding in the bush someone saw your big head and sniped you.");

        defeat();
    }

    private void youVsPleasant() {

       tvStoryText.setText(
                "\n You wipe all of the players in Pleasant, you now have all the best loot, Scar, chug jug, you name it.");

       tvStoryText.setText(" Which of the following do you do now?");
       tvStoryText.setText("1. Push the 10 remaining players left\n2. Camp in your 1x1 waiting for players to die.");

        btn1.setText("Push the 10 remaining players left");
        btn2.setText("Camp in your 1x1 waiting for players to die");
        btn3.setVisibility(View.INVISIBLE);
    }

    private void camp() {

       tvStoryText.setText("\n You decide to camp in your 1x1");

       tvStoryText.setText(" you get focused by the lobby and every player remaining wants you dead. YOU DIE");

        defeat();
    }

    private void push() {

       tvStoryText.setText("\n You decide to Push everyone in the lobby because your good at the game.");

       tvStoryText.setText("you kill 5 out of the 10 players remaining and get the VICTORY ROYALE.");

        start();
    }

    private void modernHouse() {

       tvStoryText.setText("\n You decided to land modern house.");

       tvStoryText.setText(
                "\n You looted all of modern, you have 50 shield, a gray AR, and a green pump, you want to push the guy in basement house. Which of the following do you do now?");

        btn1.setText("Go to the roof and wait for him to come out");
        btn2.setText("Go inside the basement and try to kill him");
        btn3.setVisibility(View.INVISIBLE);
    }

    private void roof() {

       tvStoryText.setText("\n You decide to wait on top of the roof for the player to come out.");

       tvStoryText.setText("\n You got sniped by a player at tree house.");

        defeat();
    }

    private void basement() {

       tvStoryText.setText("\n You decide to push the guy in the basement");

       tvStoryText.setText("\n You got 200 pumped by a purple pump, YOU DIED");

        defeat();
    }

    private void defeat() {
        // run method when defeated

        // lose a life
        numLives--;

        // clear console, display text, etc
       tvStoryText.setText("You lost the game, ready up to continue playing solos.");

        // determine if player gets to play again
        if (numLives > 0) {
            // if you still have lives, return to start()
            start();
        } else {
            // print game over message
           tvStoryText.setText("GAME OVER");
        }

    }

    // Tilted Path
    private void tiltedTowers() {

       tvStoryText.setText("\n You decided to land at Tilted Towers");

       tvStoryText.setText(" Where in Tilted do you want to land?");

        btn1.setText("Clock Tower");
        btn2.setText(" Garage");
        btn3.setVisibility(View.INVISIBLE);
    }

    private void clockTower() {

       tvStoryText.setText("\n You decide to land at Clock Tower, You get both chests.");

       tvStoryText.setText(" You now have 50 shield from the big pot and a Green SMG.");

       tvStoryText.setText("Which of the following do you do now?");
       tvStoryText.setText("1. Loot Pawn Shop \n2. Loot the Park");


        btn1.setText("Loot Pawn Shop");
        btn2.setText("Loot the Park");
        btn3.setVisibility(View.INVISIBLE);
    }

    private void garage() {

       tvStoryText.setText("\n You decided to land at garage.");

       tvStoryText.setText(" Someone lands with you.");

       tvStoryText.setText(" You didn't get the chest...");

       tvStoryText.setText("YOU DIED BACK TO THE LOBBY!");

        defeat();
    }

    private void pawnShop() {

       tvStoryText.setText("\n You decide to rotate to Pawn Shop.");

       tvStoryText.setText("\n You loot both chests that spawned.");

       tvStoryText.setText(" You now have 100 shield, minis, a blue pump and a Green SMG.");

       tvStoryText.setText("\n You have to go Pee IRL...");

       tvStoryText.setText("Which of the following do you do now?");

        btn1.setText("Hide in a cone a go pee");
        btn2.setText("keep playing");
        btn3.setVisibility(View.INVISIBLE);
    }

    private void lootPark() {

       tvStoryText.setText("\n You decided to land at garage.");

       tvStoryText.setText(" Someone lands with you.");

       tvStoryText.setText(" You didn't get the chest...");

       tvStoryText.setText("YOU DIED BACK TO THE LOBBY!");

        defeat();
    }

    private void pee() {

       tvStoryText.setText("\n You decide to go pee IRL...");

       tvStoryText.setText("\n Someone came and killed you");

       tvStoryText.setText("\n You didn't win the game but you feel better rather than holding it.");

        start();
    }

    private void holdIt() {

       tvStoryText.setText("\n You decided to Hold it in.");

       tvStoryText.setText(" While fighting someone you have to go so bad.");

       tvStoryText.setText(" You pee your pants");

       tvStoryText.setText(" You Died and you peed yourself.");

        defeat();
    }

}