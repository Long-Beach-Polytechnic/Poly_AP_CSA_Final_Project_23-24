package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GamePerezAdan extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private int numLives;
    //private Player player; (optional)
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;


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

        tvTitle.setText("LIFE AFTER GRADUATION");
        tvSubtitle.setText("");


        numLives = 5;
        start();
    }


    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }

    private void start()
    {
        tvTitle.setText("GRADUATED");
        tvSubtitle.setText("HIGH SCHOOL EDITION");
        ivStory.setImageResource(R.drawable.im_perezadan_graduated_high_school);

        String text = "We graduated high school, lets go!" +
                "Where would you like to go?";

        tvStoryText.setText(text);

        setAllBtnsVisible();

        btn1.setText("College");
        btn2.setText("Get a job");
        btn3.setText("Stay at parent's house");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                college();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getJob();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stayAtParents();
            }
        });

    }

    private void college()
    {

        ivStory.setImageResource(R.drawable.im_perezadan_going_to_college);
        tvStoryText.setText("What are you doing in your classes?");

        setAllBtnsVisible();
        btn1.setText("You are doing very well");
        btn2.setText("You are struggling");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                veryWell();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                struggle();

            }
        });
    }

    private void veryWell()
    {


        ivStory.setImageResource(R.drawable.im_perezadan_doing_well);
        tvStoryText.setText("Do you keep on doing well in your classes?");

        setAllBtnsVisible();
        btn1.setText("Keep doing well");
        btn1.setText("Lose motivation");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                graduate();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loseMotivation();
            }
        });
    }

    private void loseMotivation()
    {

        ivStory.setImageResource(R.drawable.im_perezadan_lose_motivation);
        tvStoryText.setText("You are losing motivation and struggling");

        setAllBtnsVisible();
        btn1.setText("Keep doing well");
        btn2.setText("Lose motivation");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                veryWell();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                struggle();
            }
        });
    }



    private void graduate()
    {

        ivStory.setImageResource(R.drawable.im_perezadan_graduate_from_college);
        tvStoryText.setText("Congrats, you graduated! What do you want to do");

        setAllBtnsVisible();
        btn1.setText("Work for a successful company");
        btn2.setText("Get a normal job");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //put image here
                //ivStory.setImageResource(R.drawable.im_hotdog_0);

                tvStoryText.setText("You now work for a successful company and get paid very good, YOU WIN!!!");

                end();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getJob();
            }
        });

    }

    private void struggle()
    {
        ivStory.setImageResource(R.drawable.im_perezadan_struggle_in_classes);
        tvStoryText.setText("You are struggling and thinking of dropping out...");

        setAllBtnsVisible();
        btn1.setText("Keep trying");
        btn2.setText("Drop out");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                keepTrying();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dropOut();
            }
        });

    }

    private void keepTrying()
    {
        ivStory.setImageResource(R.drawable.im_perezadan_keep_trying);
        tvStoryText.setText("You keep on trying does it end up paying off?");

        setAllBtnsVisible();
        btn1.setText("Yes, you go on to graduate");
        btn2.setText("No, you end up dropping out");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               graduate();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dropOut();
            }
        });


    }


    private void dropOut()
    {
        ivStory.setImageResource(R.drawable.im_perezadan_dropped_out);
        tvStoryText.setText("You dropped out of college, what do you do now?");

        setAllBtnsVisible();
        btn1.setText("Get a job");
        btn2.setText("Stay at parent's house");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getJob();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stayAtParents();
            }
        });

    }

    private void getJob()
    {
        ivStory.setImageResource(R.drawable.im_perezadan_getting_job);
        tvStoryText.setText("Where would you like to work at?");

        setAllBtnsVisible();
        btn1.setText("A stay at home job that pays good money");
        btn2.setText("McDonald's");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeJob();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                badJob();
            }
        });

    }

    private void homeJob()
    {

        ivStory.setImageResource(R.drawable.im_perezadan_home_job);
        tvStoryText.setText("You get a big opportunity at the job do you take it?");

        setAllBtnsVisible();
        btn1.setText("Yes, and start to get paid millions");
        btn2.setText("No, but continue to make good money");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               bigOpportunity();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvStoryText.setText("You get paid good money but this is not the right choice, YOU LOSE!!!");

                end();
            }
        });

    }

    private void badJob()
    {

        ivStory.setImageResource(R.drawable.im_perezadan_bad_job);
        tvStoryText.setText("You start your job but things aren't looking the best what do you do?");

        setAllBtnsVisible();
        btn1.setText("Get fired for being lazy on the job");
        btn2.setText("Quit, and go live with your parents");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jobOrLazy();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stayAtParents();
            }
        });

    }

    private void bigOpportunity()
    {

        ivStory.setImageResource(R.drawable.im_perezadan_big_opportunity);
        tvStoryText.setText("You took it and make a lot of money, but are you smart with it?");

        setAllBtnsVisible();
        btn1.setText("Yes, and you life live to its best");
        btn2.setText("No, gamble all your money away");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvStoryText.setText("You retire early with a lot of money in your bank, YOU WIN!!!");

                end();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stayAtParents();
            }
        });

    }

    private void jobOrLazy()
    {

        ivStory.setImageResource(R.drawable.im_perezadan_job_or_lazy);
        tvStoryText.setText("You are fired for being lazy, do you look for another job or stay lazy");

        setAllBtnsVisible();
        btn1.setText("No one wants to hire you, you stay at parent's house");
        btn2.setText("Stay lazy and don't look for another job");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stayAtParents();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvStoryText.setText("You don't get another job due to your laziness, YOU LOSE!!!");

                end();
            }
        });

    }

    private void stayAtParents()
    {

        ivStory.setImageResource(R.drawable.im_perezadan_stay_at_parents);
        tvStoryText.setText("You stay at your parents house, do you help around the house?");

        setAllBtnsVisible();
        btn1.setText("Yes, you do help around the house");
        btn2.setText("You do not help around the house and your parent's are getting fed up with you");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helpWithHouse();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                parentsFedUp();
            }
        });

    }

    private void helpWithHouse()
    {

        ivStory.setImageResource(R.drawable.im_perezadan_cooking_dinner);
        tvStoryText.setText("You help out with the house but do you also cook dinner? ");

        setAllBtnsVisible();
        btn1.setText("Yes, you do chores and dinner");
        btn2.setText("No, you only do chores");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeParentsProud();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chores();
            }
        });

    }

    private void makeParentsProud()
    {

        ivStory.setImageResource(R.drawable.im_perezadan_make_parents_proud);
        tvStoryText.setText("They suggest you finally get a job,do you agree with them??");

        setAllBtnsVisible();
        btn1.setText("Yes, and decide to get a job");
        btn2.setText("No, and parent's finally have enough of you and kick you out");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getJob();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvStoryText.setText("Your parents kick you out their house, you lose!!!");

                end();
            }
        });

    }

    private void chores()
    {

        ivStory.setImageResource(R.drawable.im_perezadan_chores);
        tvStoryText.setText("You start doing chores around the house");

        setAllBtnsVisible();
        btn1.setText("Do you continue only doing chores?");
        btn2.setText("You finally give in and also start making dinner as well");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helpWithHouse();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                helpWithHouse();
            }
        });

    }

    private void parentsFedUp()
    {

        ivStory.setImageResource(R.drawable.im_perezadan_parents_fed_up);
        tvStoryText.setText("Do you change your mind about helping with the house or do you continue to be lazy?");

        setAllBtnsVisible();
        btn1.setText("You changed your mind and start helping with the  house ");
        btn2.setText("You do not and continue to be lazy");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helpWithHouse();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                continueBeingLazy();
            }
        });


    }

    private void continueBeingLazy()
    {
        ivStory.setImageResource(R.drawable.im_perezadan_lazy);
        tvStoryText.setText("You are now kicked out of your parents house what do you do?");

        setAllBtnsVisible();
        btn1.setText("Live in the streets");
        btn2.setText("Live in the homeless shelter");
        btn3.setText("Find A job");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvStoryText.setText("You now live in the streets, YOU LOSE!!!");

                end();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               tvStoryText.setText("You live in the homeless shelter, YOU LOSE!!!");


                end();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                getJob();
            }
        });
    }


    private void end()
    {
        ivStory.setImageResource(R.drawable.im_perezadan_the_end);
        setAllBtnsVisible();
        btn1.setText("Play again");
        btn2.setText("Quit");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GamePerezAdan.this, MainActivity.class));
            }
        });
    }
}