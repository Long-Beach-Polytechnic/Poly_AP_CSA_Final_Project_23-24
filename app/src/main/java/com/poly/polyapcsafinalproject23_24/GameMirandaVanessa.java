package com.poly.polyapcsafinalproject23_24;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameMirandaVanessa extends GameActivity{

    //instance variables
    //   variables you plan to use throughout the adventure

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;
    private int numLives;
    //private Player player; (optional)

    @Override
    protected void run() {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        tvTitle.setText("Choose your superpower.");

        numLives = 5;

        start();
    }

    private void setAllBtnsVsisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);

    }

    private void start() {

    isWon = false;

        ivStory.setImageResource(R.drawable.im_superpower_title);
    playAudio(R.raw.audio_superpower_bass);

        tvStoryText.setText("You get to choose a superpower between three. Hope you make the right choice!");
        tvStoryText.setText("Whcih power are willing to choose between these three?");

        setAllBtnsVisible();
        btn1.setText("Ice powers");
        btn2.setText("Fire powers");
        btn3.setText("Electric powers");

        btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {icePowers();}
    });
        btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {firePowers();}
    });

        btn3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {electricPowers();}
    });


}


    private void icePowers()
    {
        ivStory.setImageResource(R.drawable.im_superpower_ice);

        tvStoryText.setText("What are you doing with your powers?");

        setAllBtnsVisible();
        btn1.setText("stay in your room");
        btn2.setText("go with your friend to the store");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stayInRoom();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToStore();
            }
        });
    }

    private void goToStore()
    {

        tvStoryText.setText("You are out with your friend at the liquor store buying drinks and ice cream. When you guys leave the store what happens?");

        ivStory.setImageResource(R.drawable.im_superpowers_store);

        setAllBtnsVisible();
        btn1.setText("The ice cream starts to melt because you guys were playing, but you try to freeze it.");
        btn2.setText("Your friend asks you to turn the drinks into slushies.");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freezeIceCream();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slushieDrinks();
            }
        });

    }

    private void freezeIceCream()
    {

        isWon = true;
        tvStoryText.setText("You get home with good cold ice cream and drinks. Yay!");

        ivStory.setImageResource(R.drawable.im_superpowers_icecream_slushies);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });

    }

    private void slushieDrinks()
    {

        tvStoryText.setText("Your friend chugs the drinks and gets a bad brain freeze. They need to go the hospital. You loose.");

        ivStory.setImageResource(R.drawable.im_superpowers_slushie_drinks);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }
    private void stayInRoom()
    {

        tvStoryText.setText("You stay in your room playing with snow but you hear someone. What are you doing?");

        ivStory.setImageResource(R.drawable.im_superpowers_stay_in_room);

        setAllBtnsVisible();
        btn1.setText("Blast them with snow and make them fall");
        btn2.setText("Wait and see who it is.");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snowBlast();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                waitAndSee();
            }
        });
    }

    private void snowBlast()
    {

        isWon = false;
        tvStoryText.setText("It was your sibling and you made them hit the wall. You loose.");

        ivStory.setImageResource(R.drawable.im_superpowers_snowblast);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void tan5Hours()
    {
        isWon = false;
        tvStoryText.setText("You are burned. Too much of a good thing is bad. Learn from this experience. Game over.");

        ivStory.setImageResource(R.drawable.im_laborday_tan5hours);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });

    }

    private void firePowers()
    {

        tvStoryText.setText("Yo you chose fire! What are you doing first?");

        ivStory.setImageResource(R.drawable.im_superpowers_fire_powers);

        setAllBtnsVisible();
        btn1.setText("You go outside and sit on the grass");
        btn2.setText("You go to a flower shop");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sitOnGrass();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flowerShop();
            }
        });
    }

    private void sitOnGrass()
    {

        tvStoryText.setText("You are now sitting on the grass, but you see a dog get chased by a snake! Wha do you do? ");

        ivStory.setImageResource(R.drawable.im_superpowers_sit_on_grass);

        setAllBtnsVisible();
        btn1.setText("You stay in your spot anf mind your own business.");
        btn2.setText("You help the dog like the nice person you are.");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stayInPlace();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helpDog();
            }
        });
    }

    private void stayInPlace()
    {

        isWon = true;
        tvStoryText.setText("The mom gives you the baby, you are a parent now, congrats. You win.T");

        ivStory.setImageResource(R.drawable.im_laborday_take_baby);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void dontCallMom()
    {

        isWon = false;
        tvStoryText.setText("The baby cries, your team loses from distraction. Game over.");

        ivStory.setImageResource(R.drawable.im_laborday_baby_lose_game);


        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });



        private void flowerShop()
    {
        System.out.println("You made it inside the flower shop! You want to buy a few flowers for your house. Which ones do you want to pick?");
        System.out.println("1. Sunflowers that are in a vase \n2. Fresh cut roses");

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
        System.out.println("you pay for the flowers and you walk out safely, you win!");
        win();
    }

    private void freshRoses()
    {
        System.out.println("As soon as you touched the flowers you burned them, you lose.");
        defeat();
    }

    private void electricPowers()
    {
        System.out.println("Damn you're trying to be like Thor, that's cool! What are you trying to do?");
        System.out.println("1. Take a walk in the night \n2. Play with the little kids and scare them :O");

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
        System.out.println("You are walking in the night but there is a dark alley where the lights are out. Which path do you take?");
        System.out.println("1. Use your powers (of course) \n2. Use the flaslight of your cell phone");

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
        System.out.println("Ayye you turned on all of the lights, you win!!");
        win();
    }

    private void usePhone()
    {
        System.out.println("You decided to use your phone but it eventually dies, you lose.");
        defeat();
    }

    private void scareKids()
    {
        System.out.println("Alright, alright so you decided to scare the kids. How do you scare them though?");
        System.out.println("1. Cut off the lights \n2. Use a mask and make the lights flicker");

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
        System.out.println("All of the kids got scared and they started crying, you lose.");
        defeat();
    }

    private void maskOn()
    {
        System.out.println("They started to scream and damn you made one of them pee their pants.");
        defeat();

    }

    private void defeat()
    {
        numLives--;

        System.out.println("Aww no! You lost! :(");

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
        System.out.println("You won thats sick!! Would you like to play again???");
        System.out.println("1. yes\n2. no");
        if (option == 1)
        {
            start();
        }
    }

}