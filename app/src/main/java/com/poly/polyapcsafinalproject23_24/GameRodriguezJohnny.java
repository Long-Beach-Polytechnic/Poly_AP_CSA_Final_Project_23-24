package com.poly.polyapcsafinalproject23_24;

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


    private RodriguezJohnnyFarmer player;
    private ArrayList<RodriguezJohnnyCrop> crops = new ArrayList<RodriguezJohnnyCrop>();

    @Override
    protected void run() {
        setContentView(R.layout.activity_rodriguezjohnny_main);

        tvGame = findViewById(R.id.tv_game);
        tvNameVal = findViewById(R.id.tv_name);
        tvHealthVal = findViewById(R.id.tv_health);
        tvDaysSurvived = findViewById(R.id.tv_days_survived);
        tvStatusVal = findViewById(R.id.tv_status);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        daysSurvived = 0;
        tvDaysSurvived.setText("" + daysSurvived);

        ivMain.setImageResource(R.drawable.im_rodriguezjohnny_farmersimstart);

        tvGame.setText("You are a farmer, and you will have to grow crops you grow in order to survive...");

        createCharacter();
        farm();

    }

    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary


    private void farm() {


        if (player.getHealth() > 0) {
            displayStats();
            chooseOptions();
            viewCrops();
            daysSurvived++;
        }
        gameOver();


    }

    private void createCharacter() {

        player = new RodriguezJohnnyFarmer("Zack");
        ivMain.setImageResource(R.drawable.im_rodriguezjohnny_happyfarmer);
    }

    private void displayStats() {

        tvNameVal.setText(player.getName());
        tvHealthVal.setText("" + player.getHealth());
        tvStatusVal.setText("" + player.isPoisoned());
        tvDaysSurvived.setText("" + daysSurvived);


    }

    private void chooseOptions() {
        tvGame.setText("What would you like to do today on your farm, " + player.getName() + "?");

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
                player.eatCrop();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }


    private void plant() {


        if (crops.size() < 3) {
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
                    daysSurvived++;
                    chooseOptions();

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


            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int daysOld = (int) (0 + Math.random() * 6);
                    boolean isRipe = (daysOld > 5);
                    RodriguezJohnnyCrop crop = new RodriguezJohnnyCrop("potato", "fruit", isRipe, daysOld, 20);
                    crops.add(crop);
                    daysSurvived++;
                    chooseOptions();

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
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int daysOld = (int) (0 + Math.random() * 6);
                    boolean isRipe = (daysOld > 5);
                    RodriguezJohnnyCrop crop = new RodriguezJohnnyCrop("apple", "fruit", isRipe, daysOld, 20);
                    daysSurvived++;
                    chooseOptions();


                }
            });


       else
        {
            tvGame.setText("You decide to plant a crop but you do not have any more space to plant it, you wasted time! You lose 20 health");
            daysSurvived ++;
            player.addHealth(-20);
            ivMain.setImageResource(R.drawable.im_rodriguezjohnny_unhappyfarmer);
            chooseOptions();
        }



    }

    private void viewCrops()
    {
        if(crops.size() > 0)
        {
            ivMain.setImageResource(R.drawable.im_rodriguezjohnny_happyfarmer);
            String text = "These are your crops!";

            for (int i=0; i<crops.size(); i++)
            {
                text += "\n" + (i+1) + ": " + crops.get(i).getName();
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


        }
        else
        {

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


    private void eat()
    {

        tvGame.setText("Which do you want to eat?");
        ivMain.setImageResource(R.drawable.im_rodriguezjohnny_farmereating);
        for (int i=0; i<crops.size(); i++)
        {
            System.out.println("Crop " + (i+1) + ": " + crops.get(i).getName());
        }

        RodriguezJohnnyCrop currentCrop = crops.get(option);
        crops.remove(option);


        if (currentCrop.isRipe())
        {
            player.addHealth(20);
            player.setPoisoned(false);
            System.out.println("The Crop was ready to eat, You gain 20 health!");
            daysSurvived ++;
            ivMain.setImageResource(R.drawable.im_rodriguezjohnny_farmereatinggoodcrop);

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

        }
        else
        {
            player.addHealth(-20);
            player.setPoisoned(true);
            tvGame.setText("Oh no! The crop was not ready to eat, You lose 20 health!");
            daysSurvived ++;
            ivMain.setImageResource(R.drawable.im_rodriguezjohnny_farmerpoisonedcrop);

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

        }

    }

    private void nothing()
    {

        tvGame.setText("You decide to do nothing for the day (lazy) your farmer starves, You lose 20 health");
        daysSurvived ++;
        player.addHealth(-20);
        ivMain.setImageResource(R.drawable.im_rodriguezjohnny_unhappyfarmer);

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




    }

    private void gameOver()
    {
        tvGame.setText(player.getName() + " Has died from hunger on his farm. Game Over!" );
        tvGame.setText(player.getName() + " survived " + daysSurvived + " days!");
        ivMain.setImageResource(R.drawable.im_rodriguezjohnny_farmerdies);

        run();


    }



