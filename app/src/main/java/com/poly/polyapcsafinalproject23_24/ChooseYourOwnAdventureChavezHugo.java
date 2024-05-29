package com.poly.polyapcsafinalproject23_24;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChooseYourOwnAdventureChavezHugo extends GameActivity {

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;
    private int numLives;

    @Override
    protected void run() {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("Attack The Titans");
        tvSubtitle.setText("Survive!!!");

        numLives = 4;
        start();
    }


private void setAllBtnsVisible()
{
    btn1.setVisibility(View.VISIBLE);
    btn2.setVisibility(View.VISIBLE);
    btn3.setVisibility(View.VISIBLE);
}




public class Adventure{

    //instance variables
    //   variables you plan to use throughout the adventure

    private int numLives;
    //private Player player; (optional)


    public void run()
    {
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input


        //create a player object (optional)
        //player = new Player(...)

        //display project title and description

        System.out.println("The Great Titan Apocolypse");
        System.out.println("In this game, you are living in a world were giant humanoid creatures attack your village. Your mission is very simple, JUST SURVIVE, and the decisions you make will decide if you live or you DIE!!!");


        start();
    }

    private void start() {
        isWon = false;

        ivStory.setImageResource(R.drawable.im_laborday_title);

        tvStoryText.setText("THE TITANS HAVE BREACHED THE WALL");
        tvStoryText.setText("You must make the right decisions in order to survive!!!");
        tvStoryText.setText("The titans have breached the wall and are now attacking the village, what will you do to survive?");
        tvStoryText.setText("1. Attack the titans\n2. Watch in fear\n3. Run as fast as possible");

        setAllBtnsVisible();
        btn1.setText("Attack");
        btn2.setText("Watch");
        btn3.setText("Run Away");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {attack();}

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {watch();}

        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { runAway();}

        });
    }



    private void attack() {

        tvStoryText.setText("So you have chosen to ATTACK the titans!, You are either very brave or very stupid, lets see how you will survive, TIME TO ATTACK, CHOOSE YOUR WEAPON");

        setAllBtnsVisible();
        btn1.setText("Sword");
        btn2.setText("Gun");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickerListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { sword() {
            });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { gun(); {
            });

            }


    private void sword() {


        tvStoryText.setText("You have chosen the sword, you have found that titans are vulnerable to swords, Now its time for you to kill the titan. Where would you attack?");
        tvStoryText.setText("1. Chest \n2. Head \n3. Neck");

        setAllBtnsVisible();
        btn1.setText("Chest");
        btn2.setText("Head");
        btn3.setText("Neck");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { chest(); {
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { head(); {
            });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { neck(); {
            });
            }



    private void chest()
    {

        tvStoryText.setText("YOU LOST!!! You got eaten by the titan!. The titans chest are very resistant, and tough against attacks, try again...");
        defeat();
    }

    private void head()
    {

        tvStoryText.setText("YOU LOST!!! You got eaten by the titan!. The titans head are very alert, and can see your movements with great accuracy, try again...");
        defeat();
    }

    private void neck()
    {

        tvStoryText.setText("You found out their weakness! Now how will you attack the neck?");
        tvStoryText.setText("1. FULL STRENGTH \n2. NO STRENGTH.......");

        setAllBtnsVisible();
        btn1.setText("FULL STRENGTH");
        btn2.setText("No strength...");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { fullstrength(); {
            });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { nostrength(); {
            });
            }





    private void fullstrength()
    {

        tvStoryText.setText("YOU WIN!! YOU WENT ALL IN WITH FULL STRENGTH AND DEFEATED THE TITANS!!! CONGRATS!!");

        start();
    }

    private void nostrength()
    {

        tvStoryText.setText("YOU LOST!!! Come on, you really thought you were gonna win without putting in strength? ._. try again...");
        defeat();
    }

    private void gun()
    {

        tvStoryText.setText("YOU LOST!!! Guns are not effective towards titans! try again...");
        defeat();
    }

    private void watch()
    {

        tvStoryText.setText();


        tvStoryText.setText("You watch as the titans breach the wall, and you just keep watching... Whats your next move?");
        tvStoryText.setText("1. You watch them \n 2. You keep watching \n 3. You watch them even more...");


        if (choice == 1)
        {
            watchThem();
        }
        else if (choice == 2)
        {
            keepWatching();
        }
        else if (choice == 3)
        {
            watchThemMore();
        }
    }

    private void watchThem()
    {

        tvStoryText.setText("YOU LOST!!! What? you thought just staring at them would make you win? try again...");
        defeat();
    }
    private void keepWatching()
    {

        tvStoryText.setText("YOU LOST!!! Why do you wanna watch them? you are just a sitting duck, try again...");
        defeat();
    }
    private void watchThemMore()
    {

        tvStoryText.setText("YOU LOST!!! Why the hell do you just wanna watcn them? you like how the look? Whats wrong with you, do something else, try again...");
        defeat();
    }

    private void runAway()

    {

        tvStoryText.setText("You have chosen to run away, you are either a coward, or your thinking strategically, and with logic, now... make a decision!");
        tvStoryText.setText("1. Run as fast as possible \n2. Try to save your family ");


        if (choice == 1)
        {
            runFast();
        }
        else if (choice == 2)
        {
            runFamily();
        }
    }

    private void runFast()

    {

        tvStoryText.setText("You are still running and are looking for a place to hide, choose quick!");
        tvStoryText.setText("1. Hide in a building \n2. Hide in a tree");


        if (choice == 1)
        {
            hideBuilding();
        }
        else if (choice == 2)
        {
            hideTree();
        }
    }

    private void hideBuilding()
    {

        tvStoryText.setText("YOU LOST!!! The titans can smell you! ");
        defeat();
    }

    private void hideTree()
    {

        System.out.println("YOU LOST!!! The titans can still smell and see you!");
    }

    private void runFamily()
    {

        System.out.println("You are looking for your family, how are you going to find them?");
        System.out.println("1. Search for them \n2. Ask where they are ");


        if (choice == 1)
        {
            searchFamily();
        }
        else if (choice == 2)
        {
            askFamily();
        }
    }

    private void searchFamily()
    {

        System.out.println("You are searching for your family, where are you going to look for them?");
        System.out.println("1. Search in a nearby bulding \n2. Search among the people in the crowd");


        if (choice == 1)
        {
            searchBuilding();
        }
        else if (choice == 2)
        {
            searchCrowd();
        }
    }

    private void searchBuilding()
    {

        System.out.println("YOU LOST!!! They were to many buildings to search for, and got eaten before you could reach one");

        defeat();
    }

    private void searchCrowd()
    {

        System.out.println("You see people who resemble them, do you go and check?");
        System.out.println("1. Check \n2 Do not check");


        if (choice == 1)
        {
            check();
        }
        else if (choice == 2)
        {
            notCheck();
        }
    }

    private void check()
    {

        System.out.println("YOU WIN!!! Those people were your family, and you succesfully rescued them and survived");

        start();
    }

    private void notCheck()
    {

        System.out.println("YOU LOST!!! Why woudln't you check? Like it doesnt hurt to double check");

        defeat();
    }

    private void askFamily()
    {

        System.out.println("YOU LOST!!! The strangers dont know how they look like, maybe you shouldve had friends");

        defeat();
    }

    private void defeat()
    {
        //run method when defeated

        //lose a life
        numLives--;

        //clear console, display text, etc
        //System.out.println(...)

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            System.out.println("But you miracalously got saved, try again...");

            start();
        }
        else
        {
            System.out.println("GAME OVER!!! YOU LOST ALL YOUR LIVES, AND GOT EATEN WHOLE BY THE TITANS");//print game over message
        }
    }
}