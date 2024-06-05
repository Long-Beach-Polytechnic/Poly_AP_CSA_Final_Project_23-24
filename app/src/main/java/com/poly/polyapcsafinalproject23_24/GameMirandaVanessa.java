package com.poly.polyapcsafinalproject23_24;


import android.content.Intent;
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

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);

    }

    private void start() {

    isWon = false;

        ivStory.setImageResource(R.drawable.im_mirandavanessa_title);

        tvStoryText.setText("You get to choose a superpower between three. Hope you make the right choice!");
        tvStoryText.setText("Which power are you willing to choose between these three?");

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
        ivStory.setImageResource(R.drawable.im_mirandavanessa_ice_powers);

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

        ivStory.setImageResource(R.drawable.im_mirandavanessa_ice_cream_melting);
        ivStory.setImageResource(R.drawable.im_mirandavanessa_slushy_drinks);


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

        ivStory.setImageResource(R.drawable.im_mirandavanessa_cold_ice_cream);

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

        ivStory.setImageResource(R.drawable.im_mirandavanessa_brain_freeze);

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
    private void stayInRoom()
    {

        tvStoryText.setText("You stay in your room playing with snow but you hear someone. What are you doing?");

        ivStory.setImageResource(R.drawable.im_mirandavanessa_a_bedroom);

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

        ivStory.setImageResource(R.drawable.im_mirandavanessa_sibling);

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

    private void waitAndSee()
    {
        isWon = false;
        tvStoryText.setText("It was just a ball, you win!");

        ivStory.setImageResource(R.drawable.im_mirandavanessa_just_a_ball);

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

    private void firePowers()
    {

        tvStoryText.setText("Yo you chose fire! What are you doing first?");

        ivStory.setImageResource(R.drawable.im_mirandavanessa_fire_powers);

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

        ivStory.setImageResource(R.drawable._im_mirandavanessa_sitting_on_grass);

        setAllBtnsVisible();
        btn1.setText("You stay in your spot and mind your own business.");
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
        tvStoryText.setText("The snake follows you instead and it bites you, you lose");

        ivStory.setImageResource(R.drawable.im_mirandavanessa__snake_person);

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

    private void helpDog()
    {

        isWon = false;
        tvStoryText.setText("You blast a small fire ball at the snake and killed it. You accidentally burned the dog though, you lose.");
        ivStory.setImageResource(R.drawable.im_mirandavanessa_fire_at_snake);


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
    private void flowerShop()
    {

        isWon = false;
        tvStoryText.setText("you made it inside the flower shop! You want to buy a few flowers for your house. Which ones do you pick?");

        ivStory.setImageResource(R.drawable.im_mirandavanessa_flower_shop);


        setAllBtnsVisible();
        btn1.setText("Vase flowers");
        btn2.setText("fresh flowers");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaseFlowers();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freshRoses();
            }
        });
    }

    private void vaseFlowers()
    {

        isWon = true;
        tvStoryText.setText("you pay for the flowers and you walk out safely, you win!");

        ivStory.setImageResource(R.drawable.im_mirandavanessa_flowers_in_vase);

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

    private void freshRoses()
    {

        isWon = false;
        tvStoryText.setText("As soon as you touched the flowers you burned them, you lose");

        ivStory.setImageResource(R.drawable.im_mirandavanessa__burned_flowers);

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

    private void electricPowers()
    {

        tvStoryText.setText("Damn you're trying to be like Thor, that's cool! What are you trying to tho?");

        ivStory.setImageResource(R.drawable.im_mirandavanessa_electric_powers);

        setAllBtnsVisible();
        btn1.setText("Take a walk in the night");
        btn2.setText("play with the little kids and scare them");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                walkNight();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scareKids();
            }
        });
    }

    private void walkNight()
    {

        tvStoryText.setText("You are now walking at night, but there is a dark alley where the lights are out. What other path do you take?");

        ivStory.setImageResource(R.drawable.im_mirandavanessa_using_electric_powers);
        ivStory.setImageResource(R.drawable.im_mirandavanessa_phone_flashlight);


        setAllBtnsVisible();
        btn1.setText("You just use your superpowers");
        btn2.setText("you decide to just use the flashlight of your phone");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usePower();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usePhone();
            }
        });
    }
    private void usePower()
    {

        isWon = true;
        tvStoryText.setText("ayye you turned on all of the lights, you win!!");

        ivStory.setImageResource(R.drawable.im_mirandavanessa_alley_with_lights);

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

    private void usePhone()
    {

        isWon = false;
        tvStoryText.setText("So you decided to use your phone but it eventually dies, you lost.");

        ivStory.setImageResource(R.drawable.im_mirandavanessa_dead_phone);

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
    private void scareKids()
    {

        tvStoryText.setText("Alright, so you want to scare the kids. How do you scare them?");

        ivStory.setImageResource(R.drawable.im_mirandavanessa_scaring_kids);

        setAllBtnsVisible();
        btn1.setText("Cut off the lights");
        btn2.setText("use a mask and make the lights flicker");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cutLights();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maskOn();
            }
        });

    }

    private void cutLights()
    {

        isWon = false;
        tvStoryText.setText("All of the kids are scared and they started crying, you lost");

        ivStory.setImageResource(R.drawable.im_mirandavanessa_kids_scared_by_person);

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
    private void maskOn()
    {

        isWon = true;
        tvStoryText.setText("They started to scram and wow, you even made one of them pee their pants");

        ivStory.setImageResource(R.drawable.im_mirandavanessa_kids_screaming_crying_peed);

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

    private void end()
    {
        if (isWon)
        {
            tvStoryText.setText("It looks like you would survive if you had any of these powers. Would you like to play again?");

            ivStory.setImageResource(R.drawable.im_mirandavanessa_you_won);
        }
        else
        {
            numLives--;
            String text = "You have " + numLives + " as you attempting to survive.";
            tvStoryText.setText(text);
        }

        if (numLives > 0)
        {
            btn1.setText("Play again!");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start();
                }
            });
        }
        else
        {
            tvStoryText.setText("your lives are over.");
            btn1.setText("Back to menu");

            ivStory.setImageResource(R.drawable._im_mirandavanessa_you_lost);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //startActivity(new Intent(GameLaborDayAdventure.this, MainActivity.class));
                }
            });
        }
    }

}



