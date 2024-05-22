package com.poly.polyapcsafinalproject23_24;

import java.util.Scanner;

public class GameValentineBenjaminA extends GameActivity {

    //create variables up here
    Criminal player;




    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary
    public void run()
    {
        player = new Criminal();

        player.setName("Bob");
        System.out.println(player);

        player.rob();
        System.out.println(player.getMoney());
        Util.pauseConsole();

        startRobbing();
    }

    public void startRobbing()
    {
        while(player.getMoney() > 0)
        {
            Util.clearConsole();
            displayStats();
            String text = """
        Options
        1. rob
        2. turn someone else in
        3. turn yourself in
        """;
            System.out.println(text);
            int option = Util.enterInt(1,3);
            if (option == 1)
            {
                player.rob();
            }
            else if (option == 2)
            {
                //turnSomeoneElseIn();
            }
            else if (option == 3)
            {
                //turnYourselfIn();
            }

            Util.pauseConsole();
        }

    }

    private void displayStats()
    {
        System.out.println( "Name:\t" + player.getName());
        System.out.println( "Money:\t$" + player.getMoney());
    }


}