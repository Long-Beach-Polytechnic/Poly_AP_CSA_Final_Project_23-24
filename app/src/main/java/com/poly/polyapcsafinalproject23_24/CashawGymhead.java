package com.poly.polyapcsafinalproject23_24;

/**
 * Gymhead for workout
 * @author Charles Cashaw
 * @since 12/20/2023
 * @version 1.0
 */
public class CashawGymhead {

    /**
     * gymheads name
     */
    private String name;
    /**
     *number of push ups
     */
    private int pushUps;
    /**
     *number of squats
     */
    private int squats;
    /**
     *number of pull ups
     */
    private int pullUps;
    /**
     *number of sit ups
     */
    private int sitUps;
    /**
     *number of workout done
     */
    private int workoutDone;
    /**
     *max number of workous
     */
    private int maxWorkout;
    /**
     *gymhead id
     */
    private int ID;
    /**
     *number of gymheads
     */
    private static int numGymHeads;

    /**
     *default constructor
     *<br>Postconditions: gymhead with name as empty string
     *    pullUps, pushUps, squats, sitUps, workoutDone, set to 0,  maxWorkout set to 30, ID is assigned
     */
    public CashawGymhead()
    {
        this.name = "";
        this.pullUps = 0;
        this.pushUps = 0;
        this.squats = 0;
        this.sitUps = 0;
        this.workoutDone = 0;
        this.maxWorkout = 30;
        numGymHeads++;
        this.ID = numGymHeads;
    }

    /**
     * constructor intializes name
     * <br>Preconditions: name must be nonnull
     * <br>Postconditions: gymhead with given name,
     *    pullUps, pushUps, squats, sitUps, workoutDone, set to 0,  maxWorkout set to 30, ID is assigned
     * @param   name    name of gymhead
     */

    public CashawGymhead(String name)
    {
        this.name = name;
        this.pullUps = 0;
        this.pushUps = 0;
        this.squats = 0;
        this.sitUps = 0;
        this.workoutDone = 0;
        this.maxWorkout = 30;
        numGymHeads++;
        this.ID = numGymHeads;
    }


    /**
     * Constructor that initializes all workouts/attributes
     *<br>Preconditions: name must be nonnull, other values must be non-negative
     *<br>Postconditions: contestant with given name, pullUps, pushUps, squats, sitUps, workoutDone, set to 0,  maxWorkout set to 30, ID is     *assigned
     *@param  name          name of gymhead
     *@param  pullUps       number of pull ups done ( >= 0)
     *@param  pushUps       number of push ups done ( >= 0)
     *@param  squats        number of squats done ( >= 0)
     *@param  sitUps        number of sit ups done ( >= 0)
     *@param  workoutDone   number of workouts dont ( >= 0)
     */
    public CashawGymhead(String name, int pullUps, int pushUps, int squats, int sitUps, int workoutDone, int maxWorkout)
    {
        this.name = name;
        this.pullUps = pullUps;
        this.pushUps = pushUps;
        this.squats = squats;
        this.sitUps = sitUps;
        this.workoutDone = workoutDone;
        this.maxWorkout = maxWorkout;
        numGymHeads++;
        this.ID = numGymHeads;
    }

    /**
     *gets the amount of workouts done
     *@return  number of workouts done
     */
    public int getWorkoutDone()
    {
        return workoutDone;
    }

    /**
     *sets the number when the workout is done
     *<br>Precondition: numWorkoutDone is greater than or equal to
     *<br>Postcondition: numWorkoutDone set
     *@param numWorkoutDone  number of when the workout is done
     */
    public void setWorkoutDone(int numWorkoutDone)
    {
        this.workoutDone = numWorkoutDone;
    }

    /**
     *gets the max amount of workouts possible
     *@return  number of max workouts
     */
    public int getMaxWorkout()
    {
        return maxWorkout;
    }

    /**
     *sets the max workout number
     *<br>Precondition: maxWorkout is greater than or equal to
     *<br>Postcondition: maxWorkout set to 30
     *@param maxWorkoutDone  number of when the workout is done
     */
    public void setMaxWorkout(int numMaxWorkout)
    {
        this.maxWorkout = numMaxWorkout;
    }

    /**
     *gets the gymhead name
     *@return  name of gymhead
     */
    public String getName()
    {
        return name;
    }

    /**
     *sets the gymheads name
     *<br>Precondition: newName is a non-empty string
     *<br>Postcondition: name set to newName
     *@param newName  new name for the gym head
     */
    public void setName(String newName)
    {
        this.name = newName;
    }

    /**
     *gets the gymhead ID
     *@return  ID of gymhead
     */
    public int getID()
    {
        return ID;
    }

    /**
     *sets the gymheads id
     *<br>Precondition: ID is a non-empty int
     *<br>Postcondition: ID set for gymhead
     *@param   ID  new ID for the gymhead
     */
    public void setID(int id)
    {
        this.ID = ID;
    }

    /**
     *gets the number of pullups
     *@return  returns the number of pullups
     */
    public int getPullUps()
    {
        return pullUps;
    }

    /**
     *sets the number of pull ups done
     *<br>Precondition: numPullUps greater than or equal to 0
     *<br>Postcondition: numPullUps set
     *@param numPullUps    number of pull ups done (>=0)
     */
    public void setPullUps(int numPullUps)
    {
        this.pullUps = numPullUps;
    }

    /**
     *gets the pull up method/number of push ups
     *@return  returns the number of push ups
     */
    public int getPushUps()
    {
        return pushUps;
    }


    /**
     *sets the number of push ups done
     *<br>Precondition: numPushUps greater than or equal to 0
     *<br>Postcondition: numPushUps set
     *@param numPullUps    number of push ups done (>=0)
     */
    public void setPushUps(int numPushUps)
    {
        this.pushUps = numPushUps;
    }

    /**
     *gets the squat method/number of squats
     *@return  returns the number of squats
     */
    public int getSquats()
    {
        return squats;
    }


    /**
     *sets the number of squats done
     *<br>Precondition: squats greater than or equal to 0
     *<br>Postcondition: squats set
     *@param numPullUps    number of squats done (>=0)
     */
    public void setSquats(int numSquats)
    {
        this.squats = numSquats;
    }

    /**
     *gets the pull up method/number of sit ups
     *@return  returns the number of sit ups
     */
    public int getSitUps()
    {
        return sitUps;
    }
    /**
     *sets the number of sit ups done
     *<br>Precondition: numSitUps greater than or equal to 0
     *<br>Postcondition: numSitUps set
     *@param numPullUps    number of sit ups done (>=0)
     */
    public void setSitUps(int numSitUps)
    {
        this.sitUps = numSitUps;
    }
    /**
     * toString method
     * @return    gymhead as a string
     */
    @Override
    public String toString()
    {
        return
                "\nGymhead name: \t" + name +
                        "\nPull ups done: \t" + pullUps +
                        "\nPush ups done: \t" + pushUps +
                        "\nSquats done: \t" + squats +
                        "\nSit ups done: \t" + sitUps +
                        "\nWorkout Done: \t" + workoutDone +
                        "\n ID: \t" + ID;
    }

    /**
     * returns true if all attributes match between equal
     *  <br>Precondition: anotherGymhead must be non-null
     *  @param    anotherGymhead    another gymhead object
     *  @return true if gymheads are equal
     */
    public boolean equals(CashawGymhead anotherGymhead)
    {
        if (this.name.equals(anotherGymhead.name) &&
                this.pullUps == anotherGymhead.pullUps &&
                this.pushUps == anotherGymhead.pushUps &&
                this.squats == anotherGymhead.squats &&
                this.sitUps == anotherGymhead.sitUps &&
                this.workoutDone == anotherGymhead.workoutDone &&
                this.ID == anotherGymhead.ID
        )
        {
            return true;
        }
        return false;
    }

    /**
     *  run this method when the gymhead does a pull up
     *  <br>Postcondition:
     *  <br>pullUps increase by 1
     *  <br>workoutDone increased by 1
     */
    public void doPullUp()
    {
        pullUps++;
        workoutDone++;
    }

    /**
     *  run this method when the gymhead does a push up
     *  <br>Postcondition:
     *  <br>pushUps increase by 1
     *  <br>workoutDone increased by 1
     */

    public void doPushUp()
    {
        pushUps++;
        workoutDone++;
    }

    /**
     *  run this method when the gymhead does a squat
     *  <br>Postcondition:
     *  <br>squats increase by 1
     *  <br>workoutDone increased by 1
     */
    public void doSquats()
    {
        squats++;
        workoutDone++;
    }

    /**
     *  run this method when the gymhead does a sit up
     *  <br>Postcondition:
     *  <br>sitUps increase by 1
     *  <br>workoutDone increased by 1
     */
    public void doSitUps()
    {
        sitUps++;
        workoutDone++;
    }



}
