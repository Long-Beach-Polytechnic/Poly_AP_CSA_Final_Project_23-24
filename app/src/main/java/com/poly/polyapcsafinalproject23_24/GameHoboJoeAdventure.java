package com.poly.polyapcsafinalproject23_24;

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

        numLives = 5;
        start();


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

            ivStory.setImageResource(R.drawable.im_laborday_title);
            playAudio(R.raw.audio_laborday_bass);

            tvStoryText.setText("You are Hobo Joe decide what to do");

            setAllBtnsVisible();
            btn1.setText("Fight another homeless person for their cheese pizza");
            btn2.setText("Go dumpster diving");
            btn3.setText("Put on hobo ski mask and rob something");
            btn4.setVisibility(View.INVISIBLE);

            System.out.println("Hobo Adventure");
            System.out.println("You are homeless decide what you want to do");
            System.out.println("1. Fight another homeless person for their cheese pizza\n2. Go dumpster diving\n3. Put on hobo ski mask and rob something");

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

        //Cheese pizza path
        private void cheesePizza() {

            ivStory.setImageResource(R.drawable.im_laborday_beach);

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

            ivStory.setImageResource(R.drawable.im_laborday_beach);

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
                tvStoryText.setText("You used the powder and gained powers you beat up the homeless and ate the pizza but it was laced with fentanyl you died");

                ivStory.setImageResource(R.drawable.im_laborday_lifeguard_shark);

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
            tvStoryText.setText("You decide to trade the powder for the pizza he gladly accepts nice you don't starve and made a new crack friend");

            ivStory.setImageResource(R.drawable.im_laborday_lifeguard_shark);

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

            ivStory.setImageResource(R.drawable.im_laborday_beach);

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
            tvStoryText.setText("You ran into a dead end and he catches up and you died");

            ivStory.setImageResource(R.drawable.im_laborday_lifeguard_shark);

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
            tvStoryText.setText("You successfully escape but you starve to death after");

            ivStory.setImageResource(R.drawable.im_laborday_lifeguard_shark);

            setAllBtnsVisible();
            btn1.setText("Play again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) { defeat();}


            System.out.println("You successfully escape but you starve to death after");

            defeat();
        }


        //dumpster diving path
        private void dumpster() {

            System.out.println("Dumpster diving what do you do");
            System.out.println("1. Belly flop in\n2. Flip the dumpster over");


            if (choice == 1) {
                bellyFlop();
            } else if (choice == 2) {
                flipDumpster();
            }


        }
        //choice 1

        private void bellyFlop() {

            System.out.println("You dive in and get cut up bad what do you do");
            System.out.println("1. Cover your wonds with dirty rags\n2. Thug it out and keep searching");


            if (choice == 1) {
                coverWound();
            } else if (choice == 2) {
                keepSearching();
            }
        }

        private void coverWound() {

            System.out.println("Rip you have Aids, Hiv, Stds and herpes worst than death");

            defeat();
        }

        private void keepSearching() {

            System.out.println("You found a medkit and some white stuff what do you use");


            if (choice == 1) {
                useMedkit();
            } else if (choice == 2) {
                takeWhite();
            }
        }

        private void useMedkit() {

            System.out.println("You used the medkit but it was dirty used for drugs you died");

            defeat();
        }

        private void takeWhite() {

            System.out.println("You take the white stuff but later on you get more addicted to it and spend every last penny for more eventually you couldnt handle it and died");

            defeat();
        }


        //choice 2
        private void flipDumpster() {

            System.out.println("You flipped the dumpster and see a glowing green rat and a honey bun pick one up");
            System.out.println("1. Pick up the glowing green rat\n2. Pick up the honey bun");


            if (choice == 1) {
                greenRat();
            } else if (choice == 2) {
                honeyBun();
            }
        }

        private void greenRat() {

            System.out.println("The rat was radioactive and you picked it up and died");
            defeat();
        }

        private void honeyBun() {

            System.out.println("It was hot like a volcano you gain powers to create a domain over 400 meter radius and you obliterated shibuya you mastered the homeless powers to its fullest");

            defeat();
        }

        //robbing path
        private void hoboRob() {

            System.out.println("Put on hobo ski mask what do you rob");
            System.out.println("1. Rob a bank\n2. Rob the local crackhead");


            if (choice == 1) {
                robBank();
            } else if (choice == 2) {
                robCracked();
            }
        }

        //choice 1
        private void robBank() {

            System.out.println("You get in the bank decide what you wanna do");
            System.out.println("1. Take off hobo mask\n2. Rush inside the vault");


            if (choice == 1) {
                maskOff();
            } else if (choice == 2) {
                rushVault();
            }
        }

        private void maskOff() {

            System.out.println("Your face is so hideous it breaks everything around you except the free money that was easy");

            defeat();
        }

        private void rushVault(){

            System.out.println("Who that dumb to leave the vault open but it closes shut on you what do you do");
            System.out.println("1. Take out the white powder in your pocket and use\n2. Eat the money inside");


            if (choice == 1)
            {
                pocketPowder();
            }
            else if (choice == 2)
            {
                eatMoney();
            }
        }

        private void pocketPowder()
        {

            System.out.println("You broke out with the strength but died after effects wore off");

            defeat();
        }

        private void eatMoney()
        {

            System.out.println("You ate the money but the cops arrested you but they believed you had a mental disabilty and let you go after you poop the money out light work no reaction easy money");

            defeat();
        }


        //choice 2
        private void robCracked()
        {

            System.out.println("");
            System.out.println("1. Do a hit and run grab the powder\n2. Heat up a honey bun");


            if (choice == 1)
            {
                snatchPowder();
            }
            else if (choice == 2)
            {
                hotHoneyBun();
            }
        }

        private void snatchPowder()
        {

            System.out.println("Rip it did not phase him and he channeled his crackhead energy into one attack and blasts you to oblivioun");

            defeat();
        }

        private void hotHoneyBun()
        {

            System.out.println("The honey bun is steaming hot do something quick");
            System.out.println("1. Eat the honey bun\n2. Throw it at the local crackhead");


            if (choice == 1)
            {
                eatHoneyBun();
            }
            else if (choice == 2)
            {
                throwHoneyBun();
            }
        }

        private void eatHoneyBun()
        {

            System.out.println("You ate the honey bun but something feels off you are now a vessle for the strongest curse and he takes control and destroyed half the city");

            defeat();
        }

        private void throwHoneyBun()
        {

            System.out.println("You threw the honey bun at him but the crackhead had a trick of his sleeve and countered with a domain expnasion your dead");

            defeat();
        }


        private void defeat()
        {
            //run method when defeated


            //lose a life
            //numLives--;

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
                System.out.println("Try again to become a homeless master");
            }

        }
    }

}
