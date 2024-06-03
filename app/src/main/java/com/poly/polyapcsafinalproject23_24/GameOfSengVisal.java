package com.poly.polyapcsafinalproject23_24;

import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameOfSengVisal extends GameActivity {


    private TextView tvSubtitle, tvNameVal, tvWeightVal, tvBodyFatVal, tvBodyMassVal, tvMaxBenchVal, tvMaxSquatVal, tvMaxRunVal, tvMain;

    private ImageView ivMain;
    private EditText etMain;

    private int day, numDays;

    private Button btn1, btn2, btn3, btn4;

    /**
     *fat body type preset
     */
    private SengMan bodyType1;
    /**
     *skinny body type preset
     */
    private SengMan bodyType2;
    /**
     *average body type preset
     */
    private SengMan bodyType3;
    /**
     *choosebody(); must be run before use
     *tracks the current body type chosen
     */
    private SengMan currentBodyType; //tracks which body type is currently being used

    @Override
    protected void run() {
        setContentView(R.layout.activity_seng_visal_main);

        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvMain = findViewById(R.id.tv_main);
        tvNameVal = findViewById(R.id.tv_name_val);
        tvWeightVal = findViewById(R.id.tv_weight_val);
        tvBodyFatVal = findViewById(R.id.tv_body_fat_val);
        tvBodyMassVal = findViewById(R.id.tv_body_mass_val);
        tvMaxBenchVal = findViewById(R.id.tv_max_bench_val);
        tvMaxSquatVal = findViewById(R.id.tv_max_squat_val);
        tvMaxRunVal = findViewById((R.id.tv_max_run_val);
        etMain = findViewById(R.id.et_main);

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);

        etMain.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setText("Continue");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                welcomeScreen();
            }
        });



    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
    }




    /**
     * Method that runs the game
     */
    public void run() {
        welcomeScreen();
        initialize();
        chooseBody();
        decision();
        endScreen();




    }

    /**
     *method for the pre-game screen
     */
    private void welcomeScreen() {

        tvSubtitle.setText("Welcome to the body improvement simulator!");
        System.out.println("\nYou can choose between 3 body types: ");
        System.out.println("There some exercises you can perform, your maxes are recorded and you can increase them by pushing your limits bit by bit");
        System.out.println("Diet is important too! There are multiple foods you can eat to manipulate your body's appearance!");
        System.out.println("\nGood luck!");
        String text = "";
        tvMain.setText(text);

        btn1.setText("Continue");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initialize();
            }
        });
    }

    /**
     *initialization of body types and the character name
     */
    private void initialize() {


        tvMain.setText("Enter your name");

        btn1.setVisibility(View.INVISIBLE);

        etMain.setVisibility(View.VISIBLE);

        etMain.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                btn4.setVisibility(View.VISIBLE);
                btn4.setText("Continue");
                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        chooseBody(etMain.getText().toString());
                    }
                });
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }

    /**
     *decision by the user to choose one of the three given body types
     */
    private void chooseBody(String characterName) {

        etMain.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        this.bodyType1 = new SengMan(characterName, 200.0, 30.0, 70.0, 150, 170, 1, 0);
        this.bodyType2 = new SengMan(characterName, 100, 10.0, 90.0, 90, 100, 3, 0);
        this.bodyType3 = new SengMan(characterName, 140, 15.0, 85.0, 120, 140, 2, 0);



        System.out.println("Pick a body preset");
        System.out.println("1. Fat\n2. Skinny\n3. Average");

        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);

        btn1.setText("Fat");
        btn2.setText("Skinny");
        btn3.setText("Average");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentBodyType = bodyType1;
                decision();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentBodyType = bodyType2;
                decision();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentBodyType = bodyType3;
                decision();
            }
        });



    }

    /**
     *contents inside this method will loop for the majority of the game
     */
    private void decision() { //block variable, you cannot use day outside of this for loop

        tvMain.setText("How many days do you want to give yourself for your best you?");

        etMain.setInputType(InputType.TYPE_CLASS_NUMBER);
        etMain.setHint("");

        etMain.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                btn4.setVisibility(View.VISIBLE);
                btn4.setText("Continue");
                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        numDays = Integer.parseInt(etMain.getText().toString());
                        day = 1;
                        options();
                    }
                });
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void options(){

        if (day < numDays)
        {
            Util.clearConsole();
            System.out.println("You have " + dayNumbers + " days to fulfill your goals, " + currentBodyType.getName());
            System.out.println(currentBodyType);

            tvNameVal.setText(currentBodyType.getName());
            tvWeightVal.setText(currentBodyType.getWeight());
            Util.pauseConsole();

            String text = """
        What do you want to do?
        1. Go to the Gym
        2. Eat food
        3. Go for a run
        4. Rest for the day
        """;


                if (option == 1) {
                    Util.clearConsole();
                    System.out.println("What do you want to do at the gym?");
                    System.out.println("1. Bench Press\n2. Squat\n3. Run on the treadmill");
                    option = Util.enterInt(1,3);
                    if (option == 1) { //benchpress chosen
                        benchPress();
                    } else if (option == 2) { //squat chosen
                        squat();
                    } else if (option == 3) { //treadmill chosen
                        Util.clearConsole();
                        currentBodyType.setConsecutiveWorkoutDays(0); //running is rest as it does not heavily train muscles
                        System.out.println("How many miles do you want to run?");
                        System.out.println("Your current max run distance is: " + currentBodyType.getMaxRunDistance());
                        int run = Util.enterInt(1,1000);
                        if (run > currentBodyType.getMaxRunDistance() + 1) {
                            System.out.println("You can't run that far! One day has been wasted");
                        }
                        else {
                            currentBodyType.setWeight(currentBodyType.getWeight() - 4);
                            currentBodyType.setLbmPercentage(currentBodyType.getLbmPercentage() + 0.5);
                            currentBodyType.setFatPercentage(currentBodyType.getFatPercentage() - 0.5);
                            System.out.println("LBM increased by 0.5\nFat decreased by 0.5\nWeight decreased by 4");
                        } if (run > currentBodyType.getMaxRunDistance() - 1) { //increases max run distance after running
                            currentBodyType.setMaxRunDistance(run);
                            System.out.println("Your max distance has increased to " + currentBodyType.getMaxRunDistance() + "!");

                        }
                    }
                } else if (option == 2) { // eat food
                    Util.clearConsole();
                    System.out.println("What do you want to eat?");
                    System.out.println("1. Chicken\n2. Salad\n3. Burger");
                    int food = Util.enterInt(1,3);
                    if (food == 1 ) { //adds 5 weight and 2 lbm, subtracts 2 fat
                        eatChicken();
                    }
                    else if (food == 2 ) { //subtracts 4 weight
                        eatSalad();
                    }
                    else if (food == 3) { //adds 5 weight and 2 fat, subtracts 2 lbm
                        eatBurger();
                    }
                } if (option == 3) { // go for a run
                    Util.clearConsole();
                    currentBodyType.setConsecutiveWorkoutDays(0); //running is rest as it does not heavily train muscles
                    System.out.println("How many miles do you want to run? Note that you cannot run over a mile over your max");
                    System.out.println("Your current max run distance is: " + currentBodyType.getMaxRunDistance());
                    int run = Util.enterInt(1, 1000);
                    if (run > currentBodyType.getMaxRunDistance() + 1) {
                        System.out.println("You can't run that far! One day has been wasted");
                    }
                    else {
                        currentBodyType.setWeight(currentBodyType.getWeight() - 4);
                        currentBodyType.setLbmPercentage(currentBodyType.getLbmPercentage() + 0.5);
                        currentBodyType.setFatPercentage(currentBodyType.getFatPercentage() - 0.5);
                        System.out.println("LBM increased by 0.5\nFat decreased by 0.5\nWeight decreased by 4");
                    } if (run > currentBodyType.getMaxRunDistance() - 1) { //increases max run distance after running
                        currentBodyType.setMaxRunDistance(run);
                        System.out.println("Your max distance has increased to " + currentBodyType.getMaxRunDistance() + "!");
                    } else if (option == 4) {
                        currentBodyType.setConsecutiveWorkoutDays(0);
                        currentBodyType.setLbmPercentage(currentBodyType.getLbmPercentage() + 0.5);
                        currentBodyType.setFatPercentage(currentBodyType.getFatPercentage() - 0.5);
                        System.out.println("You rested for the day");
                        // You decide to rest for the day
                    }

                }
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("You have " + day + " days left to fulfill your goals, " + currentBodyType.getName());
                System.out.println(currentBodyType);
                Util.pauseConsole();

                text = """
          What do you want to do?
          1. Go to the Gym
          2. Eat food
          3. Go for a run
          4. Rest for the day
          """;
                System.out.println(text);
            }
        }
        else {
            endScreen();
        }

    }


    /**
     *Precondition:
     *decision() must be completely run before this method
     *Postcondition:
     *prints game over screen
     */
    private void endScreen() {
        Util.clearConsole();
        System.out.println("You have reached the deadline of your goal!");
        System.out.println("Your final stats are:");
        System.out.println(currentBodyType);

        System.out.println("\nYour old stats are:");
        if (currentBodyType == bodyType1) {
            System.out.println("Name: " + currentBodyType.getName() + "\nWeight: 200\nBody Fat %: 30.0\nLean Body Mass %: 70.0\nMax Bench: 150\nMax Squat: 170\nMax Run Distance: 1");
        } else if (currentBodyType == bodyType2) {
            System.out.println("Name: " + currentBodyType.getName() + "\nWeight: 100\nBody Fat %: 10.0\nLean Body Mass %: 90.0\nMax Bench: 90\nMax Squat: 100\nMax Run Distance: 3");
        } else if (currentBodyType == bodyType3) {
            System.out.println("Name: " + currentBodyType.getName() + "\nWeight: 140\nBody Fat %: 15.0\nLean Body Mass %: 75.0\nMax Bench: 120\nMax Squat: 140\nMax Run Distance: 2");
        }
    }

    /**
     *run when the user wants to do a bench press
     *<br>Precondition:
     *(option == 1)
     *<br>Postcondition:
     *<br>LbmPercentage increased by 0.5
     *<br>FatPercentage decreased by 0.5
     *
     *if the bench amount cannot be lifted then:
     *lbmPercentage decreased by 0.5
     *fatPercentage increased by 0.5
     *
     *if bench amount is under 5 over max:
     *maxBench increased to amount the user benched
     */
    private void benchPress() {
        Util.clearConsole();
        System.out.println("How much lbs do you want to bench?");
        System.out.println("Your current max is: " + currentBodyType.getMaxBench());
        int bench = Util.enterInt(1,1000);
        if (currentBodyType.getConsecutiveWorkoutDays() >= 5) {
            System.out.println("You have not been taking enough rest! You wasted one day.");
        }
        else if (bench > currentBodyType.getMaxBench() + 5) {
            System.out.println("You can't bench that much! You are injured in the process");
            currentBodyType.setLbmPercentage(currentBodyType.getLbmPercentage() - 0.5);
            currentBodyType.setFatPercentage(currentBodyType.getFatPercentage() + 0.5);
            currentBodyType.setWeight(currentBodyType.getWeight() - 2);
            System.out.println("LBM decreased by 0.5\nFat increased by 0.5\nWeight decreased by 2");
        }
        else {
            currentBodyType.setLbmPercentage(currentBodyType.getLbmPercentage() + 0.5);
            currentBodyType.setFatPercentage(currentBodyType.getFatPercentage() - 0.5);
            System.out.println("LBM incresaed by 0.5\nFat decreased by 0.5");
            if (bench > currentBodyType.getMaxBench() - 5) { //increases max bench after working out
                currentBodyType.setMaxBench(bench);
                System.out.println("Your max bench has increased to " + currentBodyType.getMaxBench() + "!");
            }
        }
    }

    /**
     *run when the user wants to do a squat
     *<br>Precondition:
     *(option == 2)
     *<br>Postcondition:
     *<br>LbmPercentage increased by 0.5
     *<br>FatPercentage decreased by 0.5
     *
     *if the squat amount cannot be lifted then:
     *lbmPercentage decreased by 0.5
     *fatPercentage increased by 0.5
     *
     *if squat amount is under 5 over max:
     *maxSquat increased to amount the user squatted
     */
    private void squat() {
        Util.clearConsole();
        System.out.println("How much lbs do you want to squat?");
        System.out.println("Your current max is: " + currentBodyType.getMaxSquat());
        int squat = Util.enterInt(1,1000);
        if (currentBodyType.getConsecutiveWorkoutDays() >= 4) {
            System.out.println("You have not been taking enough rest! You wasted one day.");
        }
        else if (squat > currentBodyType.getMaxSquat() + 5) { // subtracts 2 lbm and 2 weight, adds 2 fat
            System.out.println("You can't squat that much! You are injured in the process");
        } else {
            currentBodyType.setLbmPercentage(currentBodyType.getLbmPercentage() + 0.5);
            currentBodyType.setFatPercentage(currentBodyType.getFatPercentage() - 0.5);
            currentBodyType.setWeight(currentBodyType.getWeight() - 2);
            System.out.println("LBM increased by 0.5\nFat decreased by 0.5");
            if (squat > currentBodyType.getMaxSquat() - 5) { //increases max squat after working out
                currentBodyType.setMaxSquat(squat);
                System.out.println("Your max squat has increased to " + currentBodyType.getMaxSquat() + "!");
            }
        }
    }

    /**
     *run when the user wants to eat chicken
     *<br>Precondition:
     *(food == 1)
     *<br>Postcondition:
     *<br>LbmPercentage increased by 0.5
     *<br>FatPercentage decreased by 0.5
     */
    private void eatChicken() {
        Util.clearConsole();
        currentBodyType.setWeight(currentBodyType.getWeight() + 5);
        currentBodyType.setFatPercentage(currentBodyType.getFatPercentage() - 0.5);
        currentBodyType.setLbmPercentage(currentBodyType.getLbmPercentage() + 0.5);
        System.out.println("LBM increased by 0.5\nFat decreased by 0.5\nWeight increased by 5");
    }

    /**
     *run when the user wants to eat salad
     *<br>Precondition:
     *(food == 2)
     *<br>Postcondition:
     *<br>Weight decreased by 3
     */
    private void eatSalad() {
        Util.clearConsole();
        currentBodyType.setWeight(currentBodyType.getWeight() - 3);
        System.out.println("Weight decreased by 3");
    }

    /**
     *run when the user wants to eat burger
     *<br>Precondition:
     *(food == 3)
     *<br>Postcondition:
     *<br>LbmPercentage decreased by 0.7
     *<br>FatPercentage increased by 0.7
     *<br>Weight increased by 5
     */
    private void eatBurger() {
        Util.clearConsole();
        currentBodyType.setWeight(currentBodyType.getWeight() + 10);
        currentBodyType.setFatPercentage(currentBodyType.getFatPercentage() + 0.7);
        currentBodyType.setLbmPercentage(currentBodyType.getLbmPercentage() - 0.7);
        System.out.println("LBM decreased by 0.7\nFat increased by 0.7\nWeight increased by 5");
    }
}










