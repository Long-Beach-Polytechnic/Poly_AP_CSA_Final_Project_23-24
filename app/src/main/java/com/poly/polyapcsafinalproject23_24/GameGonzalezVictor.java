package com.poly.polyapcsafinalproject23_24;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class
GameGonzalezVictor extends GameActivity{

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
        tvSubtitle.setText("Find the key to unlock the treasure hidden in the Solar System. You have 5 lives. Search at your own risk.  Good Luck!!");

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

        tvStoryText.setText("COUTDOWN\n10 9 8 7 6 5 4 3 2 1\nBLAST OFF!!!\nWhere would you like to search first?");

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
        tvStoryText.setText("They saw your hesitation. A laser gun is aimed to your head :(");

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
        tvStoryText.setText("They don't like you. Pew pew!!");

        defeat();


    }

    //__PLUTO__________________________________________________________________________________________

    private void pluto()
    {

        tvStoryText.setText("So you've landed on Pluto. Before u exit into the extreme cold. What should you wear?");
        setAllbtnsVisable();
        btn1.setText("Pajamas");
        btn2.setText("Space suit");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pajamas();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spacesuit();
            }
        });

    }


    private void spacesuit()
    {

        tvStoryText.setText("It's too cold, you froze.");
        defeat();

    }

    private void pajamas()
    {


        tvStoryText.setText("You find a frozen ship. Search it?");
        setAllbtnsVisable();
        btn1.setText("YESSS");
        btn2.setText("HELL NAH");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchShip();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notSearchShip();
            }
        });

    }

    private void notSearchShip()
    {

        tvStoryText.setText("Are you sure you don't wanna go into the ship?");
        setAllbtnsVisable();
        btn1.setText("Fine I'll go in");
        btn2.setText("No I don't wanna go in");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchShip();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("Well your going into the ship whether you like it or not.");
                searchShip();
            }
        });


    }

    private void searchShip()
    {


        tvStoryText.setText("You step in, you walk towards the kitchen");
        setAllbtnsVisable();
        btn1.setText("check the fridge");
        btn2.setText("check the microwave");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkFridge();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("Well your going into the ship whether you like it or not.");
                checkMicrowave();
            }
        });

    }

    private void checkFridge()
    {

        points++;
        tvStoryText.setText("You found a key");
        setAllbtnsVisable();
        btn1.setText("go back to ship");
        btn2.setText("check the microwave");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("Well your going into the ship whether you like it or not.");
                checkMicrowave();
            }
        });

    }

    private void checkMicrowave()
    {

        tvStoryText.setText("There was a nice slice of pizza. You go in for a bite but then an angry mob of aliens attack you");

        defeat();
    }


    private void goBack()
    {

        tvStoryText.setText("So you're in the ship. Where would you like to go?");
        setAllbtnsVisable();
        btn1.setText("Mars");
        btn2.setText("Venus");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mars();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("Well your going into the ship whether you like it or not.");
                venus();
            }
        });

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

            tvStoryText.setText("you got caught in a hurricane.");

            defeat();
        }
    }


    private void landSafe()
    {

        tvStoryText.setText("Wow, you landed safely avoiding the crazy weather.");
        setAllbtnsVisable();
        btn1.setText("explore cave");
        btn2.setText("explore volcano");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expCave();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("Well your going into the ship whether you like it or not.");
                expVolcano();
            }
        });

    }


    private void expCave()
    {

        tvStoryText.setText("You found the treasure chest. IT'S HUGE!");
        tvStoryText.setText("Unlock with a key.");



        if (points >= 1)
        {
            tvStoryText.setText("THERES AN....\nempty can of coke \nYou win!!!");
            setAllbtnsVisable();
            btn1.setText("Victory Royale");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(GameGonzalezVictor.this, MainActivity.class));
                }
            });

        }
        else if (points < 1)
        {
            tvStoryText.setText("You may not open the treasure chest. Go find the key.");

            setAllbtnsVisable();
            btn1.setText("continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    start();
                }
            });

        }
    }

    private void expVolcano()
    {

        tvStoryText.setText("THE VOLCANOS ERUPTING! RUNN!!!");
        setAllbtnsVisable();
        btn1.setText("run to cave");
        btn2.setText("take high ground on mountain");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expCave();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("Well your going into the ship whether you like it or not.");
                runToMt();
            }
        });

    }


    private void runToMt()
    {

        tvStoryText.setText("Phew, close one.");
        tvStoryText.setText("Wait.\n");

        tvStoryText.setText("Acid rain comes storming in.");

        defeat();
    }

























    private void defeat()
    {
        numLives--;

        //clear console, display text, etc
        //System.out.println(...)

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            if (numLives > 1)
            {
                tvStoryText.setText("TRY AGAIN, YOU NOW HAVE " + numLives + " LIVES");
            }
            else if(numLives == 1)
            {
                tvStoryText.setText("TRY AGAIN, YOU HAVE ONE MORE SHOT\n");
            }

            setAllbtnsVisable();
            btn1.setText("Try again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    start();
                }
            });

        }
        else
        {
            tvStoryText.setText("NO TREASURE FOR YOU");
            tvStoryText.setText("GAME OVER LOSER");

            setAllbtnsVisable();
            btn1.setText("End");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(GameGonzalezVictor.this, MainActivity.class));
                }
            });

            //print game over message
        }

    }
}