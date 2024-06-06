package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameBautistaCarolina extends GameActivity
{

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
    private boolean isWon;
    private int numLives;


    public void run()
    {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);


        tvTitle.setText("DAILY LIFE CHORES");
        tvSubtitle.setText("HOUSE EDITION");

        numLives = 4;
        start();
    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.INVISIBLE);

    }

    private void start()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_bautistacarolina_title);
        isWon = false;

        tvStoryText.setText("You are in the chore life were you have three choices to decide on, what option would you like to choose for your first chore?");

        btn1.setText("Clean the restroom");
        btn2.setText("Cook dinner");
        btn3.setText("Clean the living room");
        btn4.setVisibility(View.INVISIBLE);




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cleanRestroom();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cookDinner();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            cleanTheLivingRoom();
        }
    });

    }




    //CLEAN THE RESTROOM
    private void cleanRestroom()
    {
        ivStory.setImageResource(R.drawable.im_bautistacarolina_cleaningrestroom);

        tvStoryText.setText("You picked to clean the restroom and it is really dirty, but you need to clean it so you can do your hygiene!");

        setAllBtnsVisible();
        btn1.setText("Clean tub");
        btn2.setText("Clean toilet");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cleanTub();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cleanToilet();
            }
        });

    }


    private void cleanTub()
    {
        tvStoryText.setText("You chose to clean the tub, what cleaner would you like to use?");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_cleaningthetub);

        setAllBtnsVisible();
        btn1.setText("Use bleach");
        btn2.setText("Use fabuloso");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { useBleach();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                useFabuloso();
            }
        });

    }

    private void cleanToilet()
    {
        tvStoryText.setText("You went with cleaning the toilet which is the messiest part of the restroom what would you like to choose?" );

        ivStory.setImageResource(R.drawable.im_bautistacarolina_cleanthetoilet);

        setAllBtnsVisible();
        btn1.setText("Use hands");
        btn2.setText("Use gloves");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                useHands();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                useGloves();
            }
        });
    }

    private void useBleach()
    {
        tvStoryText.setText("You want to use the safe cleaner, but it did not make the toilet shine, sucks");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_usebleach);

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

    private void useFabuloso()
    {
        isWon = false;
        tvStoryText.setText("You chose the wrong cleaner and you just ruined the toilet, not great");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_usefabuloso);

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

    private void useGloves()
    {
        tvStoryText.setText("You chose to use gloves to clean the toilet, but while using them they go diry, what would you like to do now?" );

        ivStory.setImageResource(R.drawable.im_bautistacarolina_usegloves);

        setAllBtnsVisible();
        btn1.setText("New gloves");
        btn2.setText("Dirty gloves");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                useGloves();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dirtyGloves();
            }
        });
    }

    private void useHands()
    {
        isWon = false;
        tvStoryText.setText("You decided to go and use your hands to clean the toilet, but your hands got so much germs and you gave up, your no longer allowed to clean the restroom, you suck loser!!");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_usehands);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end ();
            }
        });
    }

    private void newGloves()
    {

        isWon = true;
        tvStoryText.setText("Yayyy!!! you decided to go get new gloves and  you are ready to clean the rest of the restroom, you win");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_newgloves);

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

    private void dirtyGloves()
    {
        isWon = false;
        tvStoryText.setText("DANGGGG, you were to lazy to go get new gloves now you cant clean the rest of the toilet because the other gloves are too dirty");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_dirtygloves);

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

    // COOK DINNER
    private void cookDinner()
    {
        tvStoryText.setText("nCooking dinner is not easy but you are willing to give it a try for one of your chores, what are you going to cook first?\");System.out.println(\"1. Make sushi\\n2. Cook Chicken?");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_cookdinner);

        setAllBtnsVisible();
        btn1.setText("Make sushi");
        btn2.setText("Cook chicken");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeSushi();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {cookChicken();
            }
        });
    }

    private void makeSushi()
    {
        tvStoryText.setText("Making sushi can be a bit hard, you do not really like raw things so you have to be careful in making the sushi the correct way");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_makesushi);

        setAllBtnsVisible();
        btn1.setText("Use veggies");
        btn2.setText("Use salmon");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                useVeggies();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {useSalmon();
            }
        });
    }

    private void useVeggies()
    {
        isWon = true;
        tvStoryText.setText("AMAZINGGGG, you were hungry and made no mistakes, you can eat the suhi already");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_useveggies);

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

    private void useSalmon()
    {
        tvStoryText.setText("You chose to add salmon on your sushi now but remembering you are alergic to raw things what are you going to do next?");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_usesalmon);

        setAllBtnsVisible();
        btn1.setText("Salmon raw");
        btn2.setText("Cook salmon");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {salmonRaw();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {cookSalmon();
            }
        });
    }

    private void salmonRaw()
    {
        isWon = false;
        tvStoryText.setText("ohhh noooo, you chose the raw salmon and you ate it all raw, you got sick and made a bad choice");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_salmonraw);

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

    private void cookSalmon()
    {
        isWon = true;
        tvStoryText.setText("You ate good today by cooking the right way, you know how to make dinner now and you can prove it to your family, YOU WINNNN");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_cooksalmon);

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

    private void cookChicken()
    {
        tvStoryText.setText("You want to cook chicken but not sure how to make it" );

        ivStory.setImageResource(R.drawable.im_bautistacarolina_cookchicken);

        setAllBtnsVisible();
        btn1.setText("Chicken plain");
        btn2.setText("Season chicken");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chickenPlain();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seasonChicken();
            }
        });
    }

    private void chickenPlain()
    {
        isWon = false;
        tvStoryText.setText("WOWWWW this does not have any flavor your chicken does not taste like nothing and its not good YUCK!");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_chickenplain);

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

    private void seasonChicken()
    {
        tvStoryText.setText("You went with seasoning the chicken so it can taste good, once seasoning the chicken how would you like to cook it?" );

        ivStory.setImageResource(R.drawable.im_bautistacarolina_seasonchicken);

        setAllBtnsVisible();
        btn1.setText("Cook chicken fully");
        btn2.setText("Cook chicken half");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cookChickenFully();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cookChickenHalf();
            }
        });
    }

    private void cookChickenFully()
    {
        isWon = false;
        tvStoryText.setText("Its amazing that you cooked the chicken correctly but it would have been better if you over cooked it a bit so it can come out crispy and crunchy");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_cookchickenfully);

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

    private void cookChickenHalf()
    {
        isWon = false;
        tvStoryText.setText("The chicken was left half raw and we have to remeber that we do not like raw things, you got disgusted and threw the chicken, you ruined tonights dinner");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_cookchickenhalfway);

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

    //CLEAN THE LIVING ROOM
    private void cleanTheLivingRoom()
    {
        tvStoryText.setText("Cleaning the living roombecause it is the biggest part of the house and it could get pretty messy where would you like to start off cleaning?" );

        ivStory.setImageResource(R.drawable.im_bautistacarolina_cleanlivingroom);

        setAllBtnsVisible();
        btn1.setText("Clean drawer");
        btn2.setText("Clean floor");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanDrawer();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanFloor();
            }
        });
    }

    private void cleanDrawer()
    {
        tvStoryText.setText("You are now cleaning the drawers but having a hard time and not sure how to start off" );

        ivStory.setImageResource(R.drawable.im_bautistacarolina_cleandrawer);

        setAllBtnsVisible();
        btn1.setText("Clean drawer however");
        btn2.setText("Empty drawer");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanDrawerHowever();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {emptyDrawer();
            }
        });
    }

    private void cleanDrawerHowever()
    {
        isWon = false;
        tvStoryText.setText("Bad choice you decided to be lazy and clean the drawer with important paper inside the drawer and unfortunately you ruined them");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_cleandrawerhowever);

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

    private void emptyDrawer()
    {
        tvStoryText.setText("You are now cleaning the drawers but having a hard time and not sure how to start off" );

        ivStory.setImageResource(R.drawable.im_bautistacarolina_empty_drawer);

        setAllBtnsVisible();
        btn1.setText("Clean drawer completly");
        btn2.setText("Clean drawer half way");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanDrawersCompletly();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanDrawerHowever();
            }
        });
    }

    private void cleanDrawersCompletly()
    {
        isWon = true;
        tvStoryText.setText("You have cleaned all the drawers and have left them shining, Once you are done cleaning all the drawers you can put everything back to its place, you have accomplished");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_cleandrawerscompletely);

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

    private void cleanDrawerHalfWay()
    {
        isWon = false;
        tvStoryText.setText("This is a bad decision to clean it half way but you made the choice and its very disapointing, you definetly do not know how to clean");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_cleandrawerhalfway);

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

    private void cleanFloor()
    {
        tvStoryText.setText("CLeaning the floor can be pretty easy but it canalso get messy really quickyly would you like to start of by choosing?" );

        ivStory.setImageResource(R.drawable.im_bautistacarolina_cleanfloor);

        setAllBtnsVisible();
        btn1.setText("Pick up some trash");
        btn2.setText("Pick up everything");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickUpSomeTrash();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickUpEverything();
            }
        });
    }

    private void pickUpSomeTrash()
    {
        isWon = false;
        tvStoryText.setText("Yes cleaning can be somewhat easy, but not picking up everything from the floor can make it a bit tricky and that what you chose, you are not ready to clean up yet until you choose to do the right thing");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_pickupsometrash);

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

    private void pickUpEverything()
    {
        isWon = true;
        tvStoryText.setText("You are doing great so far by picking up everything which will make cleaning a bit easier and faster once you are done cleaning the floor you are free to do whatever you want, CONGRADULATIONSSSS!!!!");

        ivStory.setImageResource(R.drawable.im_bautistacarolina_clean_everything);

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


    private void end()
    {
        if (isWon)
        {
            tvStoryText.setText("Cleaning has to be done again You can go again to redo your chores");

            ivStory.setImageResource(R.drawable.im_bautistacarolina_end);
        }
        else
        {
            numLives--;
            String text = "You wasted an entire Day trying to do chores. You have " + numLives + " years remaining";
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
            tvStoryText.setText("Chore life is over. Permenant Game over.");
            btn1.setText("Back to Home entrance");

            ivStory.setImageResource(R.drawable.im_bautistacarolina_over);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   startActivity(new Intent(GameBautistaCarolina.this, MainActivity.class));
                }
            });
        }
    }


}