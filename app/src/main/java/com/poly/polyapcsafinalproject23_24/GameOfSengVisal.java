package com.poly.polyapcsafinalproject23_24;

import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameOfSengVisal extends GameActivity {

    private TextView tvTitle, tvSubtitle, tvStoryText;

    private ImageView ivStory;

    private Button btn1, btn2, btn3, btn4;

    @Override
    protected void run() {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewByID(R.id.tv_title_txt);
        tvSubtitle = findviewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("GET FIT!");
    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
    }

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
        String text = """

         ____ _____ _____   _____ ___ _____ _
        / ___| ____|_   _| |  ___|_ _|_   _| |
       | |  _|  _|   | |   | |_   | |  | | | |
       | |_| | |___  | |   |  _|  | |  | | |_|
       | ____|_____| |_|   |_|   |___| |_| (_)


      """;
        System.out.println(text);
        System.out.println("Welcome to the body improvement simulator!");
        System.out.println("\nYou can choose between 3 body types: ");
        System.out.println("There some exercises you can perform, your maxes are recorded and you can increase them by pushing your limits bit by bit");
        System.out.println("Diet is important too! There are multiple foods you can eat to manipulate your body's appearance!");
        System.out.println("\nGood luck!");
        Util.pauseConsole();
        Util.clearConsole();
    }

    /**
     *initialization of body types and the character name
     */
    private void initialize() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String characterName = scan.nextLine();


        //initialize the instance variables

        this.bodyType1 = new SengMan(characterName, 200.0, 30.0, 70.0, 150, 170, 1, 0);
        this.bodyType2 = new SengMan(characterName, 100, 10.0, 90.0, 90, 100, 3, 0);
        this.bodyType3 = new SengMan(characterName, 140, 15.0, 85.0, 120, 140, 2, 0);


    }

    /**
     *decision by the user to choose one of the three given body types
     */
    private void chooseBody() {
        Util.clearConsole();
        System.out.println("Pick a body preset");
        System.out.println("1. Fat\n2. Skinny\n3. Average");

        int body = Util.enterInt(1, 3);
        if (body == 1) {
            this.currentBodyType = bodyType1;
        } else if (body == 2) {
            this.currentBodyType = bodyType2;
        } else if (body == 3) {
            this.currentBodyType = bodyType3;
        }

    }

    /**
     *contents inside this method will loop for the majority of the game
     */
    private void decision() { //block variable, you cannot use day outside of this for loop
        Util.clearConsole();
        System.out.println("How many days do you want to give yourself for your best you?");
        int dayNumbers = Util.enterInt(1, 500);
        Util.clearConsole();
        System.out.println("You have " + dayNumbers + " days to fulfill your goals, " + currentBodyType.getName());
        System.out.println(currentBodyType);
        Util.pauseConsole();

        String text = """
        What do you want to do?
        1. Go to the Gym
        2. Eat food
        3. Go for a run
        4. Rest for the day
        """;
        System.out.println(text);
        for (int day=dayNumbers;day>=1;day--) { //incrementing for loop
            int option = Util.enterInt(1,4);
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










