package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameSannAaron extends GameActivity {

        private SannPokemon playerPokemon;
        private int choice;
        private TextView tvTitle, tvSubtitle, tvStoryText;
        private ImageView ivStory;
        private Button btn1, btn2, btn3;

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

            setAllBtnsVisible();
            btn1.setText("Play!");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            tvTitle.setText("Pokemon RPG");
            tvSubtitle.setText("Aaron Sann");

            String text = "";
            tvStoryText.setText(text);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    choosePlayerStarter();
                }
            });
        }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }




        /**
         * Allows the player to choose their starter Pokemon and set their name.
         * <br> Preconditions: There is no precondition
         * <br> Postconditions: The player's name is set, and they receive a starter Pokemon.
         */
        private void choosePlayerStarter()
        {
            String text = "\"Hello there! Welcome to the world of Pokemon! \n \nMy name is Burke! People call me the Pokemon Prof! This world is inhabited by creatures called Pokemon! \n" +
                    " \nFor some people, Pokemon are pets. Others use them for fights. Myself...I study Pokemon as a profession. \n \nNow this is the time you have been waiting for, choose your starter Pokemon!: ";




            tvStoryText.setText(text);


            setAllBtnsVisible();

            btn1.setText("Bulbasaur");
            btn2.setText("Charmander");
            btn3.setText("Squirtle");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    playerPokemon = SannPokemonFactory.bulbasaur();
                    start();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    playerPokemon = SannPokemonFactory.charmander();
                    start();
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    playerPokemon = SannPokemonFactory.squirtle();
                    start();
                }
            });

        }

        public void start()
        {

            String text5 = "Welcome to the world of Pokemon!\n \nYou have received a starter Pokemon: " + playerPokemon.getName() + "\n \nNow it is time to start your Pokemon adventure and become a Pokemon Master!";

            tvStoryText.setText(text5);

            setAllBtnsVisible();
            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    pathToPewterCityGym();
                }
            });
        }





        /**
         * Represents the path to Pewter City Gym and Viridian Forest.
         * <br> Preconditions: The player has chosen a starter Pokemon.
         * <br> Postconditions: The player is introduced to the path towards Pewter City Gym.
         */
        public void pathToPewterCityGym()
        {
            String text8 = "After receiving " + playerPokemon.getName() + "\n \nNow we need to make our way to Pewter City Gym, but we have to go through Viridian Forest";
            tvStoryText.setText(text8);

            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startViridianForest();
                }
            });
        }

        public void startViridianForest()
        {
            setAllBtnsVisible();
            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    viridianForest();
                }
            });
        }


        /**
         * Manages the player's decision to either train in Viridian Forest or face Brock.
         * <br> Preconditions: The player has started their journey towards Pewter City Gym.
         * <br> Postconditions: The player makes a choice to either train or face Brock.
         */
        public void viridianForest()
        {
            String text10 = "Brock, the Gym Leader of Pewter City, has really strong and high-leveled Pokemon\n \nWhat do you decide to do?\n \n1. Train in Viridian Forest\n \n2. It doesn't matter, let's just go face Brock";

            tvStoryText.setText(text10);

            btn1.setText("Level Pokemon");
            btn2.setText("Battle Brock");

            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    continueToLevelUpPokemon();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    continueToBrock();
                }
            });
        }

    public void continueToLevelUpPokemon()
    {
        String text34 = "You've decided to level up " + playerPokemon.getName() + "\n \nGo and level up!";
        tvStoryText.setText(text34);

        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                levelPokemon();
            }
        });
    }

        public void continueToBrock()
        {
            String text34 = "You've decided to challenge Brock in the Pewter City Gym!\n \nContinue to Brock!";
            tvStoryText.setText(text34);

            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SannPokemon brocksOnix = SannPokemonFactory.onix();
                    initiateBattle(playerPokemon, brocksOnix);
                }
            });
        }

        public void initiateBattle(SannPokemon playerPokemon, SannPokemon wildPokemon) {

            String text14 = "Get ready to battle!\n \nYou sent out " + playerPokemon.getName() + "!";
            tvStoryText.setText(text14);

            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    boolean battleOver = false;
                    runBattle(wildPokemon, battleOver);
                }
            });

        }

        public void runBattle(SannPokemon wildPokemon, boolean battleOver) {

            if (playerPokemon.getHealth() <= 0) {
                youFainted();
            }
            if (wildPokemon.getHealth() <= 0) {
                wildPokemonFainted(wildPokemon);
            }
            setContentView(R.layout.activity_sannaaron_battle);

            TextView tvP1HealthVal = findViewById(R.id.tv_p1_health_val);
            TextView tvP2HealthVal = findViewById(R.id.tv_p2_health_val);

            tvP1HealthVal.setText("" + playerPokemon.getHealth());
            tvP2HealthVal.setText("" + wildPokemon.getHealth());

            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);

            btn1.setText("Attack");
            btn2.setText("Run");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });


            // Player's turn
            String text15 = "What will " + playerPokemon.getName() + " do?";
            String text16 = "1. Attack";
            String text17 = "2. Run";
            tvStoryText.setText(text15);
            tvStoryText.setText(text16);
            tvStoryText.setText(text17);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int playerDamage = playerPokemon.calculateDamage(wildPokemon);
                    wildPokemon.takeDamage(playerDamage);

                    String text18 = playerPokemon.getName() + " dealt " + playerDamage + " damage to " + wildPokemon.getName();
                    tvStoryText.setText(text18);

                    setAllBtnsVisible();
                    btn1.setText("Continue");
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);

                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            otherPokemonAttacksBack(wildPokemon);
                        }
                    });
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String text19 = "You successfully ran away!";
                    tvStoryText.setText(text19);
                    boolean battleOver = true;

                    setAllBtnsVisible();
                    btn1.setText("Continue");
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);

                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            viridianForest();
                        }
                    });
                }
            });

        }

        private void otherPokemonAttacksBack(SannPokemon wildPokemon){
            if(playerPokemon.getHealth() <= 0 || wildPokemon.getHealth() <= 0)
            {
                youFainted();
            }

            int wildDamage = wildPokemon.calculateDamage(playerPokemon);
            playerPokemon.takeDamage(wildDamage);
            String text20 = wildPokemon.getName() + " dealt " + wildDamage + " damage to " + playerPokemon.getName() + "\n \n" + playerPokemon.getName() + " HP: " + playerPokemon.getHealth() + "\n \n" + wildPokemon.getName() + " HP: " + wildPokemon.getHealth();
            tvStoryText.setText(text20);

            if (playerPokemon.getHealth() <= 0)
            {
                youFainted();

            }


        }

        private void youFainted() {
            String text23 = playerPokemon.getName() + " fainted. You ran to the nearest Pokemon Center to heal your Pokémon.";
            tvStoryText.setText(text23);

            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    viridianForest();
                }
            });

        }

        private void wildPokemonFainted(SannPokemon wildPokemon) {

            String text24 = "You defeated the " + wildPokemon.getName() + "!";
            tvStoryText.setText(text24);
        }


        /**
         * Allows the player to level up their Pokemon by battling wild Pokemon.
         * <br> Preconditions: The player has chosen to train in Viridian Forest.
         * <br> Postconditions: The player's Pokemon may level up, and their stats may improve.
         */
        public void levelPokemon()
        {
            String text25 = "You're in Viridian Forest and find a wild Caterpie.";
            tvStoryText.setText(text25);

            boolean continueLeveling = true;
            boolean shouldLevelUp = false;

            while (continueLeveling) {
                SannPokemon wildCaterpie = SannPokemonFactory.caterpie();
                SannPokemon wildPokemon = SannPokemonFactory.caterpie();

                String text26 = "A " + wildPokemon.getName() + " appeared!";
                tvStoryText.setText(text26);

                initiateBattle(playerPokemon, wildPokemon);

                if (shouldLevelUp)
                {
                    playerPokemon.levelUp();
                    String text27 = playerPokemon.getName() + " leveled up!";
                    tvStoryText.setText(text27);
                    String text28 = "Current stats: ";
                    tvStoryText.setText(text28);
                    String text29 = "Pokemon:\t" + playerPokemon.getName() + "\n" + "Level:\t" + playerPokemon.getLevel() + "\n" + "Health:\t" + playerPokemon.getHealth() + "\n" + "Attack:\t" + playerPokemon.getAttack() + "\n" + "Defense:\t" + playerPokemon.getDefense();
                    tvStoryText.setText(text29);
                }

                String text30 = "Do you want to train more? (1. Yes / 2. No)";
                tvStoryText.setText(text30);

                btn1.setText("Yes");
                btn2.setText("No");

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        boolean continueLeveling = false;
                        boolean shouldLevelUp = false;
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        boolean shouldLevelUp = true;
                    }
                });

            }

            String text31 = "What do you decide to do now?";
            String text32 = "1. Continue leveling up";
            String text33 = "2. Go face Brock";
            tvStoryText.setText(text31);
            tvStoryText.setText(text32);
            tvStoryText.setText(text33);



            btn1.setText("Continue leveling up");
            btn2.setText("Go face Brock");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    levelPokemon();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    pewterCityGym();
                }
            });
        }



        /**
         * Initiates a battle against Brock, the Pewter City Gym Leader.
         * <br> Preconditions: The player has decided to challenge Brock.
         * <br> Postconditions: The battle against Brock is resolved, and the player may proceed or retry.
         */



        /**
         * Enters Pewter City Gym and allows the player to decide whether to face Brock.
         * <br> Preconditions: The player has arrived at Pewter City Gym.
         * <br> Postconditions: The player may choose to challenge Brock or return to Viridian Forest.
         */
        public void pewterCityGym() {

            String text40 = "You enter the Pewter City Gym, and Brock is there waiting.\n";
            String text41 = "He says, 'Are you sure you want to face me right now?";
            String text42 = "1. Yes";
            String text43 = "2. No";
            tvStoryText.setText(text40);
            tvStoryText.setText(text41);
            tvStoryText.setText(text42);
            tvStoryText.setText(text43);

            btn1.setText("Yes");
            btn2.setText("No");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SannPokemon brocksOnix = SannPokemonFactory.onix();
                    initiateBattle(playerPokemon, brocksOnix);
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    viridianForest();
                }
            });
        }


        /**
         * Return a string representation of the game's current state.
         * @return A string containing information about the player's Pokemon and progress.
         */
        public String toString()
        {
            return "Game State:\n" +
                    "Player's Pokemon: " + playerPokemon.getName() + "\n" +
                    "Player's Pokemon Level: " + playerPokemon.getLevel() + "\n" +
                    "Player's Pokemon Health: " + playerPokemon.getHealth() + "\n" +
                    "Player's Pokemon Attack: " + playerPokemon.getAttack() + "\n" +
                    "Player's Pokemon Defense: " + playerPokemon.getDefense() + "\n";
        }
    }
