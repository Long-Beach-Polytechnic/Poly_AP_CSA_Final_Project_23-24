package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameTayshawnReed extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
    private boolean isWon;
    private int numLives;
    //private Player player; (optional)


        @Override
    protected void run() {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById((R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);

        tvTitle.setText("Portal Time");
        tvSubtitle.setText("High School");
        //initialize number of lives
        numLives = 1;
        //create a scanner object for user input

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        System.out.println("You find secret tunnels under the school and they have mysterious portals");
        System.out.println("There are 3 portals that you can enter if you decide to, now of course if you do not choose to enter the portals you are a loser dork and yeah have fun!");
        start();
    }
        private void setAllBtnsVisible()
        {
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);


        }
    private void start()
    {
        isWon = false;

        ivStory.setImageResource(R.drawable.);
        //start adventure here
        tvStoryText.setText("It is normal day at school and you are being nosy and you find secret tunnels under the school and they have mysterious portals");
        
        SetAllBtnsVisible();
        btn1.setText("Go into the red portal");
        btn2.setText("Go into the blue portal");
        btn3.setText("Go into the purple portal");
        btn4.setText("No Portal");

        btn1.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) { (redPortal(); }
    });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { bluePortal(); }


        });
               btn3.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) { purplePortal(); }
               });

                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) { noPortal();}


                });

    }



    private void redPortal()
    {

        tvStoryText.setText("You enter the red portal and you enter this super magical dimension");
       ivStory.setImageResource(R.drawable.);


        setAllBtnsVisible();
        btn1.setText("Follow the glowing butterflies");
        btn2.setText("Cross the magic bridge");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) { glowingButterflies();}

    });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { magicBridge();}
        });


    }





    private void glowingButterflies() {
        tvStoryText.setText("You decided to follow the glowing butterflies but there are 2 of them and they are going 2 different directions one is leading you to a cyrstal key and another leads you to a dark area which one do you follow?");
        ivStory.setImageResource(R.drawable.);

        setAllBtnsVisible();
        btn1.setText("crystal key");
        btn2.setText("Dark Area");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crystalKey();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                darkArea();

            }
        });
    }



    private void crystalKey()
    {
       tvStoryText.setText("You decided to use the crystal key and it opens a door. Do you decide to go left or right?");
        ivStory.setImageResource(R.drawable.);

        setAllBtnsVisible();
        btn1.setText("Go Left");
        btn2.setText("Go Right");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { goLeft();

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goRight();

            }
        });

    }

    private void goLeft()
    {
        tvStoryText.setText("You went left and it lead you to a magical island for you and you find a bunch of treasures and win the game! congrats.");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });
    }

    private void goRight()
    {
        tvStoryText.setText("You went right and it lead you to a dark abyss and you ended up dying womp womp choose the right path next time.");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    private void magicBridge()
    {
        tvStoryText.setText("You decide to cross the mystical bridge and you realize it is really really wobbly do you want to take the risk and cross it?");
        ivStory.setImageResource(R.drawable.);

        setAllBtnsVisible();
        btn1.setText("Cross The Bridge");
        btn2.setText("Dont Cross The Bridge");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { crossBridge();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { goBack();

            }
        });


    }

    private void crossBridge()
    {
        tvStoryText.setText("You decided to cross the bridge as it was very wobbly you still managed to get through and you made it, there is another portal do you want to enter?");
        ivStory.setImageResource(R.drawable.);

        setAllBtnsVisible();
        btn1.setText("Enter the portal");
        btn2.setText("Dont enter and contiune your journey");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { entryPortal();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {leavePortal();

            }
        });




    }

    private void leavePortal()
    {
        tvStoryText.setText("Turned your back and a giant snake came and bite your head off and now you are dead sadly ");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               defeat();
            }
        });
    }


    private void entryPortal()
    {
        tvStoryText.setText("You decided to enter the portal and once you enter there is a big giant ogre what shall you do?");
        ivStory.setImageResource(R.drawable.);
        btn1.setText("Fight back");
        btn2.setText("Run away");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { fightBack();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { runAway();

            }
        });


    }

    private void fightBack()
    {
        tvStoryText.setText("You decide to fight back and you ended up dying because you had no weapon no sword no anything and you decided to fight some greek beast nice try... better luck next time");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    private void runAway()
    {
        tvStoryText.setText("You ran away and thats what was best for you congrats! you did not die.  You live to see another day.");
    }

    private void goBack()
    {
        tvStoryText.setText("You went back and were shivering and you didn't know what to do so you sat there for the rest of your life");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               defeat();
            }
        });
    }


    private void darkArea()
    {
        tvStoryText.setText("You decided to go into the dark area and you fell to your death in the aybss");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }


    //BLUE PORTAL
    private void bluePortal()
    {

       tvStoryText.setText("You enter the blue portal and you enter this super wierd lava type dimension");

       ivStory.setImageResource(R.drawable);

       setAllBtnsVisible();
        btn1.setText("Fight back");
        btn2.setText("Run away");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {crystalMaze();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {lavaSwim();

            }
        });

    }


    private void lavaSwim()
    {
        tvStoryText.setText("For some odd reason you thought that swimming in lava would be a good idea. Buddy you are no superhero give it up you died.");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }



    private void crystalMaze()
    {
        tvStoryText.setText("You decide to go through the crystal maze and explore! do you want to ride the lava stream on a lava rock or naviagte through the maze");

        ivStory.setImageResource(R.drawable.);

        setAllBtnsVisible();
        btn1.setText("Ride the Lava stream");
        btn2.setText("Navigate");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { lavaStream();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {navigateMaze();

            }
        });

    }

    private void lavaStream()
    {
        tvStoryText.setText("I dont know what is up with you and going in lava but clearly this isnt working out for you so yep you guessed it, you die");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    private void navigateMaze()
    {
        tvStoryText.setText("You want to go through the maze now you see this gigantic beautiful bird do you want to go up to it, or go to the old person on the throne");

        ivStory.setImageResource(R.drawable.);

        setAllBtnsVisible();
        btn1.setText("Go towards the bird");
        btn2.setText("Go towards the old man");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {beautifulBird();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {throneGuy();

            }
        });

    }


    private void beautifulBird()
    {
        tvStoryText.setText("The bird doesn't recgonize you and it burns you alive as it is a fire bird and it shot a fireball at you");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    private void throneGuy()
    {
        tvStoryText.setText("You went to the mysterious man and you found him as he is the LAVA KING and he gives you all the treasures you could ask for congragulations for winning and obtaining the secret lava treasure");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });

    }


    //Purple Portal

    private void purplePortal()
    {
        tvStoryText.setText("This portal takes you into a MINECRAFT WORLD and you get to decide if yo want to go into the END or if you want to go into the overworld.");

        ivStory.setImageResource(R.drawable.);


        setAllBtnsVisible();
        btn1.setText("Enter the End");
        btn2.setText("Enter the Overworld");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { theEnd();

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {theOverWorld();

            }
        });

    }

    private void theEnd()
    {
       tvStoryText.setText("\nYou wanted to go into the end lets see what we got here... okay so basically you can decide if you want to fight the ender dragon or glitch through the game and go into the end city while the dragon is stil alive");
       ivStory.setImageResource(R.drawable.);


       setAllBtnsVisible();
        btn1.setText("Fight the enderdragon");
        btn2.setText("Go to the end city");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {fightEnderDragon();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {enterEndCity();

            }
        });

    }

    private void fightEnderDragon()
    {
       tvStoryText.setText("You fight the enderdragon what weapon will you use a sword or a bunch of beds");

       ivStory.setImageResource(R.drawable.);


       setAllBtnsVisible();
        btn1.setText("Use the diamond sword");
        btn2.setText("Use the beds");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {diamondSword();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { explosiveBed();

            }
        });

    }

    private void diamondSword()
    {
        tvStoryText.setText("You grabbed the diamond sword and sadly did not make it as the enderdragon dragged his purple throwup all over you");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    private void explosiveBed()
    {
        tvStoryText.setText("You used the beds to explode and you were able to kill the enderdragon and obtain his dragon egg as you now go onto live peacfully");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });
    }

    private void enterEndCity()
    {
        tvStoryText.setText("You somehow glitched into the endcity and now you are stuck there forever and can never leave their, womp womp.");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }


    private void theOverWorld()
    {
        tvStoryText.setText("\nYou wanted to go into the overworld as this place is very boring you will find very random things to happen here regardless do you want to follow the cow or follow the cat");

       ivStory.setImageResource(R.drawable.);


       setAllBtnsVisible();
        btn1.setText("Follow the Cow");
        btn2.setText("Follow the Cat");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {followCow();

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {followCat();

            }
        });

    }


    private void followCow()
    {
        tvStoryText.setText("The cow ate you alive I told you very weird things happen in the overworld in this portal and yes the cow's can eat people");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               defeat();
            }
        });
    }

    private void followCat()
    {
        tvStoryText.setText("You follow the cat and it is a goodluck charm defending you from every creeper and even the King and Queen Creeper boss as they are very afriad of the cat congrats you win! ");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });

    }


    //No Portal

    private void noPortal()
    {
        tvStoryText.setText("you live you're live normally as you don't technically lose the game you just decide not to play it");

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });

    }




















    private void defeat()
    {
        numLives--;
        tvStoryText.setText("You lose");


        if(numLives > 0)
        {
            start();
        }
        else if(numLives == 0)
        {
            System.out.println("Play again?");
        }
    }
}

    private void SetAllBtnsVisible() {
    }

    private void redPortal() {

    }