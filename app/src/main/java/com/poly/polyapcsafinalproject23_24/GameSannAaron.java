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
            String text = "\"Hello there! Welcome to the world of Pokemon! " +
                    "My name is Burke! People call me the Pokemon Prof! This world is inhabited by creatures called Pokemon! " +
                    "For some people, Pokemon are pets. Others use them for fights. Myself...I study Pokemon as a profession." +
                    "\nNow this is the time you have been waiting for, choose your starter Pokemon!:";

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

            String text1 = "Welcome to the world of Pokemon!" + "You have recieved a starter Pokemon: " + playerPokemon.getName() +
                    "Now it is time to start your Pokemon adventure and become a Pokemon Master!";

            tvStoryText.setText(text1);

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
            String text3 = "After receiving " + playerPokemon.getName() +
                    " we must make our way to Pewter City Gym, but we have to go through Viridian Forest";

            tvStoryText.setText(text3);

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
            String text4 = "Brock, the Gym Leader of Pewter City, has really strong and high-leveled Pokemon"
                    + "What do you decide to do?"
                    + "1. Train in Viridian Forest"
                    + "2. It doesn't matter, let's just go face Brock";

            tvStoryText.setText(text4);

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

            String text5 = "A " + wildPokemon.getName() + " appeared!";
            tvStoryText.setText(text5);

            boolean battleOver = false;

            while (playerPokemon.getHealth() > 0 && wildPokemon.getHealth() > 0 && !battleOver)
            {
                // Player's turn
                String text6 = "What will " + playerPokemon.getName() + " do?"
                        + "1. Attack"
                        + "2. Run";
                tvStoryText.setText(text6);

                btn1.setText("Attack");
                btn2.setText("Run");

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int playerDamage = playerPokemon.calculateDamage(wildPokemon);
                        wildPokemon.takeDamage(playerDamage);

                        String text7 = playerPokemon.getName() + " dealt " + playerDamage + " damage to " + wildPokemon.getName();
                        tvStoryText.setText(text7);
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String text8 = "You successfully ran away!";
                        tvStoryText.setText(text8);
                        boolean battleOver = true;
                    }
                });


                if (!battleOver)
                {
                    int wildDamage = wildPokemon.calculateDamage(playerPokemon);
                    playerPokemon.takeDamage(wildDamage);
                    String text9 = wildPokemon.getName() + " dealt " + wildDamage + " damage to " + playerPokemon.getName();
                    tvStoryText.setText(text9);

                    String text10 = playerPokemon.getName() + " HP: " + playerPokemon.getHealth();
                    tvStoryText.setText(text10);

                    String text11 = wildPokemon.getName() + " HP: " + wildPokemon.getHealth();
                    tvStoryText.setText(text11);

                    if (playerPokemon.getHealth() <= 0)
                    {
                        String text12 = playerPokemon.getName() + " fainted. You ran to the nearest Pokemon Center to heal your Pokémon.";
                        tvStoryText.setText(text12);
                        viridianForest();
                        return;
                    }
                }
                else if (wildPokemon.getHealth() <= 0)
                {
                    String text13 = "You defeated the " + wildPokemon.getName() + "!";
                    tvStoryText.setText(text13);
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
            String text14 = "You're in Viridian Forest and find a wild Caterpie.";
            tvStoryText.setText(text14);

            boolean continueLeveling = true;
            boolean shouldLevelUp = false;

            while (continueLeveling) {
                SannPokemon wildCaterpie = SannPokemonFactory.caterpie();
                SannPokemon wildPokemon = SannPokemonFactory.caterpie();

                String text15 = "A " + wildPokemon.getName() + " appeared!";
                tvStoryText.setText(text15);

                initiateBattle(playerPokemon, wildPokemon);

                if (shouldLevelUp)
                {
                    playerPokemon.levelUp();
                    System.out.println(playerPokemon.getName() + " leveled up!");
                    System.out.println("Current stats:");
                    System.out.println("Pokemon:\t" + playerPokemon.getName() + "\n" + "Level:\t" + playerPokemon.getLevel() + "\n" + "Health:\t" + playerPokemon.getHealth() + "\n" + "Attack:\t" + playerPokemon.getAttack() + "\n" + "Defense:\t" + playerPokemon.getDefense());
                }

                String text16 = "Do you want to train more? (1. Yes / 2. No)";
                tvStoryText.setText(text16);

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

            String text17 = "What do you decide to do now?"
                    + "1. Continue leveling up"
                    + "2. Go face Brock";
            tvStoryText.setText(text17);

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

            String text18 = "You've decided to challenge Brock in the Pewter City Gym!"
                    + "Brock says, 'I accept your challenge!"
                    + "Brock sends out his Pokémon!";
            tvStoryText.setText(text18);

            SannPokemon brocksOnix = SannPokemonFactory.onix();

            initiateBattle(playerPokemon, brocksOnix);

            if (playerPokemon.getHealth() > 0)
            {
                System.out.println("Nice job! You defeated Brock!");
                System.out.println("You should level up more and get ready for the next Gym.");
                System.out.println("Heading back to Viridian Forest to level up... and you can face Brock again to test your Pokemon skills");
                viridianForest(); // Loop back to Brock
            }
        }


        /**
         * Enters Pewter City Gym and allows the player to decide whether to face Brock.
         * <br> Preconditions: The player has arrived at Pewter City Gym.
         * <br> Postconditions: The player may choose to challenge Brock or return to Viridian Forest.
         */
        public void pewterCityGym() {

            String text19 = "You enter the Pewter City Gym, and Brock is there waiting.\n"
                    + "He says, 'Are you sure you want to face me right now?"
                    + "1. Yes"
                    + "2. No";
            tvStoryText.setText(text19);

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
