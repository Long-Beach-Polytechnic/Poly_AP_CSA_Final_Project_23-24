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
            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

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
            String text = "\"Hello there! Welcome to the world of Pokemon! ";

            String text2 = "My name is Burke! People call me the Pokemon Prof! This world is inhabited by creatures called Pokemon! ";

            String text3 = "For some people, Pokemon are pets. Others use them for fights. Myself...I study Pokemon as a profession.";

            String text4 = "\nNow this is the time you have been waiting for, choose your starter Pokemon!:";


            tvStoryText.setText(text);
            tvStoryText.setText(text2);
            tvStoryText.setText(text3);
            tvStoryText.setText(text4);

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

            String text5 = "Welcome to the world of Pokemon!";
            String text6 = "You have received a starter Pokemon: " + playerPokemon.getName();
            String text7 = "Now it is time to start your Pokemon adventure and become a Pokemon Master!";

            tvStoryText.setText(text5);
            tvStoryText.setText(text6);
            tvStoryText.setText(text7);

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
            String text8 = "After receiving " + playerPokemon.getName();
            String text9 = " we must make our way to Pewter City Gym, but we have to go through Viridian Forest";

            tvStoryText.setText(text8);
            tvStoryText.setText(text9);

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
            String text10 = "Brock, the Gym Leader of Pewter City, has really strong and high-leveled Pokemon";
            String text11 = "What do you decide to do?";
            String text12 = "1. Train in Viridian Forest";
            String text13 = "2. It doesn't matter, let's just go face Brock";

            tvStoryText.setText(text10);
            tvStoryText.setText(text11);
            tvStoryText.setText(text12);
            tvStoryText.setText(text13);

            btn1.setText("Level Pokemon");
            btn2.setText("Battle Brock");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    levelPokemon();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    battleBrock();
                }
            });
        }


        /**
         * Initiates a battle between the player's Pokemon and a wild Pokemon.
         * <br> Preconditions: The player's Pokemon and a wild Pokemon are present for battle.
         * <br> Postconditions: The battle between the two Pokemon is resolved.
         *
         * @param playerPokemon The player's Pokemon.
         * @param wildPokemon   The wild Pokemon.
         */
        private void initiateBattle(SannPokemon playerPokemon, SannPokemon wildPokemon)
        {

            String text14 = "A " + wildPokemon.getName() + " appeared!";
            tvStoryText.setText(text14);

            boolean battleOver = false;

            while (playerPokemon.getHealth() > 0 && wildPokemon.getHealth() > 0 && !battleOver)
            {
                // Player's turn
                String text15 = "What will " + playerPokemon.getName() + " do?";
                String text16 = "1. Attack";
                String text17 = "2. Run";
                tvStoryText.setText(text15);
                tvStoryText.setText(text16);
                tvStoryText.setText(text17);

                btn1.setText("Attack");
                btn2.setText("Run");

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int playerDamage = playerPokemon.calculateDamage(wildPokemon);
                        wildPokemon.takeDamage(playerDamage);

                        String text18 = playerPokemon.getName() + " dealt " + playerDamage + " damage to " + wildPokemon.getName();
                        tvStoryText.setText(text18);
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String text19 = "You successfully ran away!";
                        tvStoryText.setText(text19);
                        boolean battleOver = true;
                    }
                });


                if (!battleOver)
                {
                    int wildDamage = wildPokemon.calculateDamage(playerPokemon);
                    playerPokemon.takeDamage(wildDamage);
                    String text20 = wildPokemon.getName() + " dealt " + wildDamage + " damage to " + playerPokemon.getName();
                    tvStoryText.setText(text20);

                    String text21 = playerPokemon.getName() + " HP: " + playerPokemon.getHealth();
                    tvStoryText.setText(text21);

                    String text22 = wildPokemon.getName() + " HP: " + wildPokemon.getHealth();
                    tvStoryText.setText(text22);

                    if (playerPokemon.getHealth() <= 0)
                    {
                        String text23 = playerPokemon.getName() + " fainted. You ran to the nearest Pokemon Center to heal your Pokémon.";
                        tvStoryText.setText(text23);
                        viridianForest();
                        return;
                    }
                }
                else if (wildPokemon.getHealth() <= 0)
                {
                    String text24 = "You defeated the " + wildPokemon.getName() + "!";
                    tvStoryText.setText(text24);
                }
            }
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
        public void battleBrock()
        {

            String text34 = "You've decided to challenge Brock in the Pewter City Gym!";
            String text35 = "Brock says, 'I accept your challenge!";
            String text36 = "Brock sends out his Pokémon!";
            tvStoryText.setText(text34);
            tvStoryText.setText(text35);
            tvStoryText.setText(text36);

            SannPokemon brocksOnix = SannPokemonFactory.onix();

            initiateBattle(playerPokemon, brocksOnix);

            if (playerPokemon.getHealth() > 0)
            {
                String text37 = "Nice job! You defeated Brock!";
                tvStoryText.setText(text37);
                String text38 = "You should level up more and get ready for the next Gym.";
                tvStoryText.setText(text38);
                String text39 = "Heading back to Viridian Forest to level up... and you can face Brock again to test your Pokemon skills";
                tvStoryText.setText(text39);
                viridianForest(); // Loop back to Brock
            }
        }


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
                    battleBrock();
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
