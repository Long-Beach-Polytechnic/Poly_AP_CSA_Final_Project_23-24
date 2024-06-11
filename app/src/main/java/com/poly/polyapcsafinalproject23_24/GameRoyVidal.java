package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;


public class GameRoyVidal extends GameActivity {

    //instance variables
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;

    //   variables you plan to use throughout the adventure
    private int numLives;

    //private Player player; (optional)
    private void setAllBtnsVisible() {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);

    }


    public void run() {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("VACATION");
        tvSubtitle.setText("PLANNER");

        ivStory.setImageResource(R.drawable.im_vidalroy_enterhotel);

        //initialize number of lives
        numLives = 5;


        //display project title and description
        tvStoryText.setText("You and your friends take a trip to the amazon. There are many wrong paths, but the right path will change your life!");
        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });

    }

    private void start() {
        //start adventure here _________________________

        ivStory.setImageResource(R.drawable.im_vidalroy_enterhotel);
        tvStoryText.setText("Welcome to the amazon vacation activity planner. Where would you like to go first ?");

        setAllBtnsVisible();
        btn1.setText("Stay In Hotel");
        btn2.setText("Go swimming");
        btn3.setText("Go explore");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stayInHotel();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSwimming();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goExplore();
            }
        });

    }
    //PATHS
    //OPTION 1 ____________________________________


    private void stayInHotel() {

        tvStoryText.setText("What would you like to do inside the hotel?");

        setAllBtnsVisible();
        btn1.setText("Leave room");
        btn2.setText("Stay In Room");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leaveRoom();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stayInRoom();
            }
        });
    }

    private void leaveRoom() {
        ivStory.setImageResource(R.drawable.im_vidalroy_inhotelroom);

        tvStoryText.setText("What would you rather do, go outside or stay inside the lobby ?");

        setAllBtnsVisible();
        btn1.setText("inside");
        btn2.setText("outside");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inside();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outside();
            }
        });
    }

    private void inside() {

        ivStory.setImageResource(R.drawable.im_vidalroy_insidelobby);
        tvStoryText.setText("What would you rather do inside the lobby ?");

        setAllBtnsVisible();
        btn1.setText("Play Eight Ball");
        btn2.setText("Play Black Jack");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eightBall();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blackJack();
            }
        });
    }

    private void outside() {
        ivStory.setImageResource(R.drawable.im_vidalroy_outsidelobby);

        tvStoryText.setText("What would you rather do outside ?");

        setAllBtnsVisible();
        btn1.setText("Play Basketball");
        btn2.setText("Play Football");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBasketball();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playFootball();
            }
        });
    }

    private void stayInRoom() {
        ivStory.setImageResource(R.drawable.im_vidalroy_stayinroom);

        tvStoryText.setText("What would you rather do, go outside or stay inside the lobby ?");

        setAllBtnsVisible();
        btn1.setText("Take a Nap");
        btn2.setText("Watch Tv");
        btn3.setText("Talk to Gf");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takeNap();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchTv();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                talkGf();
            }
        });
    }

    private void talkGf() {
        ivStory.setImageResource(R.drawable.im_vidalroy_talkgf);

        isWon = false;
        tvStoryText.setText("You and your crazy Girlfriend get into an argument." +
                " She shoots you because she is crazy. Game over.");


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

    private void eightBall() {
        ivStory.setImageResource(R.drawable.im_vidalroy_eightball);

        isWon = false;
        tvStoryText.setText("You beat everyone at 8ball, but start a bar fight for talking trash. " +
                "You are thrown out");


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

    private void blackJack() {
        ivStory.setImageResource(R.drawable.im_vidalroy_blackjack);

        isWon = false;
        tvStoryText.setText("You get caught cheating in blackjack and are thrown out");


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


    private void playBasketball() {
        ivStory.setImageResource(R.drawable.im_vidalroy_basketball);

        isWon = false;
        tvStoryText.setText("You play basketball and you get your ankles broken by lebron james" +
                "You can't continue your vacation");


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

    private void playFootball() {
        ivStory.setImageResource(R.drawable.im_vidalroy_football);

        isWon = false;
        tvStoryText.setText("You play football and get hit-sticked by Raw Lewis. " +
                "You have a concussion. Game over.");


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

    private void takeNap() {
        ivStory.setImageResource(R.drawable.im_vidalroy_nap);

        isWon = false;
        tvStoryText.setText("You took too much melatonin and you are in a coma now. Game over.");


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

    private void watchTv() {
        ivStory.setImageResource(R.drawable.im_vidalroy_watchtv);

        isWon = false;
        tvStoryText.setText("The burgers weren't cooked correctly, you now " +
                "have a stomach virus. Game over.");


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

    //OPTION 2 ________________________________________________________

    private void goSwimming() {
        ivStory.setImageResource(R.drawable.im_vidalroy_goswim);
        tvStoryText.setText("Where would you like to go swimming ?");

        setAllBtnsVisible();
        btn1.setText("In Hotel");
        btn2.setText("Amazon River");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inHotel();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amazonRiver();
            }
        });
    }

    private void inHotel() {
        ivStory.setImageResource(R.drawable.im_vidalroy_inhotel);
        tvStoryText.setText("Which pool would you like to swim in  ?");

        setAllBtnsVisible();
        btn1.setText("Infinity Pool");
        btn2.setText("Main Pool");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infinityPool();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPool();
            }
        });
    }

    private void infinityPool() {
        ivStory.setImageResource(R.drawable.im_vidalroy_ininiftypool);
        tvStoryText.setText("What time would you like to go swimming ?");

        setAllBtnsVisible();
        btn1.setText("Eleven Am");
        btn2.setText("Ten Pm");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elevenAm();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tenPm();
            }
        });
    }

    private void mainPool() {
        ivStory.setImageResource(R.drawable.im_vidalroy_mainpool);
        tvStoryText.setText("What time would you like to go swimming ?");

        setAllBtnsVisible();
        btn1.setText("Twelve Pm");
        btn2.setText("Nine Pm");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twelvePm();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ninePm();
            }
        });
    }

    private void amazonRiver() {
        ivStory.setImageResource(R.drawable.im_vidalroy_amazonriver);
        tvStoryText.setText("What time would you like to go swimming ?");

        setAllBtnsVisible();
        btn1.setText("Ten Am");
        btn2.setText("One Pm");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tenAm();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onePm();
            }
        });
    }

    private void elevenAm() {
        ivStory.setImageResource(R.drawable.im_vidalroy_elevenam_infintypool);
        isWon = false;
        tvStoryText.setText("There is too many people in the pool at this time and you " +
                "fall over the edge. Game over.");


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

    private void tenPm() {
        ivStory.setImageResource(R.drawable.im_vidalroy_tenpm_inifity);
        isWon = false;
        tvStoryText.setText("people steal your items and you have no money to survive. " +
                "It was to dark to see anything. Game over.");


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

    private void twelvePm() {
        ivStory.setImageResource(R.drawable.im_vidalroy_twelvepm_mainpool);
        isWon = false;
        tvStoryText.setText("There was to many people in the pool and you got stuck " +
                "underwater and drowned Game over.");


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

    private void ninePm() {
        ivStory.setImageResource(R.drawable.im_vidalroy_ninepm_mainpool);
        isWon = false;
        tvStoryText.setText("You drown because there is no lifeguard on duty this late Game over.");


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

    private void tenAm() {
        ivStory.setImageResource(R.drawable.im_vidalroy_tenam_amazonriver);
        isWon = false;
        tvStoryText.setText("Hunters rob you on the way to the river" +
                " Game over.");


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

    private void onePm() {
        ivStory.setImageResource(R.drawable.im_vidalroy_onepm_amazonriver);
        isWon = false;
        tvStoryText.setText("You get attacked by piranhas in the amazon river. Game over.");


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

    //OPTION 3 __________________________________________________________________

    private void goExplore() {
        ivStory.setImageResource(R.drawable.im_vidalroy_goexplore);

        tvStoryText.setText("Where would you like to explore?");

        setAllBtnsVisible();
        btn1.setText("Go To Town");
        btn2.setText("Go To River");
        btn3.setText("Go To Zoo");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTown();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRiver();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToZoo();
            }
        });
    }

    private void goToTown() {
        ivStory.setImageResource(R.drawable.im_vidalroy_gototown);

        tvStoryText.setText("Do you want to go shopping or go to the amusement park ?");

        setAllBtnsVisible();
        btn1.setText("Go Shop");
        btn2.setText("Go Amusement");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goShop();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goAmusement();
            }
        });
    }

    private void goShop() {
        ivStory.setImageResource(R.drawable.im_vidalroy_goshop);

        tvStoryText.setText("How much money would you like to bring to town ?");

        setAllBtnsVisible();
        btn1.setText("Bring Extra");
        btn2.setText("Bring Less");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bringExtra();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bringLess();
            }
        });
    }

    private void goAmusement() {
        ivStory.setImageResource(R.drawable.im_vidalroy_goamusement);

        tvStoryText.setText("Do you want to get food at the Amusement park ?");

        setAllBtnsVisible();
        btn1.setText("Get Food");
        btn2.setText("No Food");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFood();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noFood();
            }
        });
    }

    private void getFood() {
        ivStory.setImageResource(R.drawable.im_vidalroy_getfood_amuse);

        tvStoryText.setText("How much food do you want to eat ?");

        setAllBtnsVisible();
        btn1.setText("Get Combo");
        btn2.setText("Get Snack");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCombo();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSnack();
            }
        });
    }

    private void noFood() {
        ivStory.setImageResource(R.drawable.im_vidalroy_nofood_amuse);

        tvStoryText.setText("Do you still want something to drink or no?");

        setAllBtnsVisible();
        btn1.setText("Get Drink");
        btn2.setText("Get No Drink");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDrink();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNoDrink();
            }
        });
    }

    private void goToZoo() {
        ivStory.setImageResource(R.drawable.im_vidalroy_gotozoo);

        tvStoryText.setText("Do you want to get food at the zoo or go straight to the bird exhibit");

        setAllBtnsVisible();
        btn1.setText("Get Zoo Food");
        btn2.setText("Go To Birds");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getZooFood();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBirds();
            }
        });
    }

    private void getZooFood() {
        ivStory.setImageResource(R.drawable.im_vidalroy_getzoofood);

        tvStoryText.setText("Do you want to eat a chicken sandwich or have a burger?");

        setAllBtnsVisible();
        btn1.setText("Get Chicken");
        btn2.setText("Get Burger");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChicken();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getBurger();
            }
        });
    }


    private void goToRiver() {
        ivStory.setImageResource(R.drawable.im_vidalroy_gotoriver);

        tvStoryText.setText("Would you rather follow the trail ahead or go back?");

        setAllBtnsVisible();
        btn1.setText("Follow The Trail");
        btn2.setText("Go Back");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                followTrail();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });
    }

    private void followTrail() {
        ivStory.setImageResource(R.drawable.im_vidalroy_followtrail);

        tvStoryText.setText("Would you rather go on a paid tour of the rainforest or go on your own?");

        setAllBtnsVisible();
        btn1.setText("On Your Own");
        btn2.setText("Go On Tour");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onYourOwn();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goOnTour();
            }
        });
    }

    private void getCombo() {
        ivStory.setImageResource(R.drawable.im_vidalroy_getcombo);

        isWon = false;
        tvStoryText.setText("You eat too much and throw up on the roller coaster. " +
                "You are sick and can't continue your vacation");


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

    private void getSnack() {
        ivStory.setImageResource(R.drawable.im_vidalroy_nofood_amuse);

        isWon = false;
        tvStoryText.setText("You did not have enough food and starve to death. " +
                "You can't continue your vacation.");


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

    private void getDrink() {
        ivStory.setImageResource(R.drawable.im_vidalroy_getdrinkamuse);

        isWon = false;
        tvStoryText.setText("Someone Spiked your drink and you pass out." +
                " You can't continue your vacation. Game over.");


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

    private void getNoDrink() {
        ivStory.setImageResource(R.drawable.im_vidalroy_getnodrink_amuse);

        isWon = false;
        tvStoryText.setText("You have not been drinking enough water and " +
                "have died of thirst. You can't continue your vacation.. Game over.");


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

    private void goToBirds() {
        ivStory.setImageResource(R.drawable.im_vidalroy_gotobirds);

        isWon = false;
        tvStoryText.setText("A giant bird bird picks you up and drops " +
                "you down a cliff. You die and can't continue your vacation Game over.");


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

    private void getChicken() {
        ivStory.setImageResource(R.drawable.im_vidalroy_getchicken_zoo);

        isWon = false;
        tvStoryText.setText("You get attacked by a hungry fox and loose your food. Game over.");


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

    private void getBurger() {
        ivStory.setImageResource(R.drawable.im_vidalroy_getburger_zoo);

        isWon = false;
        tvStoryText.setText("Lion escapes its cage and attacks you for your burger." +
                " He kills you and you can't continue your vacation. Game over.");


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

    private void goBack() {
        ivStory.setImageResource(R.drawable.im_vidalroy_goback);

        isWon = false;
        tvStoryText.setText("Your friends call you scared and leave you in the " +
                "middle of the forest. You are now lost and cant continue your" +
                " vacation Game over.");


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


    private void bringExtra() {
        ivStory.setImageResource(R.drawable.im_vidalroy_bringextra);

        isWon = false;
        tvStoryText.setText("You get robbed for all of your money. " +
                "You can't continue your vacation. Game over.");


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

    private void bringLess() {
        ivStory.setImageResource(R.drawable.im_vidalroy_bringless);

        isWon = false;
        tvStoryText.setText(" You run out of money and cant afford the bus home. " +
                "You are stranded. You can't continue your vacation. Game over.");


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


    private void goOnTour() {
        ivStory.setImageResource(R.drawable.im_vidalroy_goontour);

        isWon = false;

        tvStoryText.setText("Your tour gets robbed by an amazon village with guns. " +
                "You get shot for not complying. You can't continue your vacation. Game over.");


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

    private void onYourOwn() {
        ivStory.setImageResource(R.drawable.im_vidalroy_onyourown);

        isWon = true;

        tvStoryText.setText("Your going the right way...");


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



  /*
  //lose a life


  //numLives--;

  //clear console, display text, etc

  //System.out.println(...)

  //determine if player gets to play again
  if (numLives > 0)
  {
    //if you still have lives, return to start()
    start();
  }
  else
  {
    //print game over message
  }
  */

    private void end() {
        if (isWon) {
            ivStory.setImageResource(R.drawable.im_vidalroy_win);
            tvStoryText.setText("You win, you have found hidden treasure" +
                    " on your hike and are now the richest person alive. You buy a private jet and fly home.");

        } else {
            numLives--;
            String text = "You made too many wrong decisions! Either try again or quit You have " + numLives + " Times that you can be rescued";
            tvStoryText.setText(text);
        }

        if (numLives > 0) {
            ivStory.setImageResource(R.drawable.im_vidalroy_tryagain);

            btn1.setText("Play again you woke up back in your room!");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start();
                }
            });
        } else {
            ivStory.setImageResource(R.drawable.im_vidalroy_gameover);

            tvStoryText.setText("No one can save you anymore. Game over");
            btn1.setText("Back to menu");


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(GameRoyVidal.this, MainActivity.class));
                }
            });


        }
    }
}