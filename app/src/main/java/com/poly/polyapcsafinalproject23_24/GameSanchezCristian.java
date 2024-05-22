package com.poly.polyapcsafinalproject23_24;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameSanchezCristian extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)


    public void run()
    {
        //initialize number of lives
        numLives = 3;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        Util.clearConsole();
        System.out.println("Will you survive");
        System.out.println("The Not so seemly Dangerous places but they are.");

        Util.pauseConsole();
        start();
    }

    private void start()
    {

        Util.clearConsole();
        System.out.println("Its a summer break");

        System.out.print("\nIts finally summer,lets get it ");
        Util.pauseConsole();
        System.out.println("\nWhere do you want to go?");
        System.out.println("1.Go to the park\n2. Go to School\n3. Go to Church");
        int choice = Util.enterInt(1,3);

        if(choice ==1)
        {
            goToPark();
        }
        else if (choice == 2)
        {
            goToSchool();
        }
        else if(choice == 3)
        {
            goToChurch();
        }
    }

    private void goToPark()
    {
        Util.pauseConsole();
        System.out.println("\nHow do you want to go to the Park?");
        System.out.println("1. Do you want to go walking\n2. Do you want to go on a uber ");
        int choice = Util.enterInt(1,3);

        if (choice == 1)
        {
            goWalking();
        }
        else if (choice == 2)
        {
            uber();
        }

    }

    private void goWalking()
    {
        Util.pauseConsole();
        System.out.println("\n Sense you chose walking what way do you want to take?");
        System.out.println("1.Do you want to take the shortcut\n2. Do you want to take the longway  ");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            shortCut();
        }
        else if (choice == 2)
        {
            longWay();
        }
    }

    private void shortCut()
    {
        Util.pauseConsole();
        System.out.println("\n Sense you chose the shortcut this is the consequence There was gangmembers in and Ali and they got you");
        Util.pauseConsole();
        defeat();
    }

    private void longWay()
    {
        Util.pauseConsole();
        System.out.println("\n Sense you chose the longway this is the consequence You made it to the park but you lost because some thugs saw you and shot at you ");
        Util.pauseConsole();
        defeat();
    }
    private void uber()
    {
        Util.pauseConsole();
        System.out.println("\n Sense you chose an uber what uber would you like to take to the park?");
        System.out.println("1.Do you want to take a nice luxury car\n2. Do you want to take the average car  ");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            niceCar();
        }
        else if (choice == 2)
        {
            regularCar();
        }
    }

    private void niceCar()
    {
        Util.pauseConsole();
        System.out.println("\nThe nice luxurious car owner is a kidnapper and he takes you");
        Util.pauseConsole();
        defeat();
    }

    private void regularCar()
    {
        Util.pauseConsole();
        System.out.println("\nThe regular average person was a serial killer and murder you.");
        Util.pauseConsole();
        defeat();
    }

    private void goToSchool()
    {
        Util.pauseConsole();
        System.out.println("\nHow do you want to go to school?");
        System.out.println("1.Do you want to bike ride\n2. Do you want to take parents Car");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            bikeRide();
        }
        else if (choice == 2)
        {
            take();
        }

    }


    private void bikeRide()
    {
        Util.pauseConsole();
        System.out.println("\nHow do you want to go to school?");
        System.out.println("1.Do you want to Take the Sidewalk\n2. Do you want to take the road");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            sideWalk();
        }
        else if (choice == 2)
        {
            road();
        }

    }

    private void sideWalk()
    {
        Util.pauseConsole();
        System.out.println("\nPeople in the sidewalk stop you and steal your bike and beat you up");
        Util.pauseConsole();
        defeat();
    }

    private void road()
    {
        Util.pauseConsole();
        System.out.println("\nYou get ran over at the coner of the school");
        Util.pauseConsole();
        defeat();
    }
    private void take()
    {
        Util.pauseConsole();
        System.out.println("\nWhat type of car do you want to take?");
        System.out.println("1.Sports car\n2. Old Car");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            sportCar();
        }
        else if (choice == 2)
        {
            oldCar();
        }

    }
    private void  sportCar()
    {
        Util.pauseConsole();
        System.out.println("\nYou go so fast and the breaks werent working that caused you to crash into a tree");
        Util.pauseConsole();
        defeat();
    }

    private void  oldCar()
    {
        Util.pauseConsole();
        System.out.println("\nThat car has been there for years that your own parents don’t even know where the keys are.");
        Util.pauseConsole();
        defeat();
    }

    private void goToChurch()
    {
        Util.pauseConsole();
        System.out.println("\nWhat church do you want to go too ");
        System.out.println("1.Old Looking church\n2. Nice fancy looking chuch");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            old();
        }
        else if (choice == 2)
        {
            fancy();
        }

    }
    private void old()
    {
        Util.pauseConsole();
        System.out.println("\nWhat color do you want to wear to Church?");
        System.out.println("1.Wear red\n2. Wear blue");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            red();
        }
        else if (choice == 2)
        {
            blue();
        }

    }
    private void  red()
    {
        Util.pauseConsole();
        System.out.println("\nThe pastor is fake and doesnt like the color red");
        Util.pauseConsole();
        defeat();
    }

    private void blue()
    {
        Util.pauseConsole();
        System.out.println("\nYou are the winner nice your a champ.");
    }

    private void fancy()
    {
        Util.pauseConsole();
        System.out.println("\nWhere do you want to sit at the Church?");
        System.out.println("1.Sit in the Front were it is empty.\n2. Sit in the Back were it is empty.");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            front();
        }
        else if (choice == 2)
        {
            back();
        }

    }


    private void  front()
    {
        Util.pauseConsole();
        System.out.println("\nYou die she is weird she dosnt like people siting in the front ");
        Util.pauseConsole();
        defeat();
    }


    private void  back()
    {
        Util.pauseConsole();
        System.out.println("\nYou die she is weird she dosnt like people siting in the back ");
        Util.pauseConsole();
        defeat();
    }




    private void defeat()
    {
        numLives--;

        System.out.print("...");

        if (numLives > 0)
        {
            start();
        }
        else
        {
            System.out.println("GAME OVER TRY AGAIN");
        }
    }
}