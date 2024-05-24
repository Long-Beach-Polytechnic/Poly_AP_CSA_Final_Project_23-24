package com.poly.polyapcsafinalproject23_24;

public class NuonPlayer {
        private String name;
        private int points;
        private int hp;
        private double money;
        private int numLives;
        private boolean gift;



        public NuonPlayer(String name)
        {
            this.name = name;
            this.points = 0;
            this.money = 100;
            this.hp = 100;
            this.numLives = 5;
            this.gift = false;
        }

        public NuonPlayer(String name, int numLives, double money)
        {
            this.name = name;
            this.points = 0;
            this.money = money;
            this.hp = 100;
            this.numLives = numLives;
            this.gift = false;
        }

        public boolean showGift()
        {
            return gift;
        }

        public String getName()
        {
            return name;
        }

        public int getPoints()
        {
            return points;
        }

        public int gethp()
        {
            return hp;
        }

        public double getMoney()
        {
            return money;
        }

        public int getLives()
        {
            return numLives;
        }

        @Override
        public String toString()
        {
            return "name:\t" + name +
                    "\npoints:\t" + points +
                    "\nmoney:\t" + money +
                    "\nlives:\t" + numLives;
        }

        public void setName(String newName)
        {
            this.name = newName;
        }

        public void setPoints(int numPoints)
        {
            this.points = numPoints;
        }

        public void sethp(int amount)
        {
            this.hp = amount;
        }

        public void setMoney(double amount)
        {
            this.money = amount;
        }

        public void setLives(int numberOfLives)
        {
            this.numLives = numberOfLives;
        }

        public void addPoints(int amount)
        {
            this.points += amount;
        }

        public void addhp(int amount)
        {
            this.hp += amount;
        }

        public void addMoney(double amount)
        {
            this.money += amount;
        }

        public void gainLife()
        {
            numLives++;
        }

        public void loseLife()
        {
            numLives--;
        }

        public void getGift()
        {
            gift = true;
        }


    }

