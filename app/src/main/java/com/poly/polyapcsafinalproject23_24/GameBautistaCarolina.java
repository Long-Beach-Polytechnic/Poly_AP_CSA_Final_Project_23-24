package com.poly.polyapcsafinalproject23_24;

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
        tvSubtitle.setText("HOUSE Edition");

        numLives = 4;
        start();
    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
    }

    private void start()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_dailylifechores_title);

        tvStory.setText("You are in the chore life were you have three choices to decide on, what option would you like to choose for your first chore?");

        btn1.setText("Clean the restroom");
        btn2.setText("Cook dinner");
        btn3.setText("Clean the living room");


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
        ivStory.setImageResource(R.drawable.im_dailylifechores_cleanRestroom);

        tvStoryText.setText("You picked to clean the restroom and it is really dirty, but you need to clean it so you can do your hygiene!");

        setAllBtnsVisible();
        btn1.setText("cleanTub");
        btn2.setText("cleanToilet");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cleanTub();
            }
        }

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
        }
            public void onClick(View v) {

                cleanToilet();
        });
    }


    private void cleanTub()
    {
        tvStoryText.setText("You chosed to clean the tub, what cleaner would you like to use?");

        ivStory.setImageResource(R.drawable.im_dailylifechores_cleanTub);

        setAllBtnsVisible();
        btn1.setText("Usebleach");
        btn2.setText("fabuloso");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Usebleach();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fabuloso();
            }
        });

    }

    private void cleanToilet()
    {
        tvStoryText.setText("You went with cleaning the toilet which is the messiest part of the restroom what would you like to choose?" );

        ivStory.setImageResource(R.drawable.im_dailylifechores_cleanToilet);

        setAllBtnsVisible();
        btn1.setText("useHands");
        btn2.setText("useGloves");
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
        Util.clearConsole();
        System.out.println("\nYou want to use the safe cleaner, but it did not make the toilet shine, sucks");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }

    private void useFabuloso()
    {
        isWon = false;
        tvStoryText.setText("You chose the wrong cleaner and you just ruined the toilet, not great");

        ivStory.setImageResource(R.drawable.im_dailylifechores_useFabuloso);

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

        ivStory.setImageResource(R.drawable.im_dailylifechores_useGloves);

        setAllBtnsVisible();
        btn1.setText("newGloves");
        btn2.setText("dirtyGloves");
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
        Util.clearConsole();
        System.out.println("\nYou decided to go and use your hands to clean the toilet, but your hands got so much germs and you gave up, your no longer allowed to clean the restroom, you suck loser!! ");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }

    private void newGloves()
    {
        Util.clearConsole();
        System.out.println("\nYayyy!!! you decided to go get new gloves and  you are ready to clean the rest of the restroom, you win");
        Util.pauseConsole();
        Util.clearConsole();
    }

    private void dirtyGloves()
    {
        Util.clearConsole();
        System.out.println("DANGGGG, you were to lazy to go get new gloves now you cant clean the rest of the toilet because the other gloves are too dirty");
        Util.pauseConsole();
        defeat();
    }

    // COOK DINNER
    private void cookDinner()
    {
        Util.clearConsole();
        System.out.println("\nCooking dinner is not easy but you are willing to give it a try for one of your chores, what are you going to cook first?");
        System.out.println("1. Make sushi\n2. Cook Chicken");
        int choice = Util.enterInt(1,2);

        if (choice ==1)
        {
            makeSushi();
        }
        else if (choice ==2)
        {
            cookChicken();
        }
    }

    private void makeSushi()
    {
        Util.clearConsole();
        System.out.println("\nMaking sushi can be a bit hard, you do not really like raw things so you have to be careful in making the sushi the correct way");
        System.out.println("1. Use veggies\n2. Use salmon");
        int choice = Util.enterInt(1,2);

        if (choice ==1)
        {
            useVeggies();
        }
        else if (choice ==2)
        {
            useSalmon();
        }
    }

    private void useVeggies()
    {
        Util.clearConsole();
        System.out.println("\nAMAZINGGGG, you were hungry and made no mistakes, you can eat the suhi already");
        Util.pauseConsole();
        Util.clearConsole();
    }

    private void useSalmon()
    {
        System.out.println("\nYou chose to add salmon on your sushi now but remembering you are alergic to raw things what are you going to do next?");
        System.out.println("1. leave salmon raw\n2. cook the salmon");
        int choice = Util.enterInt(1,2);

        if (choice ==1)
        {
            salmonRaw();
        }
        else if (choice ==2)
        {
            cookSalmon();
        }
    }

    private void salmonRaw()
    {
        Util.clearConsole();
        System.out.println("\nohhh noooo, you chose the raw salmon and you ate it all raw, you got sick and made a bad choice");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }

    private void cookSalmon()
    {
        System.out.println("\nYou ate good today by cooking the right way, you know how to make dinner now and you can prove it to your family, YOU WINNNN");
        Util.pauseConsole();
        Util.clearConsole();
    }

    private void cookChicken()
    {
        Util.clearConsole();
        System.out.println("\nYou want to cook chicken but not sure how to make it");
        System.out.println("1. Leave the chicken plain\n2. Season the chicken");
        int choice = Util.enterInt(1,2);

        if (choice ==1)
        {
            chickenPlain();
        }
        else if (choice ==2)
        {
            seasonChicken();
        }
    }

    private void chickenPlain()
    {
        Util.clearConsole();
        System.out.println("\nWOWWWW this does not have any flavor your chicken does not taste like nothing and its not good YUCK!");
        Util.pauseConsole();
        defeat();
    }

    private void seasonChicken()
    {
        Util.clearConsole();
        System.out.println("\nYou went with seasoning the chicken so it can taste good, once seasoning the chicken how would you like to cook it?");
        System.out.println("1.Cook the chicken fully\n2. Cook the chicken half way");
        int choice = Util.enterInt(1,2);

        if (choice ==1)
        {
            cookChickenFully();
        }
        else if (choice ==2)
        {
            cookChickenHalf();
        }
    }

    private void cookChickenFully()
    {
        Util.clearConsole();
        System.out.println("Its amazing that you cooked the chicken correctly but it would have been better if you over cooked it a bit so it can come out crispy and crunchy");
        Util.pauseConsole();
        defeat();
    }

    private void cookChickenHalf()
    {
        Util.clearConsole();
        System.out.println("\nThe chicken was left half raw and we have to remeber that we do not like raw things, you got disgusted and threw the chicken, you ruined tonights dinner");
        Util.pauseConsole();
        defeat();
    }

    //CLEAN THE LIVING ROOM
    private void cleanTheLivingRoom()
    {
        Util.clearConsole();
        System.out.println("\nCleaning the living roombecause it is the biggest part of the house and it could get pretty messy where would you like to start off cleaning?");
        System.out.println("1. CLean the drawer\n2. Clean the floor");
        int choice = Util.enterInt(1,2);

        if (choice ==1)
        {
            cleanDrawer();
        }
        else if (choice ==2)
        {
            cleanFloor();
        }
    }

    private void cleanDrawer()
    {
        Util.clearConsole();
        System.out.println("\nYou are now cleaning the drawers but having a hard time and not sure how to start off");
        System.out.println("1. Clean the drawer however\n2. Empty the drawer out");
        int choice = Util.enterInt(1,2);

        if (choice ==1)
        {
            cleanDrawerHowever();
        }
        else if (choice ==2)
        {
            emptyDrawer();
        }
    }

    private void cleanDrawerHowever()
    {
        Util.clearConsole();
        System.out.println("\nBad choice you decided to be lazy and clean the drawer with important paper inside the drawer and unfortunately you ruined them");
        Util.pauseConsole();
        defeat();
    }

    private void emptyDrawer()
    {
        Util.clearConsole();
        System.out.println("\nYou emptied all the drawer, you are ready to clean the drawer or you have other choices you can choose how you want to clean the restroom");
        System.out.println("1. Clean evverthing\n2. Clean the drawers half way");
        int choice = Util.enterInt(1,2);

        if (choice ==1)
        {
            cleanDrawersCompletly();
        }
        else if (choice ==2)
        {
            cleanDrawerHalfWay();
        }
    }

    private void cleanDrawersCompletly()
    {
        Util.clearConsole();
        System.out.println("\nYou have cleaned all the drawers and have left them shining, Once you are done cleaning all the drawers you can put everything back to its place, you have accomplished");
        Util.pauseConsole();
        Util.clearConsole();
    }

    private void cleanDrawerHalfWay()
    {
        Util.clearConsole();
        System.out.println("\nThis is a bad decision to clean it half way but you made the choice and its very disapointing, you definetly do not know how to clean");
        Util.pauseConsole();
        defeat();
    }

    private void cleanFloor()
    {
        Util.clearConsole();
        System.out.println("\nCLeaning the floor can be pretty easy but it canalso get messy really quickyly would you like to start of by choosing?");
        System.out.println("1. Pick up some trash\n2. Pick up all the trash");
        int choice = Util.enterInt(1,2);

        if (choice ==1)
        {
            pickUpSomeTrash();
        }
        else if (choice ==2)
        {
            pickUpEverything();
        }
    }

    private void pickUpSomeTrash()
    {
        Util.clearConsole();
        System.out.println("\nYes cleaning can be somewhat easy, but not picking up everything from the floor can make it a bit tricky and that what you chose, you are not ready to clean up yet until you choose to do the right thing");
        Util.pauseConsole();
        defeat();
    }

    private void pickUpEverything()
    {
        Util.clearConsole();
        System.out.println("\nYou are doing great so far by picking up everything which will make cleaning a bit easier and faster once you are done cleaning the floor you are free to do whatever you want, CONGRADULATIONSSSS!!!!");
        Util.pauseConsole();
        Util.clearConsole();
    }


    private void defeat()
    {
        numLives--;
        Util.clearConsole();
        System.out.println("You lose");
        Util.pauseConsole();

        if(numLives > 0)
        {
            start();
        }
        else if(numLives == 0)
        {
            System.out.println("Play again?");
        }
    }

}