package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.WindowDecorActionBar;

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
        tvSubTitle.setText("High School Edition");

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
        //Util.enterInt was here

        setAllBtnsVisible();
        btn1.setText("Stay home");
        btn2.setText("Go out and be a kid");
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

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
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
        tvStoryText.setText("In your attempts to get your parents the man watching you appears behind you the moment you turned your back to him, you die, the matrix show their true power");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }
    private void hideBed()  //SAD VICTORY
    {
        //Util.clearConsole was here
        tvStoryText.setText("You hide and close your eyes. Once you open them everything is white. You try recalling what had just happened yet cannot remember a single thing. Funny . Do I know you?");
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
        setAllBtnsVisible();
        btn1.setText("Left hook to the jaw!");
        btn2.setText("Push him");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftHook();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pushHim();
            }
        });
    }

    private void leftHook() //DEFEAT
    {
        //Util.clearConsole was here
        tvStoryText.setText("Once you threw your punch, the supposed man was never a man, you turn around and BOOM.");

        tvStoryText.setText("Death is a concept we'll never understand, except you, idiot..");
        //Util.clearConsole was here
        defeat();
    }

    private void pushHim()  //SAD VICTORY
    {
        //Util.clearConsole was here
        tvStoryText.setText("You fall inside the man's cloak and continue falling, and falling, and falling");

        tvStoryText.setText("You are now apart of an experiment the Matrix developed, as you continue falling you accept this.");

        tvStoryText.setText("HAIL THAT WHO SEES ALL");
        //Util.clearConsole was here
    }

    private void runAway()
    {
        //Util.clearConsole was here
        tvStoryText.setText("You run away and luckily survive.");

        tvStoryText.setText("Years pass and the insanity caused by trying to forget what happened that night as a kid forces you into a mental asylum");

        tvStoryText.setText("Who knows, maybe death would've been better...");
        //Util.clearConsole was here
        defeat();
    }


    //GIVING UP PATH COMPLETED


    //GOING PUBLIC PATH COMPLETED


    private void goPublic() {
        //Util.clearConsole was here
        tvStoryText.setText("You choose to go public, how should you approach this?");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("Conspiracy theories on youtube, that always works!");
        btn2.setText("Go to the mall and become one of those preaching weirdos");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youtube();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preachingWeirdo();
            }
        });
    }

    private void youtube()  //____YOUTUBE CHOICE_____
    {
        //Util.clearConsole was here
        tvStoryText.setText("You gain a mass following and are given the choice to make a deal or continue on your own");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("Let's make this deal!");
        btn2.setText(" I work alone.");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deal();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loner();
            }
        });
    }
    private void deal() //DEFEAT
    {
        //Util.clearConsole was here

        tvStoryText.setText("Without reading any contracts you make this deal and realize, you made a deal with doordash...");
        tvStoryText.setText("You are forever known as doordash man");

        //Util.clearConsole was here
        defeat();
    }
    private void loner()
    {
        //Util.clearConsole was here
        tvStoryText.setText("Working alone increased your following and you are now known as the MATRIX MAN. How should you continue your legacy?");
        System.out.println("1. Bob??? \n2. Enforce your power to everyone!");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("BOB???");
        btn2.setText("Enforce your power to everyone!");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bob();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                matrixMan();
            }
        });
    }
    private void bob() //DEFEAT
    {
        //Util.clearConsole was here

        tvStoryText.setText("Bob");

        tvStoryText.setText("Bob");

        tvStoryText.setText("Your body is found in a ditch and the letters B.O.B are carved on your head");

        tvStoryText.setText("Bob");

        //Util.clearConsole was here
        defeat();
    }

    private void matrixMan()  //VICTORY
    {
        //Util.clearConsole was here
        tvStoryText.setText("THE WHOLE WORLD KNOWS YOUR NAME AND OBEY YOU");

        tvStoryText.setText("THE GREAT PAPA MATRIX.");

        tvStoryText.setText("HAIL PAPA MATRIX");
        //Util.clearConsole was here
    }

    private void preachingWeirdo() //_____PREACHING CHOICE____
    {
        //Util.clearConsole was here
        tvStoryText.setText("You go to the mall daily and preach about the Matrix. You can either stick with malls or preach everywhere, including hospitals");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("Malls have the most influence");
        btn2.setText("Become a greater preaching weirdo");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                malls();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youAreWeird();
            }
        });
    }

    private void malls() //DEFEAT
    {
        //Util.clearConsole was here

        tvStoryText.setText("After some time your crush sees you preaching at the mall and blocks you on all social media");

        tvStoryText.setText("You live a sad life with the nickname Preaching Weirdo");

        //Util.clearConsole was here
        defeat();
    }

    private void youAreWeird()  //SAD VICTORY
    {
        //Util.clearConsole was here
        tvStoryText.setText("Surprisingly people begin supporting you and start questioning their way of living");

        tvStoryText.setText("This forces global issues as people begin creating alliances in which you join against the forces trying to expose The Matrix");

        tvStoryText.setText("WW3 begins and everyone now live questioning everything.");

        //Util.clearConsole was here
    }


    //GOING PUBLIC PATH COMPLETED


    //VENTURING OUT PATH COMPLETED

    private void ventureOut()
    {
        //Util.clearConsole was here
        tvStoryText.setText("You have decided to venture out, where shall you go?");
        System.out.println("1. Should probably stay local \n2. Across seas we go!");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("Should probably stay local");
        btn2.setText("Across seas we go!");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stayLocal();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acrossSeas();
            }
        });
    }

    private void stayLocal()  //_____STAYING LOCAL CHOICE___________
    {
        //Util.clearConsole was here
        tvStoryText.setText("Since you have chosen to stay local you arrive at Area 51, there are two ways to getting inside");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("Underground path");
        btn2.setText("Just jump the fence");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                underground();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumpFence();
            }
        });
    }
    private void underground()  //SAD VICTORY
    {
        //Util.clearConsole was here
        tvStoryText.setText("You take the underground path and fall into an underground civilization called the Bombaclats");

        tvStoryText.setText("A man named Boomba takes you in and you join the Boombaclat Resistance");

        tvStoryText.setText("Yous a proud brotha.");

        //Util.clearConsole was here
    }

    private void jumpFence()
    {
        //Util.clearConsole was here
        tvStoryText.setText("You're in! It's so dark...where now?");
        System.out.println("1.Keep heading forward until you see something \n2. Stay near the walls and pray you find a door");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("Keep heading forward until you see something");
        btn2.setText("Stay near the walls and pray you find a door");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forward();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wallHugger();
            }
        });
    }

    private void forward()
    {
        //Util.clearConsole was here
        tvStoryText.setText("You notice a door and enter, inside the room you get hit with the presence of a contained black hole, do you touch it?");
        System.out.println("1. yes.. \n2. Hell no");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("yes..");
        btn2.setText("Hello no");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blackHole();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noTouch();
            }
        });
    }
    private void blackHole()  //VICTORY
    {
        //Util.clearConsole was here
        tvStoryText.setText("You get sucked in and observe knowledge no man can bare to witness");

        tvStoryText.setText("You behold the power to travel between multiverses.");

        tvStoryText.setText("jjM4M8XtE4ChAEdXv9F5hg==");
        //Util.clearConsole was here
    }
    private void noTouch() //DEFEAT
    {
        //Util.clearConsole was here

        tvStoryText.setText("Because of your fear, you try turning back yet get trapped inside and get caught");

        tvStoryText.setText("You live a sad life as you become a test dummy for multiple experiments");

        //Util.clearConsole was here
        defeat();
    }

    private void wallHugger() //DEFEAT
    {
        //Util.clearConsole was here

        tvStoryText.setText("You hug the wall and eventually discover a manlike figure");

        tvStoryText.setText("As you approach this he murders you, apparently he thought you were an ugly Alien");

        //Util.clearConsole was here
        defeat();
    }

    private void acrossSeas()  //_____ACROSS SEAS CHOICE___________
    {
        //Util.clearConsole was here
        tvStoryText.setText("ACROSS SEAS WE GO! Now that your across seas you go to the one man who knows of the Matrix, Andrew Tate to ask questions.");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("Ask him directly");
        btn2.setText("Try to get to know him");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                direct();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indirect();
            }
        });
    }

    private void direct()  //VICTORY
    {
        //Util.clearConsole was here
        tvStoryText.setText("He respects your directness and tells you everything he knows");

        tvStoryText.setText("You join his undercover team and become one of the Tate's.");

        tvStoryText.setText("God bless the future...");
        //Util.clearConsole was here
    }

    private void indirect() //SAD DEFEAT
    {
        //Util.clearConsole was here
        tvStoryText.setText("Since you were indirect you can either choose a money distraction or physical distraction.");
        System.out.println("1. money talks \n2. Impress him physically");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("Money talks");
        btn2.setText("Impress him physically");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                money();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pushups();
            }
        });
    }

    private void money() //DEFEAT
    {
        //Util.clearConsole was here

        tvStoryText.setText("Well... you tried flexing your money");

        tvStoryText.setText("Andrew calls you broke, beats you up, then makes a video about how you tried flexing your EBT card and 2 bucks");

        //Util.clearConsole was here
        defeat();
    }
    private void pushups() //DEFEAT
    {
        //Util.clearConsole was here

        tvStoryText.setText("You try doing 5 push-ups and eat the pavement after your third");

        tvStoryText.setText("He calls you fat and throws a cheese burger at you");

        tvStoryText.setText("You eat it in shame...");

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

        tvStoryText.setText("Maybe next time");

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else
        {
            //print game over message
            tvStoryText.setText("WOMP WOMP GAME OVER");

        }

    }
}