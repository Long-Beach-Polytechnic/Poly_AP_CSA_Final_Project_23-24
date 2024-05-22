package com.poly.polyapcsafinalproject23_24;

import java.util.Scanner;

public class ChooseYourOwnAdventureChavezHugo extends GameActivity {

public class Adventure{

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)


    public void run()
    {
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        Util.clearConsole();
        System.out.println("The Great Titan Apocolypse");
        System.out.println("In this game, you are living in a world were giant humanoid creatures attack your village. Your mission is very simple, JUST SURVIVE, and the decisions you make will decide if you live or you DIE!!!");

        Util.pauseConsole();
        start();
    }

    private void start()
    {
        Util.clearConsole();
        System.out.println("THE TITANS HAVE BREACHED THE WALL");

        System.out.println("You must make the right decisions in order to survive!!!");
        Util.clearConsole();
        System.out.println("The titans have breached the wall and are now attacking the village, what will you do to survive?");
        System.out.println("1. Attack the titans\n2. Watch in fear\n3. Run as fast as possible");
        int choice = Util.enterInt (1,3);

        if (choice == 1)
        {
            attack();
        }
        else if (choice == 2)
        {
            watch();
        }
        else if (choice == 3)
        {
            runAway();
        }
    }


    private void attack()
    {
        Util.clearConsole();
        System.out.println();

        Util.clearConsole();
        System.out.println("So you have chosen to ATTACK the titans!, You are either very brave or very stupid, lets see how you will survive, TIME TO ATTACK, CHOOSE YOUR WEAPON");
        System.out.println("1. Sword \n2. Gun");
        int choice = Util.enterInt (1,2);

        if (choice == 1)
        {
            sword();
        }
        else if (choice == 2)
        {
            gun();
        }
    }

    private void sword()
    {
        Util.clearConsole();
        System.out.println();

        Util.clearConsole();
        System.out.println("You have chosen the sword, you have found that titans are vulnerable to swords, Now its time for you to kill the titan. Where would you attack?");
        System.out.println("1. Chest \n2. Head \n3. Neck");
        int choice = Util.enterInt (1,3);

        if (choice == 1)
        {
            chest();
        }
        else if (choice == 2)
        {
            head();
        }
        else if (choice == 3)
        {
            neck();
        }
    }

    private void chest()
    {
        Util.clearConsole();
        System.out.println("YOU LOST!!! You got eaten by the titan!. The titans chest are very resistant, and tough against attacks, try again...");
        defeat();
    }

    private void head()
    {
        Util.clearConsole();
        System.out.println("YOU LOST!!! You got eaten by the titan!. The titans head are very alert, and can see your movements with great accuracy, try again...");
        defeat();
    }

    private void neck()
    {
        Util.clearConsole();
        System.out.println("You found out their weakness! Now how will you attack the neck?");
        System.out.println("1. FULL STRENGTH \n2. NO STRENGTH.......");
        int choice  = Util.enterInt (1,2);

        if (choice == 1)
        {
            fullstrength();
        }
        else if (choice == 2)
        {
            nostrength();
        }

    }

    private void fullstrength()
    {
        Util.clearConsole();
        System.out.println("YOU WIN!! YOU WENT ALL IN WITH FULL STRENGTH AND DEFEATED THE TITANS!!! CONGRATS!!");
        Util.pauseConsole();
        start();
    }

    private void nostrength()
    {
        Util.clearConsole();
        System.out.println("YOU LOST!!! Come on, you really thought you were gonna win without putting in strength? ._. try again...");
        defeat();
    }

    private void gun()
    {
        Util.clearConsole();
        System.out.println("YOU LOST!!! Guns are not effective towards titans! try again...");
        defeat();
    }

    private void watch()
    {
        Util.clearConsole();
        System.out.println();

        Util.clearConsole();
        System.out.println("You watch as the titans breach the wall, and you just keep watching... Whats your next move?");
        System.out.println("1. You watch them \n 2. You keep watching \n 3. You watch them even more...");
        int choice = Util.enterInt (1,3);

        if (choice == 1)
        {
            watchThem();
        }
        else if (choice == 2)
        {
            keepWatching();
        }
        else if (choice == 3)
        {
            watchThemMore();
        }
    }

    private void watchThem()
    {
        Util.clearConsole();
        System.out.println("YOU LOST!!! What? you thought just staring at them would make you win? try again...");
        defeat();
    }
    private void keepWatching()
    {
        Util.clearConsole();
        System.out.println("YOU LOST!!! Why do you wanna watch them? you are just a sitting duck, try again...");
        defeat();
    }
    private void watchThemMore()
    {
        Util.clearConsole();
        System.out.println("YOU LOST!!! Why the hell do you just wanna watcn them? you like how the look? Whats wrong with you, do something else, try again...");
        defeat();
    }

    private void runAway()

    {
        Util.clearConsole();
        System.out.println("You have chosen to run away, you are either a coward, or your thinking strategically, and with logic, now... make a decision!");
        System.out.println("1. Run as fast as possible \n2. Try to save your family ");
        int choice = Util.enterInt (1,2);

        if (choice == 1)
        {
            runFast();
        }
        else if (choice == 2)
        {
            runFamily();
        }
    }

    private void runFast()

    {
        Util.clearConsole();
        System.out.println("You are still running and are looking for a place to hide, choose quick!");
        System.out.println("1. Hide in a building \n2. Hide in a tree");
        int choice = Util.enterInt (1,2);

        if (choice == 1)
        {
            hideBuilding();
        }
        else if (choice == 2)
        {
            hideTree();
        }
    }

    private void hideBuilding()
    {
        Util.clearConsole();
        System.out.println("YOU LOST!!! The titans can smell you! ");
        defeat();
    }

    private void hideTree()
    {
        Util.clearConsole();
        System.out.println("YOU LOST!!! The titans can still smell and see you!");
    }

    private void runFamily()
    {
        Util.clearConsole();
        System.out.println("You are looking for your family, how are you going to find them?");
        System.out.println("1. Search for them \n2. Ask where they are ");
        int choice = Util.enterInt (1,2);

        if (choice == 1)
        {
            searchFamily();
        }
        else if (choice == 2)
        {
            askFamily();
        }
    }

    private void searchFamily()
    {
        Util.clearConsole();
        System.out.println("You are searching for your family, where are you going to look for them?");
        System.out.println("1. Search in a nearby bulding \n2. Search among the people in the crowd");
        int choice = Util.enterInt (1,2);

        if (choice == 1)
        {
            searchBuilding();
        }
        else if (choice == 2)
        {
            searchCrowd();
        }
    }

    private void searchBuilding()
    {
        Util.clearConsole();
        System.out.println("YOU LOST!!! They were to many buildings to search for, and got eaten before you could reach one");
        Util.pauseConsole();
        defeat();
    }

    private void searchCrowd()
    {
        Util.clearConsole();
        System.out.println("You see people who resemble them, do you go and check?");
        System.out.println("1. Check \n2 Do not check");
        int choice = Util.enterInt (1,2);

        if (choice == 1)
        {
            check();
        }
        else if (choice == 2)
        {
            notCheck();
        }
    }

    private void check()
    {
        Util.clearConsole();
        System.out.println("YOU WIN!!! Those people were your family, and you succesfully rescued them and survived");
        Util.pauseConsole();
        start();
    }

    private void notCheck()
    {
        Util.clearConsole();
        System.out.println("YOU LOST!!! Why woudln't you check? Like it doesnt hurt to double check");
        Util.pauseConsole();
        defeat();
    }

    private void askFamily()
    {
        Util.clearConsole();
        System.out.println("YOU LOST!!! The strangers dont know how they look like, maybe you shouldve had friends");
        Util.pauseConsole();
        defeat();
    }

    private void defeat()
    {
        //run method when defeated
        Util.pauseConsole();
        //lose a life
        numLives--;

        //clear console, display text, etc
        //System.out.println(...)

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            System.out.println("But you miracalously got saved, try again...");
            Util.pauseConsole();
            start();
        }
        else
        {
            System.out.println("GAME OVER!!! YOU LOST ALL YOUR LIVES, AND GOT EATEN WHOLE BY THE TITANS");//print game over message
        }
    }
}