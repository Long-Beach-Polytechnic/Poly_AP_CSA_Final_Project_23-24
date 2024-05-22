package com.poly.polyapcsafinalproject23_24;

import java.util.Scanner;

public class GameGonzalezVictor extends GameActivity{

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    private int points;
    //private Player player; (optional)


    public void run()
    {
        //initialize number of lives
        numLives = 4;
        points = 0;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)


        //display project title and description
        Util.clearConsole();
        System.out.println("SPACE ADVENTURE");
        System.out.println();
        System.out.println("Find the key to unlock the treasure hidden in the Solar System. You have 5 lives. Good Luck!!");

        Util.pauseConsole();
        start();
    }

    private void start()
    {
        //start adventure here
        //Util.clearConsole();
        System.out.print("COUNTDOWN! ");
        for (int i=10; i>0; i--)
        {
            System.out.println();
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("BLAST OFF!!!");
        System.out.println();
        System.out.println("Where would you like to search first?");
        System.out.println("1. Mars\n2. Venus\n3. Pluto");
        int choice = Util.enterInt(1,3);

        if (choice == 1)
        {
            mars();
        }
        else if (choice == 2)
        {
            venus();
        }
        else if (choice == 3)
        {
            pluto();
        }


    }


    //__MARS____________________________________________________________________________________________
    private void mars()
    {
        Util.clearConsole();
        System.out.println("You head towards mars, Where would you like to go?");
        System.out.println("1. Land east \n2. Land west");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            landEast();
        }
        else if (choice == 2)
        {
            landWest();
        }
    }


    private void landEast()
    {
        Util.clearConsole();
        System.out.println("So you've landed but where do you go next?");
        System.out.println("1. The CANYON!!! \n2. the river");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            expCan();
        }
        else if (choice == 2)
        {
            expRiv();
        }
    }



    private void landWest()
    {
        Util.clearConsole();
        System.out.println("So you've landed but you see Aliens. What do you do?");
        System.out.println("1. Say hi to them \n2. Shoot them");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goToAliens();
        }
        else if (choice == 2)
        {
            shootAliens();
        }
    }


    private void expCan()
    {
        Util.clearConsole();
        System.out.println("Jawas gang up on you and rob everything you own including your spaceship, water and food");
        System.out.println();
        defeat();
    }


    private void expRiv()
    {
        Util.clearConsole();

        System.out.println("you flow down the river and barely survived but you see Aliens. What do you do?");
        System.out.println("1. Say hi to them \n2. Shoot them");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goToAliens();
        }
        else if (choice == 2)
        {
            shootAliens();
        }
    }


    private void goToAliens()
    {
        Util.clearConsole();
        System.out.println("They are welcoming and friendly. They invite you to their spaceship");
        System.out.println("1. accept request \n2. decline request");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            onShip();
        }
        else if (choice == 2)
        {
            notOnShip();
        }
    }


    private void shootAliens()
    {
        Util.clearConsole();
        System.out.println("They saw your hesitation. A laser gun is aimed to your head :(");
        System.out.println();
        defeat();
    }


    private void onShip()
    {
        Util.clearConsole();
        System.out.println("So you're in the ship. Where would you like to go?");
        System.out.println("1. Venus \n2. Pluto");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            venus();
        }
        else if (choice == 2)
        {
            pluto();
        }
    }

    private void notOnShip()
    {
        Util.clearConsole();
        System.out.println("They don't like you. Pew pew!!!");
        System.out.println();
        defeat();
    }

    //__PLUTO__________________________________________________________________________________________

    private void pluto()
    {
        Util.clearConsole();
        System.out.println("So you've landed on Pluto. Before u exit into the extreme cold. What should you wear?");
        System.out.println("1. Pajamas \n2. Space suit");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            pajamas();
        }
        else if (choice == 2)
        {
            spacesuit();
        }
    }


    private void spacesuit()
    {
        Util.clearConsole();
        System.out.println("It's too cold, you froze.");
        System.out.println();
        defeat();
    }

    private void pajamas()
    {
        Util.clearConsole();
        System.out.println("You find a frozen ship. Search it?");
        System.out.println("1. YESSS \n2. HELL NAH");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            searchShip();
        }
        else if (choice == 2)
        {
            notSearchShip();
        }
    }

    private void notSearchShip()
    {
        Util.clearConsole();
        System.out.println("Are you sure you do't wanna go into the ship?");
        System.out.println("1. Fine I'll go in \n2. No I don't wanna go in");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            searchShip();
        }
        else if (choice == 2)
        {
            Util.clearConsole();
            System.out.println("Well your going into the ship whether you like it or not.");
            Util.pauseConsole();
            searchShip();
        }
    }

    private void searchShip()
    {
        Util.clearConsole();
        System.out.println("U step in, you walk towards the kitchen");
        System.out.println("1. check the fridge \n2. check the microwave");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            checkFridge();
        }
        else if (choice == 2)
        {
            checkMicrowave();
        }
    }

    private void checkFridge()
    {
        Util.clearConsole();
        points++;
        System.out.println("You found a key");
        System.out.println("1. go back to ship \n2. check the microwave");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goBack();
        }
        else if (choice == 2)
        {
            checkMicrowave();
        }
    }

    private void checkMicrowave()
    {
        Util.clearConsole();
        System.out.println("There was a nice slice of pizza. You go in for a bite but then an angry mob of aliens attack you");
        System.out.println();
        defeat();
    }


    private void goBack()
    {
        Util.clearConsole();
        System.out.println("So you're in the ship. Where would you like to go?");
        System.out.println("1. Mars \n2. Venus");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            mars();
        }
        else if (choice == 2)
        {
            venus();
        }
    }
    //__VENUS__________________________________________________________________________________________



    private void venus()
    {
        Util.clearConsole();
        double num = Math.random();
        if (num > .5)
        {
            landSafe();
        }
        else
        {
            Util.clearConsole();
            System.out.println("you got caught in a hurricane.");
            System.out.println();
            defeat();
        }
    }


    private void landSafe()
    {
        Util.clearConsole();
        System.out.println("Wow, you landed safely avoiding the crazy weather.");
        System.out.println("1. explore cave \n2. explore volcano");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            expCave();
        }
        else if (choice == 2)
        {
            expVolcano();
        }
    }


    private void expCave()
    {
        Util.clearConsole();
        System.out.println("You found the treasure chest. IT'S HUGE!");
        System.out.println("Unlock with a key.");
        Util.pauseConsole();
        if (points >= 1)
        {
            System.out.println("THERES A....");
            Util.pauseConsole();
            System.out.println("empty can of coke \nYou win!!!");
        }
        else if (points < 1)
        {
            System.out.println("You may not open the treasure chest. Go find the key.");
            System.out.println("Start all over.");
            Util.pauseConsole();
            start();
        }
    }

    private void expVolcano()
    {
        Util.clearConsole();
        System.out.println("THE VOLCANOS ERUPTING! RUNN!!!");
        System.out.println("1. run to cave \n2. take high ground on mountain");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            expCave();
        }
        else if (choice == 2)
        {
            runToMt();
        }
    }


    private void runToMt()
    {
        Util.clearConsole();
        System.out.println("Phew, close one.");
        System.out.println("Wait.");
        Util.pauseConsole();
        Util.clearConsole();
        System.out.println("Acid rain comes stroming in.");
        System.out.println();
        defeat();
    }

























    private void defeat()
    {
        //run method when defeated


        //lose a life
        //numLives--;

        //clear console, display text, etc
        //System.out.println(...)

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            if (numLives > 1)
            {
                System.out.println("TRY AGAIN, YOU NOW HAVE " + numLives + " LIVES");
            }
            else if(numLives == 1)
            {
                System.out.print("TRY AGAIN, YOU HAVE ONE MORE SHOT\n");
            }
            numLives--;
            Util.pauseConsole();
            start();

        }
        else
        {
            System.out.println("NO TREASURE FOR YOU");
            System.out.println("GAME OVER LOSER");

            //print game over message
        }

    }
}