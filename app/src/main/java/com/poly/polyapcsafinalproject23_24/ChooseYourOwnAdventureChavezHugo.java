package com.poly.polyapcsafinalproject23_24;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChooseYourOwnAdventureChavezHugo extends GameActivity {

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;
    private int numLives;

    @Override
    protected void run() {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("Attack The Titans");
        tvSubtitle.setText("Survive!!!");

        numLives = 4;
        start();
    }


private void setAllBtnsVisible()
{
    btn1.setVisibility(View.VISIBLE);
    btn2.setVisibility(View.VISIBLE);
    btn3.setVisibility(View.VISIBLE);
}




public class Adventure {

    //instance variables
    //   variables you plan to use throughout the adventure

    private int numLives;
    //private Player player; (optional)


    public void run() {
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input


        //create a player object (optional)
        //player = new Player(...)

        //display project title and description

        System.out.println("The Great Titan Apocolypse");
        System.out.println("In this game, you are living in a world were giant humanoid creatures attack your village. Your mission is very simple, JUST SURVIVE, and the decisions you make will decide if you live or you DIE!!!");


        start();
    }

    private void start() {
        isWon = false;

        ivStory.setImageResource(R.drawable.im_chavezhugo_titans_attackt);

        tvStoryText.setText("THE TITANS HAVE BREACHED THE WALL");
        tvStoryText.setText("You must make the right decisions in order to survive!!!");
        tvStoryText.setText("The titans have breached the wall and are now attacking the village, what will you do to survive?");


        setAllBtnsVisible();
        btn1.setText("Attack");
        btn2.setText("Watch");
        btn3.setText("Run Away");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attack();
            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                watch();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                runAway();

            }
        });
    }





    private void attack() {

        tvStoryText.setText("So you have chosen to ATTACK the titans!, You are either very brave or very stupid, lets see how you will survive, TIME TO ATTACK, CHOOSE YOUR WEAPON");

        ivStory.setImageResource(R.drawable.im_chavezhugo_attack);
        setAllBtnsVisible();
        btn1.setText("Sword");
        btn2.setText("Gun");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sword();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gun();
            }
        });
    }


    private void sword() {


        tvStoryText.setText("You have chosen the sword, you have found that titans are vulnerable to swords, Now its time for you to kill the titan. Where would you attack?");

        ivStory.setImageResource(R.drawable.im_chavezhugo_sword);

        setAllBtnsVisible();
        btn1.setText("Chest");
        btn2.setText("Head");
        btn3.setText("Neck");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chest();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                head();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                neck();
            }
        });

    }


    private void chest()
    {

        tvStoryText.setText("YOU LOST!!! You got eaten by the titan!. The titans chest are very resistant, and tough against attacks, try again...");

        ivStory.setImageResource(R.drawable.im_chavezhugo_chest);
        defeat();
    }

    private void head()
    {

        tvStoryText.setText("YOU LOST!!! You got eaten by the titan!. The titans head are very alert, and can see your movements with great accuracy, try again...");

        ivStory.setImageResource(R.drawable.im_chavezhugo_head);

        defeat();
    }

    private void neck()
        {

            tvStoryText.setText("You found out their weakness! Now how will you attack the neck?");

            ivStory.setImageResource(R.drawable.im_chavezhugo_neck);


            setAllBtnsVisible();
            btn1.setText("FULL STRENGTH");
            btn2.setText("No strength...");
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    fullstrength();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    nostrength();
                }
            });
        }





    private void fullstrength()
    {

        tvStoryText.setText("YOU WIN!! YOU WENT ALL IN WITH FULL STRENGTH AND DEFEATED THE TITANS!!! CONGRATS!!");

        ivStory.setImageResource(R.drawable.im_chavezhugo_fullstrength);

        start();
    }

    private void nostrength()
    {

        tvStoryText.setText("YOU LOST!!! Come on, you really thought you were gonna win without putting in strength? ._. try again...");

        ivStory.setImageResource(R.drawable.im_chavezhugo_defeat1);

        defeat();
    }

    private void gun()
    {

        tvStoryText.setText("YOU LOST!!! Guns are not effective towards titans! try again...");

        ivStory.setImageResource(R.drawable.im_chavezhugo_deafeat_gun);

        defeat();
    }

    private void watch()
    {

        tvStoryText.setText("You watch as the titans breach the wall, and you just keep watching... Whats your next move?");

        ivStory.setImageResource(R.drawable.im_chavezhugo_titanbreached);


        setAllBtnsVisible();
        btn1.setText("Watch Them");
        btn2.setText("Keep Watching");
        btn3.setText("Watch Them More");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { watchThem();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { keepWatching();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { watchThemMore();

            }
        });



    }

    private void watchThem()
    {

        tvStoryText.setText("YOU LOST!!! What? you thought just staring at them would make you win? try again...");

        ivStory.setImageResource(R.drawable.im_chavezhugo_defeat2);

        defeat();
    }
    private void keepWatching()
    {

        tvStoryText.setText("YOU LOST!!! Why do you wanna watch them? you are just a sitting duck, try again...");

        ivStory.setImageResource(R.drawable.im_chavezhugo_defeat3);
        defeat();
    }
    private void watchThemMore()
    {

        tvStoryText.setText("YOU LOST!!! Why the hell do you just wanna watcn them? you like how the look? Whats wrong with you, do something else, try again...");

        ivStory.setImageResource(R.drawable.im_chavezhugo_defeat4);

        defeat();
    }

    private void runAway()

    {

        tvStoryText.setText("You have chosen to run away, you are either a coward, or your thinking strategically, and with logic, now... make a decision!");

        ivStory.setImageResource(R.drawable.im_chavezhugo_runaway);


        setAllBtnsVisible();
        btn1.setText("Run as fast as possible");
        btn2.setText("Run to save your family");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                runFast();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                runFamily();
            }
        });

    }

    private void runFast()

    {

        tvStoryText.setText("You are still running and are looking for a place to hide, choose quick!");

        ivStory.setImageResource(R.drawable.im_chavezhugo_runfast);


        setAllBtnsVisible();
        btn1.setText("Hide in a building");
        btn2.setText("Hide in a tree");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideBuilding();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideTree();
            }
        });


    }

    private void hideBuilding()
    {

        tvStoryText.setText("YOU LOST!!! The titans can smell you! ");

        ivStory.setImageResource(R.drawable.im_chavezhugo_defeat5);

    }

    private void hideTree()
    {

        tvStoryText.setText("YOU LOST!!! The titans can still smell and see you!");

        ivStory.setImageResource(R.drawable.im_chavezhugo_defeat6);

        defeat();
    }

    private void runFamily()
    {

        tvStoryText.setText("You are looking for your family, how are you going to find them?");

        ivStory.setImageResource(R.drawable.


        setAllBtnsVisible();
        btn1.setText("Search for them");
        btn2.setText("Ask where they are");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchFamily();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                askFamily();
            }
        });




    }

    private void searchFamily()
    {

        tvStoryText.setText("You are searching for your family, where are you going to look for them?");

        ivStory.setImageResource(R.drawable.


        setAllBtnsVisible();
        btn1.setText("Search in a nearby building");
        btn2.setText("Search among the people in the crowd");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchBuilding();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchCrowd();
            }
        });



    }

    private void searchBuilding()
    {

        tvStoryText.setText("YOU LOST!!! They were to many buildings to search for, and got eaten before you could reach one");

        ivStory.setImageResource(R.drawable.

        defeat();
    }

    private void searchCrowd()
    {

        tvStoryText.setText("You see people who resemble them, do you go and check?");

        ivStory.setImageResource(R.drawable.


        setAllBtnsVisible();
        btn1.setText("Check");
        btn2.setText("Do not check");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notCheck();
            }
        });



    }

    private void check()
    {

        tvStoryText.setText("YOU WIN!!! Those people were your family, and you succesfully rescued them and survived");

        ivStory.setImageResource(R.drawable.

        start();
    }

    private void notCheck()
    {

        tvStoryText.setText("YOU LOST!!! Why woudln't you check? Like it doesnt hurt to double check");

        ivStory.setImageResource(R.drawable.

        defeat();
    }

    private void askFamily()
    {

        tvStoryText.setText("YOU LOST!!! The strangers dont know how they look like, maybe you shouldve had friends");

        ivStory.setImageResource(R.drawable.

        defeat();
    }

    private void defeat()
    {
        //run method when defeated

        //lose a life
        numLives--;

        //clear console, display text, etc
        //System.out.println(...)

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            tvStoryText.setText("But you miracalously got saved, try again...");

            start();
        }
        else
        {
            tvStoryText.setText("GAME OVER!!! YOU LOST ALL YOUR LIVES, AND GOT EATEN WHOLE BY THE TITANS");//print game over message
        }
    }
}