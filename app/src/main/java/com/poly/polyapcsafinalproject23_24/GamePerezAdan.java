package com.poly.polyapcsafinalproject23_24;

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
    private int numLives;

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
        tvSubtitle.setText("")


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
        String text = """
      How are you doing in your classes?
      1. You are doing very well.
      2. You are struggling.
      """;

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

        String text = """
      Do you keep on doing well in your classes?
      1. Keep doing well.
      2. Lose motivation.
      """;

        tvStoryText.setText("Do you keep on doing well in your classes?");

        setAllBtnsVisible();
        btn1.setText("Keep doing well");
        btn1.setText("Lose motivation");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

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

        String text = """
      You are losing motivation and struggling
      """;

        tvStoryText.setText("You are losing motivation and struggling");

        setAllBtnsVisible();
        btn1.setText("Keep doing well");
        btn1.setText("Lose motivation");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

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

    }



    private void graduate()
    {
        Util.clearConsole();
        String text = """
      Congrats,you graduated! What do you want to do?
      1. Work for a successful company.
      2. Get a normal job.
      """;

        tvStoryText.setText("Congrats,you graduated! What do you want to do");

        setAllBtnsVisible();
        btn1.setText("Work for a successful company");
        btn1.setText("Get a normal job");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ();

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
        Util.clearConsole();
        String text = """
      You are struggling and thinking of dropping out...
      1. keep trying.
      2. drop out.
      """;

        tvStoryText.setText("You are struggling and thinking of dropping out...");

        setAllBtnsVisible();
        btn1.setText("keep trying");
        btn2.setText("drop out");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

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
        Util.clearConsole();
        String text = """
      You keep on trying does it end up paying off?
      1.Yes,you go on to graduate.
      2.No,you end up dropping out of school.
      """;

        tvStoryText.setText("You keep on trying does it end up paying off?");

        setAllBtnsVisible();
        btn1.setText("Yes,you go on to graduate");
        btn2.setText("No,you end up dropping out");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

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
        Util.clearConsole();
        String text = """
      You dropped out of college, what do you do now?
      1.Get a job.
      2.Stay at parent's house.
      """;

        tvStoryText.setText("You dropped out of college, what do you do now?");

        setAllBtnsVisible();
        btn1.setText("Get a job");
        btn2.setText("Stay at parent's house");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

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
        Util.clearConsole();
        String text = """
      Where would you like to work at?
      1. A stay at home job that pays good money.
      2. Mcdonalds.
      """;

        tvStoryText.setText("Where would you like to work at?");

        setAllBtnsVisible();
        btn1.setText("A stay at home job that pays good money");
        btn2.setText("Mcdonalds");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

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
        Util.clearConsole();
        String text = """
      You get a big opportunity at the job do you take it?
      1. Yes,and start to get paid millions.
      2. No,but continue to make good money.
      """;

        tvStoryText.setText("You get a big opportunity at the job do you take it?");

        setAllBtnsVisible();
        btn1.setText("Yes,and start to get paid millions");
        btn2.setText("No,but continue to make good money");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               bigOpportunity();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ();
            }
        });

    }

    private void badJob()
    {
        Util.clearConsole();
        String text = """
      You start your job but things aren't looking the best
      what do you do?
      1. Get fired for being lazy on the job.
      2. Quit,and go live with your parents.
      """;

        tvStoryText.setText("You start your job but things aren't looking for nthe best what do you do?");

        setAllBtnsVisible();
        btn1.setText("Get fired for being lazy on the job");
        btn2.setText("Quit,and go live with your parents");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

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
        Util.clearConsole();
        String text = """
      You took it and make a lot of money,but are you smart
      with it?
      1. Yes,and you life live to its best.
      2. No,gamble all your money away.
      """;

        tvStoryText.setText("You took it and make a lot of money,but are you smart with it?");

        setAllBtnsVisible();
        btn1.setText("Yes,and you life live to its best");
        btn2.setText("No,gamble all your money away");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ();

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
        Util.clearConsole();
        String text = """
      You got fired for being lazy,do you look for another
      job or stay lazy.
      1. No one wants to hire you,stay at parent's house.
      2. Stay lazy and don't look for another job.
      """;

        tvStoryText.setText("You khot fired for being lazy,do you look for another job or stay lazy");

        setAllBtnsVisible();
        btn1.setText("no one wants to hire you.you stay at parent's house");
        btn2.setText("Stay lazy and don't look for another job");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stayAtParents();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ();
            }
        });

    }

    private void stayAtParents()
    {
        Util.clearConsole();
        String text = """
      You stay at your parents house, do you help around the
      house?
      1. Yes,you do help around the house.
      2. You do not help around the house and your parent's
         are getting fed up with you.
      """;

        tvStoryText.setText("You stay at your parents house, do you help around the house?");

        setAllBtnsVisible();
        btn1.setText("Yes,you dpo help around the house");
        btn2.setText("You do not help around the house and your parent's are getting fed up with you");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

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
        Util.clearConsole();
        String text = """
      You help out with the house but do you also cook
      dinner?
      1. Yes,you do chores and dinner.
      2. No,you only do chores.
      """;

        tvStoryText.setText("You help out with the house but do you also cook dinner? ");

        setAllBtnsVisible();
        btn1.setText("Yes,you do chores and dinner");
        btn1.setText("No,you only do chores");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

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
        Util.clearConsole();
        String text = """
      They suggest you finally get a job,do you agree with
      them?
      1. Yes,and decide to get a job.
      2. No,and parent's finally have enough of you and kick
         you out.
      """;

        tvStoryText.setText("They suggest you finally get a job,do you agree with them??");

        setAllBtnsVisible();
        btn1.setText("Yes,and decide to get a job");
        btn1.setText("No,and parent's finally have enough of you and kick you out");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getJob();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                     ();
            }
        });

    }

    private void chores()
    {
        Util.clearConsole();
        String text = """
      You start doing chores around the house
      1. Do you continue only doing chores?
      2. You finally give in and also start making dinner
         aswell.
      """;

        tvStoryText.setText("You start doing chores around the house");

        setAllBtnsVisible();
        btn1.setText("Do you continue only doing chores?");
        btn1.setText("You finally give in and also start making dinner aswell");
        btn3.setVisibility(View.INVISIBLE);
        System.out.println(text);

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
        Util.clearConsole();
        String text = """
      Do you change your mind about helping with the house
      or do you continue to be lazy?
      1. You changed your mind and start helping with the
         house.
      2. You do not and continue to be lazy.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            helpWithHouse();
        }
        else if (choice == 2)
        {
            continueBeingLazy();//struggle();
        }
    }

    private void continueBeingLazy()
    {
        Util.clearConsole();
        String text = """
      You are now kicked out of your parents house what do
      you do?
      1. Live in the streets.
      2. Live in the homeless shelter.
      3. Find a job.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,3);
        if (choice == 1)
        {
            System.out.println("Now you are on the streets");
            Util.pauseConsole();
            start();
        }
        else if (choice == 2)
        {
            start();//struggle();
        }
        else if (choice == 3)
        {
            getJob();
        }
    }

    private void defeat()
    {
        //run method when defeated

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
    }
}