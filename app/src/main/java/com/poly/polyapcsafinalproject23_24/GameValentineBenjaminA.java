package com.poly.polyapcsafinalproject23_24;


import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

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



    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary
    public void run()
    {
        setContentView(R.layout.activity_valentineben_main);
        etView = findViewById(R.id.et_name);
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




        System.out.println("You wake up in a strange place. You don't know where or who you are, but you walk out of the alley way you woke up in and see that the city is bright. You find yourself a cheap house with the insignificant amount of money that you had woken up with, and you ultimately decide to live a life of crime. After all, you don't have anything to live for... right?");
        System.out.println("What is your name?");
        ValentineCriminal player1 = new ValentineCriminal(etView.getText().toString());
        System.out.println("How many people will be playing with you?");
    }

    public void startRobbing()
    {
        while(player.getMoney() > 0)
        {
            displayStats();
            String text = "        Options\n" +
                    "        1. rob\n" +
                    "        2. turn someone else in\n" +
                    "        3. turn yourself in";
            System.out.println(text);
            if (option == 1)
            {
                player.rob();
            }
            else if (option == 2)
            {
                ValentineCriminal victim = new ValentineCriminal();
                player.turnInCriminal(victim);
            }
            else if (option == 3)
            {
                player.turnYourselfIn();
            }

        }

    }

    private void displayStats()
    {
        System.out.println( "Name:\t" + player.getName());
        System.out.println( "Money:\t$" + player.getMoney());
        System.out.println( "Wanted Level:\t" + player.getWantedLvl());
        System.out.println( "Driver's ID number:\t" + player.getID());
        System.out.println( "Moral Level:\t" + player.getMoralLvl());
    }

}






