package com.poly.polyapcsafinalproject23_24;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

public class GameOntiverosMichael extends GameActivity {

    /**
     * Player in game
     */
    private TextView tvHealthVal, tvSleepVal, tvText;
    private ImageView ivPicture;
    private Button btnSleep, btnStayUp;
    private boolean isWon;
    private OntiverosWokePerson player;
    private Context context;

    /**
     * Method that runs the game. Calls createPlayer() and runSleeper()
     */
    public void run()
    {
        setContentView(R.layout.activity_ontiveros_main);
        tvHealthVal = findViewById(R.id.tv_health_val);
        tvSleepVal = findViewById(R.id.tv_time_val);
        tvText = findViewById(R.id.tv_main);
        ivPicture = findViewById(R.id.iv_main);
        btnSleep = findViewById(R.id.btn_sleep);
        btnStayUp = findViewById(R.id.btn_stay_up);

        player = new OntiverosWokePerson("Person",100,0);

        btnSleep.setText("Go to sleep");
        btnStayUp.setText("Stay up");
        ivPicture.setImageResource(R.drawable.im_ontiverosmichael_bed);

        runSleeper();
    }


    /**
     * Method that runs game. The game run in a loop again where player
     * sleep or does't. The sleeper end when the woke player
     * insanity reaches 100 or higher, or when their health is at least
     * to 0.
     */
    private void runSleeper()
    {
        if (player.getHealth() >= 50 && player.getHealth() <= 60)
        {
            ivPicture.setImageResource(R.drawable.im_ontiverosmichael_paranoid);
        }
        else if (player.getHealth() > 0 && player.getHealth() <= 30)
        {
            ivPicture.setImageResource(R.drawable.im_ontiverosmichael_lostit);
        }
        if (player.getInsanity() < 100 && player.getHealth() > 0)
        {
            displayStats();
            chooseOption();
        }
        else
        {
            endOfSleeper();
        }

    }

    /**
     * Displays player's stats at the beginning of each round
     */
    private void displayStats()
    {
        tvHealthVal.setText("" + player.getHealth());
        tvSleepVal.setText(""+ player.getTimeHasSleep());
    }

    private void chooseOption()
    {

        btnSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.goToSleep();
                runSleeper();
            }
        });
        btnStayUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.stayUp();
                runSleeper();
            }
        });

    }


    /**
     * After player's health is to 0, or when thier insanity reaches to
     * 100, the game ends. Messages are displayed to indicate why the
     * game ended. Player is told how much health they have, but not their
     * insanity. Player may choose to play again
     */
    private void endOfSleeper()
    {
        if (player.getHealth() <= 0)
        {
            ivPicture.setImageResource(R.drawable.im_ontiverosmicjhael_losthealth);
            tvText.setText("Your health is down");

        }
        if (player.getInsanity() >= 100)
        {
            ivPicture.setImageResource(R.drawable.im_ontiverosmicjhael_insane);
            tvText.setText("Woah you slept " + player.getTimeHasSleep() + " those are rookie numbers\n\n" +
                    "Do you want to sleep?");

            btnSleep.setText("Yea, I'm not a loser");
            btnStayUp.setText("Nah, I called it wraps");

            btnSleep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    player = new OntiverosWokePerson(player.getName(),100, 0);
                    run();
                }
            });

            btnStayUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(GameOntiverosMichael.this, MainActivity.class));
                }
            });

        }
    }













}