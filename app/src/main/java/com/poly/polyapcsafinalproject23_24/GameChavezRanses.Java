package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameChavezRanses extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)

    private TextView tvTitle, tvSubTitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;

    public void run()

    {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubTitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("THE MATRIX");
        tvSubtitle.setText("High School Edition");

        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)
        start();
    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }

    private void start()
    {
        tvStoryText.setText("Escaping the Matrix, how blind are we?");
        System.out.println("1. Man...That's a lot of work, forget that stuff.\n2. We must go public and discover the truth.\n3. We must venture out! There’s more out there!");
        //Util.enterInt was here

        setAllBtnsVisible();
        btn1.setText(" Give up");
        btn2.setText("Go public");
        btn3.setText("Venture out");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                giveUp();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPublic();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ventureOut();
            }
        });

    }

    //GIVING UP PATH


    private void giveUp()
    {
        //Util.clearConsole was here
        tvStoryText.setText("What would you like to do on your free time?");
        System.out.println("1. Stay home \n2. Go out and be a kid");
        //Util.enterInt was here

        setAllBtnsVisible();
        btn1.setText("Stay home");
        btn2.setText("Go out");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stayHome();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goOut();
            }
        });

    }
    //____STAYING HOME CHOICE____
    private void stayHome()
    {
      //Util.clearConsole was here
        tvStoryText.setText("You decide to stay home and be FAT");
        System.out.println("1. Go mimis \n2. Watch conspiracy theories");
         //Util.enterInt was here


        setAllBtnsVisible();
        btn1.setText("Go mimis, sleep is amazing");
        btn2.setText("watch videos");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goMimis();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchVideos();
            }
        });

    }
    private void goMimis()  //DEFEAT
    {
        tvStoryText.setText("After a long beautiful uneventful night, you wake up and see the heavenly stairs of heaven since you died in your sleep for being FAT");
        defeat();
    }


    private void watchVideos()
    {
        //Util.clearConsole was here
        tvStoryText.setText("You decide to enjoy the rest of your night by watching conspiracy videos until you notice a man watching you through your window, what shall you do?");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("Hide under your bed");
        btn2.setText("Run and get your parents, NOW!");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideBed();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runToParents();
            }
        });

    }
    private void runToParents() //DEFEAT
    {
        //Util.clearConsole was here
        tvStoryText.setText("\nIn your attempts to get your parents the man watching you appears behind you the moment you turned your back to him, you die, the matrix show their true power");
        //Util.clearConsole was here
        defeat();
    }
    private void hideBed()  //SAD VICTORY
    {
        //Util.clearConsole was here
        tvStoryText.setText("You hide and close your eyes. Once you open them everything is white. You try recalling what had just happended yet cannot remember a single thing. Funny . Do I know you?");
        //Util.clearConsole was here
    }


    //_________GOING OUT CHOICE______
    private void goOut()
    {
        //Util.clearConsole was here
        tvStoryText.setText("You go out and have the time of your life until you notice a man starring at you");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("Press the issue");
        btn2.setText("Wuss out and run away");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pressIssue();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runAway();
            }
        });
    }
    private void pressIssue()
    {
        //Util.clearConsole was here
        tvStoryText.setText("You run up on the man real gangsta style");
        //Util.clearConsole was here
        //Util.clearConsole was here

        if (choice == 1)
        {
            leftHook();
        }
        else if (choice == 2)
        {
            pushHim();
        }
    }

    private void leftHook() //DEFEAT
    {
        //Util.clearConsole was here
        System.out.println("\nOnce you threw your punch, the supposed man was never a man, you turn around and BOOM.");

        System.out.println("\nDeath is a concept we'll never understand, except you, idiot..");
        //Util.clearConsole was here
        defeat();
    }

    private void pushHim()  //SAD VICTORY
    {
        //Util.clearConsole was here
        System.out.println("\nYou fall inside the man's cloak and continue falling, and falling, and falling");

        System.out.println("\nYou are now apart of an experiment the Matrix developed, as you continue falling you accept this.");

        System.out.println("\nHAIL THAT WHO SEES ALL");
        //Util.clearConsole was here
    }

    private void runAway()
    {
        //Util.clearConsole was here
        System.out.println("\nYou run away and luckily survive.");

        System.out.println("\nYears pass and the insanity caused by trying to forget what happened that night as a kid forces you into a mental asylum");

        System.out.println("\nWho knows, maybe death would've been better...");
        //Util.clearConsole was here
        defeat();
    }


    //GIVING UP PATH COMPLETED


    //GOING PUBLIC PATH COMPLETED


    private void goPublic()
    {
        //Util.clearConsole was here
        System.out.println("\nYou choose to go public, how should you approach this?");
        System.out.println("1. Conspiracy theories on youtube, that always works! \n2. Go to the mall and become one of those preaching weirdos");
        //Util.clearConsole was here

        if (choice == 1)
        {
            youtube();
        }
        else if (choice == 2)
        {
            preachingWeirdo();
        }
    }

    private void youtube()  //____YOUTUBE CHOICE_____
    {
        //Util.clearConsole was here
        System.out.println("\nYou gain a mass following and are given the choice to make a deal or continue on your own");
        System.out.println("1. Let's make this deal \n2. I work alone");
        //Util.clearConsole was here

        if (choice == 1)
        {
            deal();
        }
        else if (choice == 2)
        {
            loner();
        }

    }
    private void deal() //DEFEAT
    {
        //Util.clearConsole was here

        System.out.println("\nWithout reading any contracts you make this deal and realize, you made a deal with doordash...");

        System.out.println("\nYou are forever known as doordash man");

        //Util.clearConsole was here
        defeat();
    }

    private void loner()
    {
        //Util.clearConsole was here
        System.out.println("\nWorking alone increased your following and you are now known as the MATRIX MAN. How should you continue your legacy?");
        System.out.println("1. Bob??? \n2. Enforce your power to everyone!");
        //Util.clearConsole was here
        if (choice == 1)
        {
            bob();
        }
        else if (choice == 2)
        {
            matrixMan();
        }
    }
    private void bob() //DEFEAT
    {
        //Util.clearConsole was here

        System.out.println("\nBob");

        System.out.println("\nBob");

        System.out.println("\nYour body is found in a ditch and the letters B.O.B are carved on your head");

        System.out.println("\nBob");

        //Util.clearConsole was here
        defeat();
    }

    private void matrixMan()  //VICTORY
    {
        //Util.clearConsole was here
        System.out.println("\nTHE WHOLE WORLD KNOWS YOUR NAME AND OBEY YOU");

        System.out.println("\n THE GREAT PAPA MATRIX.");

        System.out.println("\nHAIL PAPA MATRIX");
        //Util.clearConsole was here
    }

    private void preachingWeirdo() //_____PREACHING CHOICE____
    {
        //Util.clearConsole was here
        System.out.println("\nYou go to the mall daily and preach about the Matrix. You can either stick with malls or preach everywhere, including hospitals");
        System.out.println("1. Malls have the most influence \n2.  Become a greater preaching weirdo");
        //Util.clearConsole was here

        if (choice == 1)
        {
            malls();
        }
        else if (choice == 2)
        {
            youAreWeird();
        }
    }

    private void malls() //DEFEAT
    {
        //Util.clearConsole was here

        System.out.println("\nAfter some time your crush sees you preaching at the mall and blocks you on all social media");

        System.out.println("\nYou live a sad life with the nickname Preaching Weirdo");

        //Util.clearConsole was here
        defeat();
    }

    private void youAreWeird()  //SAD VICTORY
    {
        //Util.clearConsole was here
        System.out.println("\nSurprisingly people begin supporting you and start questioning their way of living");

        System.out.println("\nThis forces global issues as people begin creating alliances in which you join against the forces trying to expose The Matrix");

        System.out.println("\nWW3 begins and everyone now live questioning everything.");

        //Util.clearConsole was here
    }


    //GOING PUBLIC PATH COMPLETED


    //VENTURING OUT PATH COMPLETED

    private void ventureOut()
    {
        //Util.clearConsole was here
        System.out.println("\nYou have decided to venture out, where shall you go?");
        System.out.println("1. Should probably stay local \n2. Across seas we go!");
        //Util.clearConsole was here

        if (choice == 1)
        {
            stayLocal();
        }
        else if (choice == 2)
        {
            acrossSeas();
        }
    }

    private void stayLocal()  //_____STAYING LOCAL CHOICE___________
    {
        //Util.clearConsole was here
        System.out.println("\nSince you have chosen to stay local you arrive at Area 51, there are two ways to getting inside");
        System.out.println("1. Underground path \n2. Just jump the fence");
        //Util.clearConsole was here

        if (choice == 1)
        {
            underground();
        }
        else if (choice == 2)
        {
            jumpFence();
        }
    }
    private void underground()  //SAD VICTORY
    {
        //Util.clearConsole was here
        System.out.println("\nYou take the underground path and fall into an underground civilization called the Bombaclats");

        System.out.println("\nA man named Boomba takes you in and you join the Boombaclat Resistance");

        System.out.println("\nYous a proud brotha.");

        //Util.clearConsole was here
    }

    private void jumpFence()
    {
        //Util.clearConsole was here
        System.out.println("\nYou're in! It's so dark...where now?");
        System.out.println("1.Keep heading forward until you see something \n2. Stay near the walls and pray you find a door");
        //Util.clearConsole was here

        if (choice == 1)
        {
            forward();
        }
        else if (choice == 2)
        {
            wallHugger();
        }
    }

    private void forward()
    {
        //Util.clearConsole was here
        System.out.println("\nYou notice a door and enter, inside the room you get hit with the presence of a contained black hole, do you touch it?");
        System.out.println("1. yes.. \n2. Hell no");
        //Util.clearConsole was here

        if (choice == 1)
        {
            blackHole();
        }
        else if (choice == 2)
        {
            noTouch();
        }
    }
    private void blackHole()  //VICTORY
    {
        //Util.clearConsole was here
        System.out.println("\nYou get sucked in and observe knowledge no man can bare to witness");

        System.out.println("\nYou behold the power to travel between multiverses.");

        System.out.println("\njjM4M8XtE4ChAEdXv9F5hg==");
        //Util.clearConsole was here
    }
    private void noTouch() //DEFEAT
    {
        //Util.clearConsole was here

        System.out.println("\nBecause of your fear, you try turning back yet get trapped inside and get caught");

        System.out.println("\nYou live a sad life as you become a test dummy for multiple experiments");

        //Util.clearConsole was here
        defeat();
    }

    private void wallHugger() //DEFEAT
    {
        //Util.clearConsole was here

        System.out.println("\nYou hug the wall and eventually discover a manlike figure");

        System.out.println("\nAs you approach this he murders you, apparently he thought you were an ugly Alien");

        //Util.clearConsole was here
        defeat();
    }

    private void acrossSeas()  //_____ACROSS SEAS CHOICE___________
    {
        //Util.clearConsole was here
        System.out.println("\nACROSS SEAS WE GO! Now that your across seas you go to the one man who knows of the Matrix, Andrew Tate to ask questions.");
        System.out.println("1. Ask him directly \n2. Try to get to know him");
        //Util.clearConsole was here

        if (choice == 1)
        {
            direct();
        }
        else if (choice == 2)
        {
            indirect();
        }
    }

    private void direct()  //VICTORY
    {
        //Util.clearConsole was here
        System.out.println("\nHe respects your directness and tells you everything he knows");

        System.out.println("\nYou join his undercover team and become one of the Tate's.");

        System.out.println("\nGod bless the future...");
        //Util.clearConsole was here
    }

    private void indirect() //SAD DEFEAT
    {
        //Util.clearConsole was here
        System.out.println("\nSince you were indirect you can either choose a money distraction or physical distraction.");
        System.out.println("1. money talks \n2. Impress him physically");
        //Util.clearConsole was here

        if (choice == 1)
        {
            money();
        }
        else if (choice == 2)
        {
            pushups();
        }
    }

    private void money() //DEFEAT
    {
        //Util.clearConsole was here

        System.out.println("\nWell... you tried flexing your money");

        System.out.println("\nAndrew calls you broke, beats you up, then makes a video about how you tried flexing your EBT card and 2 bucks");

        //Util.clearConsole was here
        defeat();
    }
    private void pushups() //DEFEAT
    {
        //Util.clearConsole was here

        System.out.println("\nYou try doing 5 push-ups and eat the pavement after your third");

        System.out.println("\nHe calls you fat and throws a cheese burger at you");

        System.out.println("You eat it in shame...");

        //Util.clearConsole was here
        defeat();
    }

    //VENTURING OUT PATH COMPLETED
    private void defeat()
    {
        //run method when defeated


        //lose a life
        numLives--;

        //clear console, display text, etc

        System.out.println("Maybe next time");

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else
        {
            //print game over message
            System.out.println("WOMP WOMP GAME OVER");

        }

    }
}