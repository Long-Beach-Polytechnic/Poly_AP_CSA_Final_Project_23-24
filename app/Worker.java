
/**
 *Worker for a working game
 *author Bob Lim
 *Since 1/22/24
 *Version 1.0
 */
public class Worker {
    /**
     *Workers name
     */
    private String name;
    /**
     *number hours worked
     */
    private int hoursWorked;
    /**
     *amount of money sav
     */
    private int moneySaved;
    /**
     *amount of money earned
     */
    private int moneyEarned;
    /**
     *amount of money spent
     */
    private int moneySpent;
    /**
     *Id of worker, assigned in constructor
     */
    private final int ID;
    /**
     *tracks number of workers created
     */
    private static int numWorkers;

    /**
     *defult constructor
     *<br>Postconditions: Worker with name as empty string,
     *    hoursWorked, moneySaved, moneyEarned, moneySpent  set to 0, ID assigned
     */
    public Worker()
    {
        this.name = "";
        this.hoursWorked = 0;
        this.moneySaved = 0;
        this.moneyEarned = 2000;
        this.moneySpent = 0;
        numWorkers++;
        this.ID = numWorkers;
    }

    /**
     *Constructor that initialoze name
     * <br>Preconditions:  name must be nonnull
     * <br>Postconditions: worker with given name;
     *     hoursWorked, moneySaved, moneyEarned, moneySpent set to 0, ID assigned
     *@param name     name of worker
     */
    public Worker(String name)
    {
        this.name = name;
        this.hoursWorked = 0;
        this.moneySaved = 2000;
        this.moneyEarned = 0;
        this.moneySpent = 0;
        numWorkers++;
        this.ID = numWorkers;
    }

    /**
     *Constructor that initializes all attributes
     *<br>Preconditions name must be nonnull, all other values must be non-negative
     *<br>Postconditions: worker with given name,
     hoursWorked, moneySaved, moneyEarned, moneySpent, ID assigned
     *@param name         name of worker
     *@param hoursWorked  number of hours worked ( >= 0)
     *@param moneySaved   amount of money saved  ( >= 0)
     *@param moneyEarned  amount of money earned ( >= 0)
     *@param moneySpent   amount of money spent  ( >= 0)
     */
    public Worker(String name,  int hoursWorked, int moneySaved,
                  int moneyEarned, int moneySpent)
    {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.moneySaved = moneySaved;
        this.moneyEarned = moneyEarned;
        this.moneySpent = moneySpent;
        numWorkers++;
        this.ID = numWorkers;
    }

    /**
     *gets the worker's name
     *@return name of worker
     */
    public String getName()
    {
        return name;
    }

    /**
     *sets the worker's name
     *<br>Preconditions: newName is a non-empty string
     *<br>Postconditions: name set to newName
     *@param  newName   new name for the worker
     */
    public void setName(String newName)
    {
        this.name = newName;
    }

    /**
     *gets the number of hours worked
     *@return  number of hours worked
     */
    public int getHoursWorked()
    {
        return hoursWorked;
    }

    /**
     *sets the number of hours worked
     *<br>Preconditions: numHours greater than or equal to 0
     *<br>Postconditions: hoursWorked set
     *@param  numHours   number of hours worked (>=0)
     */
    public void setHoursWorked(int numHoursWorked)
    {
        this.hoursWorked = numHoursWorked;
    }

    /**
     *gets the amount of money saved
     *@return  amount of money saved
     */
    public int getMoneySaved()
    {
        return moneySaved;
    }

    /**
     *sets the amount of money saved
     *<br>Preconditions: numMoney greater than or equal to 0
     *<br>Postconditions: moneySaved set
     *@param numMoney     number of money saved (>=0)
     */
    public void setMoneySaved(int amount)
    {
        this.moneySaved = amount;
    }

    /**
     *gets the amount of money earned
     *@return amount of money earned
     */
    public int getMoneyEarned()
    {
        return moneyEarned;
    }

    /**
     *set the amount of money earned
     *<br>Preconditions: numMoney greater than or equal to 0
     *<br>Postconditions: moneyEarned set
     *@param num money   number of money earned (>=0)
     */
    public void setMoneyEarned(int numMoneyEarned)
    {
        this.moneyEarned = numMoneyEarned;
    }

    /**
     *gets the amount of money spent
     *@return amount of money spent
     */
    public int getMoneySpent()
    {
        return moneySpent;
    }

    /**
     *set the amount of money spent
     *<br>Precondtions: numMoney greater than or equal to 0
     *<br>PostConditions: moneySpent set
     *@param num money    number of money spent (>=0)
     */
    public void setMoneySpent(int numMoneySpent)
    {
        this.moneySpent = numMoneySpent;
    }

    /**
     *toString method
     *@return worker as a string
     */
    public String toString()
    {
        return
                "Worker name:\t" + name +
                        "\nHours Worked:\t\t" + hoursWorked +
                        "\nAmount of Sleep:\t\t" + moneySaved +
                        "\nMoney Earned:\t\t" + moneyEarned +
                        "\nMoney Spent:\t\t" + moneySpent +
                        "\nWorker ID:\t" + ID;
    }

    /**
     *returns true if all attributes match betweentwo contestants
     *<br>Preconditions : anotherWorker must be non-null
     *@param    anotherWorker    anotherWorker object
     *@return   true if workers are equal
     */
    public boolean equals(Worker anotherWorker)
    {
        if (this.name.equals(anotherWorker.name) &&
                this.hoursWorked == anotherWorker.hoursWorked &&
                this.moneySaved == anotherWorker.moneySaved &&
                this.moneyEarned == anotherWorker.moneyEarned &&
                this.moneySpent == anotherWorker.moneySpent &&
                this.ID == anotherWorker.ID
        )

        {
            return true;
        }
        return false;
    }

    /**
     *run this method whne the worker is working
     *<br>Postconditions:
     *<br>hoursWorked increase by 1
     *<br>moneyEarned increase by 50
     *<br>moneySaved increase by 25
     */
    public void hoursWorking()
    {
        hoursWorked++;
        moneyEarned +=50;
        moneySaved += 25;
    }

    public void earnMoney()
    {
        moneyEarned++;
        if (hoursWorked > 10)
        {
            hoursWorked--;
        }
        moneySaved += 200;
    }
    public void moneySpent()
    {
        moneySpent++;
        if (moneySpent < 500)
        {
            moneySaved -= 50;
        }
        moneyEarned -= 50;
    }
}