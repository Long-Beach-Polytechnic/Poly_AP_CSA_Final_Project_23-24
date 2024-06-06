package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameHoboJoeAdventure extends GameActivity {

        //instance variables
        //   variables you plan to use throughout the adventure

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
    private boolean isWon;
    private int numLives;

        @Override
    protected void run() {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);

        tvTitle.setText("Hobo Joe Adventure");
        tvSubtitle.setText("Master the dark arts of the homeless");


        start();

        }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
    }

        private void start() {

            isWon = false;

            tvStoryText.setText("You are Hobo Joe decide what to do");
            ivStory.setImageResource(R.drawable.homeless_black_anime);

            setAllBtnsVisible();
            btn1.setText("Fight another homeless person for their cheese pizza");
            btn2.setText("Go dumpster diving");
            btn3.setText("Put on hobo ski mask and rob something");
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cheesePizza();
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dumpster();
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    hoboRob();
                }
            });
        }
        //cheese pizza path
        private void cheesePizza() {

            ivStory.setImageResource(R.drawable.homeless_with_cheese_pizza);

            tvStoryText.setText("You chose to fight another homeless man for the pizza what do you do");

            setAllBtnsVisible();
            btn1.setText("Hit him with the 3 piece combo");
            btn2.setText("Grab the pizza and run");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    threeHit();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    grabPizza();
                }
            });

        }

        //choice 1
        private void threeHit() {

            ivStory.setImageResource(R.drawable.homeless_black_threehit);

            tvStoryText.setText("Your attack was successful but it barely phased him You also remember you had white powder in your pocket what do you do");

            setAllBtnsVisible();
            btn1.setText("Trade him the powder for the pizza");
            btn2.setText("Use the powder to fight back");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tradePowder();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    usePowder();
                }
            });
        }

        private void usePowder() {

                isWon = false;
                ivStory.setImageResource(R.drawable.homeless_usepowder);
                tvStoryText.setText("You used the powder and gained powers you beat up the homeless and ate the pizza but it was laced with fentanyl you died");


                setAllBtnsVisible();
                btn1.setText("Play again");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);
                btn4.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeat();
                    }
                });

        }

        private void tradePowder() {

            isWon = true;
            ivStory.setImageResource(R.drawable.homeless_trade_sugar);
            tvStoryText.setText("You decide to trade the powder for the pizza he gladly accepts nice you don't starve and made a new crack friend");


            setAllBtnsVisible();
            btn1.setText("Play again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {defeat();}
            });

        }

        //choice 2
        private void grabPizza() {

            ivStory.setImageResource(R.drawable.homeless_running_away_with_pizza_in_hand);

            tvStoryText.setText("You rush in and grab his pizza what do you do next");

            setAllBtnsVisible();
            btn1.setText("Don't stop and keep running");
            btn2.setText("Throw it at his face");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    keepRunning();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    throwFace();
                }
            });

        }

        private void keepRunning() {

            isWon = false;
            ivStory.setImageResource(R.drawable.homeless_with_pizza_in_hand_running_away_pizza_deadend);
            tvStoryText.setText("You ran into a dead end and he catches up and you died");

            setAllBtnsVisible();
            btn1.setText("Play again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }
            });
        }

        private void throwFace() {

            isWon = false;
            ivStory.setImageResource(R.drawable.homeless_with_pizza_in_hand_running_away_pizza_thrown_at_face);
            tvStoryText.setText("You successfully escape but you starve to death after");


            setAllBtnsVisible();
            btn1.setText("Play again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }

            });

        }



        //dumpster diving path
        private void dumpster() {

                ivStory.setImageResource(R.drawable.homeless_dumpster_in_hood);
                tvStoryText.setText("Dumpster diving what do you do");

                setAllBtnsVisible();
                btn1.setText("Belly flop in");
                btn2.setText("Flip the dumpster over");
                btn3.setVisibility(View.INVISIBLE);
                btn4.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bellyFlop();
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flipDumpster();
                    }
                });



        }
        //choice 1

        private void bellyFlop() {
            ivStory.setImageResource(R.drawable.homeless_bellyflop_in_dumpster);
            tvStoryText.setText("You dive in and get cut up bad what do you do");

            setAllBtnsVisible();
            btn1.setText("Cover your wounds with dirty rags");
            btn2.setText("Thug it out and keep searching");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bellyFlop();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flipDumpster();
                }
            });

        }

        private void coverWound() {

            isWon = false;
            ivStory.setImageResource(R.drawable.homeless_covered_in_rags_inside_dumpster);
            tvStoryText.setText("Rip you have Aids, Hiv, Stds and herpes worst than death");



            setAllBtnsVisible();
            btn1.setText("Play again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }

            });

        }

        private void keepSearching() {

            ivStory.setImageResource(R.drawable.homeless_with_cheese_pizza);
            tvStoryText.setText("You found a med kit and some white stuff what do you use");

            setAllBtnsVisible();
            btn1.setText("use the med kit");
            btn2.setText("use the white stuff");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    useMedkit();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    takeWhite();
                }
            });


        }

        private void useMedkit() {

                isWon = false;
            ivStory.setImageResource(R.drawable.homeless_with_cheese_pizza);
                tvStoryText.setText("You used the med kit but it was dirty used for drugs you died");



                setAllBtnsVisible();
                btn1.setText("Play again");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);
                btn4.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeat();
                    }

                });


        }

        private void takeWhite() {

            isWon = false;
            ivStory.setImageResource(R.drawable.homeless_holding_homeless_sugar_in_bag);
            tvStoryText.setText("You take the white stuff but later on you get more addicted to it and spend every last penny for more eventually you couldn't handle it and died");



            setAllBtnsVisible();
            btn1.setText("Play again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }

            });

        }


        //choice 2
        private void flipDumpster() {

            ivStory.setImageResource(R.drawable.homeless_flip_over_dumpster);
                tvStoryText.setText("You flipped the dumpster and see a glowing green rat and a honey bun pick one up");

                setAllBtnsVisible();
                btn1.setText("Pick up the glowing green rat");
                btn2.setText("Pick up the honey bun");
                btn3.setVisibility(View.INVISIBLE);
                btn4.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        greenRat();
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        honeyBun();
                    }
                });


        }

        private void greenRat() {

            isWon = false;
            ivStory.setImageResource(R.drawable.green_rat_coming_out_dumpster);
            tvStoryText.setText("The rat was radioactive and you picked it up and died");



            setAllBtnsVisible();
            btn1.setText("Play again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }

            });

        }

        private void honeyBun() {

            isWon = true;
            ivStory.setImageResource(R.drawable.homeless_man_lava);
            tvStoryText.setText("It was hot like a volcano you gain powers to create a domain iron coffin meter and you are able obliterated the city you mastered the homeless powers to its fullest");



            setAllBtnsVisible();
            btn1.setText("Play again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }

            });

        }

        //robbing path
        private void hoboRob() {

            ivStory.setImageResource(R.drawable.hobo_ski_mask_black);
            tvStoryText.setText("Put on hobo ski mask what do you rob");

            setAllBtnsVisible();
            btn1.setText("Rob a bank");
            btn2.setText("Rob the local crackhead");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    robBank();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    robCracked();
                }
            });

        }

        //choice 1
        private void robBank() {

            ivStory.setImageResource(R.drawable.rob_bank_store);
            tvStoryText.setText("You get in the bank decide what you wanna do");

            setAllBtnsVisible();
            btn1.setText("Take off hobo mask");
            btn2.setText("Rush inside the vault");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    robBank();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    robCracked();
                }
            });

        }

        private void maskOff() {

            isWon = false;

            tvStoryText.setText("Your face is so hideous it breaks everything around you except the free money that was easy");



            setAllBtnsVisible();
            btn1.setText("Play again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }

            });

        }

        private void rushVault(){

            ivStory.setImageResource(R.drawable.homeless_man_covered_in_money_in_a_bank_by_himself);
            tvStoryText.setText("Who that dumb to leave the vault open but it closes shut on you what do you do");

            setAllBtnsVisible();
            btn1.setText("Take out the white powder and use");
            btn2.setText("Eat the money inside");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pocketPowder();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    eatMoney();
                }
            });

        }

        private void pocketPowder()
        {

            isWon = false;
            ivStory.setImageResource(R.drawable.homeless_sugar_in_bank);
            tvStoryText.setText("You broke out with the strength but died after effects wore off");



            setAllBtnsVisible();
            btn1.setText("Play again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }

            });

        }

        private void eatMoney()
        {


            isWon = false;
            ivStory.setImageResource(R.drawable.homeless_man_eating_money_covered_in_money_in_a_bank_surrounded_by_poop);
            tvStoryText.setText("You ate the money but the cops arrested you but they believed you had a mental disability and let you go after you poop the money out light work no reaction easy money");



            setAllBtnsVisible();
            btn1.setText("Play again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }

            });

        }


        //choice 2
        private void robCracked()
        {

            ivStory.setImageResource(R.drawable.homeless_sugar_rob);

            tvStoryText.setText("You decide to rob the local crackhead what do you do");

            setAllBtnsVisible();
            btn1.setText("Do a hit and run grab the powder");
            btn2.setText("Heat up a honey bun");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    snatchPowder();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    hotHoneyBun();
                }
            });

        }

        private void snatchPowder()
        {

            isWon = false;
            ivStory.setImageResource(R.drawable.homeless_black_punching);
            tvStoryText.setText("Rip it did not phase him and he channeled his crackhead energy into one attack and blasts you to oblivion");



            setAllBtnsVisible();
            btn1.setText("Play again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }

            });

        }

        private void hotHoneyBun()
        {
            ivStory.setImageResource(R.drawable.homeless_super_hot_honeybun);
            tvStoryText.setText("The honey bun is steaming hot do something quick");

            setAllBtnsVisible();
            btn1.setText("Eat the honey bun");
            btn2.setText("Throw it at the local crackhead");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    eatHoneyBun();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    throwHoneyBun();
                }
            });

        }

        private void eatHoneyBun()
        {

            isWon = true;
            tvStoryText.setText("You ate the honey bun but something feels off you are now a vessel for the strongest curse and he takes control and destroyed half the city");



            setAllBtnsVisible();
            btn1.setText("Play again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }

            });

        }

        private void throwHoneyBun()
        {

            isWon = false;
            tvStoryText.setText("You threw the honey bun at him but the crackhead had a trick of his sleeve and countered with a domain expnasion your dead");



            setAllBtnsVisible();
            btn1.setText("Play again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }

            });

        }


        private void defeat()
        {
            //run method when defeated


            //lose a life
            //numLives--;

            //clear console, display text, etc
            //System.out.println(...)

            //determine if player gets to play again

            if (isWon)
            {
                tvStoryText.setText("You have mastered the homeless ways and ancient techniques");


            }
            else
            {
                String text = "You failed to learn the ways of the homeless try again";
                tvStoryText.setText(text);
            }

            if (numLives > 0)
            {
                btn1.setText("Play again!");
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        start();
                    }
                });
            }
            else
            {
                tvStoryText.setText("Try again to become a homeless master.");
                btn1.setText("Play again");

                ivStory.setImageResource(R.drawable.im_laborday_high_school_over);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(GameHoboJoeAdventure.this, MainActivity.class));
                    }
                });
            }
        }

}





