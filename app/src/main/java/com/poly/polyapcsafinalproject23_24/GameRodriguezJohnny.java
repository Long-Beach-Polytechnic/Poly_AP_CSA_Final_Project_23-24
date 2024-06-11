package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;


import java.util.ArrayList;

public class GameRodriguezJohnny extends GameActivity {

    //create variables up here
    private TextView tvGame, tvNameVal, tvHealthVal, tvStatusVal, tvDaysSurvived;
    private ImageView ivMain;
    private Button btn1, btn2, btn3, btn4;
    private boolean isWon;
    private int numLives;
    private int daysSurvived;

    private RodriguezJohnnyCrop currentCrop;


    private RodriguezJohnnyFarmer player;
    private ArrayList<RodriguezJohnnyCrop> crops = new ArrayList<RodriguezJohnnyCrop>();

    @Override
    protected void run() {
        setContentView(R.layout.activity_rodriguezjohnny_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        tvGame = findViewById(R.id.tv_game);
        tvNameVal = findViewById(R.id.tv_name);
        tvHealthVal = findViewById(R.id.tv_health);
        tvDaysSurvived = findViewById(R.id.tv_days_survived);
        tvStatusVal = findViewById(R.id.tv_status);
        ivMain = findViewById(R.id.iv_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        daysSurvived = 0;
        tvDaysSurvived.setText("" + daysSurvived);

        ivMain.setImageResource(R.drawable.im_rodriguezjohnny_farmersimstart);

        tvGame.setText("You are a farmer, and you will have to grow crops you grow in order to survive...");

        player = new RodriguezJohnnyFarmer("Zack");
        ivMain.setImageResource(R.drawable.im_rodriguezjohnny_happyfarmer);


        farm();

    }

    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary


    private void farm() {
        displayStats();

        for (RodriguezJohnnyCrop crop:crops) {
            crop.addDay();
        }

        if (player.getHealth() > 0) {
            daysSurvived++;
            chooseOptions();
        }
        else {
            gameOver();
        }



    }

    private void displayStats() {

        tvNameVal.setText(player.getName());
        tvHealthVal.setText("" + player.getHealth());
        if (player.isPoisoned()) {
            tvStatusVal.setText("Poisoned");
        } else {
            tvStatusVal.setText("Healthy");
        }
        tvDaysSurvived.setText("" + daysSurvived);


    }

    private void chooseOptions() {
        tvGame.setText("What would you like to do today on your farm, " + player.getName() + "?");

        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn1.setText("Plant");
        btn2.setText("Eat");
        btn3.setText("Nothing");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plant();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eat();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nothing();


            }
        });
    }


    private void plant() {


        if (crops.size() < 3) {
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);

            btn1.setText("carrot");
            btn2.setText("potato");
            btn3.setText("apple");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int daysOld = (int) (0 + Math.random() * 6);
                    boolean isRipe = (daysOld > 5);
                    RodriguezJohnnyCrop crop = new RodriguezJohnnyCrop("carrot", "fruit", isRipe, daysOld, 20);
                    crops.add(crop);
                    tvGame.setText("You have planted a carrot");
                    farm();
                }
            });


            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int daysOld = (int) (0 + Math.random() * 6);
                    boolean isRipe = (daysOld > 5);
                    RodriguezJohnnyCrop crop = new RodriguezJohnnyCrop("potato", "fruit", isRipe, daysOld, 20);
                    crops.add(crop);
                    tvGame.setText("You have planted a potato");
                    farm();
                }
            });


                    btn3.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick (View view){
                    int daysOld = (int) (0 + Math.random() * 6);
                    boolean isRipe = (daysOld > 5);
                    RodriguezJohnnyCrop crop = new RodriguezJohnnyCrop("apple", "fruit", isRipe, daysOld, 20);
                    crops.add(crop);
                    tvGame.setText("You have planted an apple");
                    farm();
                }
                });

            }
        else
        {
            tvGame.setText("You decide to plant a crop but you do not have any more space to plant it, you wasted time! You lose 20 health");
            player.addHealth(-20);
            ivMain.setImageResource(R.drawable.im_rodriguezjohnny_unhappyfarmer);

            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setText("Continue");
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    farm();

                }
            });

        }


    }

    private void viewCrops() {
        if (crops.size() > 0) {
            ivMain.setImageResource(R.drawable.im_rodriguezjohnny_happyfarmer);
            String text = "These are your crops!";

            for (int i = 0; i < crops.size(); i++) {
                text += "\n" + (i + 1) + ": " + crops.get(i).getName();
            }

            tvGame.setText(text);

            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn3.setText("Continue");

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    chooseOptions();
                }
            });


        } else if (crops.size() >2){

            tvGame.setText("You have no crops in your farm right now!");
            ivMain.setImageResource(R.drawable.im_rodriguezjohnny_unhappyfarmer);

            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn3.setText("Continue");

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    chooseOptions();
                }
            });


        }
    }


    private void eat() {
        currentCrop = new RodriguezJohnnyCrop();

        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);

        Button[] btns = {btn1, btn2, btn3};
        tvGame.setText("Which do you want to eat?");
        ivMain.setImageResource(R.drawable.im_rodriguezjohnny_farmereating);
        for (int i = 0; i < crops.size(); i++) {

            btns[i].setText(crops.get(i).getName());

            final int k = i;

            btns[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    currentCrop = crops.get(k);
                    crops.remove(k);
                    tvGame.setText("You have eaten a " + currentCrop.getName());

                    eatTheCrop(currentCrop);
                }
            });
        }
    }

    private void eatTheCrop(RodriguezJohnnyCrop currentCrop) {


        if (currentCrop.isRipe()) {
            player.addHealth(20);
            player.setPoisoned(false);
            tvGame.setText("The Crop was ready to eat, You gain 20 health!");
            ivMain.setImageResource(R.drawable.im_rodriguezjohnny_farmereatinggoodcrop);


            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn3.setText("Continue");

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    farm();
                }
            });

        } else if (!currentCrop.isRipe()) {
            player.addHealth(-20);
            player.setPoisoned(true);
            tvGame.setText("Oh no! The crop was not ready to eat, You lose 20 health!");
            ivMain.setImageResource(R.drawable.im_rodriguezjohnny_farmerpoisonedcrop);

            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn3.setText("Continue");
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    farm();
                }
            });
        }
    }

    private void nothing() {

        player.addHealth(-20);
        ivMain.setImageResource(R.drawable.im_rodriguezjohnny_unhappyfarmer);

        tvGame.setText("You decide to do nothing for the day (lazy) your farmer starves, You lose 20 health");


        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn3.setText("Continue");

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                farm();

            }
        });

    }

    private void gameOver() {
        tvGame.setText(player.getName() + " Has died from hunger on his farm. Game Over!");
        tvGame.setText(player.getName() + " survived " + daysSurvived + " days!");
        ivMain.setImageResource(R.drawable.im_rodriguezjohnny_farmerdies);


        btn1.setVisibility(View.INVISIBLE);

        btn2.setVisibility(View.VISIBLE);
        btn2.setText("Play again");

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                run();
            }
        });

        btn3.setVisibility(View.VISIBLE);
        btn3.setText("Back to menu");
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GameRodriguezJohnny.this, MainActivity.class));
            }
        });



    }
}



