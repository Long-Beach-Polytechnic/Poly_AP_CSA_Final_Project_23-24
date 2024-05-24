package com.poly.polyapcsafinalproject23_24;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameGonzalezVictor extends GameActivity{

    //instance variables
    //   variables you plan to use throughout the adventure

    private int numLives;
    private int points;
    //private Player player; (optional)
    private TextView tvTitle, tvSubtitle, tvStoryText;

    private ImageView ivStory;

    private Button btn1, btn2, btn3;


    public void run()
    {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("SPACE ADVENTURE");
        tvSubtitle.setText("Find the key to unlock the treasure hidden in the Solar System. You have 5 lives. Search at your own risk.  Good Luck!!")

        //initialize number of lives
        numLives = 4;
        points = 0;
        //create a scanner object for user input


        //create a player object (optional)


        //display project title and description



        start();
    }

    private void setAllbtnsVisable()
    {
        btn1.setVisibility(TextView.VISIBLE);
        btn2.setVisibility(TextView.VISIBLE);
        btn3.setVisibility(TextView.VISIBLE);
    }










    private void start()
    {

        tvStoryText.setText("COUTDOWN\n10 9 8 7 6 5 4 3 2 1\nBLAST OFF!!!\n\Where would you like to search first?");

        setAllbtnsVisable();
        btn1.setText("Mars");
        btn2.setText("Venus");
        btn3.setText("Pluto");


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mars();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                venus();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pluto();
            }
        });


    }


    //__MARS____________________________________________________________________________________________
    private void mars()
    {

        tvStoryText.setText("You head towards mars, Where would you like to go?");

        setAllbtnsVisable();
        btn1.setText("Land east");
        btn2.setText("Land west");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                landEast();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                landWest();
            }
        });


    }


    private void landEast()
    {
        tvStoryText.setText("So you've landed but where do you go next?");
        setAllbtnsVisable();
        btn1.setText("The CANYON!!");
        btn2.setText("The river");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expCan();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expRiv();
            }
        });

    }



    private void landWest()
    {


        tvStoryText.setText("So you've landed but you see Aliens. What do you do?");
        setAllbtnsVisable();
        btn1.setText("Say hi to them");
        btn2.setText("Shoot them");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAliens();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shootAliens();
            }
        });



    }


    private void expCan()
    {
        //COME BACK TO THIS
        tvStoryText.setText("Jawas gang up on you and rob everything you own including your spaceship, water and food");
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        defeat();
    }


    private void expRiv()
    {


        tvStoryText.setText("you flow down the river and barely survived but you see Aliens. What do you do?");
        setAllbtnsVisable();
        btn1.setText("Say hi to them");
        btn2.setText("Shoot them");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAliens();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shootAliens();
            }
        });


    }


    private void goToAliens()
    {

        tvStoryText.setText("They are welcoming and friendly. They invite you to their spaceship");
        setAllbtnsVisable();
        btn1.setText("accept request");
        btn2.setText("decline request");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onShip();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notOnShip();
            }
        });



    }


    private void shootAliens()
    {
        //COME BACK TO DEFEAT
        System.out.println("They saw your hesitation. A laser gun is aimed to your head :(");
        System.out.println();
        defeat();
    }


    private void onShip()
    {
        tvStoryText.setText("So you're in the ship. Where would you like to go?");
        setAllbtnsVisable();
        btn1.setText("Venus");
        btn2.setText("Pluto");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                venus();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pluto();
            }
        });




    }

    private void notOnShip()
    {
        //COME BACK TO DEFEATS MESSASGE
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