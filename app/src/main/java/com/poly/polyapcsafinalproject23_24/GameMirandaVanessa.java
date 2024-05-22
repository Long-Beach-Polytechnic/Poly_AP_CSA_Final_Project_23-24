package com.poly.polyapcsafinalproject23_24;

import java.util.Scanner;

public class GameMirandaVanessa extends GameActivity{

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
        System.out.println("Choose Your Superpower");
        System.out.println("You get to chose a superpower between three. Hope you make the right choice and have fun!");

        Util.pauseConsole();
        start();

    }

    private void start()
    {
        System.out.println("\n Which superpower are you choosing between these three?");
        System.out.println("1. Ice Powers \n2. Fire Powers \n3. Electric Powers");
        int choice = Util.enterInt(1,3);

        if(choice == 1)
        {
            icePowers();
        }
        else if(choice == 2)
        {
            firePowers();
        }
        else if(choice == 3)
        {
            electricPowers();
        }

    }

    private void icePowers()
    {
        Util.clearConsole();
        System.out.println("\n.Whare are you doing with your powers?");
        System.out.println("1. Stay in your room \n2. Go with your friend to the store");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            stayInRoom();
        }
        else if (choice == 2)
        {
            goToStore();
        }

    }

    private void goToStore()
    {
        Util.pauseConsole();
        System.out.println("You are out with your friend at the liquor store buying drinks and ice cream. When you guys get out of the store what happens?");
        System.out.println("1. The ice cream starts to melt because you guys were fooling around but you try to freeze it \n2. Your friend asks you to turn all the drinks into slushies");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            freezeIceCream();
        }
        else if(choice == 2)
        {
            slushieDrinks();
        }
    }

    private void freezeIceCream()
    {
        Util.clearConsole();
        System.out.println("You get home with good cold ice cream and drinks, you win!");
        Util.pauseConsole();
        win();
    }

    private void slushieDrinks()
    {
        Util.clearConsole();
        System.out.println("Your friend chugs the drinks and gets a bad brain freeze. They need to go to the doctor, you lose.");
        Util.pauseConsole();
        defeat();
    }

    private void stayInRoom()
    {
        Util.clearConsole();
        System.out.println("You stay in your room playing with snow but you hear someone. What are you doing?");
        System.out.println("1. blast them with snow and make them fall \n2. Wait and see who it is");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            snowBlast();
        }
        else if (choice == 2)
        {
            waitAndSee();
        }
    }

    private void snowBlast()
    {
        Util.clearConsole();
        System.out.println("It was your sibling and you made them hit the wall, you lose.");
        Util.pauseConsole();
        defeat();
    }

    private void waitAndSee()
    {
        Util.clearConsole();
        System.out.println("It was just a ball, you win!");
        Util.pauseConsole();
        win();

    }

    private void firePowers()
    {
        Util.clearConsole();
        System.out.println("YO you chosed fire!! What are you going to do first?");
        System.out.println("1. You go outside and sit on the grass \n2. You go to a flower shop");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            sitOnGrass();
        }
        else if (choice == 2)
        {
            flowerShop();
        }
    }

    private void sitOnGrass()
    {
        Util.clearConsole();
        System.out.println("you are now sitting at the grass but you see a dog get chased by a snake! What do you do??");
        System.out.println("1. you just stay in your spot for real \n2. You help the dog like the nice person you are");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            stayInPlace();
        }
        else if(choice == 2)
        {
            helpDog();
        }
    }

    private void stayInPlace()
    {
        Util.clearConsole();
        System.out.println("\n The snake follows you instead and it bites you, you lose.");
        Util.pauseConsole();
        defeat();
    }

    private void helpDog()
    {
        Util.clearConsole();
        System.out.println("\n You blast a small fire ball at the snake and killed it. You accidentally burned the dog though, you lose.");
        Util.pauseConsole();
        defeat();
    }

    private void flowerShop()
    {
        Util.clearConsole();
        System.out.println("You made it inside the flower shop! You want to buy a few flowers for your house. Which ones do you want to pick?");
        System.out.println("1. Sunflowers that are in a vase \n2. Fresh cut roses");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            vaseFlowers();
        }
        else if (choice == 2)
        {
            freshRoses();
        }
    }

    private void vaseFlowers()
    {
        Util.clearConsole();
        System.out.println("you pay for the flowers and you walk out safely, you win!");
        Util.pauseConsole();
        win();
    }

    private void freshRoses()
    {
        Util.clearConsole();
        System.out.println("As soon as you touched the flowers you burned them, you lose.");
        Util.pauseConsole();
        defeat();
    }

    private void electricPowers()
    {
        Util.clearConsole();
        System.out.println("Damn you're trying to be like Thor, that's cool! What are you trying to do?");
        System.out.println("1. Take a walk in the night \n2. Play with the little kids and scare them :O");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            walkNight();
        }
        else if (choice == 2)
        {
            scareKids();
        }
    }

    private void walkNight()
    {
        Util.clearConsole();
        System.out.println("You are walking in the night but there is a dark alley where the lights are out. Which path do you take?");
        System.out.println("1. Use your powers (of course) \n2. Use the flaslight of your cell phone");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            usePower();
        }
        else if(choice == 2)
        {
            usePhone();
        }
    }

    private void usePower()
    {
        Util.clearConsole();
        System.out.println("Ayye you turned on all of the lights, you win!!");
        Util.pauseConsole();
        win();
    }

    private void usePhone()
    {
        Util.clearConsole();
        System.out.println("You decided to use your phone but it eventually dies, you lose.");
        Util.pauseConsole();
        defeat();
    }

    private void scareKids()
    {
        Util.clearConsole();
        System.out.println("Alright, alright so you decided to scare the kids. How do you scare them though?");
        System.out.println("1. Cut off the lights \n2. Use a mask and make the lights flicker");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            cutLights();
        }
        else if(choice == 2)
        {
            maskOn();
        }
    }

    private void cutLights()
    {
        Util.clearConsole();
        System.out.println("All of the kids got scared and they started crying, you lose.");
        Util.pauseConsole();
        defeat();
    }

    private void maskOn()
    {
        Util.clearConsole();
        System.out.println("They started to scream and damn you made one of them pee their pants.");
        Util.pauseConsole();
        defeat();

    }

    private void defeat()
    {
        numLives--;

        System.out.println("Aww no! You lost! :(");
        Util.pauseConsole();

        if(numLives>0)
        {
            start();
        }
        else
        {
            System.out.println("GAME OVER");
        }
    }

    private void win()
    {
        Util.clearConsole();
        System.out.println("You won thats sick!! Would you like to play again???");
        System.out.println("1. yes\n2. no");
        int option = Util.enterInt(1,2);
        if (option == 1)
        {
            start();
        }
    }

}