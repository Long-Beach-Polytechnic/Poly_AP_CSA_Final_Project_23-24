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

    private void SetAllBtnsVisible() {
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





    private void glowingButterflies()
    {
        System.out.println("\nYou decided to follow the glowing butterflies but there are 2 of them and they are going 2 different directions one is leading you to a cyrstal key and another leads you to a dark area which one do you follow?");
        System.out.println("1.crystal key\n2. dark area");

        if(choice ==1)
        {
            crystalKey();
        }
        else if(choice ==2)
        {
            darkArea();
        }
    }

    private void crystalKey()
    {
        System.out.println("\nYou decided to use the crystal key and it opens a door. Do you decide to go left or right?");
        System.out.println("1.Left\n2. Right");

        if(choice ==1)
        {
            goLeft();
        }
        else if(choice ==2)
        {
            goRight();
        }
    }

    private void goLeft()
    {
        System.out.println("\nYou went left and it lead you to a magical island for you and you find a bunch of treasures and win the game! congrats.");
        start();
    }

    private void goRight()
    {
        System.out.println("\nYou went right and it lead you to a dark abyss and you ended up dying womp womp choose the right path next time.");
        defeat();
    }

    private void magicBridge()
    {
        System.out.println("\nYou decide to cross the mystical bridge and you realize it is really really wobbly do you want to take the risk and cross it?");
        System.out.println("1.yes LETS cross it\n2. no im too scared im going to fall");

        if(choice ==1)
        {
            crossBridge();
        }
        else if(choice ==2)
        {
            goBack();
        }
    }

    private void crossBridge()
    {
        System.out.println("\nYou decided to cross the bridge as it was very wobbly you still managed to get through and you made it, there is another portal do you want to enter?");
        System.out.println("1.yes LETS enter it\n2. no im too scared to go into another portal");

        if(choice ==1)
        {
            entryPortal();
        }
        else if(choice ==2)
        {
            leavePortal();
        }
    }

    private void leavePortal()
    {
        System.out.println("\nTurned your back and a giant snake came and bite your head off and now you are dead sadly ");
        defeat();
    }


    private void entryPortal()
    {
        System.out.println("\nYou decided to enter the portal and once you enter there is a big giant beast what shall you do?");
        System.out.println("1.Fight it\n2. run away");

        if(choice ==1)
        {
            fightBack();
        }
        else if(choice ==2)
        {
            runAway();
        }
    }

    private void fightBack()
    {
        System.out.println("\nYou decide to fight back and you ended up dying because you had no weapon no sword no anything and you decided to fight some greek beast nice try... better luck next time");
        defeat();
    }

    private void runAway()
    {
        System.out.println("\nYou ran away and thats what was best for you congrats! you did not die.  You live to see another day.");
    }

    private void goBack()
    {
        System.out.println("\nYou went back and were shivering and you didn't know what to do so you sat there for the rest of your life");
        defeat();
    }


    private void darkArea()
    {
        System.out.println("\nYou decided to go into the dark area and you fell to your death in the aybss");
        defeat();
    }


    //BLUE PORTAL
    private void bluePortal()
    {

        System.out.println("You enter the blue portal and you enter this super wierd lava type dimension");
        System.out.println("1.Go to the crystal maze\n2. go lava swimming");

        if (Choice == 1)
        {
            crystalMaze();
        }

        if (Choice == 2)
        {
            lavaSwim();
        }
    }


    private void lavaSwim()
    {
        System.out.println("\nFor some odd reason you thought that swimming in lava would be a good idea. Buddy you are no superhero give it up ");
        defeat();
    }



    private void crystalMaze()
    {
        System.out.println("\nYou decide to go through the crystal maze and explore! do you want to ride the lava stream on a lava rock or naviagte through the maze");
        System.out.println("1.Ride the stream\n2. navigate");

        if(choice ==1)
        {
            lavaStream();
        }
        else if(choice ==2)
        {
            navigateMaze();
        }
    }

    private void lavaStream()
    {
        System.out.println("\nI dont know what is up with you and going in lava but clearly this isnt working out for you so yep you guessed it, you die");
        defeat();
    }

    private void navigateMaze()
    {
        System.out.println("\nYou want to go through the maze now you see this gigantic beautiful bird do you want to go up to it, or go to the old person on the throne");
        System.out.println("1.bird\n2. throne");

        if(choice ==1)
        {
            beautifulBird();
        }
        else if(choice ==2)
        {
            throneGuy();
        }
    }


    private void beautifulBird()
    {
        System.out.println("\nThe bird doesn't recgonize you and it burns you alive as it is a fire bird and it shot a fireball at you");
        defeat();
    }

    private void throneGuy()
    {
        System.out.println("\nYou went to the mysterious man and you found him as he is the LAVA KING and he gives you all the treasures you could ask for congragulations for winning and obtaining the secret lava treasure");
        start();

    }


    //Purple Portal

    private void purplePortal()
    {
        System.out.println("\nThis portal takes you into a MINECRAFT WORLD and you get to decide if yo want to go into the END or if you want to go into the overworld.");
        System.out.println("1.end\n2. overworld");

        if(choice ==1)
        {
            theEnd();
        }
        else if(choice ==2)
        {
            theOverWorld();
        }
    }

    private void theEnd()
    {
        System.out.println("\nYou wanted to go into the end lets see what we got here... okay so basically you can decide if you want to fight the ender dragon or glitch through the game and go into the end city while the dragon is stil alive");
        System.out.println("1.fight enderdragon\n2. go to end city");

        if(choice ==1)
        {
            fightEnderDragon();
        }
        else if(choice ==2)
        {
            enterEndCity();
        }
    }

    private void fightEnderDragon()
    {
        System.out.println("\nYou fight the enderdragon what wepaon will you use a sowrd or a bow and arrow");
        System.out.println("1.sword\n2. beds");

        if(choice ==1)
        {
            diamondSword();
        }
        else if(choice ==2)
        {
            explosiveBed();
        }
    }

    private void diamondSword()
    {
        System.out.println("\nYou grabbed the diamond sword and sadly did not make it as the enderdragon dragged his purple throwup all over you");
        defeat();
    }

    private void explosiveBed()
    {
        System.out.println("\nYou used the beds to explode and you were able to kill the enderdragon and obtain his dragon egg as you now go onto live peacfully");
        start();
    }

    private void enterEndCity()
    {
        System.out.println("\nYou somehow glitched into the endcity and now you are stuck there forever and can never leave their, womp womp.");
        defeat();
    }


    private void theOverWorld()
    {
        System.out.println("\nYou wanted to go into the overworld as this place is very boring you will find very random things to happen here regardless do you want to follow the cow or follow the cat");
        System.out.println("1.cow\n2. cat");

        if(choice ==1)
        {
            followCow();
        }
        else if(choice ==2)
        {
            followCat();
        }
    }


    private void followCow()
    {
        System.out.println("\nThe cow ate you alive I told you very weird things happen in the overworld in this portal and yes the cow's can eat people");
        defeat();
    }

    private void followCat()
    {
        System.out.println("\nYou follow the cat and it is a goodluck charm defending you from every creeper and even the King and Queen Creeper boss as they are very afriad of the cat congrats you win! ");
        start();

    }


    //No Portal

    private void noPortal()
    {
        System.out.println("\nyou live you're live normally as you don't technically lose the game you just decide not to play it");
        start();
    }




















    private void defeat()
    {
        numLives--;
        Util.clearConsole();
        System.out.println("You lose");
        Util.pauseConsole();

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