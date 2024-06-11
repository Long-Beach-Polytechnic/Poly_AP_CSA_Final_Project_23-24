package com.poly.polyapcsafinalproject23_24;

/**
 * WokePerson class is another game similar to a simulate game
 * @author Michael Ontiveros
 * @since 12/15/23
 * @version 1.1
 */
public class OntiverosWokePerson {

    /**
     * Players name
     */
    private String name;

    /**
     *  Players health
     */
    private double health;

    /**
     * Players insanity
     */
    private double insanity;

    /**
     * If the player is sleeping
     * Hidden stat
     */
    private boolean isSleeping;

    /**
     * How many time the player is sleeping
     * Hidden stat
     */
    private int timeHasSleep;

    // !!!!!!!!!!!!!!!!!!! CONSTRUCTORS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    /** - default constructot
     **<br> Postconditons: name set to "empty", health set to 100.00. Sanity set to 0.00, isSleeping set to true, TimehasSleep set to 0
     */

    public OntiverosWokePerson()
    {
        this.name = "empty";
        this.health = 100.00;
        this.insanity = 0.00;  // !!! HIDDEN STAT
        this.isSleeping = true; // !!! HIDDEN STAT
        this.timeHasSleep = 0;
    }

    // !!!!!!!!!!!!!!!!!!!  ANOTHER CONSTRUCTORS  (1) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    /**<br> Prestconditons: name is empty string, Health is greater than or equal to one hundred, Sanity is greater than or equal to 0, Timehas sleep is greater than ot equal to 0.
     *<br> PostConditons: set name, health, and timeHas sleep
     * @parem  name   name of player
     * @parem  health   how much health you have
     * @parem  timeHasSleep time you have sleep
     */
    public OntiverosWokePerson(String name, double health, int timeHasSleep)
    {
        this.name = name;
        this.health = health;
        this.timeHasSleep = timeHasSleep;
    }

    // !!!!!!!!!!!!!!!!!!!  ANOTHER CONSTRUCTORS  (2) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    /** <br> Prestconditons: name is empty string, Health is greater than or equal to one hundred, Sanity is greater than or equal to 0, Timehas sleep is greater than ot equal to 0.
     * <br> PostConditons: set name, health, and timeHas sleep
     *  @parem  name   name of player
     *  @parem  health   how much health you have
     *  @parem  insanity  how much insanity you have
     */
    public OntiverosWokePerson(String name, double health, boolean isSleeping)
    {
        this.name = name;
        this.health = health;
        this.insanity = 0.00;  // !!! HIDDEN STAT
        this.isSleeping = true; // !!! HIDDEN STAT
        this.timeHasSleep = timeHasSleep;
    }

    // METHOD - changes the state of a class
    /**
     * Gets the amount of health of the player, and the amount of sleep
     * @return   how much health, and amount of sleep have
     */
    //GETTER

    public String getName()
    {
        return name;
    }

    public double getHealth()
    {
        return health;
    }

    public int getTimeHasSleep()
    {
        return timeHasSleep;
    }
    public double getInsanity()
    {
        return insanity;
    }
    public boolean isSleeping()
    {
        return isSleeping;
    }
    //SETTER
    /**
     * Gets the amount of money a shop has
     *<br>Preconditon: amount must be greater than or equal to 0
     *<br>Postcondition: sets amount of player health has. If amount is less than 0,
     *                    health set to 0
     *@param   amount    amount of cash shop has (greater than or equal to 0)
     */
    public void setHealth(double amount)
    {
        if (amount > 0)
        {
            this.health = amount;
        }
        else
        {
            this.health = 0;
        }
    }


//TO STRING
    /**
     * toString method
     * @return   Sleeper as a string
     * @Override
     */
    public String toString()
    {
        return
                "Sleeper name:\t" + name +
                        "\nHealth:\t\t" + health +
                        "\nYou slpet:\t\t" + timeHasSleep;
    }


//EQUALS
    /**
     * return true if all attributes match sleeper
     * <br>Precondition: anotherSleeper must be non-null
     * @param   antherSleeper     another sleeper object
     * @return  true if sleeper are equal
     */
    public boolean equals(OntiverosWokePerson anotherSleeper)
    {
        if (this.name.equals(anotherSleeper.getName()) &&
                this.health == anotherSleeper.getHealth() &&
                this.timeHasSleep == anotherSleeper.getTimeHasSleep()
        )
        {
            return true;
        }
        return false;
    }

//MUTATOR
    /**
     * run this method when the sleeper goes to sleep
     * <br>Postcondition
     * <br>insanity increase by 10
     * <br>health decrease by 5
     * <br>timeHasSleep increase by 1
     */
// ---------------------------------------------------- GO TO SLEEP (option) -----------------------------------------------------------
    public void goToSleep()
    {
        insanity += 10;// !!! HIDDEN STAT FEATURE
        health -= 5;
        timeHasSleep ++;
    }

    /**
     * run this method when the sleeper doesn't go to sleep
     * <br>Postcondition
     * <br>insanity increase by 5
     * <br>health decrease by 10
     */
// ---------------------------------------------------- STAYED UP (option) -----------------------------------------------------------
    public void stayUp()
    {
        insanity += 5; // !!! HIIDEN STAT FEATURE
        health -= 10;
    }







}