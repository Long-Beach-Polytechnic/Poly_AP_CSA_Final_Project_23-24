package com.poly.polyapcsafinalproject23_24;

public class RodriguezJohnnyCrop {

    /**
     * Name of the crops
     */
    private String name;

    /**
     * Category of the crop
     * Is is a fruit or a vegetable
     */
    private String category;

    /**
     * If the crop is ripe?
     * If crop is not ripe, then damage player
     * If the crop is ripe, boost health
     */
    private boolean isRipe;

    /**
     * The amount of days old the crop is
     * If the crop is older then 5 days its ripe
     * If the crop is less then 5 days old, then its not ripe
     */
    private int daysOld;

    /**
     * How much does the crop boost the health by
     * If the crop is fully ripe, it will restore farmer health by 10
     * If the crop is not fully ripe, damage player by 30

     */
    private int healthBoost;

    /**
     * default constructor
     * <br>Postconditions: Crop with name as empty string,
     * category as empty string, isRipe set to false, daysOld,
     * healthboost set to 0
     */
    public RodriguezJohnnyCrop()
    {
        this.name = " ";
        this.category = " ";
        this.isRipe = false;
        this.daysOld = 0;
        this.healthBoost = 0;


    }

    /**
     * constructor that initializes name and category
     * <br>Precondition: name and category must be nonnull
     * <br>Postconditions: crop with given name and category,
     *     isRipe set to false, daysOld, healthBoost set to 0
     */
    public RodriguezJohnnyCrop(String name, String category)
    {
        this.name = name;
        this.category = category;
        this.isRipe = false;
        this.daysOld = 0;
        this.healthBoost = 0;
    }

    /**
     * constructor that initializes all attributes
     * <br>Precondition: name and category must be nonnull,
     all other values must be non-negative
     * <br>Postconditions: crop with given name and category,
     *     isRipe, daysOld, healthBoost
     * @param name          name of crop
     * @param category      name of category (fruit or vegetable)
     * @param isRipe        if the crop is ripe (yes or No)
     * @param daysOld       number of days the crop has been planted for ( >= 0)
     * @param healthboost   amount of health the crop gives ( >=0)
     */
    public RodriguezJohnnyCrop(String name, String category, boolean isRipe, int daysOld, int healthBoost)
    {
        this.name = name;
        this.category = category;
        this.isRipe = isRipe;
        this.daysOld = daysOld;
        this.healthBoost = healthBoost;

    }

    /**
     * gets the crop's name
     * @return    name of crop
     */
    public String getName()
    {
        return name;
    }

    /**
     * sets the crop's name
     * <br>Precondition: newName is a non-empty string
     * <br>Postcondition: name set to newName
     * @param    newName    new name for the crop
     */
    public void setName(String newName)
    {
        this.name = newName;
    }

    /**
     * gets the Crop's category
     * @return    Crop's category
     */
    public String getCategory()
    {
        return category;
    }

    /**
     * sets the crop's category
     * <br>Precondition: newCategory is a non-empty string
     * <br>Postcondition: category set to newCategory
     * @param    newCategory    new category for the crop
     */
    public void setCategory(String newCategory)
    {
        this.category = newCategory;
    }

    /**
     * gets the number of days the crop has been planted
     * @return    number of days the crop has been planted
     */
    public int getDaysOld()
    {
        return daysOld;
    }

    /**
     * sets the number of days the crop has been planted for
     * <br>Precondition: numDaysOld greater than or equal to 0
     * <br>Postcondition: daysOld set to numDaysOld
     * @param    numDaysOld    number of days the crop has been planted (>=0)
     */
    public void setDaysOld(int numDaysOld)
    {
        this.daysOld = numDaysOld;
    }

    /**
     * gets if the crop is ripe or not
     * @return    is the crop ripe or not
     */
    public boolean isRipe()
    {
        return daysOld >= 2;
    }

    public void getIsRipe(boolean newIsRipe)
    {
        this.isRipe = newIsRipe;
    }


    /**
     * gets the number of health a crop grants
     * @return    number of health crops grant
     */
    public int getHealthBoost()
    {
        return healthBoost;
    }

    /**
     * sets the amount of health the crops grant
     * <br>Precondition: numHealthBoost greater than or equal to 0
     * <br>Postcondition: healthBoost set to numHealthBoost
     * @param    numHealthBoost    number of health the crops grant the player (>=0)
     */
    public void setHealthBoost(int numHealthBoost)
    {
        this.healthBoost = numHealthBoost;
    }


    public void addDay() {
        daysOld++;
    }

    /**
     * toString method
     * @return    crop as a string
     */
    public String toString()
    {
        return
                "Name of the crop:\t" + name +
                        "\nCategory of the crop:\t\t" + category +
                        "\nIs the crop Ripe?:\t\t" + isRipe +
                        "\nHow many days old is the crop?:\t" + daysOld +
                        "\nHealth crops gives:\t" + healthBoost;

    }

    /**
     * returns true if all attributes match between two crops
     * <br>Precondition: anotherCrop must be non-null
     * @param    anotherCrop    another Crop object
     * @return   true if crops are equal
     */
    public boolean equals(RodriguezJohnnyCrop anotherCrop)
    {
        if(this.name.equals(anotherCrop.name) &&
                this.category == anotherCrop.category &&
                this.isRipe == anotherCrop.isRipe &&
                this.daysOld == anotherCrop.daysOld &&
                this.healthBoost == anotherCrop.healthBoost
        )
        {
            return true;
        }
        return false;
    }


}
