package com.poly.polyapcsafinalproject23_24;

public class SengMan extends Contestant {


    /**
     * player's name
     */
    private String name;
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
    public Man() {
        name = "";
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

    /**
     * Constructor that initializes all attributes
     * <br>Preconditions: name must be nonull, all other values must be non-negative
     * <br>Postconditions: contestant with given name, weight, fat percentage, lean body mass percentage, max bench, max squat, max run distance, consecutive, ID assigned
     * @param name                   name of the player
     * @param weight                 weight of the player ( >=0 )
     * @param fatPercentage          fat percentage of the player ( >=0 )
     * @param lbmPercentage          lean body mass percentage of the player ( >=0 )
     * @param maxBench               max bench press weight of the player ( >=0 )
     * @param maxSquat               max squat weight of the player ( >=0 )
     * @param maxRunDistance         max run distance of the player ( >=0 )
     * @param consecutiveWorkoutDays consecutive workout days of the player ( >=0 )
     */
    public Man(String n, double w, double f, double c, int mb, int ms, int mr, int cw) {
        name = n;
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
    public Man(String name) {
        this.name = "";
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
        return name;
    }
    /**
     * gets the weight of the player
     *
     * @return weight of the player
     */

    public CharSequence getWeight() {
        return weight;
    }
    /**
     * gets the body fat percentage of the player
     *
     * @return body fat percentage of the player
     */
    public CharSequence getFatPercentage() {
        return fatPercentage;
    }
    /**
     * gets the lean body mass percentage of the player
     *
     * @return lean body mass percentage of the player
     */
    public CharSequence getLbmPercentage() {
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

    /**
     *sets the number of the player's weight
     *<br>Precondition: weight must be non-negative
     *<br>Postcondition: weight is set
     *@param     weight     weight of the player
     */
    public void setWeight(double w) {
        this.weight = w;
        if (weight < 0) {
            weight = 0;
        }
    }
    /**
     *sets the number of the player's body fat percentage
     *<br>Precondition: fatPercentage must be non-negative
     *<br>Postcondition: fatPercentage is set
     *@param     fatPercentage     fat percentage of the player
     */
    public void setFatPercentage(double f) {

        this.fatPercentage = f;
        if (fatPercentage < 0) {
            fatPercentage = 0;
        }

    }
    /**
     *sets the number of the player's lean body mass percentage
     *<br>Precondition: lbmPercentage must be non-negative
     *<br>Postcondition: lbmPercentage is set
     *@param     lbmPercentage     lean body mass percentage of the player
     */
    public void setLbmPercentage(double m) {

        this.lbmPercentage = m;
        if (lbmPercentage < 0) {
            lbmPercentage = 0;
        }
    }
    /**
     *sets the number of the player's max benchpress
     *<br>Precondition: maxBench must be non-negative
     *<br>Postcondition: maxBench is set
     *@param     maxBench     max bench press weight of the player
     */
    public void setMaxBench(int mb) {
        this.maxBench = mb;

    }
    /**
     *sets the number of the player's max squat
     *<br>Precondition: maxSquat must be non-negative
     *<br>Postcondition: maxSquat is set
     *@param     maxSquat     max squat weight of the player
     */
    public void setMaxSquat(int ms) {
        this.maxSquat = ms;

    }
    /**
     *sets the number of the player's max run distance
     *<br>Precondition: maxRunDistance must be non-negative
     *<br>Postcondition: maxRunDistance is set
     *@param     maxRunDistance     max run distance of the player
     */
    public void setMaxRunDistance(int mr) {
        this.maxRunDistance = mr;

    }
    /**
     *sets the number of the player's consecutive workout days
     *<br>Precondition: consecutiveWorkoutDays must be non-negative
     *<br>Postcondition: consecutiveWorkoutDays is set
     *@param     consecutiveWorkoutDays     consecutive workout days of the player
     */
    public void setConsecutiveWorkoutDays(int cw) {
        this.consecutiveWorkoutDays = cw;
    }
    /**
     *toString method
     *@return player's stats
     */
    //toString
    public String toString() {
        return "Name: " + name + "\nWeight: " + weight + "\nBody Fat %: " + fatPercentage + "\nLean Body Mass %: " + lbmPercentage + "\nMax Benchpress: " + maxBench + "\nMax Squat: " + maxSquat + "\nMax Run Distance: " + maxRunDistance;


    }
    /**
     *returns true if all attributes match between two men
     * <br>Precondition: other must be non-null
     *@param     other     the other man
     *@return    true if all attributes match, false otherwise
     */
    public boolean equals(Man otherMan) {
        if (this.name.equals(otherMan.name) && this.weight == otherMan.weight && this.fatPercentage == otherMan.fatPercentage && this.lbmPercentage == otherMan.lbmPercentage && this.maxBench == otherMan.maxBench && this.maxSquat == otherMan.maxSquat && this.maxRunDistance == otherMan.maxRunDistance && this.ID == otherMan.ID) {
            return true;
        }
        return false;
    }
}




