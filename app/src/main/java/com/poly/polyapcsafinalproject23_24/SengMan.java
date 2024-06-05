package com.poly.polyapcsafinalproject23_24;

public class SengMan extends Contestant {


    /**
     * player's name
     */
    private String characterName;
    /**
     * player's weight
     */
    private double weight;
    /**
     * player's body fat percentage
     */
    private double fatPercentage;
    /**
     * player's lean body mass percentage
     */
    private double lbmPercentage;
    /**
     * player's max benchpress weight
     */
    private int maxBench;
    /**
     * player's max squat weight
     */
    private int maxSquat;
    /**
     * player's max run distance in miles
     */
    private int maxRunDistance;
    /**
     * tracks how much days of strength training in a row
     */
    private int consecutiveWorkoutDays;
    /**
     * ID of the player, assigned in constructor
     */
    private final int ID;
    /**
     * tracks number of men created
     */
    private static int numMen;

    /**
     *default constructor
     *<br>Postcondition: man with name as empty string, all variables as 0
     */
    public SengMan() {
        characterName = "";
        weight = 0;
        fatPercentage = 0;
        lbmPercentage = 0;
        maxBench = 0;
        maxSquat = 0;
        maxRunDistance = 0;
        consecutiveWorkoutDays = 0;
        numMen++;
        this.ID = numMen;
    }

    public SengMan(String n, double w, double f, double c, int mb, int ms, int mr, int cw) {
        characterName = n;
        weight = w;
        fatPercentage = f;
        lbmPercentage = c;
        maxBench = mb;
        maxSquat = ms;
        maxRunDistance = mr;
        consecutiveWorkoutDays = cw;
        numMen++;
        this.ID = numMen;
    }
    /**
     * Constructor that initializes name
     *<br>Preconditions: name must be nonull
     *<br>Postconditions: contestent with given name, all other values as 0
     */
    public SengMan(String name) {
        this.characterName = "";
        weight = 0;
        fatPercentage = 0;
        lbmPercentage = 0;
        maxBench = 0;
        maxSquat = 0;
        maxRunDistance = 0;
        consecutiveWorkoutDays = 0;
        numMen++;
        this.ID = numMen;
    }






    // getters
    /**
     * gets the name of the player
     * @return name of the player
     */
    public String getName() {
        return characterName;
    }
    /**
     * gets the weight of the player
     *
     * @return weight of the player
     */

    public double getWeight() {
        return weight;
    }
    /**
     * gets the body fat percentage of the player
     *
     * @return body fat percentage of the player
     */
    public double getFatPercentage() {
        return fatPercentage;
    }
    /**
     * gets the lean body mass percentage of the player
     *
     * @return lean body mass percentage of the player
     */
    public double getLbmPercentage() {
        return lbmPercentage;
    }
    /**
     * gets the max bench of the plauer
     * @return max bench of the player
     */
    public int getMaxBench() {
        return maxBench;
    }
    /**
     * gets the max squat of the player
     * @return max squat of the player
     */
    public int getMaxSquat() {
        return maxSquat;
    }
    /**
     * gets the max run distance of the player
     * @return max run distance of the player
     */
    public int getMaxRunDistance() {
        return maxRunDistance;
    }
    /**
     * gets the consecutive workout days of the player
     * @return consecutive workout days of the player
     */
    public int getConsecutiveWorkoutDays() {
        return consecutiveWorkoutDays;
    }

    //setters


    public void setWeight(double w) {
        this.weight = w;
        if (weight < 0) {
            weight = 0;
        }
    }

    public void addWeight(double amount) {
        this.weight += amount;
    }

    public void setFatPercentage(double f) {

        this.fatPercentage = f;
        if (fatPercentage < 0) {
            fatPercentage = 0;
        }

    }

    public void addFatPercentage(double amount) {
        this.fatPercentage += amount;
    }

    public void setLbmPercentage(double m) {

        this.lbmPercentage = m;
        if (lbmPercentage < 0) {
            lbmPercentage = 0;
        }
    }

    public void addLbmPercentage(double amount) {
        this.lbmPercentage += amount;
    }

    public void setMaxBench(int mb) {
        this.maxBench = mb;

    }

    public void addMaxBench(double amount) {
        this.maxBench += amount;
    }

    public void setMaxSquat(int ms) {
        this.maxSquat = ms;

    }
    public void addMaxSquat(double amount) {
        this.maxSquat += amount;
    }

    public void setMaxRunDistance(int mr) {
        this.maxRunDistance = mr;

    }

    public void addMaxRunDistance(double amount) {
        this.maxRunDistance += amount;
    }

    public void addConsecutiveWorkoutDays (int amount)
    {
        this.consecutiveWorkoutDays += amount;
    }

    public void setConsecutiveWorkoutDays(int cw) {
        this.consecutiveWorkoutDays = cw;
    }
    /**
     *toString method
     *@return player's stats
     */
    //toString
    public String toString() {
        return "Name: " + characterName + "\nWeight: " + weight + "\nBody Fat %: " + fatPercentage + "\nLean Body Mass %: " + lbmPercentage + "\nMax Benchpress: " + maxBench + "\nMax Squat: " + maxSquat + "\nMax Run Distance: " + maxRunDistance;


    }

    public boolean equals(SengMan otherMan) {
        if (this.characterName.equals(otherMan.characterName) && this.weight == otherMan.weight && this.fatPercentage == otherMan.fatPercentage && this.lbmPercentage == otherMan.lbmPercentage && this.maxBench == otherMan.maxBench && this.maxSquat == otherMan.maxSquat && this.maxRunDistance == otherMan.maxRunDistance && this.ID == otherMan.ID) {
            return true;
        }
        return false;
    }
}




