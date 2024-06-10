package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;



public class GameNuonVunly extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    NuonPlayer player = new NuonPlayer("YourPlayerName");
    private int money;
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;


    public void run() {
        //initialize number of lives
        numLives = 5;
        money = 100;
        //create a scanner object for user input
        //create a player object (optional)
        //player = new Person(...)
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);

        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);


        ivStory.setImageResource(R.drawable.im_nuonvunly_1);


        tvTitle.setText("It's HALLOWEEN!");
        tvSubtitle.setText("For some reason in your universe, Halloween is a holiday!. You have nothing to do but play video game");


        //display project title and description

        start();
    }

    private void setAllBtnsVisible() {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }

    private void start() {

        ivStory.setImageResource(R.drawable.im_nuonvunly_2);

        tvStoryText.setText("So....Where do you want to do?");

        setAllBtnsVisible();
        btn1.setText("Play Videogame");
        btn2.setText("PLAY VIDEO GAME");
        btn3.setText("play videogame again");


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoGame();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoGame();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoGame();
            }
        });


    }


    public void videoGame() {
        chooseAPresent();
    }


    public void chooseAPresent() {

        ivStory.setImageResource(R.drawable.im_nuonvunly_3);


        tvStoryText.setText("You decided to stay home and play games. Moment later, Your uncle shown up and want to give you an early present for your birth. But He can't decide.");
        btn1.setText("$1,000");
        btn2.setText("a blaster and a spaceship from starwar");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.addMoney(1000.00);
                tvStoryText.setText("You get $1,000 from your uncle, Now you have $" + player.getMoney());

                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        gamingTime();
                    }
                });


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.getGift();
                tvStoryText.setText("You get $1,000 from your uncle, Now you have $" + player.getMoney());

                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        gamingTime();
                    }
                });

            }
        });

    }


    private void gamingTime() {

        ivStory.setImageResource(R.drawable.im_nuonvunly_4);

        tvStoryText.setText("After that, you hop on a new game...similar to detroit become human. \nHowever! AS soon as you open it, Your Monitor START FLASHIN-----");

        glichingMetrex();
    }


    private void glichingMetrex() {

        ivStory.setImageResource(R.drawable.im_nuonvunly_5);

        tvStoryText.setText("You now have " + numLives + " lives left \nThis is the moment when you realizing that your're now stuck in a game. when you respawn back, you see right in front of you two paths:");

        setAllBtnsVisible();
        btn1.setText("left");
        btn2.setText("right");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                left();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                right();
            }
        });


    }


    private void right() {
        ivStory.setImageResource(R.drawable.im_nuonvunly_6);

        tvStoryText.setText("As soon as you turn right, You see 3 three path:");


        setAllBtnsVisible();
        btn1.setText("A small alleyway to your left");
        btn2.setText("A road infront of you with sign saying \"DO NOT ENTER\"");
        btn3.setText("a road to the right");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemDrop();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumpOverFence();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightToDead();
            }
        });

    }


    private void itemDrop() {

        ivStory.setImageResource(R.drawable.im_nuonvunly_7);

        tvStoryText.setText("*DING* you recieved: \n+1 Dessert Engle, +2 magazine (30 ammos) \nAs soon as you pick up the items, The monster is about 30 feet away and going to charge on you");

        setAllBtnsVisible();
        btn1.setText("Are you gonna shoot it");
        btn2.setText("continue to run");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                continueToShoot();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                continueToRun();
            }
        });

    }


    private void continueToShoot() {

        ivStory.setImageResource(R.drawable.im_nuonvunly_8);

        tvStoryText.setText("*BANG* *BANG* *BANG* *BANG*..... \nYou shot the \"Monster\" until you ran out of the 1st magazine. but It's seem to work because it has that thing SCREAMING screaming. While it stay still and screaming and bleeding, what would you do next?");

        setAllBtnsVisible();
        btn1.setText("shoot again");
        btn2.setText("runaway");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("*you continue to shoot it* Little did you know...The monster slowly stand up and walk toward you...all its blood start to faint out. With just a blink of an eye, it jump to you...");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runAway();
            }
        });


    }






    private void runAway()
    {

        ivStory.setImageResource(R.drawable.im_nuonvunly_9);

        tvStoryText.setText("You decided not to shoot it because you thought that you might miss it \nAfter you took about 4 steps, you see a left turn next to you. What would you do?");

        setAllBtnsVisible();
        btn1.setText("turn left");
        btn2.setText("continue straight");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("The moment you turn, You see a light shine upward coming from a \"place\". fortunately, The monster is still stationary, allowing to get to there. It's a shop");

                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (player.showGift())
                        {
                            lightSaberAndShip();
                        }
                        else
                        {
                            store();
                        }
                    }
                });

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("You decided to continue forward, but it's seem like you have been running on a straight line forever. About 2 minute later, see somthing...behind you...and it's approaching you fast. *As It get closer and closer you realized* It's the monster. In a flash, It already catch up to you and then... ");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });

            }
        });

    }





    private void lightSaberAndShip()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_9);

        tvStoryText.setText("\" You got a starter pack. a light saber and a spaceship. but you can only choose one of these. SO? \"");

        setAllBtnsVisible();
        btn1.setText("Light Saber");
        btn2.setText("SpaceShip");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bossFight();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotTelepot();
            }
        });
    }

    private void gotTelepot()
    {
        tvStoryText.setText(" Thought a spaceship going to spawn? \nA light coming from above and shine dirctly at you. and the closer you look, You realized a ship coming down and abducting you \n*CONGRATULATION YOU WIN* The moment you open your eye again, you'll forget everything.");

        run();
    }


    private void bossFight()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_10);

        String text = ("*+1 light saber*   *change scene to arena* *telepot Jeff* \n Jeff, the Monster appear to have human-like body with superhuman-strength. Its right arm is long and big hand, similar to the normal devil arm usually see in game, skinny and flesh skin, and small left arm \nFIGHT\n Immediately, Jeff approach at you in fast pace and about to swing right \n1. block \n2. dodge ");

        btn1.setText("block");
        btn2.setText("dodge");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeatGame();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                piercingIt();
            }
        });


    }




    private void piercingIt()
    {

        ivStory.setImageResource(R.drawable.im_nuonvunly_11);

        btn1.setText("stab");
        btn2.setText("move");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stabJeff();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeatGame();
            }
        });


    }

    private void stabJeff()
    {

        ivStory.setImageResource(R.drawable.im_nuonvunly_12);


        tvStoryText.setText("You stabbed it in the stomach, lashing out a loud scream. \n*see the opportunity to hit it again...* \n1. pull out and slash it \n2. dodge back");


        setAllBtnsVisible();
        btn1.setText("pull out and slash it");
        btn2.setText("dodge back");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("As you about to slashing it, Jeff's right hand was able to move then proceed to grab your head and crush it ");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backward();
            }
        });


    }



    private void backward()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_11);

        tvStoryText.setText("*Take steps back to give more space* not even a second later, Jeff rushing at you about swing right again, but this time slower and seem weaker than last time....however it still fast.");

        setAllBtnsVisible();
        btn1.setText("try to block...");
        btn2.setText("dodge again...");
        btn3.setText("rush at him and try to slashing its stomach");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("You were able to block the attack, but its superstrength enable it to left kick you at the stomach and start comboing you.");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dodgeAgain();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("You're rushing at him back and even dodge the attack. but as you about to swing, Jeff using sacrifice its left hand to successfully block the light Saber. then proceed grap you by the neck, and choking you to .... ");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });
            }
        });


    }


    private void dodgeAgain()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_13);

        System.out.println("\nYou dodge and try to do like time, but this time your aim for the neck. At the same time, Jeff's left hand was about to swing. \n1. risk it \n2. dodge \n3. change aim to the left hand");
        setAllBtnsVisible();
        btn1.setText("Risk it");
        btn2.setText("Dodge");
        btn3.setText("change aim to its left hand");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("It's a battle of time. But You Won...You piered him in a throat and kill it. \nCongratulation YOU WIN");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        run();
                    }
                });
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("\nYou dodged right but Jeff swing around, back slapping you and...");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("You're rushing at him back and even dodge the attack. but as you about to swing, Jeff using sacrifice its left hand to successfully block the light Saber. then proceed grap you by the neck, and choking you to .... ");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });
            }
        });

    }





    private void store()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_14);

        tvStoryText.setText("You 3 options:");
        setAllBtnsVisible();
        btn1.setText("speed potions ($1050)");
        btn2.setText("ak-47 ($600)");
        btn3.setText("mystery box ($900)");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speedPotion();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ak_47();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mysteryBox();
            }
        });
    }



    private void speedPotion()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_15);

        tvStoryText.setText("The potion give you insane speed and immortality for 1:30min. skipping most of the obstacle. *TIME SKIP TO WHERE THE AFFECT STOP* You stop and face three paths.");

        setAllBtnsVisible();
        btn1.setText("Left Path");
        btn2.setText("Straight Path");
        btn3.setText("The in Between Path");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftPath();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                straightPath();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inBetween();
            }
        });

    }





    private void leftPath()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_16);

        tvStoryText.setText("You see a portal and run into it. \n\"CONGRATULATION YOU WIN\" \nYou wake up in your bed and don't remeber anything");
        btn1.setText("continue");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run();
            }
        });



    }

    private void straightPath()
    {
        tvStoryText.setText("\nAs you continue to run straight, A message pop up \n \"Opp!!! The games haven’t yet so this is a bug\" \nWe going to send you back to nearly the start");
        btn1.setText("continue");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                right();
            }
        });


    }

    private void inBetween()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_17);


        tvStoryText.setText("As you continue to run, There is a deadend and a door infront... \nAs you approach to the door, It need password to open. (This is a dlc path, it's should not be appear right now)...So that mean you stuck here, waiting for dead");
        btn1.setText("continue");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeatGame();
            }
        });
    }







    private void ak_47()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_18);

        tvStoryText.setText("+1 Gun, +5 Mag \nYou shoot the monster finished 1st Mag. However, AS you try to shoot try to it, The monster's regeneration power getting more stronger and stronger, to the point of bullet become useless...");
        btn1.setText("continue");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeatGame();
            }
        });
    }




    private void mysteryBox()
    {
        int chances = (int) (Math.random() * 3) + 1;
        if (chances == 1 || chances == 3)
        {
            grenade();
        }
        else if (chances == 2)
        {
            bossFight();
        }

    }



    private void grenade()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_19);

        System.out.println("wow...one single grenade...\n1. end yourself \n2. throw to the monster");

        setAllBtnsVisible();
        btn1.setText("end yourself");
        btn2.setText("throw to the monster");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("You open the trigger and rush to the monster....");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("You throw it to the monster....It dodged.....");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });
            }
        });

    }







    private void continueToRun()
    {

        ivStory.setImageResource(R.drawable.im_nuonvunly_21);

        tvStoryText.setText("You decided not to shoot it because you thought that you might miss it \nAfter you took about 4 steps, you see a left turn next to you. What would you do? \n1. turn left \n2. continue straight");
        setAllBtnsVisible();
        btn1.setText("turn left");
        btn2.setText("continue straight");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("The moment you turn, You see a light shine upward coming from a \"place\". unfortunately, you're too slow and the \"thing\" catch up to you....");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("You decided to continue forward, but what you don't realized is how fast the \"monster\" is. In a flash, It already catch up to you and then...");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });
            }
        });

    }








    private void jumpOverFence()
    {

        int chances = (int) (Math.random() * 5) + 1;
        if (chances == 1 || chances == 2 || chances == 4 || chances == 5)
        {
            ivStory.setImageResource(R.drawable.im_nuonvunly_22);

            tvStoryText.setText("A sign placed there for a reason.... You then proceed to fall off a climb");
            btn1.setText("continue");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeatGame();
                }
            });
        }
        else
        {
            ivStory.setImageResource(R.drawable.im_nuonvunly_23 );

            tvStoryText.setText("WOW, NO WAY!! You actually so lucky. Congrat, You won");
            btn1.setText("continue");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    run();
                }
            });
        }
    }




    private void rightToDead()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_24);

        tvStoryText.setText("\"You're at the starting line\" \nTurn out there a barrier at a starting line, unfortunate...");
        btn1.setText("continue");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeatGame();
            }
        });

    }




    private void left()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_25);

        System.out.println("You took left and then see a split way again, Which way you going? ");
        setAllBtnsVisible();
        btn1.setText("Left");
        btn2.setText("Right");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("You're at a starting line");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstObstacle();
            }
        });

    }



    private void firstObstacle()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_26);

        tvStoryText.setText("\nAs soon as you turned, You see: \n1. A fence that you might able to jump over \n2. A wall with broken bottom part");
        setAllBtnsVisible();
        btn1.setText("A fence that you might able to jump over");
        btn2.setText("A wall with broken bottom part");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondObstacle();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText(" wall is too close to slide in and too small to roll over. which allow the monster to catch up");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });

            }
        });

    }


    private void secondObstacle()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_27);

        System.out.println("\nAfter jump across, the road getting smaller, barely fit two person. and there is a do-- \n *quick time event*");
        setAllBtnsVisible();
        btn1.setText("dropping planks on your right to block way...");
        btn2.setText("grab a crowbar and throw at the monster... ");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("You dropped all the planks down and not realized they connect to a big rock above. dropping the plank meaning that a big rock also fall down and it fail on the monster, knocking it out for a moment ");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        door();
                    }
                });

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("When you threw that crowber, It hit its throat which is a jekpot (because it's the monster's weak point), knocking the monster out for a mmonet");

                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        door();
                    }
                });

            }
        });

    }

    private void door()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_28);


        System.out.print("\nThis giving you time to rush to the door. beside you there: \n1. A key \n2. An axe");
        setAllBtnsVisible();
        btn1.setText("A key");
        btn2.setText("An axe");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomKey();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anAxe();
            }
        });

    }

    private void randomKey()
    {

        int chances = (int) (Math.random() * 4) + 1;
        if (chances == 1 || chances == 2 || chances == 4 )
        {
            ivStory.setImageResource(R.drawable.im_nuonvunly_29);

            tvStoryText.setText("Oh oh! wrong key...");
            btn1.setText("continue");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeatGame();
                }
            });
        }
        else
        {
            ivStory.setImageResource(R.drawable.im_nuonvunly_17);

            tvStoryText.setText("*Door unlocked*");
            btn1.setText("continue");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    triviaQuestions();
                }
            });

        }
    }



    private void anAxe()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_10);

        System.out.println("\nYou pick up the axe and immediately axing the door viciously. after 30second of cutting the door, The monster wake up. and you start panicking \n1. continue \n2. facing the monster");
        setAllBtnsVisible();
        btn1.setText("continue");
        btn2.setText("facing the monster");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("\nAnd then the door crack a huge hole. with no time less, You hurry and go through ");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        triviaQuestions();
                    }
                });

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("You try charging toward the monster but he just launch to you and grab by the head first. and crushing it.");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });

            }
        });

    }


    private void triviaQuestions()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_30);

        tvStoryText.setText("*TRIVIA TIME* TIME REMAIN STOP UNTIL YOU ANSWER THE QUESTION. \nWhat was the first Disney animated feature movie that was not based on an already existing story? ");
        setAllBtnsVisible();
        btn1.setText("Lion King");
        btn2.setText("Cinderella");
        btn3.setText("Bambi");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("Correct");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finalDestination();
                    }
                });

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("WRONG");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("Close but WRONG");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });

            }
        });

    }

    private void finalDestination()
    {

        ivStory.setImageResource(R.drawable.im_nuonvunly_31);

        tvStoryText.setText("After answer the question and go to the door, you see see two path. \n1. right lane \n2. diagonal line to the right");
        setAllBtnsVisible();
        btn1.setText("right lane");
        btn2.setText("diagonal line to the right");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("As you continue to run, There is a deadend and a door infront...\nAs you approach to the door, It need password to open. (This is a DLC path, it's should not be appear right now)...So that mean you stuck here, waiting for dead");

                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeatGame();
                    }
                });

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvStoryText.setText("You see a portal and run into it. \n\"CONGRATULATION YOU WIN\" \nYou wake up in your bed and don't remeber anything ");
                btn1.setText("continue");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        run();
                    }
                });

            }
        });


    }











    private void defeatGame()
    {
        ivStory.setImageResource(R.drawable.im_nuonvunly_999);

        //run method when defeated


        //lose a life
        numLives--;

        //clear console, display text, etc
        //System.out.println(...)

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            tvStoryText.setText(TextColor.RED_BOLD + "YOU DIE");
            btn1.setText("continue");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    glichingMetrex();
                }
            });


        }
        else
        {
            tvStoryText.setText(TextColor.RED_BACKGROUND_BRIGHT + "GAME OVER");
        }

    }






}