package com.poly.polyapcsafinalproject23_24;

public class GameSannAaron extends GameActivity {

        private SannPokemon playerPokemon;
        private int choice;

        public void startGame()
        {
            choosePlayerStarter();
            run();
            pathToPewterCityGym();
            viridianForest();
        }



        /**
         * Allows the player to choose their starter Pokemon and set their name.
         * <br> Preconditions: There is no precondition
         * <br> Postconditions: The player's name is set, and they receive a starter Pokemon.
         */
        private void choosePlayerStarter()
        {
            System.out.println("Hello there! Welcome to the world of Pokemon! My name is Burke! People call me the Pokemon Prof! This world is inhabited by creatures called Pokemon! For some people, Pokemon are pets. Others use them for fights. Myself...I study Pokemon as a profession.\n");

            System.out.println("Hello, " + "!\n");

            System.out.println("Now this is the time you have been waiting for, choose your starter Pokemon!:");
            System.out.println("1. Bulbasaur");
            System.out.println("2. Charmander");
            System.out.println("3. Squirtle");

            choice = scanner.nextInt();

            if (choice == 1)
            {
                playerPokemon = SannPokemonFactory.bulbasaur();
            }
            else if (choice == 2)
            {
                playerPokemon = SannPokemonFactory.charmander();
            }
            else if (choice == 3)
            {
                playerPokemon = SannPokemonFactory.squirtle();
            }
            else
            {
                System.out.println("Wow nice, you got a secret Pikachu instead.");
                playerPokemon = SannPokemonFactory.pickachu();
            }
        }



        /**
         * Displays a welcome message to the player.
         * <br> Preconditions: The game has started, and the player has chosen a starter Pokemon.
         * <br> Postconditions: The player is welcomed to the game world.
         */
        public void run()
        {
            System.out.println("Welcome to the world of Pokemon!");
            System.out.println("You have recieved a starter Pokemon: " + playerPokemon.getName());
            System.out.println("Now it is time to start your Pokemon adventure and become a Pokemon Master!");
        }



        /**
         * Represents the path to Pewter City Gym and Viridian Forest.
         * <br> Preconditions: The player has chosen a starter Pokemon.
         * <br> Postconditions: The player is introduced to the path towards Pewter City Gym.
         */
        public void pathToPewterCityGym()
        {
            System.out.println("After receiving " + playerPokemon.getName() + " we must make our way to Pewter City Gym, but we have to go through Viridian Forest");

        }


        /**
         * Manages the player's decision to either train in Viridian Forest or face Brock.
         * <br> Preconditions: The player has started their journey towards Pewter City Gym.
         * <br> Postconditions: The player makes a choice to either train or face Brock.
         */
        public void viridianForest()
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Brock, the Gym Leader of Pewter City, has really strong and high-leveled Pokemon");
            System.out.println("What do you decide to do?");
            System.out.println("1. Train in Viridian Forest");
            System.out.println("2. It doesn't matter, let's just go face Brock");

            int choice = scanner.nextInt();

            if (choice == 1)
            {
                levelPokemon();
            }
            else if (choice == 2)
            {
                battleBrock();
            }
            else
            {
                System.out.println("Invalid choice. Please choose 1 or 2.");
            }
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
            System.out.println("A " + wildPokemon.getName() + " appeared!");

            Scanner scanner = new Scanner(System.in);
            boolean battleOver = false;

            while (playerPokemon.getHealth() > 0 && wildPokemon.getHealth() > 0 && !battleOver)
            {
                // Player's turn
                System.out.println("What will " + playerPokemon.getName() + " do?");
                System.out.println("1. Attack");
                System.out.println("2. Run");

                int playerChoice = scanner.nextInt();

                if (playerChoice == 1)
                {
                    int playerDamage = playerPokemon.calculateDamage(wildPokemon);
                    wildPokemon.takeDamage(playerDamage);
                    System.out.println(playerPokemon.getName() + " dealt " + playerDamage + " damage to " + wildPokemon.getName());
                }
                else if (playerChoice == 2)
                {
                    System.out.println("You successfully ran away!");
                    battleOver = true;
                }

                if (!battleOver)
                {
                    int wildDamage = wildPokemon.calculateDamage(playerPokemon);
                    playerPokemon.takeDamage(wildDamage);
                    System.out.println(wildPokemon.getName() + " dealt " + wildDamage + " damage to " + playerPokemon.getName());

                    System.out.println(playerPokemon.getName() + " HP: " + playerPokemon.getHealth());
                    System.out.println(wildPokemon.getName() + " HP: " + wildPokemon.getHealth());

                    if (playerPokemon.getHealth() <= 0)
                    {
                        System.out.println(playerPokemon.getName() + " fainted. You ran to the nearest Pokemon Center to heal your Pokémon.");
                        viridianForest();
                        return;
                    }
                }
                else if (wildPokemon.getHealth() <= 0)
                {
                    System.out.println("You defeated the " + wildPokemon.getName() + "!");
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
            Scanner scanner = new Scanner(System.in);

            System.out.println("You're in Viridian Forest and find a wild Caterpie.");

            boolean continueLeveling = true;
            boolean shouldLevelUp = false;

            while (continueLeveling) {
                SannPokemon wildCaterpie = SannPokemonFactory.caterpie();
                SannPokemon wildPokemon = SannPokemonFactory.caterpie();

                System.out.println("A " + wildPokemon.getName() + " appeared!");

                initiateBattle(playerPokemon, wildPokemon);

                if (shouldLevelUp)
                {
                    playerPokemon.levelUp();
                    System.out.println(playerPokemon.getName() + " leveled up!");
                    System.out.println("Current stats:");
                    System.out.println("Pokemon:\t" + playerPokemon.getName() + "\n" + "Level:\t" + playerPokemon.getLevel() + "\n" + "Health:\t" + playerPokemon.getHealth() + "\n" + "Attack:\t" + playerPokemon.getAttack() + "\n" + "Defense:\t" + playerPokemon.getDefense());
                }

                System.out.println("Do you want to train more? (1. Yes / 2. No)");
                int choice = scanner.nextInt();

                if (choice != 1)
                {
                    continueLeveling = false;
                    shouldLevelUp = false;
                }
                else
                {
                    shouldLevelUp = true;
                }
            }

            System.out.println("What do you decide to do now?");
            System.out.println("1. Continue leveling up");
            System.out.println("2. Go face Brock");

            int choice = scanner.nextInt();

            if (choice == 1) {
                levelPokemon();
            } else if (choice == 2) {
                pewterCityGym();
            } else {
                System.out.println("Invalid choice. Please choose 1 or 2.");
            }
        }



        /**
         * Initiates a battle against Brock, the Pewter City Gym Leader.
         * <br> Preconditions: The player has decided to challenge Brock.
         * <br> Postconditions: The battle against Brock is resolved, and the player may proceed or retry.
         */
        public void battleBrock()
        {
            System.out.println("You've decided to challenge Brock in the Pewter City Gym!");
            System.out.println("Brock says, 'I accept your challenge!'");
            System.out.println("Brock sends out his Pokémon!");

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
            Scanner scanner = new Scanner(System.in);

            System.out.println("You enter the Pewter City Gym, and Brock is there waiting.\n");
            System.out.println("He says, 'Are you sure you want to face me right now?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            int selectedOption = scanner.nextInt();

            if (selectedOption == 1)
            {
                battleBrock();
            }
            else if (selectedOption == 2)
            {
                viridianForest();
            }
            else
            {
                System.out.println("Invalid choice. Please choose 1 or 2.");
                pewterCityGym(); // Ask again if the choice is invalid
            }
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
