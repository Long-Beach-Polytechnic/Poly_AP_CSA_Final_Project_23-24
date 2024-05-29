package com.poly.polyapcsafinalproject23_24;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameSengSambat extends GameActivity
{
 private TextView tvTitle, tvSubtitle, tvStoryText;
 private ImageView ivStory;
 private Button btn1, btn2, btn3;
 private boolean isWon;
 private int numLives;

 @Override
 protected void run() {
     setContentView(R.layout.activity_game_3_button);

     tvTitle = findViewById(R.id.tv_title_txt);
     tvSubtitle = findViewById(R.id.tv_subtitle);
     tvStoryText = findViewById(R.id.tv_story);
     ivStory = findViewById(R.id.iv_story);
     btn1 = findViewById(R.id.btn_1);
     btn2 = findViewById(R.id.btn_2);
     btn3 = findViewById(R.id.btn_3);

     tvTitle.setText("EERIE WOODLANDS");
     tvSubtitle.setText("Made by Sambat");

     //initialize number of lives
     numAttempts = 3;
     //create a scanner object for user input
     scan = new Scanner(System.in);

     //create a player object (optional)
     //player = new Player(...)

     //display project title and description
     String text = """

      ███████╗███████╗██████╗ ██╗███████╗    ██╗    ██╗ ██████╗  ██████╗ ██████╗ ██╗      █████╗ ███╗   ██╗██████╗ ███████╗
      ██╔════╝██╔════╝██╔══██╗██║██╔════╝    ██║    ██║██╔═══██╗██╔═══██╗██╔══██╗██║     ██╔══██╗████╗  ██║██╔══██╗██╔════╝
      █████╗  █████╗  ██████╔╝██║█████╗      ██║ █╗ ██║██║   ██║██║   ██║██║  ██║██║     ███████║██╔██╗ ██║██║  ██║███████╗
      ██╔══╝  ██╔══╝  ██╔══██╗██║██╔══╝      ██║███╗██║██║   ██║██║   ██║██║  ██║██║     ██╔══██║██║╚██╗██║██║  ██║╚════██║
      ███████╗███████╗██║  ██║██║███████╗    ╚███╔███╔╝╚██████╔╝╚██████╔╝██████╔╝███████╗██║  ██║██║ ╚████║██████╔╝███████║
      ╚══════╝╚══════╝╚═╝  ╚═╝╚═╝╚══════╝     ╚══╝╚══╝  ╚═════╝  ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝ ╚══════╝



      """;
     System.out.print(TextColor.YELLOW + (text) + TextColor.RESET);

     System.out.println("You currently have " +  numAttempts + " attempts. You have " + numAttempts + " attempts left to survive the forest");

     System.out.println("\nTime: 11:07 PM Location: Somewhere in Alberta, Canada \n \nIt's getting dark and you're in the woods trying to get to a campsite. While navigating your way through the forest you hear a screech that creeps you out. What do you do?");

     System.out.println( );


     start();
 }
    //instance variables
    //   variables you plan to use throughout the adventure
    private int numAttempts;
    private int shootResult;
    private int leaveResult;
    //private Player player; (optional)


    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
    }

    private void start()
    {
        //start adventure here
        System.out.println("1. Keep walking forward\n2. Investigate the noise \n3. Turn around and run away");

        System.out.println( );


        if (choice == 1)
        {
            goForward();
        }
        else if (choice == 2)
        {
            investigateNoise();
        }
        else if (choice == 3)
        {
            runAway();
        }
    }

    private void goForward()
    {
        System.out.println("You keep walking forward hoping to find a way out of the forest, but you see an eyeless monster, he notices your footsteps and walks towards you. What do you do?");

        System.out.println("1. Hide in a bush\n2. Keep walking forward");

        System.out.println( );


        if (choice == 1)
        {
            hideInBush();
        }
        else if (choice == 2)
        {
            keepWalkingForward();
        }
    }
    private void hideInBush()
    {
        System.out.println("You hide in the bush for a while and it seems like the monster has wandered off somewhere close. What do you do?");

        System.out.println("1. Wait longer\n2. Try to leave");

        System.out.println( );

        if (choice == 1)
        {
            waitLonger();
        }
        else if (choice == 2)
        {
            tryToLeave();
        }
    }
    private void waitLonger()
    {

        System.out.println("You wait longer and the monster eventually wanders off somewhere far, you left the forest surviving");


        endAdventure();

    }

    private void tryToLeave()
    {

        System.out.println("Choose a direction to walk towards");

        System.out.println( );

        System.out.println("1. North\n2. South\n3. East");

        System.out.println( );

        if (choice == 1)
        {
            goNorth();
        }
        else if (choice == 2)
        {
            goSouth();
        }
        else if (choice == 3)
            goEast();
    }

    private void goNorth()

    {
        System.out.println("After heading north you walk into a bear and it ends up eating you. You died");
        defeat();
    }

    private void goSouth()
    {
        System.out.println("After heading south, you end up walking into the monster again and it eats you. You died");
        defeat();
    }

    private void goEast()
    {


        System.out.println("After heading east you walk into a group of hikers and they take you somewhere safe. You lived");



        endAdventure();
    }

    private void keepWalkingForward()
    {

        System.out.println("You keep walking forward but at this point the monster finds where you are and is very near. What do you do?");

        System.out.println("1. Attack the monster\n2. Stay still and be quiet\n3. Run away as fast as you can");

        System.out.println( );



        if (choice == 1)
        {
            attackMonster();
        }
        else if (choice == 2)
        {
            beQuiet();
        }
        else if (choice == 3)
        {
            runAway();
        }
    }
    private void beQuiet()
    {


        System.out.println("You stay stil without making a noise, the monster can't detect you and eventually wanders off. What do you do?");

        System.out.println("\n1. Wait longer\n2. Try to leave");

        System.out.println( );


        if (choice == 1)
        {
            waitLonger();
        }
        else if (choice == 2)
            tryToLeave();
    }


    private void investigateNoise()
    {

        System.out.println("\nYou investigate the noise and see a horrific eyeless monster in front of you. What do you do?");

        System.out.println("1. Stay still and don't make a noise\n2. Try to run away\n3. Throw a rock at it");

        System.out.println( );


        if (choice == 1)
        {
            beQuiet();
        }
        else if (choice == 2)
        {
            runAway();
        }
        else if (choice == 3)
        {
            throwRock();
        }
    }

    private void throwRock()
    {


        System.out.println("You throw a rock at the monster, he responds by brutally beating you to death");



        defeat();
    }

    private void runAway()
    {


        System.out.println("\nWhile you're running away you notice the monster catching up. What do you do?");

        System.out.println("1. Attack the monster\n2. Run West\n3. Keep running");

        System.out.println( );


        if (choice == 1)
        {
            attackMonster();
        }
        else if (choice == 2)
        {
            runWest();
        }
        else if (choice == 3)
        {
            keepRunning();
        }
    }

    private void keepRunning()
    {


        System.out.println("The monster catches up and kills you. You died");



        defeat();
    }

    private void runWest()
    {

        ivStory.setImageResource(R.drawable.im_sengsambat_tunnel);

        String text = """
      You run west and find a cave, there are two tunnels in front of you. What do you do
      1. Hide in left tunnel
      2. Hide in right tunnel
      3. Hide behind a rock
      """;
        System.out.println(TextColor.YELLOW + (text) + TextColor.RESET);


        if (choice == 1)
        {
            leftTunnel();
        }
        else if (choice == 2)
        {
            rightTunnel();
        }
        else if (choice == 3)
        {
            hideBehindRock();
        }
    }

    private void hideBehindRock()
    {



        System.out.println("You hide behind the rock and see it walk past you, you can use this as your chance to escape. What do you do?");

        System.out.println("1. Make a run for it\n2. Walk silently out\n3. Attack the monster");


        if (choice == 1)
        {
            runOut();
        }
        else if (choice == 2)
        {
            walkSilently();
        }
        else if (choice == 3)
        {
            attackMonster();
        }
    }

    private void runOut()
    {


        System.out.println("You try to run out of the cave but the monster chases you and kills you. You died");



        defeat();
    }
    private void walkSilently()
    {

        System.out.println("You walk silently out of the cave and make it out the forest without the monster noticing");


        endAdventure();
    }
    private void leftTunnel()
    {

        System.out.println("The monster headed to the right tunnel and couldn't find you. What do you do?");

        System.out.println("1. Stop hiding and try to leave\n2. Hide for longer");

        System.out.println( );


        if (choice == 1)
        {
            stopHiding();
        }
        else if (choice == 2)
            hideForLonger();
    }
    private void rightTunnel()
    {


        System.out.println("The monster headed to the right tunnel and found you. You died");



        defeat();
    }
    private void hideForLonger()
    {


        System.out.println("The monster wanders off somewhere far and you leave safely");



        endAdventure();
    }
    private void stopHiding()
    {


        int leaveResult = (int) (1 + Math.random()*100);
        if (leaveResult <= 50)
        {
            System.out.println("The monster wanders off somewhere far and you leave safely");



            endAdventure();

        }
        else
        {
            System.out.println("You walk into the monster again and it eats you.  You died.");



            defeat();

        }
    }
    private void attackMonster()
    {


        System.out.println("What will will you attack it with");

        System.out.println("1. Gun\n2. Knife");

        System.out.println( );


        if (choice == 1)
        {
            useGun();
        }
        else if (choice == 2)
        {
            useKnife();
        }
    }

    private void useGun()
    {


        int shootResult = (int) (1 + Math.random()*100);
        if (shootResult <= 50)
        {
            System.out.println("You shoot the monster and it dies. You escaped the forest");


            endAdventure();

        }
        else
        {
            System.out.println("Oh no! your gun ends up jamming and the monster eats you.");



            defeat();
        }
    }


    private void useKnife()
    {


        System.out.println("You try to attack it with a knife but it isn't very effective, it angers the monster and you die a horrible painful death");



        defeat();
    }






    private void endAdventure()
    {


        System.out.println(TextColor.GREEN + "You have won! Play again?" + TextColor.RESET);

        start();

    }

    private void defeat()
    {
        //run method when defeated

        //lose a life
        //numLives--;
        numAttempts--;



        //clear console, display text, etc


        //System.out.println(...)
        System.out.println(TextColor.YELLOW + "You failed to survive, you now have " + numAttempts + " attempts left" + TextColor.RESET);


        //determine if player gets to play again
        if (numAttempts > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else
        {
            //print game over message
            Util.clearConsole();

            System.out.println(TextColor.RED + "Game over! you ran out of attempts" + TextColor.RESET);
        }
    }
}
