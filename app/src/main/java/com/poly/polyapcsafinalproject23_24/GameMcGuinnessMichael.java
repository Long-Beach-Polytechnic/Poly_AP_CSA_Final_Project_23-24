package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;

public class GameMcGuinnessMichael extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;

    private int points;
    //private Player player; (optional)
    private TextView tvTitle, tvSubtitle, tvStoryText;

    private ImageView ivStory;

    private Button btn1, btn2, btn3;



    public void run()
    {
        setContentView(R.layout.activity_mcguinnessmichael_main);

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
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
         //util wuz hear


         //util wuz hear
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
        tvTitle.setText("Hit On Hot Person");
        tvSubtitle.setText("");
        tvStoryText.setText("You see an hot person. You think they are really good looking and you want to get their number. What do you do?");

        ivStory.setImageResource(R.drawable.im_mcguinnessmichael_girl);

        points = 0;
        //start adventure here

        //set points = 0      ask mr burke

        setAllBtnsVisible();

        btn1.setText("Use one of your top tier pickup lines");
        btn2.setText("Use Comedy");
        btn3.setText("Smolder");



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points += 100;
                lines();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points += 200;
                comedy();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points += 300;
                smolder();
            }
        });

    }

    //SMOLDER PATH
    private void smolder() {
         //util wuz hear

        setAllBtnsVisible();
        tvStoryText.setText("How do you want to Smolder?");
        btn1.setText("Smolder into the distance");
        btn2.setText("Smolder at them");
        btn3.setVisibility(View.INVISIBLE);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Math.random() > 0.5)
                {
                    ivStory.setImageResource(R.drawable.im_mcguinnessmichael_smolder1);
                    tvStoryText.setText("They think you are staring at them. They are not interested in a stalker");
                    points -= 15;
                    defeat();
                }
                else
                {
                    ivStory.setImageResource(R.drawable.im_mcguinnessmichael_smolder1);
                    tvStoryText.setText("They are into the smoldering. They give you their number and walk away");
                    points += 100;
                    setAllBtnsVisible();
                    btn1.setText("Continue");
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    success();

                }
            }
        });


         //util wuz hear
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Math.random() > 0.5)
                {
                    ivStory.setImageResource(R.drawable.im_mcguinnessmichael_smolder2);
                    tvStoryText.setText("They don't notice you. Fail.");
                    points -= 10;
                    defeat();
                }
                else
                {
                    ivStory.setImageResource(R.drawable.im_mcguinnessmichael_smolder2);
                    points += 50;
                    noticeYou();

                    //line 106
                }
            }
        });


    }

    private void noticeYou() {
        setAllBtnsVisible();
        tvStoryText.setText("They notice you and they are intrigued by the smoldering. They approach you. What do you do?");
        btn1.setText("Break the stance and ask for their number");
        btn2.setText("Say nothing. Smolder even harder");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                tvStoryText.setText("You break the look and try to ask for their number but your voice cracks and you sound like an elderly goose. They are disgusted and lose all interest in you");
                points -= 25;
                defeat();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ivStory.setImageResource(R.drawable.im_mcguinnessmichael_smolder3);
                tvStoryText.setText("You don't react to them approaching you. They are about to talk to you but get intimidated by the intensity of the look on your face. They are about to leave but suddenly you smolder harder. They fall apart and cant believe how powerful you look. They write down their number and stick it in your pocket and whisper 'call me' in your ear before running away fantasizing. ");
                points += 575;
                setAllBtnsVisible();
                btn1.setText("Continue");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        success();
                    }
                });
                success();
            }
        });

    }

    //comedy path
    private void comedy() {
        //util wuz hear
        setAllBtnsVisible();
        tvStoryText.setText("What joke do you want to use?");
        btn1.setText("I just got rid of my vacuum cleaner. It sucked.");
        btn2.setText("Cosmetic surgery use to be such a touchy subject. Now you talk about botox and nobody raises an eyebrow.");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivStory.setImageResource(R.drawable.im_mcguinnessmichael_hoover);
                points += 25;
                weird();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points += 50;
                ivStory.setImageResource(R.drawable.im_mcguinnessmichael_handsome);
                if (Math.random() > 0.5) {
                    tvStoryText.setText("They think you are insulting their appearance. They yell at you for being misogynistic and superficial and walk away");
                    points -= 15;
                    defeat();

                }
                else {
                    botox();
                }
            }
        });

        }



    private void botox() {
        tvStoryText.setText("They ask you if you think that they actually look like they have gotten work done. What do you respond? ");
        //util wuz hear
        setAllBtnsVisible();
        btn1.setText("Tell them they look beautiful");
        btn2.setText("Tell them they look like Caitlyn Jenner");
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("They think you're sweet and they give you their number");
                points += 115;
                success();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivStory.setImageResource(R.drawable.im_mcguinnessmichael_jenner);
                tvStoryText.setText("They start yelling at you and start calling you terrible names and storm away in disgust. You probably meant Kylie or Kendall but now you blundered it");
                points -= 30;
                defeat();
            }
        });


    }

    private void weird() {
        points += 10;
        setAllBtnsVisible();
        tvStoryText.setText("They think you are trying to be funny and laugh a bit uncomfortably. This is your last chance, what do you say?");
        btn1.setText("How does a hot dog show appreciation? It franks you");
        btn2.setText("When does Thor like pop rap? When it's hammer time.");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivStory.setImageResource(R.drawable.im_mcguinnessmichael_dog);
                tvStoryText.setText(" They feel bad for you and give you their number out of pity");
                points += 3;
                success();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivStory.setImageResource(R.drawable.im_mcguinnessmichael_hammer);
                tvStoryText.setText("They are visibly not interested. they tell you they have a boyfriend");
                points += 8;
                defeat();
            }
        });


    }

    //Pickup Lines path
    private void lines() {
         //util wuz hear
        setAllBtnsVisible();
        tvStoryText.setText("Which of your top tier pickup lines do you want to use?");
        btn1.setText("Do you live in a corn field? Because I'm stalking you");
        btn2.setText("I just pooped in my bed, can I sleep in yours?");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivStory.setImageResource(R.drawable.im_mcguinnessmichael_stalking);
                color();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivStory.setImageResource(R.drawable.im_mcguinnessmichael_poop);
                weird();

            }
        });

    }

    private void color() {
        setAllBtnsVisible();
        tvStoryText.setText("They are kind of scared of you. They ask you what color their car is to see if you actually are stalking them. How do you respond?");
        btn1.setText("Blue");
        btn2.setText("Brown");
        btn3.setText("Ignore the question and try another pickup line");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivStory.setImageResource(R.drawable.im_mcguinnessmichael_prison);
                tvStoryText.setText("OMG you guessed correct! They call the cops on you and you go to prison for a long time. YOU LOSE! You don't get another chance. GAME OVER!");

                points -= 350;
                numLives -=5;
                tvStoryText.setText("You got " + points + " points");

                btn1.setVisibility(View.VISIBLE);
                btn1.setText("GAME OVER GO AWAY");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(GameMcGuinnessMichael.this, MainActivity.class));
                    }
                });
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                confuse();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivStory.setImageResource(R.drawable.im_mcguinnessmichael_weird);
                tvStoryText.setText("You ask them 'Are you a parking ticket? Because I want to jam you under a car windshield' ");

                setAllBtnsVisible();
                btn1.setText("Continue");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (Math.random() > 0.75) {
                            tvStoryText.setText(" Fail. What did you think would happen with a line like that?");
                            points -= 8;
                            defeat();
                        }
                        else {
                            tvStoryText.setText(" They like that? They give you their number? WHAT? What kind of idiot who has never talked to someone made this stupid game?!");
                            points += 40;
                            success();
                        }
                    }
                });


            }
        });


    }

    private void confuse() {
        setAllBtnsVisible();
        tvStoryText.setText("You are wrong and they are really confused. Last chance. What do you do?");
        btn1.setText("Cry");
        btn2.setText("Tell them you love them");
        btn3.setVisibility(View.INVISIBLE);
        //util wuz hear

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("You start crying. They take pity on you and give you their number.");
                points += 7;
                success();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("You tell them you love them. They get visibly disgusted. They tell you they have a boyfriend and walk away. Now you start to cry for real.");
                points -= 13;
                defeat();
            }
        });

    }












    private void defeat() {
        //run method when defeated
//lose a life
        numLives--;
        ivStory.setImageResource(R.drawable.im_mcguinnessmichael_failure);
        //clear console, display text, etc
        tvSubtitle.setText("Failure. Try Again. " + numLives + " lives left\n\t\t\t\t\t\t\t\t\t\t" +points + " points");
        //determine if player gets to play again
        if (numLives > 0) {
            //if you still have lives, return to start()
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setText("Try Again");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start();
                }
            });
        }
        else {
            //print game over message
            btn1.setVisibility(View.VISIBLE);
            btn1.setText("GAME OVER");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(GameMcGuinnessMichael.this, MainActivity.class));
                }
            });
        }

        //no touchie
    }

    private void success() {
        ivStory.setImageResource(R.drawable.im_mcguinnessmichael_success);
        //tvSubtitle.setText("You successfully got their phone number, congratulations! You Win");
        tvSubtitle.setText("You successfully got their phone number, congratulations! You Win\n\t\t\t\t\t\tYou got " + points + " points");
         //util wuz hear

        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setText("Try Again");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });

    }


}