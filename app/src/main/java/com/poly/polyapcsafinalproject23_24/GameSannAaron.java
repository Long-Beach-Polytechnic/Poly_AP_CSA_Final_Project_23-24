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
            String text10 = "Brock, the Gym Leader of Pewter City, has really strong and high-leveled Pokemon\n \nLets go fight him!";

            tvStoryText.setText(text10);

            btn1.setText("Battle Brock");

            btn1.setVisibility(View.VISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    continueToBrock();
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
                public void onClick(View view) {;
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

            String text40 = "You enter the Pewter City Gym, and Brock is there waiting.\n \nHe says, 'Are you sure you want to face me right now?\n \n1. Yes\n \n2. No";
            tvStoryText.setText(text40);

            btn1.setText("Yes");
            btn2.setText("No");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    battleWithBrock();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    viridianForest();
                }
            });
        }

        public void battleWithBrock()
        {
            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {;
                    pewterCityGym();
                }
            });

            String text1 = "1. Attack\n \n2. Forfeit";
            tvStoryText.setText(text1);

            btn1.setText("Yes");
            btn2.setText("No");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    brockLoses();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    youForfeit();
                }
            });
        }

        public void brockLoses(){
            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {;
                    pewterCityGym();
                }
            });
            String text1 = "Congrats you Won against Brock, so start getting ready for the next gym!";
            tvStoryText.setText(text1);
        }

    public void youForfeit(){
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {;
                pewterCityGym();
            }
        });
        String text1 = "Oh no! You forfeited the battle against Brock. You should try facing him again";
        tvStoryText.setText(text1);
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
