package com.poly.polyapcsafinalproject23_24;

public class ValentineCriminal
{
    /**
     * Name of the criminal.
     * The name of the criminal object will vary depending on what the player puts for the name.
     */
    private String
            name;
    /**
     * How much money the criminal will own
     * will change based on what the player will spend their money on, sell, or may even gain money in robberies
     */
    private double money;
    /**
     * The odds of being caught by police
     * Decrease by inactivity
     * Increase by activity
     */
    private int wantedLvl;
    /**
     * Morality of the criminal
     * Options will depend on how high or low your morality is, and whether they are "good" or "bad" would depend on morality
     */
    private int moralLvl;

    /**
     * Will keep track of when the criminal was created and where they were placed among the criminals created in
     * order of oldest to newest
     */
    private final int ID;
    /**
     * The number of criminals existing in a game
     */
    private static int numCriminals = 0;



    /**
     * default constructor
     * <br>Postconditions: name is null, money defaults at 1000.00, wanted level is 0, and moral lvl is 5
     */
    public ValentineCriminal()
    {
        this.name = "";
        this.money = 1000.00;
        this.wantedLvl = 0;
        this.moralLvl = 5;

        numCriminals++;
        this.ID = numCriminals;
    }

    /**
     * Constructor that initializes name
     * <br>Precondition: Name must be nonnull
     * <br>Postconditions: valentineCriminal with name
     *                    Money set to 1k, wanted lvl at 0 and moral lvl at 5
     * @param      name    name of the criminal
     */
    public ValentineCriminal(String name)
    {
        this.name = name;
        this.money = 1000.00;
        this.wantedLvl = 0;
        this.moralLvl = 5;

        numCriminals++;
        this.ID = numCriminals;
    }

    /**
     * Constructor that initializes all attributes
     * <br> preconditions: all variables must have a value, money, moral level, and wanted level should all be positive
     * <br> postconditions: all variables assigned: name, money, wanted level, and moral level
     * @param name         name of the criminal
     * @param money        how much money the criminal starts with
     * @param wantedLvl    the odds of cops coming and ending the game (maxes out at ten)
     * @param moralLvl     how morally strong the criminal is
     */
    public ValentineCriminal(String name, double money, int wantedLvl, int moralLvl)
    {
        this.name = name;
        this.money = money;
        this.wantedLvl = wantedLvl;
        this.moralLvl = moralLvl;

        numCriminals++;
        this.ID = numCriminals;
    }

    /**
     * gets the name of the criminal
     * @return name of criminal
     */
    public String getName()
    {
        return name;
    }

    /**
     * gets the wanted level of the criminal
     * @return wantedLvl
     */
    public int getWantedLvl()
    {
        return wantedLvl;
    }

    /**
     * gets the amount of money a criminal has
     * @return the amount of money
     */
    public double getMoney()
    {
        return money;
    }

    /**
     * gets the moral level of a criminal
     * @return moralLvl
     */
    public int getMoralLvl()
    {
        return moralLvl;
    }

    /**
     * gets the amount of active criminals
     * @return the amount of criminals
     */
    public int numCriminals()
    {
        return numCriminals;
    }

    /**
     * gets the ID of the criminal in question
     * @return ID
     */
    public int getID()
    {
        return ID;
    }

    /**
     * sets the criminals name
     * <br> precondition: new name is not an empty String
     * <br> postcondition: set name to new name
     * @param newName      set new name for the criminal
     */
    public void setName(String newName)
    {
        this.name = newName;
    }

    /**
     * sets the amount of money a criminal has
     * <br> precondition: must not be an empty double; must have positive value
     * <br> postcondition: set the money to a new amount of money
     * @param newMoney      set new amount of money for the criminal
     */
    public void setMoney(double newMoney)
    {
        this.money = newMoney;
    }

    /**
     * sets the wanted level of a criminal
     * <br> precondition: must not be an empty int; must have a positive value
     * <br> postcondition: give the criminal a new wanted level
     */
    public void setWantedLvl(int newWantedLvl)
    {
        this.wantedLvl = newWantedLvl;
    }

    /**
     * sets the moral level of a criminal
     * <br> precondition: must not be an empty int; must have a positive value
     * <br> postcondition: set the replace the old moral level of a criminal with a new one
     * @param newMoralLvl      set the new moral level of a criminal
     */
    public void setMoralLvl(int newMoralLvl)
    {
        this.moralLvl = newMoralLvl;
    }

    /**
     * toString method
     * @return      criminal as string
     */
    @Override
    public String toString()
    {
        return
                "valentineCriminal name: \t" + name +
                        "\n Amount of money: \t\t" + money +
                        "\n The wanted level of criminal: " + wantedLvl +
                        "\n The moral level of a criminal: " + moralLvl +
                        "\n the ID of the criminal: \t\t" + ID;
    }

    /**
     * returns true if all attributes match between two criminals
     *<br>precondition: anotherCriminal must be non-null
     * @param      anotherCriminal
     * @return true if criminals are equal
     */
    public boolean equals(ValentineCriminal anotherCriminal)
    {
        if (this.name.equals(anotherCriminal.name) &&
                this.money == anotherCriminal.money &&
                this.wantedLvl == anotherCriminal.wantedLvl &&
                this.moralLvl == anotherCriminal.wantedLvl &&
                this.ID == anotherCriminal.ID
        )
        {
            return true;
        }
        return false;
    }

    /**
     * robbing will increase money and wanted level
     * <br>postconditions: money + from $25 to $500; wanted level + by .1;
     */
    public void rob()
    {
        this.money += (25 + Math.random() * 476);
        this.wantedLvl += 1;
    }

    public void turnInCriminal(ValentineCriminal target) {
        moralLvl--;
        money += 500;
        wantedLvl -= 5;
        if (wantedLvl < 0) {
            wantedLvl = 0;
        }
    }

    public void turnYourselfIn() {
        moralLvl++;
        setMoney(0.00);
        setWantedLvl(0);
    }







}