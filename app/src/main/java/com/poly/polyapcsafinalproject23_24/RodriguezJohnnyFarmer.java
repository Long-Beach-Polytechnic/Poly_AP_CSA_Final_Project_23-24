package com.poly.polyapcsafinalproject23_24;

public class RodriguezJohnnyFarmer {

    /**
     * Name of the farmer
     */
    private String name;

    /**
     * Amount of health the farmer starts with
     * He starts off with 100 health
     */
    private int health;

    /**
     * Will decide if the farmer is poisoned or not
     * if a crop is not ripe, it will poison the farmer
     * if a crop is ripe, it will heal the farmer
     */
    private boolean isPoisoned;

    /**
     * default constructor
     * <br>Postconditions: Farmer with name as empty string,
     * health set to 100, isPoisoned set to false
     */
    public Farmer(String name)
    {
        this.name = name;
        this.health = 100;
        this.isPoisoned = false;
    }



    /**
     * gets the farmer's name
     * @return    name of farmer
     */
    public String getName()
    {
        return name;
    }

    /**
     * sets the farmer's name
     * <br>Precondition: newName is a non-empty string
     * <br>Postcondition: name set to newName
     * @param    newName    new name for the farmer
     */
    public void setName(String newName)
    {
        this.name = newName;
    }

    /**
     * gets the amount of health a farmer has
     * @return    amount of health
     */
    public int getHealth()
    {
        return health;
    }

    /**
     * sets the number of health the farmer has
     * <br>Precondition: numHealth greater less or equal to 100
     * <br>Postcondition: health set to numhealth
     * @param    numhealth    number of health the farmer has (>=100)
     */
    public void setHealth(int numHealth)
    {
        this.health = numHealth;
    }

    public void addHealth(int amount)
    {
        this.health += amount;
    }

    /**
     * gets if the farmer is poisoned or not
     * @return    if the farmer is poisoned
     */
    public boolean isPoisoned()
    {
        return isPoisoned;
    }

    public void setPoisoned(boolean newIsPoisoned)
    {
        this.isPoisoned = newIsPoisoned;
    }




    public void eatCrop(Crop crop)
    {
        this.health += crop.getHealthBoost();
        if (!crop.isRipe())
        {
            this.isPoisoned = true;
        }
    }

    /**
     * toString method
     * @return    farmer as a string
     */
    public String toString()
    {
        return
                "Name of the Farmer:\t" + name +
                        "\nAmount of health:\t" + health +
                        "\nIs the Farmer Poisoned\t" + isPoisoned;
    }





}