package com.poly.polyapcsafinalproject23_24;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameCashawCharles extends GameActivity {

    //create variables up here

    /**
     *  gymhead in game
     */
    private CashawGymhead gymhead;

    private TextView tvMain, tvPushUpVal, tvPullUpVal, tvSitUpVal, tvSquatVal;
    private ImageView ivMain;
    private Button btnPushUp, btnPullUp, btnSitUp, btnSquat;

    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary
    /**
     * method that starts the workout. Calls createGymhead() and runWorkout()
     */
    @Override
    public void run()
    {
        setContentView(R.layout.activity_cashaw_main);

        tvMain = findViewById(R.id.tv_main);
        ivMain = findViewById(R.id.iv_main);
        btnPushUp = findViewById(R.id.btn_pushup);
        btnPullUp = findViewById(R.id.btn_pullup);
        btnSitUp = findViewById(R.id.btn_situp);
        btnSquat = findViewById(R.id.btn_squat);

        tvPushUpVal = findViewById(R.id.tv_pushup_value);
        tvPullUpVal = findViewById(R.id.tv_pullup_value);
        tvSitUpVal = findViewById(R.id.tv_situp_value);
        tvSquatVal = findViewById(R.id.tv_squat_value);

        ivMain.setImageResource(R.drawable.im_cashaw_charles_starting);

        createGymhead();
        runWorkout();
    }


    private void setAllBtnsVisisble()
    {
        btnPushUp.setVisibility(View.VISIBLE);
        btnPullUp.setVisibility(View.VISIBLE);
        btnSitUp.setVisibility(View.VISIBLE);
        btnSquat.setVisibility(View.VISIBLE);
    }


    /**
     * method creates the gymhead. method asks for user name and uses
     * it to create a gymhead
     */
    private void createGymhead()
    {
        System.out.println("Whats your name?");
        gymhead = new CashawGymhead("DEFAULT");
    }

    /**
     *  method that runs the workour. the workout runs in a loop where a gymhead
     *  either does push ups, pull ups, sit ups, or squats. the workour ends when the gymheads
     *  workour reaches 30
     */
    private void runWorkout()
    {
        if (gymhead.getWorkoutDone() < gymhead.getMaxWorkout())
        {
            displayStats();
            chooseOption();
        }
        else
        {
            ivMain.setImageResource(R.drawable.im_cashaw_charles_complete);
            endOfWorkout();
        }

    }


    /**
     *  Displays the gymheads workout stats
     */
    private void displayStats()
    {
        tvSquatVal.setText(""+gymhead.getSquats());
        tvPullUpVal.setText(""+gymhead.getPullUps());
        tvPushUpVal.setText(""+gymhead.getPushUps());
        tvSitUpVal.setText(""+gymhead.getSitUps());
    }

    /**
     *  player chooses to do push ups, pull ups, sit ups, or squats
     */
    private void chooseOption()
    {
        setAllBtnsVisisble();
        btnPushUp.setText("pushup");
        btnPullUp.setText("pullup");
        btnSitUp.setText("sit-up");
        btnSquat.setText("squat");
        btnPushUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gymhead.doPullUp();
                ivMain.setImageResource(R.drawable.im_cashaw_charles_pushup);
                runWorkout();
            }
        });

        btnPullUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gymhead.doPushUp();
                ivMain.setImageResource(R.drawable.im_cashaw_charles_pullup);
                runWorkout();


            }
        });

        btnSitUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gymhead.doSquats();
                ivMain.setImageResource(R.drawable.im_cashaw_charles_situp);
                runWorkout();
            }
        });

        btnSquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gymhead.doSitUps();
                ivMain.setImageResource(R.drawable.im_cashaw_charles_squat);
                runWorkout();

            }
        });
    }

    /**
     * after gymheads workout reaches 30 the workout is ended
     * player is told how many push ups, pull ups, sit ups, or squats they did
     *  may chose to play again
     */
    private void endOfWorkout()
    {
        ivMain.setImageResource(R.drawable.im_cashaw_charles_workout_again);

        btnPushUp.setVisibility(View.INVISIBLE);
        btnPullUp.setVisibility(View.INVISIBLE);
        btnSitUp.setVisibility(View.INVISIBLE);
        btnSquat.setText("Workout Again?");


        if (gymhead.getWorkoutDone() >= gymhead.getMaxWorkout())
        {
            System.out.println("Workout done!");
            ivMain.setImageResource(R.drawable.im_cashaw_charles_workout_again);
        }

        tvMain.setText("Congratulations, you did " + gymhead.getPullUps() + " push ups " + gymhead.getPushUps() + " pull ups " + gymhead.getSquats() + " sit-ups and " + gymhead.getSitUps() + " squats ");


        btnSquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gymhead = new CashawGymhead(gymhead.getName());
                tvMain.setText("Choose your workout");

                ivMain.setImageResource(R.drawable.im_cashaw_charles_complete);
                runWorkout();
            }
        });
    }


}