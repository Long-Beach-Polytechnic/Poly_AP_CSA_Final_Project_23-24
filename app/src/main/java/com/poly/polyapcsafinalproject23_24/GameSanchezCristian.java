package com.poly.polyapcsafinalproject23_24;

import com.poly.polyapcsafinalproject23_24.GameActivity;



public class GameSanchezCristian extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure

    private int numLives;
    //private Player player; (optional)


    public void run()
    {
     setContentView(R.layout.activity_game_3_button);
     tvTitle = findViewById(R.id.tv_title_txt);
        numLives = 3;





        System.out.println("Will you survive");
        System.out.println("The Not so seemly Dangerous places but they are.");


        start();
    }

    private void start()
    {


        System.out.println("Its a summer break");

        System.out.print("\nIts finally summer,lets get it ");

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

        System.out.println("\nHow do you want to go to the Park?");
        System.out.println("1. Do you want to go walking\n2. Do you want to go on a uber ");


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

        System.out.println("\n Sense you chose walking what way do you want to take?");
        System.out.println("1.Do you want to take the shortcut\n2. Do you want to take the longway  ");


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

        System.out.println("\n Sense you chose the shortcut this is the consequence There was gangmembers in and Ali and they got you");

        defeat();
    }

    private void longWay()
    {

        System.out.println("\n Sense you chose the longway this is the consequence You made it to the park but you lost because some thugs saw you and shot at you ");

        defeat();
    }
    private void uber()
    {

        System.out.println("\n Sense you chose an uber what uber would you like to take to the park?");
        System.out.println("1.Do you want to take a nice luxury car\n2. Do you want to take the average car  ");

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

        System.out.println("\nThe nice luxurious car owner is a kidnapper and he takes you");

        defeat();
    }

    private void regularCar()
    {

        System.out.println("\nThe regular average person was a serial killer and murder you.");

        defeat();
    }

    private void goToSchool()
    {

        System.out.println("\nHow do you want to go to school?");
        System.out.println("1.Do you want to bike ride\n2. Do you want to take parents Car");


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

        System.out.println("\nHow do you want to go to school?");
        System.out.println("1.Do you want to Take the Sidewalk\n2. Do you want to take the road");


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

        System.out.println("\nPeople in the sidewalk stop you and steal your bike and beat you up");

        defeat();
    }

    private void road()
    {

        System.out.println("\nYou get ran over at the coner of the school");

        defeat();
    }
    private void take()
    {

        System.out.println("\nWhat type of car do you want to take?");
        System.out.println("1.Sports car\n2. Old Car");


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

        System.out.println("\nYou go so fast and the breaks werent working that caused you to crash into a tree");

        defeat();
    }

    private void  oldCar()
    {

        System.out.println("\nThat car has been there for years that your own parents don’t even know where the keys are.");

        defeat();
    }

    private void goToChurch()
    {

        System.out.println("\nWhat church do you want to go too ");
        System.out.println("1.Old Looking church\n2. Nice fancy looking chuch");


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

        System.out.println("\nWhat color do you want to wear to Church?");
        System.out.println("1.Wear red\n2. Wear blue");


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

        System.out.println("\nThe pastor is fake and doesnt like the color red");

        defeat();
    }

    private void blue()
    {

        System.out.println("\nYou are the winner nice your a champ.");
    }

    private void fancy()
    {

        System.out.println("\nWhere do you want to sit at the Church?");
        System.out.println("1.Sit in the Front were it is empty.\n2. Sit in the Back were it is empty.");


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

        System.out.println("\nYou die she is weird she dosnt like people siting in the front ");

        defeat();
    }


    private void  back()
    {

        System.out.println("\nYou die she is weird she dosnt like people siting in the back ");

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