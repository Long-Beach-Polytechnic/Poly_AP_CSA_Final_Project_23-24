package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;

public class GameLeangThong extends GameActivity {

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;
    private int numLives;

    @Override
    protected void run() {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("Which pill will you take?");
        tvSubtitle.setText("By Andrew Leang");
        numLives = 5;
        start();
    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }



    public void start()
    {

        isWon = false;

        ivStory.setImageResource(R.drawable.im_leangthong_pills);

        tvStoryText.setText("You're a freshmen at a college frat party, a senior offers you three pills. A red, a blue, and a black pill. Which pill will you take?");
        setAllBtnsVisible();
        btn1.setText("Red Pill");
        btn2.setText("Blue Pill");
        btn3.setText("Black Pill");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mountain();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                island();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                war();
            }
        });

    }

    //________Red Pill________
    public void mountain()
    {
        //mountain adventure
        ivStory.setImageResource(R.drawable.im_leangthong_mountain);
        tvSubtitle.setVisibility(View.INVISIBLE);

        tvStoryText.setText("You wake on a desolated rocky mountain, and find a piece of paper in your hand. You read it and it says, Reach the top and a reward awaits you.");

        setAllBtnsVisible();

        setAllBtnsVisible();
        btn1.setText("Hike up a path");
        btn2.setText("Climb the mountain");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hike();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                climb();
            }
        });


    }

    public void hike()
    {
        tvStoryText.setText("While you hike up the colossal mountain you encounter a mountain lion. What do you do?");

        ivStory.setImageResource(R.drawable.im_leangthong_hike);

        setAllBtnsVisible();
        btn1.setText("Fight");
        btn2.setText("Make a run for it");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fight();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runAway();
            }
        });

    }

    public void runAway()
    {
        tvStoryText.setText("You're not that guy pal... the mountain lion mauls you.");

        ivStory.setImageResource(R.drawable.im_leangthong_run_away);

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });

    }

    public void fight()
    {
        double luckFight = Math.random();
        if (luckFight <= .5)
        {
            tvStoryText.setText("You're not that guy pal... the mountain lion beats you to a pulp.");

            ivStory.setImageResource(R.drawable.im_leangthong_fight);

            setAllBtnsVisible();
            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    defeat();
                }
            });
        }
        else
        {
            tvStoryText.setText("You found grenades on the ground and blow up the fierce beast.");

            ivStory.setImageResource(R.drawable.im_leangthong_grenades);

            setAllBtnsVisible();
            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bloodLossEnding();
                }
            });
        }
    }

    public void bloodLossEnding()
    {
        double luckFight = Math.random();
        if (luckFight > .5 && luckFight <= .75)
        {
            tvStoryText.setText("You survived the fight, but die to blood loss... womp womp");

            ivStory.setImageResource(R.drawable.im_leangthong_lose_to_lion);

            setAllBtnsVisible();
            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    defeat();
                }
            });
        }
        else
        {
            tvStoryText.setText("You managed to take out the lion without even a scratch");

            ivStory.setImageResource(R.drawable.im_leangthong_defeat_lion);

            setAllBtnsVisible();
            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    topOfMountain();
                }
            });
        }
    }

    public void topOfMountain()
    {
        tvStoryText.setText("Congratulations Adventurer!!! Oh wait there's an alter with a purple drink on it. Do you drink it?");

        ivStory.setImageResource(R.drawable.im_leangthong_purple_drink_mountain);

        setAllBtnsVisible();
        btn1.setText("Drink the mysterious lean");
        btn2.setText("Don't drink it (Don't be a prune)");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        drinkPotionOnMountain();
                    }
                });

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dontDrinkPotionOnMountain();
                    }
                });
            }
        });

    }

    public void drinkPotionOnMountain()
    {
        tvStoryText.setText("You drink the lean, and black out once again. You wake back up at the party, and the senior offers you the pills again. Which will you take?");

        ivStory.setImageResource(R.drawable.im_leangthong_drinking_potion_mountain);

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });

    }

    public void dontDrinkPotionOnMountain()
    {
        tvStoryText.setText("Guess what... you died to oxygen deprivation (hahahhahahahahahahahhaahahahah)");

        ivStory.setImageResource(R.drawable.im_leangthong_oxygen);

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });

    }

    public void climb()
    {
        System.out.println("\nYou decided to scale the mountain");
        System.out.println("1. Take it nice and slow (slowpoke)\n2. Yolo it and rush the climb");

        tvStoryText.setText("You decided to scale the mountain");

        ivStory.setImageResource(R.drawable.im_leangthong_climb);

        setAllBtnsVisible();
        btn1.setText("Take it nice and slow (slowpoke)");
        btn2.setText("Yolo it and rush the climb\"");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slowPoke();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { yoloClimb(); }
        });
    }

    public void slowPoke()
    {
        tvStoryText.setText("Well you're no fun, but after 37 hours of climbing slower than a grandma on the highway, you make it to the top.");

        ivStory.setImageResource(R.drawable.im_leangthong_slow_poke);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topOfMountain();
            }
        });
    }

    public void yoloClimb()
    {
        tvStoryText.setText("You decided to ball out and speedrun climbing the mountain.");

        ivStory.setImageResource(R.drawable.im_leangthong_yolo_climb);
        double chance = Math.random();

        if (chance <= .5)
        {
            tvStoryText.setText("Well... that was a bad idea you fell and snap both your legs. And some rabid bunnies tickle you to death.");

            ivStory.setImageResource(R.drawable.im_leangthong_fall);

            setAllBtnsVisible();
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
        else
        {
            tvStoryText.setText("Oh wow you survived the climb... You have reached the top of the mountain!!!");

            ivStory.setImageResource(R.drawable.im_leangthong_successful_climb);

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    topOfMountain();
                }
            });
        }
    }

    //________Blue Pill________
    public void island()
    {
        //island adventure
        tvStoryText.setText("You wake up in a plane seat of a plane that seemed to have crash on a beach and is also missing its front half. Well anyways you smell some oil and... booooommmmmmmm****, you get sent flying across the beach and slam into a palm tree. You regain consciousness after a few hours and it's about to be night so now you have to find shelter. Where do you go?");

        ivStory.setImageResource(R.drawable.im_leangthong_island);

        setAllBtnsVisible();
        btn1.setText("Walk along the coast");
        btn2.setText("Venture into the forest");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coast();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forest();
            }
        });

    }

    public void forest()
    {
        tvStoryText.setText("You decided on venturing into the forest. The forest is loud and wet. Mosquitoes are going crazy and biting the living out of you. Itchy and afraid you start hearing some familar sounds. The sound of people, you begin rushing to the sound. As your about to reach the sound , you decided to hide in a bush to make sure they're friendly first of all. You see local natives of the natives in a small village living peacefully. Now what will you do?");

        ivStory.setImageResource(R.drawable.im_leangthong_forest);

        setAllBtnsVisible();
        btn1.setText("Join them (boring) peacefully");
        btn2.setText("Pillage and plunder (embrace inner european)");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                join();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exterminate();
            }
        });
    }

    public void exterminate()
    {
        tvStoryText.setText("Well aren't you a genocidal maniac... So how will you approach this massacre? ");

        ivStory.setImageResource(R.drawable.im_leangthong_exterminate);

        setAllBtnsVisible();
        btn1.setText("Burn their village to the ground");
        btn2.setText("Fight them barefist");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arson();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bigMan();
            }
        });
    }

    public void arson()
    {
        tvStoryText.setText("To top it off you're also a Pyromaniac. Well anyways you camp in the bush till night time. After all the villagers fell asleep you begin igniting all their wood houses. As you watch the inferno with the screams of the poor villagers. You seem to have overdone it and the fire is spreading to the trees, but anyways that ain't you're problem so you decide to call it a day and went to sleep.");

        ivStory.setImageResource(R.drawable.im_leangthong_arson);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { helicoptor(); }
        });
    }

    public void helicoptor()
    {
        tvStoryText.setText("As you wake up from your beauty sleep and you hear the faint sounds of helicoptors, they seemed to have notice the notice the hellfire you caused last night. A helicoptor picks you up and you flies back to the main land. However, you see a familar face sitting next to you. It's the senior and he offers you the pills once again. Which will you take?");

        ivStory.setImageResource(R.drawable.im_leangthong_helicoptor);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { start(); }
        });
    }

    public void bigMan()
    {
        tvStoryText.setText("You leave the bush and get ready to massacre them all with your bare hands, when out came a 7ft tall and jacked up villager from the treelines, ready to throw hands.");

        ivStory.setImageResource(R.drawable.im_leangthong_big_man);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { bigManFightProbability(); }
        });
    }

    public void bigManFightProbability()
    {
        double luckFight = Math.random();
        if (luckFight > .5)
        {
            tvStoryText.setText("The giant rams right into you at the speed of 50 mph, sending you ragdolling, as you barely get up he grabs you by the neck and tosses you into the air, then does a flying knee to your spine rendering you crippled. After all that he drags you to an active volcano and launches straight into the molten lava. X_X");

            ivStory.setImageResource(R.drawable.im_leangthong_ram);

            setAllBtnsVisible();
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
        else
        {
            tvStoryText.setText("With the power of plot armor and the gun in your pocket you take out the giant man before he could even touched you. After that shortlived battle, the villagers were amazed by your skills and offer you a bowl filled with a purple liquid. Do you drink it?");

            ivStory.setImageResource(R.drawable.im_leangthong_beat_giant);

            setAllBtnsVisible();
            btn1.setText("Yes (gotta stay hydrated)");
            btn2.setText("No (What if it's poison?)");
            btn3.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    potion();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    noPotion();
                }
            });
        }
    }

    public void join()
    {
        tvStoryText.setText("You come out the bush hands in the air, and the natives start screaming and they start blowdarting you. As the 100 tranqs enter your system you immediately knock out. You slowly start waking up after a few days, your legs are completely paralyzed and you're being dragged by the natives. They bring you to a room and throw you into it. Now in front you lays a bowl full of a purple substance. Do you drink it?");

        ivStory.setImageResource(R.drawable.im_leangthong_join);

        setAllBtnsVisible();
        btn1.setText("Drink it...What's the worse that could happen?");
        btn2.setText("Don't take it (drugs are bad for you >_<)");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potion();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noPotion();
            }
        });
    }

    public void potion()
    {
        tvStoryText.setText("You drink the mysterious purple substance, and black out once again. You wake back up at the party, and the senior offers you the pills again. Which will you take?");

        ivStory.setImageResource(R.drawable.im_leangthong_potion);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    public void noPotion()
    {
        defeat();

        tvStoryText.setText("Well you decided not take it. Afterwards, the villagers greeted you as one of their own and you live the rest of your meaningless life as one of them. Shortly after you died to some waterborne disease.");

        ivStory.setImageResource(R.drawable.im_leangthong_no_potion);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { defeat(); }
        });
    }

    public void coast()
    {

        tvStoryText.setText("While you walk along the coast, you spot something in the distance and run towards it, only to find a skinwalker eating a sea lion. As you try backing up the stench of your musty clothes gains the attention of the skinwalker and it starts chasing after you. What now?");

        ivStory.setImageResource(R.drawable.im_leangthong_coast);

        setAllBtnsVisible();
        btn1.setText("Run for dear life");
        btn2.setText("Take your chances with the ocean");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keepOnRunning();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                water();
            }
        });
    }

    public void keepOnRunning()
    {
        double speed = Math.random();
        if (speed <= .5)
        {
            tvStoryText.setText("Shouldn't have been a couch potato... the skinwalker catches you and chomps off your head. Then it proceeds to emote on you.");

            ivStory.setImageResource(R.drawable.im_leangthong_keep_on_running);

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) { defeat(); }
            });
        }
        else
        {
            tvStoryText.setText("You somehow managed to outrun the skinwalker... joining the track team was a good decision on your part.");

            ivStory.setImageResource(R.drawable.im_leangthong_successfully_running_away);

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) { boat(); }
            });
        }
    }
    public void boat()
    {
        tvStoryText.setText("After running for hours on end you find a boat house. You decide to finally rest after the day you had until you suddenly smell the scent of gas... kabooooommm**** (don't go in other people's houses.)");

        ivStory.setImageResource(R.drawable.im_leangthong_boat);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { defeat(); }
        });
    }
    public void water()
    {
        tvStoryText.setText("You really thought that would work?... the skinwalker jumps on top of you and drowns you. Then it teabags on your corpse.");

        ivStory.setImageResource(R.drawable.im_leangthong_water);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { defeat(); }
        });
    }

    //________Black Pill________
    public void war()
    {
        tvStoryText.setText("You wake up in a trench, you are in the middle of battle during a blitzkrieg. You also have no weapons on you except for your French uniform. You hear nazi soldiers closing in on you. You gotta make a move now, what will you do?");

        ivStory.setImageResource(R.drawable.im_leangthong_war);

        setAllBtnsVisible();
        btn1.setText("Play dead (Too Scawwyy >_<)");
        btn2.setText("Fight the war (BE A MAN)");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playDead();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                warFight();
            }
        });
    }

    public void warFight()
    {
        tvStoryText.setText("Good job soldier, you made the right choice. Now what is your first line of action?");

        ivStory.setImageResource(R.drawable.im_leangthong_war_fight);

        setAllBtnsVisible();
        btn1.setText("Loot a gun from a body (They aint gonna need it anymore)");
        btn2.setText("Hide in a bunker (chat is this guy serious rn)");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loot();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coward();
            }
        });
    }

    public void loot()
    {
        tvStoryText.setText("You let go of your morals and start looting some bodies. !!!!YOU FOUND A LUGER!!!! with one bullet in it only. What's the strategy now?");

        ivStory.setImageResource(R.drawable.im_leangthong_loot);

        setAllBtnsVisible();
        btn1.setText("Camp (superior tactic)");
        btn2.setText("Get on the offensive");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                camp();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shoot();
            }
        });
    }

    public void shoot()
    {
        tvStoryText.setText("Now that you have yourself a weapon (1 bullet *_*) how are you going to go about winning the war?");

        ivStory.setImageResource(R.drawable.im_leangthong_shoot);

        setAllBtnsVisible();
        btn1.setText("Be strategic and plan first (nerd 0_0)");
        btn2.setText("Go out GUNS BLAZING!!! (One bullet one kill)");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sniped();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tank();
            }
        });
    }

    public void sniped()
    {
        tvStoryText.setText("You decided on making a plan, so to start you should get a view of your surroundings. You peak your head outside the trench... you're dead you just got head-shotted by a sniper 10 miles away (skill issue).");
        ivStory.setImageResource(R.drawable.im_leangthong_sniped);

        setAllBtnsVisible();
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

    public void tank()
    {
        tvStoryText.setText("You don't need a plan you're the main character, so with that you jump out of the trenches and start running across the battlefield, dodging stray bullets with the power of plot armor, and you come across a empty tank. You pilot it and go on a rampage deleting the enemy and your allies. After five filler episodes you finally finish the battle and come out on top.");
        ivStory.setImageResource(R.drawable.im_leangthong_tank);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                victory();
            }
        });
    }

    public void victory()
    {
        tvStoryText.setText("As you celebrate your victory against the Nazis, a portal suddenly opens below you sending you into a void of complete darkness, you shortly black out after loss of oxygen. You wake back up at the party, and the senior offers you the pills again. Which will you take?");
        ivStory.setImageResource(R.drawable.im_leangthong_victory);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    public void camp()
    {
        tvStoryText.setText("You wait silently and patiently for a target to come by. As nazis pass by you take them out one by one then loot them and repeat. And after 4 hours of this process you manage to wipe out the whole enemy squadron leading your nation to victory. (Fortnite Zero Build) ");
        ivStory.setImageResource(R.drawable.im_leangthong_camp);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                victory();
            }
        });
    }

    public void coward()
    {
        tvStoryText.setText("You decide to hide in a bunker till the blitzkriegs ends. (Well I take back what I said you darn sissy)");
        ivStory.setImageResource(R.drawable.im_leangthong_coward);
        double chance = Math.random();

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chance <= .5) {
                    gas();
                } else {
                    allies();
                }
            }
        });


    }

    public void gas()
    {
        tvStoryText.setText("Well... that was a bad idea the Nazis leak some gas bombs inside and you suffocate. (L way to die) ");
        ivStory.setImageResource(R.drawable.im_leangthong_gas);

        setAllBtnsVisible();
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

    public void allies()
    {
        tvStoryText.setText("Whats that... you hear the shooting from outside come to abrupt stop, as you peak your head outside you see that the nazis have left and your allies won. You get to live another day.");
        ivStory.setImageResource(R.drawable.im_leangthong_allies);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sike();
            }
        });
    }

    public void sike()
    {
        tvStoryText.setText("SIKKKEEEE. You got 360 no scoped by a sniper camping on a hill 5 miles away. X_x skill issue");
        ivStory.setImageResource(R.drawable.im_leangthong_sike);

        setAllBtnsVisible();
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

    public void playDead()
    {
        double chance = Math.random();
        if (chance >= .5)
        {
            tvStoryText.setText("You really thought that would work... the Nazis jump you and beat the living out of you, then they took you to one of their concentration camps");
            ivStory.setImageResource(R.drawable.im_leangthong_caught);

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    captured();
                }
            });
        }
        else
        {
            tvStoryText.setText("Due to your immense stealth skills, you managed to appear completely invisible to the soldiers, as they leave you alone, you see an opening to run to the tree-lines and desert the battle. As you run for dear life you hear your fellow comrades call you a dirty coward.");
            ivStory.setImageResource(R.drawable.im_leangthong_successful_stealth);

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    deserter();
                }
            });
        }
    }

    public void deserter()
    {
        tvStoryText.setText("You suddenly feel a hit of guilt as your about to desert the battle. Will you go back in the warzone?");
        ivStory.setImageResource(R.drawable.im_leangthong_guilt);

        setAllBtnsVisible();
        btn1.setText("Go back to the war");
        btn2.setText("Nah looking out for #1 only");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                warFight();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                woods();
            }
        });
    }

    public void woods()
    {
        tvStoryText.setText("As you flee into the forest you reach an abandoned house, and decide to rest on a bed for a sec. Then you started hearing some beeping under it ... kabboooooooommmmm X_X (the house was rigged with explosives >_<) ");
        ivStory.setImageResource(R.drawable.im_leangthong_woods);

        setAllBtnsVisible();
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

    public void captured()
    {
        tvStoryText.setText("Well now you're a war prisoner of the Nazis. They put you in a cell room with an interrogator. They offer you a chance of freedom, if you rat out your comrades. What will you do?");
        ivStory.setImageResource(R.drawable.im_leangthong_captured);

        setAllBtnsVisible();
        btn1.setText("Rat out your team");
        btn2.setText("Don't snitch on them");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snitch();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dontSnitch();
            }
        });
    }

    public void dontSnitch()
    {
        tvStoryText.setText("Good on you for staying loyal and not betraying your nation... however the Nazis didn't take it so well and they sent you to solitude confinement.");
        ivStory.setImageResource(R.drawable.im_leangthong_dont_snitch);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prisoner();
            }
        });
    }

    public void snitch()
    {
        double speed = Math.random();
        if (speed <= .5)
        {
            tvStoryText.setText("You immediately rat out your whole nation without hesitation.");
            ivStory.setImageResource(R.drawable.im_leangthong_snitch);

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    traitor();
                }
            });
        }
        else
        {
            tvStoryText.setText("Well you betrayed the nation, and even more you were gullible in thinking the nazis will set you free. The nazis drag you into soilitude confinement.");
            ivStory.setImageResource(R.drawable.im_leangthong_snitch);

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    prisoner();
                }
            });
        }
    }

    public void prisoner()
    {
        tvStoryText.setText("Well well well, aren't you in a tough pickle now. Trapped in a prison cell waiting to starve to death. (you suck as this game)");
        ivStory.setImageResource(R.drawable.im_leangthong_prisoner);

        setAllBtnsVisible();
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

    public void traitor()
    {
        tvStoryText.setText("Well not only did you betray your whole nation, but with your charismatic skills you convinced the Nazis to let you live by switching teams. *_*). However the bomb implanted into your French suit exploded immediately after detecting your act of treason.");
        ivStory.setImageResource(R.drawable.im_leangthong_traitor);

        setAllBtnsVisible();
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

    public void defeat()
    {
        //run method when defeated


        //lose a life
        numLives--;

        //clear console, display text, etc


        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            tvStoryText.setText("Damn you suck");
            ivStory.setImageResource(R.drawable.im_leangthong_defeat);

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start();
                }
            });
        }
        else
        {
            //print game over message
            tvStoryText.setText("GAME OVER LOSER");
            ivStory.setImageResource(R.drawable.im_leangthong_defeat);

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start();
                }
            });
        }

    }
}