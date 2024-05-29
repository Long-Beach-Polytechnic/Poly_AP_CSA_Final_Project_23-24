package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

public class GamePokJordan extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure

    private TextView tvTitle, tvSubtitle, tvStoryText;

    private ImageView ivStory;

    private Button btn1, btn2, btn3;

    private boolean isWon;
    private int numLives;

    private void setAllBtnVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }

    public void run()
    {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);


        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        //display project title and description
        tvSubtitle.setText("Protecting the container ");
        tvStoryText.setText("There are terrorist coming to your lab to come taking your cure for cancer trying to destroy it. They kill and destory all of the other labs looking for it. They then kill all the lights and it goes quiet inside the building and your the last one alive with the terrorist.");

        start();
    }

    private void start() {

        tvTitle.setText("Protect the cure.");

        tvSubtitle.setText("Who do you want to play as?");
        tvStoryText.setText("1. Castle\n2. Frost\n3. Caveria");

        btn1.setText("Castle");
        btn2.setText("Frost");
        btn3.setText("Caveria");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                castle();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frost();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caveria();
            }
        });
    }

    private void castle()
    {
        tvStoryText.setText("You have bulletproof barricades but not explosive proof. The terrorist can't shoot inside nor can you shoot outside. What do you barricade?");

        setAllBtnVisible();
        btn1.setText("Barricade Doors");
        btn2.setText("Barricade Entrances");
        btn3.setVisibility(View.INVISIBLE);


    }

    private void barricadeDoors()
    {
        tvStoryText.setText("You completly barricaded off the doors to the room of the cure. Do you want to go look and take out the terrorist or stay with the cure inside the room.");

        setAllBtnVisible();
        btn1.setText("Look for terrorist");
        btn2.setText("Stay");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                levels();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("They breached in through the walls your barricades did nothing and you died.");
                defeat();
            }
        });
    }

    private void barricadeEntrances()
    {
        tvStoryText.setText("You barricaded off all of the entrances and hear them walking down the halls. What do you do?");

        btn1.setText("Surrender");
        btn2.setText("Safer Room");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You surrendered and they demanded the cure but you were to stubborn to hand it to them. They shot you.");
                defeat();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saferRoom();
            }
        });
    }

    private void saferRoom()
    {
        tvStoryText.setText("You are now in a safer room what is your next move?");

        btn1.setText("Escape");
        btn2.setText("Help");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You ran straight into a group of terrorist. You died.");
                defeat();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You called out for help and the terrorist heard you. You were whining and crying out for help like a baby. You died");
                defeat();
            }
        });

    }

    private void levels()
    {
        tvStoryText.setText("You went out of the room and left it alone to go search for terrorist. Do you want to go upstairs or downstairs?");

        btn1.setText("Upstairs");
        btn2.setText("Downstairs");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You tripped using the stairs and the terrorist heard you. You died from falling not from the terrorist.");
                defeat();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You tripped using the stairs and the terrorist heard you. You died from falling not from the terrorist.");
                defeat();
            }
        });
    }

    private void frost()
    {
        tvStoryText.setText("Your playing as frost you have bear traps that you can place down to kill the terrorist slowly. Do you want to use the bear traps as bait or Place them around.");

        btn1.setText("Bait");
        btn2.setText("Place them");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bait();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You tripped using the stairs and the terrorist heard you. You died from falling not from the terrorist.");
                defeat();
            }
        });
    }

    private void placed()
    {
        tvStoryText.setText("You placed down your bear traps thinking you will injure one with a bear trap. Do you place them and try to kill one with the trap or do you place them cleverly near the cure.");

        btn1.setText("Kill one");
        btn2.setText("Cleverly");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kill();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You did what you wanted and placed them cleverly but didn't think they would look down see a huge bear trap. The traps did nothing and you died to your own trap.");
                defeat();
            }
        });
    }

    private void kill()
    {
        tvStoryText.setText("Congrats you got all of your traps down now do you finish off the terrorist when you hear the trap go off or do you let it do its thing.");

        btn1.setText("Finish terrorist");
        btn2.setText("Do its thing");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You got one of the terrorist congrats! You turn around the corner to finish off your kill and die. What made you think there was only going to be one terrorist?");
                defeat();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You decide to let the traps do it's own thing and it did absolutely nothing. You get lost in the dark and get scared and start running. You slipped on a banana because you didn't want to throw away your trash. You died from the banana.");
                defeat();
            }
        });
    }

    private void bait()
    {
        tvStoryText.setText("You placed the bear traps down and used them as bait and only have two options left. Do you shoot when you hear noise or do you sit behind a desk.");

        btn1.setText("Shoot with noise");
        btn2.setText("Sit behind a desk");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You shot when you heard noise and they're behind you. You got shot from behind and died.");
                defeat();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You went to go hide behind a desk and got shot because they saw your feet. You died.");
                defeat();
            }
        });
    }

    private void caveria()
    {
        tvStoryText.setText("Your playing as caveria. You can move around quickly and silently. Do you choose to move around loudly or quietly.");

        btn1.setText("Loudly");
        btn2.setText("Quietly");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loudly();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quietly();
            }
        });
    }

    private void loudly()
    {
        tvStoryText.setText("Your moving around loudly completely dense of you but do you use your noise as distraction or use the sound to help you escape.");

        btn1.setText("Distraction");
        btn2.setText("Escape");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("What made you think that using your noisy footsteps would be a good distraction. They can literally hear your exact movement. You died because you ran around the corner too fast getting shot.");
                defeat();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("Using your own loud footsteps to help you escape is a horrible idea and you proceeded to do it. You died running into a group of terrorist at the exit.");
                defeat();
            }
        });
    }

    private void quietly()
    {
        tvStoryText.setText("Moving around quietly. Do you wish to take them out one by one or Find whos their leader.");

        btn1.setText("Take out");
        btn2.setText("Find leader");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takeOut();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You went down the halls quietly and saw who was their leader and heard one of the terrorist mention his name and kept it in mind.");
                tvSubtitle.setText("Congrats you escaped with " + numLives + " lives left!");
            }
        });
    }

    private void takeOut()
    {
        tvStoryText.setText("Your taking them out one by one with out a noise. Do you want to hide the bodies or interrogate them.");

        btn1.setText("Hide the bodies");
        btn2.setText("Interrogate");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You killed all of the terrorist and found out who sent the terrorist. You escaped with the cure in your hands and called for backup before more come and fly away.");
                tvSubtitle.setText("Congrats you escaped with " + numLives + " lives left!");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You interrogated the terrorist and found that their boss is one of your lab assistance who want to take the cure and steal all of the credit from you. You escape walking away from the lab with rage.");
                tvSubtitle.setText("Congrats you escaped with " + numLives + " lives left!");
            }
        });

    }

    private void defeat()
    {
        //run method when defeated

        //lose a life
        numLives--;

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
            System.out.println("GAME OVER");
        }
    }
}