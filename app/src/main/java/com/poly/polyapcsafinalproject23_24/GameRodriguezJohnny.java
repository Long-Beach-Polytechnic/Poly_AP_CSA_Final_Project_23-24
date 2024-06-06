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
        tvDaysSurvived.setText(""+daysSurvived);

        ivMain.setImageResource(R.drawable.im_rodriguezjohnny_farmersimstart);

        System.out.println("You are a farmer, and you will have to grow crops you grow in order to survive...");

        createCharacter();
        farm();

    }

    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary


    private void farm()
    {


        if (player.getHealth() > 0)
        {
            displayStats();
            chooseOptions();
            viewCrops();
            daysSurvived ++;
        }
        gameOver();




    }

    private void createCharacter()
    {

        player = new RodriguezJohnnyFarmer("Zack");
        ivMain.setImageResource(R.drawable.im_rodriguezjohnny_happyfarmer);
    }

    private void displayStats()
    {

        tvNameVal.setText(player.getName());
        tvHealthVal.setText(""+player.getHealth());
        tvStatusVal.setText(""+player.isPoisoned());
        tvDaysSurvived.setText(""+ daysSurvived());


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




    private void plant()
    {


        if (crops.size() < 3)
        {
            btn1.setText("carrot");
            btn2.setText("potato");
            btn3.setText("apple");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int daysOld = (int) (0 + Math.random() * 6);
                    boolean isRipe = (daysOld > 5);
                    RodriguezJohnnyCrop crop = new RodriguezJohnnyCrop("carrot",category,isRipe, daysOld, 20);
                    crops.add(crop);
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int daysOld = (int) (0 + Math.random() * 6);
                    boolean isRipe = (daysOld > 5);
                    RodriguezJohnnyCrop crop = new RodriguezJohnnyCrop("potato",category,isRipe, daysOld, 20);
                    crops.add(crop);
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int daysOld = (int) (0 + Math.random() * 6);
                    boolean isRipe = (daysOld > 5);
                    RodriguezJohnnyCrop crop = new RodriguezJohnnyCrop("apple",category,isRipe,daysOld, 20);

                }
            });
        }
            ivMain.setImageResource(R.drawable.im_rodriguezjohnny_farmerplantscrop);
            System.out.println("What crop would you like to plant today?");
            String name = scan.nextLine();
            System.out.println("Is this crop a vegetable or a fruit?");
            crops.add(crops);
            String category = scan.nextLine();

            btn1.setText("vegetable");
            btn2.setText("fruit");
            btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RodriguezJohnnyCrop crop = new RodriguezJohnnyCrop(name,"vegetable",isRipe,daysOld, 20);
                crops.add(crop);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RodriguezJohnnyCrop crop = new RodriguezJohnnyCrop(name,"fruit",isRipe, daysOld, 20);
                crops.add(crop);
            }
        });


            int daysOld = (int) (0 + Math.random() * 6);
            boolean isRipe = (daysOld > 5);
            RodriguezJohnnyCrop crop = new RodriguezJohnnyCrop(name,category,isRipe, daysOld, 20);
            crops.add(crop);
            daysSurvived ++;

        }
        else
        {
            System.out.println("You decide to plant a crop but you do not have any more space to plant it, you wasted time! You lose 20 health");
            daysSurvived ++;
            player.addHealth(-20);
            ivMain.setImageResource(R.drawable.im_rodriguezjohnny_unhappyfarmer);


        }



    }

    private void viewCrops()
    {
        if(crops.size() > 0)
        {

            System.out.println("These are your crops!");
            for (int i=0; i<crops.size(); i++)
            {
                System.out.println("Crop " + (i+1) + ": " + crops.get(i).getName());
                ivMain.setImageResource(R.drawable.im_rodriguezjohnny_happyfarmer);

            }


        }
        else
        {

            System.out.println("You have no crops in your farm right now!");
            ivMain.setImageResource(R.drawable.im_rodriguezjohnny_unhappyfarmer);



        }
    }


    private void eat()
    {

        System.out.println("Which do you want to eat?");
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

        }
        else
        {
            player.addHealth(-20);
            player.setPoisoned(true);
            System.out.println("Oh no! The crop was not ready to eat, You lose 20 health!");
            daysSurvived ++;
            ivMain.setImageResource(R.drawable.im_rodriguezjohnny_farmerpoisonedcrop);

        }

    }

    private void nothing()
    {

        System.out.println("You decide to do nothing for the day (lazy) your farmer starves, You lose 20 health");
        daysSurvived ++;
        player.addHealth(-20);
        ivMain.setImageResource(R.drawable.im_rodriguezjohnny_unhappyfarmer);




    }

    private void gameOver()
    {
        System.out.println(player.getName() + " Has died from hunger on his farm. Game Over!" +);
        System.out.println(player.getName() + " survived " + daysSurvived + " days!");
        ivMain.setImageResource(R.drawable.im_rodriguezjohnny_farmerdies);

        run();


    }


}
