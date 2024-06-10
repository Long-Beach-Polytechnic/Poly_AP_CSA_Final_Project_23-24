package com.poly.polyapcsafinalproject23_24;

public class SannPokemon extends GameLaborDayAdventure {

        private String name;
        /**
         *Name of Pokemon
         */
        private int level;
        /**
         *Level of Pokemon
         */
        private int health;
        /**
         *Health of Pokemon
         */
        private int attack;
        /**
         *Attack of Pokemon
         */
        private int defense;
        /**
         *Defense of Pokemon
         */
        private static int numPokemon = 0;
        /**
         *Pokemon count
         */

        /**
         * Represents a Pokemon with a name, level, health, attack, and defense stats.
         */
        public SannPokemon()
        {
            this.name = "";
            this.level = 1;
            this.health = 27;
            this.attack = 10;
            this.defense = 5;
            numPokemon++;
        }

        /**
         Constructor to give a Pokemon a specified name and level. This constructor that I added only takes the name and level as parameters and calculates the rest of the statss in the formula I put.
         @param name This is the name of the Pokemon.
         @param level This is the level of the Pokemon.
         */
        public SannPokemon(String name, int level)
        {
            this.name = name;
            this.level = level;
            this.health = 7 + (level * 10);
            this.attack = 2 + (level * 2);
            this.defense = 1 + (level * 1);
            numPokemon++;
        }


        /**
         * Return a string of the Pokemon's details.
         * @return A string containing the Pokemon's name, level, health, attack, and defense.
         */
        public String toString()
        {
            return "Pokemon Details:\n" +
                    "Name: " + name + "\n" +
                    "Level: " + level + "\n" +
                    "Health: " + health + "\n" +
                    "Attack: " + attack + "\n" +
                    "Defense: " + defense + "\n";
        }

        /**
         Constructor to create a Pokemon with all attributes specified. This constructor that allows me to change certain pokemon stats.
         @param name This is the name of the Pokemon.
         @param level This is the level of the Pokemon.
         @param health This is the health stat of the Pokemon.
         @param attack This is the attack stat of the Pokemon.
         @param defense This is the defense stat of the Pokemon.
         */
        public SannPokemon(String name, int level, int health, int attack, int defense)
        {
            this.name = name;
            this.level = level;
            this.health = health;
            this.attack = attack;
            this.defense = defense;
            numPokemon++;
        }


        /**
         * Gets the name of the Pokemon.
         * @return The name of the Pokemon.
         */
        public String getName()
        {
            return name;
        }


        /**
         * Gets the level of the Pokemon.
         * @return The level of the Pokemon.
         */
        public int getLevel()
        {
            return level;
        }



        /**
         * Gets the health of the Pokemon.
         * @return The health of the Pokemon.
         */
        public int getHealth()
        {
            return health;
        }



        /**
         * Gets the attack stat of the Pokemon.
         * @return The attack stat of the Pokemon.
         */
        public int getAttack()
        {
            return attack;
        }



        /**
         * Gets the defense stat of the Pokemon.
         * @return The defense stat of the Pokemon.
         */
        public int getDefense()
        {
            return defense;
        }



        /**
         * Sets the name of the Pokemon.
         * @param name The new name for the Pokemon.
         */
        public void setName(String name)
        {
            this.name = name;
        }

        /**
         Increase the level of the Pokemon.
         */
        public void levelUp()
        {
            this.level++;
            this.health += 10;
            this.attack += 2;
            this.defense += 1;
        }

        /**
         Allows attacking another Pokemon.
         @param target The target Pokemon to attack.
         */
        public void attack(SannPokemon enemy)
        {
            int damage = (2 * level * attack) - enemy.defense;
            if (damage > 0)
            {
                enemy.health -= damage;
            }
        }

        /**
         This gets the count of how many Pokemon were created.
         @return The count of Pokemon created.
         */
        public static int getNumPokemon()
        {
            return numPokemon;
        }



        /**
         * Calculates the damage that this Pokemon can inflict on an opponent.
         * @param opponent The opponent Pokemon.
         * @return The calculated damage.
         */
        public int calculateDamage(SannPokemon opponent)
        {
            int damage = (2 * this.level / 5 + 2) * this.attack / opponent.getDefense();
            return damage;
        }



        /**
         * Takes damage and reduces the Pokemon's health.
         * @param damage The amount of damage taken.
         */
        public void takeDamage(int damage)
        {
            this.health -= damage;
            if (this.health < 0)
            {
                this.health = 0;
            }
        }

        /**
         * Ensures that the level of the Pokemon is true
         */
        public boolean equals(SannPokemon level)
        {
            if (level == this)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }


