package com.poly.polyapcsafinalproject23_24;



public class GameGonzalezVictor extends GameActivity{

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    private int points;
    //private Player player; (optional)


    public void run()
    {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv)

        //initialize number of lives
        numLives = 4;
        points = 0;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)


        //display project title and description

        System.out.println("SPACE ADVENTURE");
        System.out.println();
        System.out.println("Find the key to unlock the treasure hidden in the Solar System. You have 5 lives. Good Luck!!");


        start();
    }

    private void start()
    {
        //start adventure here

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

        System.out.println("You head towards mars, Where would you like to go?");
        System.out.println("1. Land east \n2. Land west");


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

        System.out.println("So you've landed but where do you go next?");
        System.out.println("1. The CANYON!!! \n2. the river");


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

        System.out.println("So you've landed but you see Aliens. What do you do?");
        System.out.println("1. Say hi to them \n2. Shoot them");


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

        System.out.println("Jawas gang up on you and rob everything you own including your spaceship, water and food");
        System.out.println();
        defeat();
    }


    private void expRiv()
    {


        System.out.println("you flow down the river and barely survived but you see Aliens. What do you do?");
        System.out.println("1. Say hi to them \n2. Shoot them");


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

        System.out.println("They are welcoming and friendly. They invite you to their spaceship");
        System.out.println("1. accept request \n2. decline request");


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

        System.out.println("They saw your hesitation. A laser gun is aimed to your head :(");
        System.out.println();
        defeat();
    }


    private void onShip()
    {

        System.out.println("So you're in the ship. Where would you like to go?");
        System.out.println("1. Venus \n2. Pluto");


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

        System.out.println("They don't like you. Pew pew!!!");
        System.out.println();
        defeat();
    }

    //__PLUTO__________________________________________________________________________________________

    private void pluto()
    {

        System.out.println("So you've landed on Pluto. Before u exit into the extreme cold. What should you wear?");
        System.out.println("1. Pajamas \n2. Space suit");


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

        System.out.println("It's too cold, you froze.");
        System.out.println();
        defeat();
    }

    private void pajamas()
    {

        System.out.println("You find a frozen ship. Search it?");
        System.out.println("1. YESSS \n2. HELL NAH");


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

        System.out.println("Are you sure you do't wanna go into the ship?");
        System.out.println("1. Fine I'll go in \n2. No I don't wanna go in");


        if (choice == 1)
        {
            searchShip();
        }
        else if (choice == 2)
        {

            System.out.println("Well your going into the ship whether you like it or not.");

            searchShip();
        }
    }

    private void searchShip()
    {

        System.out.println("U step in, you walk towards the kitchen");
        System.out.println("1. check the fridge \n2. check the microwave");


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

        points++;
        System.out.println("You found a key");
        System.out.println("1. go back to ship \n2. check the microwave");


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

        System.out.println("There was a nice slice of pizza. You go in for a bite but then an angry mob of aliens attack you");
        System.out.println();
        defeat();
    }


    private void goBack()
    {

        System.out.println("So you're in the ship. Where would you like to go?");
        System.out.println("1. Mars \n2. Venus");


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

        double num = Math.random();
        if (num > .5)
        {
            landSafe();
        }
        else
        {

            System.out.println("you got caught in a hurricane.");
            System.out.println();
            defeat();
        }
    }


    private void landSafe()
    {

        System.out.println("Wow, you landed safely avoiding the crazy weather.");
        System.out.println("1. explore cave \n2. explore volcano");


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

        System.out.println("You found the treasure chest. IT'S HUGE!");
        System.out.println("Unlock with a key.");

        if (points >= 1)
        {
            System.out.println("THERES A....");

            System.out.println("empty can of coke \nYou win!!!");
        }
        else if (points < 1)
        {
            System.out.println("You may not open the treasure chest. Go find the key.");
            System.out.println("Start all over.");

            start();
        }
    }

    private void expVolcano()
    {

        System.out.println("THE VOLCANOS ERUPTING! RUNN!!!");
        System.out.println("1. run to cave \n2. take high ground on mountain");


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

        System.out.println("Phew, close one.");
        System.out.println("Wait.");


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