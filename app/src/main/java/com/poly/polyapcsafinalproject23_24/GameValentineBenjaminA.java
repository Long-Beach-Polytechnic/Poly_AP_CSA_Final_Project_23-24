package com.poly.polyapcsafinalproject23_24;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class GameValentineBenjaminA extends GameActivity {

    //create variables up here
    ValentineCriminal player;
    int option;

    EditText etView;

    ImageView ivPlayer, ivMain;
    TextView tvText, tvMoneyVal, tvDriverId;

    TextView[] tvHistory;

    Button btn1, btn2, btn3;

    ProgressBar pbWantedLevel, pbMoralLevel;

    ArrayList<String> pastActions = new ArrayList<String>();



    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary
    public void run()
    {
        setContentView(R.layout.activity_valentineben_main);
        ivPlayer = findViewById(R.id.iv_player);
        ivMain = findViewById(R.id.iv_main);
        tvText = findViewById(R.id.tv_text);
        tvMoneyVal = findViewById(R.id.tv_money);
        tvDriverId = findViewById(R.id.tv_driver_id);

        tvHistory = new TextView[8];
        tvHistory[0] = findViewById(R.id.tv_history_1);
        tvHistory[1] = findViewById(R.id.tv_history_2);
        tvHistory[2] = findViewById(R.id.tv_history_3);
        tvHistory[3] = findViewById(R.id.tv_history_4);
        tvHistory[4] = findViewById(R.id.tv_history_5);
        tvHistory[5] = findViewById(R.id.tv_history_6);
        tvHistory[6] = findViewById(R.id.tv_history_7);
        tvHistory[7] = findViewById(R.id.tv_history_8);

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        pbWantedLevel = (ProgressBar) findViewById(R.id.pb_wanted_level);
        pbMoralLevel = (ProgressBar) findViewById(R.id.pb_moral_level);






        tvText.setText("You wake up in a strange place. You don't know where or who you are, but you walk out of the alley way you woke up in and see that the city is bright. You find yourself a cheap house with the insignificant amount of money that you had woken up with, and you ultimately decide to live a life of crime. After all, you don't have anything to live for... right?");
        tvText.setText("What is your name?");
        player = new ValentineCriminal("Rob Earght");
        startRobbing();
    }

    public void startRobbing()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);

        if (player.getMoney() >= 1000000) {
            tvText.setText("You won the game, and you were able to buy your way out of the city. Using your sheer power, you manage to corrupt the cops with your silver tongue, and they escort you to the local airport. As you leave, you smile thinking about how you managed to be the greatest criminal in modern times. You got the true ending!");
            end();
        }
        else if (player.getWantedLvl() >= 10) {
            tvText.setText("The police caught up to your scandals and you ended up going to jail. Sucks to suck!");
            end();
        }
        else if (player.getMoralLvl() <= 0) {
            tvText.setText("You get so insane that the police find you in a corner of an alleyway hugging your knees. Without even knowing what's happened, you get captured and then admitted into a mental institution.");
            end();
        }
        else
        {
            displayStats();


            btn1.setText("Rob");
            btn2.setText("Turn someone else in");
            btn3.setText("Turn yourself in");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    pastActions.add(0,"Rob");
                    player.rob();
                    tvText.setText("You rob a house. Classic B&E, nobody hears you. You grab your items and leave the house. It's a shame though, the house was really nice when you arrived. Too bad you left it a mess...");
                    startRobbing();

                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    ValentineCriminal victim = new ValentineCriminal();
                    player.turnInCriminal(victim);
                    pastActions.add(0,"Turn in criminal " + victim.getID());

                    tvText.setText("You decide to backstab your fellow criminals. You turn one in to the police, somehow unseen. You made sure to leave a note attatched saying 'from your frienemy :)'  \t to: the police ;)\t The criminal looks at you with a dirty look, but you back away giggling.");
                    startRobbing();
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    player.turnYourselfIn();
                    tvText.setText("You cave. Whether it was from stress, internal conflict, influence from a peer, or whatever, you turn yourself in knowing that you would recieve the consequences. You lose all your money, but on the bright side, you are at a peaceful state knowing full well that you did the right thing. Congrats, you got the good ending!");
                    pastActions.add(0,"Turn self in");

                    displayStats();
                    end();
                }
            });



        }


    }

    private void displayStats()
    {

        tvMoneyVal.setText(""+player.getMoney());
        tvDriverId.setText(""+player.getID());

        pbWantedLevel.setMax(10);
        pbWantedLevel.setProgress( player.getWantedLvl());

        pbMoralLevel.setMax(10);
        pbMoralLevel.setProgress(player.getMoralLvl());

        for (int indexHistory = 0; indexHistory < 8; indexHistory++) {
            if (indexHistory >= pastActions.size()) {
                tvHistory[indexHistory].setText("");
            } else {
                tvHistory[indexHistory].setText(pastActions.get(indexHistory));
            }

        }
    }

    private void end() {

        btn2.setText("Play again");
        btn3.setText("Back to menu");

        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                run();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GameValentineBenjaminA.this, MainActivity.class));
            }
        });
    }

}






