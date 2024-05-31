package com.poly.polyapcsafinalproject23_24;


import android.widget.EditText;

public class GameValentineBenjaminA extends GameActivity {

    //create variables up here
    ValentineCriminal player;
    int option;

    EditText etView;







    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary
    public void run()
    {
        System.out.println("You wake up in a strange place. You don't know where or who you are, but you walk out of the alley way you woke up in and see that the city is bright. You find yourself a cheap house with the insignificant amount of money that you had woken up with, and you ultimately decide to live a life of crime. After all, you don't have anything to live for... right?");
        System.out.println("What is your name?");
        EditText name;
        ValentineCriminal player1 = new ValentineCriminal(name);
        System.out.println("How many people will be playing with you?");
    }

    public void startRobbing()
    {
        while(player.getMoney() > 0)
        {
            displayStats();
            String text = "        Options\n" +
                    "        1. rob\n" +
                    "        2. turn someone else in\n" +
                    "        3. turn yourself in";
            System.out.println(text);
            if (option == 1)
            {
                player.rob();
            }
            else if (option == 2)
            {
                ValentineCriminal victim = new ValentineCriminal();
                player.turnInCriminal(victim);
            }
            else if (option == 3)
            {
                player.turnYourselfIn();
            }

        }

    }

    private void displayStats()
    {
        System.out.println( "Name:\t" + player.getName());
        System.out.println( "Money:\t$" + player.getMoney());
        System.out.println( "Wanted Level:\t" + player.getWantedLvl());
        System.out.println( "Driver's ID number:\t" + player.getID());
        System.out.println( "Moral Level:\t" + player.getMoralLvl());
    }

}






