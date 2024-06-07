package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameLimBob extends GameActivity {

    private Worker player;

    public void run()
    {
        createPlayer();
        runWorker();
    }

    private void createPlayer()
    {
        player = new Worker("Bob");
    }

    private void runWorker()
    {
        setContentView(R.layout.activity_lim_main);
        if (player.getHoursWorked() < 15 && player.getMoneySaved() < 4_000)
        {
            displayStats();
            chooseOption();
        }
        else {
            endOfWorker();
        }
    }


    private void displayStats()
    {
        TextView tvHoursWorked = findViewById(R.id.tv_worked_val);
        TextView tvMoneySaved = findViewById(R.id.tv_saved_val);
        TextView tvMoneyEarned = findViewById(R.id.tv_earned_val);
        TextView tvMoneySpent = findViewById(R.id.tv_spent_val);

        tvHoursWorked.setText("  " + player.getHoursWorked()+ " hours");
        tvMoneySaved.setText("  $" + player.getMoneySaved());
        tvMoneyEarned.setText("  $" + player.getMoneyEarned());
        tvMoneySpent.setText("  $" + player.getMoneySpent());



    }

    private void chooseOption()
    {
        TextView tvMain = findViewById(R.id.tv_main);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);

        tvMain.setText("What do you want to do?");

        btn1.setText("Work");
        btn2.setText("Earn money");
        btn3.setText("Spend money");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.hoursWorking();
                tvMain.setText("You will earn money when you work, so keep working!!");
                runWorker();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.earnMoney();
                tvMain.setText("Your work paid off, now you can spend it.");
                runWorker();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.moneySpent();
                tvMain.setText("SPEND YOUR MONEY");
                runWorker();
            }
        });

    }

    private void endOfWorker()
    {
        TextView tvMain = findViewById(R.id.tv_main);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);

        if (player.getMoneyEarned() >= 5_000)
        {

            tvMain.setText("oh damn your bank is full!");
        }
        if (player.getHoursWorked() >= 15)
        {
            tvMain.setText("You passed out because you worked too much.");
        }
        if (player.getMoneySaved() < 1_500 || player.getMoneySpent() < 1_500)
        {
            tvMain.setText("You are a spender");
        }

        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setText("Continue");

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                tvMain.setText("Congratulation, you saved " + player.getMoneySaved() + " money!");

                btn1.setVisibility(View.VISIBLE);
                btn2.setVisibility(View.VISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                btn1.setText("Work again");
                btn2.setText("No, I saved too much");

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        player = new Worker(player.getName());
                        runWorker();
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(GameLimBob.this, MainActivity.class));
                    }
                });
            }
        });


    }

}

/**
 *Worker for a working game
 *author Bob Lim
 *Since 1/22/24
 *Version 1.0
 */
class Worker {
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
     *default constructor
     *<br>Post conditions: Worker with name as empty string,
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
     *Constructor that initialize name
     * <br>Preconditions:  name must be nonnull
     * <br>Post conditions: worker with given name;
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
     *<br>Post conditions: worker with given name,
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
     *<br>Post conditions: name set to newName
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
     *<br>Post conditions: hoursWorked set
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
     *<br>Post conditions: moneySaved set
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
     *<br>Post conditions: moneyEarned set
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
     *<br>Pre conditions: numMoney greater than or equal to 0
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
     *returns true if all attributes match between two contestants
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
     *run this method when the worker is working
     *<br>Post conditions:
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