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

        ivStory.setImageResource(R.drawable.im_pokjordan_raid);
        tvTitle.setText("Protect the cure.");

        tvSubtitle.setText("Terrorist are raiding your building. Who do you want to play as?");
        tvStoryText.setText("1. Castle\n2. Frost\n3. Caveria");

        setAllBtnVisible();
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
        ivStory.setImageResource(R.drawable.im_pokjordan_castle);
        tvStoryText.setText("You have bulletproof barricades but not explosive proof. The terrorist can't shoot inside nor can you shoot outside. What do you barricade?");
        tvSubtitle.setText("Barricade the area");

        setAllBtnVisible();
        btn1.setText("Barricade Doors");
        btn2.setText("Barricade Entrances");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barricadeDoors();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barricadeEntrances();
            }
        });

    }

    private void barricadeDoors()
    {
        ivStory.setImageResource(R.drawable.im_pokjordan_barricade_doors);
        tvStoryText.setText("You completly barricaded off the doors to the room of the cure. Do you want to go look and take out the terrorist or stay with the cure inside the room.");
        tvSubtitle.setText("What do you do?");

        setAllBtnVisible();
        btn1.setText("Look for terrorist");
        btn2.setText("Stay");
        btn3.setVisibility(View.INVISIBLE);

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
        ivStory.setImageResource(R.drawable.im_pokjordan_entrances);
        tvStoryText.setText("You barricaded off all of the entrances and hear them walking down the halls. What do you do?");
        tvSubtitle.setText("Choose wisely");

        btn1.setText("Surrender");
        btn2.setText("Safer Room");
        btn3.setVisibility(View.INVISIBLE);

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
        ivStory.setImageResource(R.drawable.im_pokjordan_hiding);
        tvStoryText.setText("You are now in a safer room what is your next move?");
        tvSubtitle.setText("Ask for help or escape");

        btn1.setText("Escape");
        btn2.setText("Help");
        btn3.setVisibility(View.INVISIBLE);

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
        ivStory.setImageResource(R.drawable.im_pokjordan_levels);
        tvStoryText.setText("You went out of the room and left it alone to go search for terrorist. Do you want to go upstairs or downstairs?");
        tvSubtitle.setText("Be careful with your choices");

        btn1.setText("Upstairs");
        btn2.setText("Downstairs");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You tripped using the stairs and the terrorist heard you. You died from falling not from the terrorist.");
                setAllBtnVisible();
                btn1.setText("Next");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeat();
                    }
                });
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You tripped using the stairs and the terrorist heard you. You died from falling not from the terrorist.");
                setAllBtnVisible();
                btn1.setText("Next");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeat();
                    }
                });
            }
        });

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
        ivStory.setImageResource(R.drawable.im_pokjordan_frost);
        tvStoryText.setText("Your playing as frost you have bear traps that you can place down to kill the terrorist slowly. Do you want to use the bear traps as bait or Place them around.");
        tvSubtitle.setText("Chose your strategy");

        btn1.setText("Bait");
        btn2.setText("Place them");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bait();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You died from placing them so horribly you forgot wher they were.");
                setAllBtnVisible();
                btn1.setText("Next");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeat();
                    }
                });
            }
        });
    }

    private void placed()
    {
        ivStory.setImageResource(R.drawable.im_pokjordan_placed);
        tvStoryText.setText("You placed down your bear traps thinking you will injure one with a bear trap. Do you place them and try to kill one with the trap or do you place them cleverly near the cure.");
        tvSubtitle.setText("You or the cure");

        btn1.setText("Kill one");
        btn2.setText("Cleverly");
        btn3.setVisibility(View.INVISIBLE);

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
                setAllBtnVisible();
                btn1.setText("Next");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeat();
                    }
                });
            }
        });
    }

    private void kill() {
        ivStory.setImageResource(R.drawable.im_pokjordan_kill);
        tvStoryText.setText("Congrats you got all of your traps down now do you finish off the terrorist when you hear the trap go off or do you let it do its thing.");
        tvSubtitle.setText("Well done");

        btn1.setText("Finish terrorist");
        btn2.setText("Do its thing");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You got one of the terrorist congrats! You turn around the corner to finish off your kill and die. What made you think there was only going to be one terrorist?");
                setAllBtnVisible();
                btn1.setText("Next");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeat();
                    }
                });
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You decide to let the traps do it's own thing and it did absolutely nothing. You get lost in the dark and get scared and start running. You slipped on a banana because you didn't want to throw away your trash. You died from the banana.");
                setAllBtnVisible();
                btn1.setText("Next");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeat();
                    }
                });
            }
        });
    }

    private void bait() {
        ivStory.setImageResource(R.drawable.im_pokjordan_bait);
        tvStoryText.setText("You placed the bear traps down and used them as bait and only have two options left. Do you shoot when you hear noise or do you sit behind a desk.");
        tvSubtitle.setText("Fear");

        btn1.setText("Shoot with noise");
        btn2.setText("Sit behind a desk");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You shot when you heard noise and they're behind you. You got shot from behind and died.");
                setAllBtnVisible();
                btn1.setText("Next");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeat();
                    }
                });
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("You went to go hide behind a desk and got shot because they saw your feet. You died.");
                setAllBtnVisible();
                btn1.setText("Next");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeat();
                    }
                });
            }
        });
    }

    private void caveria() {
        ivStory.setImageResource(R.drawable.im_pokjordan_caveria);
        tvStoryText.setText("Your playing as caveria. You can move around quickly and silently. Do you choose to move around loudly or quietly.");
        tvSubtitle.setText("Your a ninja");

        btn1.setText("Loudly");
        btn2.setText("Quietly");
        btn3.setVisibility(View.INVISIBLE);

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
        ivStory.setImageResource(R.drawable.im_pokjordan_loudly);
        tvStoryText.setText("Your moving around loudly completely dense of you but do you use your noise as distraction or use the sound to help you escape.");
        tvSubtitle.setText("Choose carefully");

        btn1.setText("Distraction");
        btn2.setText("Escape");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("What made you think that using your noisy footsteps would be a good distraction. They can literally hear your exact movement. You died because you ran around the corner too fast getting shot.");
                setAllBtnVisible();
                btn1.setText("Next");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeat();
                    }
                });
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvStoryText.setText("Using your own loud footsteps to help you escape is a horrible idea and you proceeded to do it. You died running into a group of terrorist at the exit.");
                setAllBtnVisible();
                btn1.setText("Next");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeat();
                    }
                });
            }
        });
    }

    private void quietly()
    {
        ivStory.setImageResource(R.drawable.im_pokjordan_quietly);
        tvStoryText.setText("Moving around quietly. Do you wish to take them out one by one or Find whos their leader.");
        tvSubtitle.setText("Don't hesitate");

        btn1.setText("Take out");
        btn2.setText("Find leader");
        btn3.setVisibility(View.INVISIBLE);

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
        ivStory.setImageResource(R.drawable.im_pokjordan_takeout);
        tvStoryText.setText("Your taking them out one by one with out a noise. Do you want to hide the bodies or interrogate them.");
        tvSubtitle.setText("Be careful");

        btn1.setText("Hide the bodies");
        btn2.setText("Interrogate");
        btn3.setVisibility(View.INVISIBLE);

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
            tvStoryText.setText("You died.");
            tvSubtitle.setText("Try again");
            start();
        }
        else
        {
            ivStory.setImageResource(R.drawable.im_pokjordan_defeat);
            tvTitle.setText("GAME OVER");
            tvSubtitle.setText("DEFEAT");
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setText("");
        }
    }
}