package com.poly.polyapcsafinalproject23_24;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameTayshawnReed extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)


    public void run()
    {
        //initialize number of lives
        numLives = 1;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        Util.clearConsole();
        System.out.println("You find secret tunnels under the school and they have mysterious portals");
        System.out.println("There are 3 portals that you can enter if you decide to, now of course if you do not choose to enter the portals you are a loser dork and yeah have fun!");
        Util.pauseConsole();
        start();
    }

    private void start()
    {
        //start adventure here
        System.out.println("It is normal day at school and you are being nosy and you find secret tunnels under the school and they have mysterious portals");
        System.out.println("1. Go into the red portal\n2. Go into the blue portal\n3. Go into the purple portal\n4. Become a loser and dont enter the portal");
        int choice = Util.enterInt(1,4);
        if (choice == 1)
        {
            redPortal();
        }

        if (choice == 2)
        {
            bluePortal();
        }

        if (choice == 3)
        {
            purplePortal();
        }
        if (choice == 4)
        {
            noPortal();
        }
    }

    private void redPortal()
    {
        Util.clearConsole();

        System.out.println("You enter the red portal and you enter this super magical dimension");
        System.out.println("1.Follow the glowing butterflies\n2. Cross the magic bridge");
        int Choice = Util.enterInt(1, 2);

        if (Choice == 1)
        {
            glowingButterflies();
        }

        if (Choice == 2)
        {
            magicBridge();
        }
    }





    private void glowingButterflies()
    {
        Util.clearConsole();
        System.out.println("\nYou decided to follow the glowing butterflies but there are 2 of them and they are going 2 different directions one is leading you to a cyrstal key and another leads you to a dark area which one do you follow?");
        System.out.println("1.crystal key\n2. dark area");
        int choice = Util.enterInt(1,2);

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
        Util.clearConsole();
        System.out.println("\nYou decided to use the crystal key and it opens a door. Do you decide to go left or right?");
        System.out.println("1.Left\n2. Right");
        int choice = Util.enterInt(1,2);

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
        Util.clearConsole();
        System.out.println("\nYou went left and it lead you to a magical island for you and you find a bunch of treasures and win the game! congrats.");
        Util.pauseConsole();
        Util.clearConsole();
        start();
    }

    private void goRight()
    {
        Util.clearConsole();
        System.out.println("\nYou went right and it lead you to a dark abyss and you ended up dying womp womp choose the right path next time.");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }

    private void magicBridge()
    {
        Util.clearConsole();
        System.out.println("\nYou decide to cross the mystical bridge and you realize it is really really wobbly do you want to take the risk and cross it?");
        System.out.println("1.yes LETS cross it\n2. no im too scared im going to fall");
        int choice = Util.enterInt(1,2);

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
        Util.clearConsole();
        System.out.println("\nYou decided to cross the bridge as it was very wobbly you still managed to get through and you made it, there is another portal do you want to enter?");
        System.out.println("1.yes LETS enter it\n2. no im too scared to go into another portal");
        int choice = Util.enterInt(1,2);

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
        Util.clearConsole();
        System.out.println("\nTurned your back and a giant snake came and bite your head off and now you are dead sadly ");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }


    private void entryPortal()
    {
        Util.clearConsole();
        System.out.println("\nYou decided to enter the portal and once you enter there is a big giant beast what shall you do?");
        System.out.println("1.Fight it\n2. run away");
        int choice = Util.enterInt(1,2);

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
        Util.clearConsole();
        System.out.println("\nYou decide to fight back and you ended up dying because you had no weapon no sword no anything and you decided to fight some greek beast nice try... better luck next time");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }

    private void runAway()
    {
        Util.clearConsole();
        System.out.println("\nYou ran away and thats what was best for you congrats! you did not die.  You live to see another day.");
        Util.pauseConsole();
        Util.clearConsole();
    }

    private void goBack()
    {
        Util.clearConsole();
        System.out.println("\nYou went back and were shivering and you didn't know what to do so you sat there for the rest of your life");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }


    private void darkArea()
    {
        Util.clearConsole();
        System.out.println("\nYou decided to go into the dark area and you fell to your death in the aybss");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }


    //BLUE PORTAL
    private void bluePortal()
    {
        Util.clearConsole();

        System.out.println("You enter the blue portal and you enter this super wierd lava type dimension");
        System.out.println("1.Go to the crystal maze\n2. go lava swimming");
        int Choice = Util.enterInt(1, 2);

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
        Util.clearConsole();
        System.out.println("\nFor some odd reason you thought that swimming in lava would be a good idea. Buddy you are no superhero give it up ");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }



    private void crystalMaze()
    {
        Util.clearConsole();
        System.out.println("\nYou decide to go through the crystal maze and explore! do you want to ride the lava stream on a lava rock or naviagte through the maze");
        System.out.println("1.Ride the stream\n2. navigate");
        int choice = Util.enterInt(1,2);

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
        Util.clearConsole();
        System.out.println("\nI dont know what is up with you and going in lava but clearly this isnt working out for you so yep you guessed it, you die");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }

    private void navigateMaze()
    {
        Util.clearConsole();
        System.out.println("\nYou want to go through the maze now you see this gigantic beautiful bird do you want to go up to it, or go to the old person on the throne");
        System.out.println("1.bird\n2. throne");
        int choice = Util.enterInt(1,2);

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
        Util.clearConsole();
        System.out.println("\nThe bird doesn't recgonize you and it burns you alive as it is a fire bird and it shot a fireball at you");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }

    private void throneGuy()
    {
        Util.clearConsole();
        System.out.println("\nYou went to the mysterious man and you found him as he is the LAVA KING and he gives you all the treasures you could ask for congragulations for winning and obtaining the secret lava treasure");
        Util.pauseConsole();
        Util.clearConsole();
        start();

    }


    //Purple Portal

    private void purplePortal()
    {
        Util.clearConsole();
        System.out.println("\nThis portal takes you into a MINECRAFT WORLD and you get to decide if yo want to go into the END or if you want to go into the overworld.");
        System.out.println("1.end\n2. overworld");
        int choice = Util.enterInt(1,2);

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
        Util.clearConsole();
        System.out.println("\nYou wanted to go into the end lets see what we got here... okay so basically you can decide if you want to fight the ender dragon or glitch through the game and go into the end city while the dragon is stil alive");
        System.out.println("1.fight enderdragon\n2. go to end city");
        int choice = Util.enterInt(1,2);

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
        Util.clearConsole();
        System.out.println("\nYou fight the enderdragon what wepaon will you use a sowrd or a bow and arrow");
        System.out.println("1.sword\n2. beds");
        int choice = Util.enterInt(1,2);

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
        Util.clearConsole();
        System.out.println("\nYou grabbed the diamond sword and sadly did not make it as the enderdragon dragged his purple throwup all over you");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }

    private void explosiveBed()
    {
        Util.clearConsole();
        System.out.println("\nYou used the beds to explode and you were able to kill the enderdragon and obtain his dragon egg as you now go onto live peacfully");
        Util.pauseConsole();
        Util.clearConsole();
        start();
    }

    private void enterEndCity()
    {
        Util.clearConsole();
        System.out.println("\nYou somehow glitched into the endcity and now you are stuck there forever and can never leave their, womp womp.");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }


    private void theOverWorld()
    {
        Util.clearConsole();
        System.out.println("\nYou wanted to go into the overworld as this place is very boring you will find very random things to happen here regardless do you want to follow the cow or follow the cat");
        System.out.println("1.cow\n2. cat");
        int choice = Util.enterInt(1,2);

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
        Util.clearConsole();
        System.out.println("\nThe cow ate you alive I told you very weird things happen in the overworld in this portal and yes the cow's can eat people");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }

    private void followCat()
    {
        Util.clearConsole();
        System.out.println("\nYou follow the cat and it is a goodluck charm defending you from every creeper and even the King and Queen Creeper boss as they are very afriad of the cat congrats you win! ");
        Util.pauseConsole();
        Util.clearConsole();
        start();

    }


    //No Portal

    private void noPortal()
    {
        Util.clearConsole();
        System.out.println("\nyou live you're live normally as you don't technically lose the game you just decide not to play it");
        Util.pauseConsole();
        Util.clearConsole();
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