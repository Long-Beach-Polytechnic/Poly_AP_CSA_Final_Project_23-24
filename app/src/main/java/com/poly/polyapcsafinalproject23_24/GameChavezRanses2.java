package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;

public class GameChavezRanses2 extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)

    private TextView tvTitle, tvSubTitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;

    private boolean isWon;

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
        tvSubTitle.setText("Those scared never live .");

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
        isWon = false;

        ivStory.setImageResource(R.drawable.im_chavezranses_blackguy);


        tvStoryText.setText("Escaping the Matrix, how blind are we?");
        //Util.enterInt was here

        setAllBtnsVisible();
        btn1.setText(" Man...That's a lot of work, forget that stuff");
        btn2.setText(" We must go public and discover the truth");
        btn3.setText("We must venture out! There’s more out there!");

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

        ivStory.setImageResource(R.drawable.im_chavezranses_emojishrug);

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

        ivStory.setImageResource(R.drawable.im_chavezranses_cuteteddy);

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
        isWon = false;

        ivStory.setImageResource(R.drawable.im_chavezranses_fatguy);

        tvStoryText.setText("After a long beautiful uneventful night, you wake up and see the heavenly stairs of heaven since you died in your sleep for being FAT");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }


    private void watchVideos()
    {
        ivStory.setImageResource(R.drawable.im_chavezranses_conspiracy);

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
        isWon = false;
        ivStory.setImageResource(R.drawable.im_chavezranses_beginning);

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
                end();
            }
        });
    }
    private void hideBed()  //SAD VICTORY
    {
        isWon = true;

        ivStory.setImageResource(R.drawable.im_chavezranses_thematrix);

        //Util.clearConsole was here
        tvStoryText.setText("You hide and close your eyes. Once you open them everything is white. You try recalling what had just happened yet cannot remember a single thing. Funny . Do I know you?");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }


    //_________GOING OUT CHOICE______
    private void goOut()
    {
        ivStory.setImageResource(R.drawable.im_chavezranses_manstarring);

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
        ivStory.setImageResource(R.drawable.im_chavezranses_confrontman);

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
        isWon = false;

        ivStory.setImageResource(R.drawable.im_chavezranses_knockedout);

        //Util.clearConsole was here
        tvStoryText.setText("Once you threw your punch, the supposed man was never a man, you turn around and BOOM.");

        tvStoryText.setText("Death is a concept we'll never understand, except you, idiot..");
        //Util.clearConsole was here
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void pushHim()  //SAD VICTORY
    {
        isWon = true;

        ivStory.setImageResource(R.drawable.im_chavezranses_inblackhole);

        //Util.clearConsole was here
        tvStoryText.setText("You fall inside the man's cloak and continue falling, and falling, and falling");

        tvStoryText.setText("You are now apart of an experiment the Matrix developed, as you continue falling you accept this.");

        tvStoryText.setText("HAIL THAT WHO SEES ALL");
        //Util.clearConsole was here

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void runAway()
    {
        isWon = false;

        ivStory.setImageResource(R.drawable.im_chavezranses_cryingboy);

        //Util.clearConsole was here
        tvStoryText.setText("You run away and luckily survive.");

        tvStoryText.setText("Years pass and the insanity caused by trying to forget what happened that night as a kid forces you into a mental asylum");

        tvStoryText.setText("Who knows, maybe death would've been better...");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }


    //GIVING UP PATH COMPLETED


    //GOING PUBLIC PATH COMPLETED


    private void goPublic() {

        ivStory.setImageResource(R.drawable.im_chavezranses_crowd);

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
        ivStory.setImageResource(R.drawable.im_chavezranses_deal);

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
        isWon=false;
        ivStory.setImageResource(R.drawable.im_chavezranses_doordash);

        tvStoryText.setText("Without reading any contracts you make this deal and realize, you made a deal with doordash...");
        tvStoryText.setText("You are forever known as doordash man");

        //Util.clearConsole was here
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }
    private void loner()
    {

        ivStory.setImageResource(R.drawable.im_chavezranses_matrixboy);

        //Util.clearConsole was here
        tvStoryText.setText("Working alone increased your following and you are now known as the MATRIX MAN. How should you continue your legacy?");
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
        isWon=false;

        ivStory.setImageResource(R.drawable.im_chavezranses_bob);

        tvStoryText.setText("Bob");

        tvStoryText.setText("Bob");

        tvStoryText.setText("Your body is found in a ditch and the letters B.O.B are carved on your head");

        tvStoryText.setText("Bob");

        //Util.clearConsole was here
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void matrixMan()  //VICTORY
    {
        isWon=true;

        ivStory.setImageResource(R.drawable.im_chavezranses_kingmatrix);

        //Util.clearConsole was here
        tvStoryText.setText("THE WHOLE WORLD KNOWS YOUR NAME AND OBEY YOU");

        tvStoryText.setText("THE GREAT PAPA MATRIX.");

        tvStoryText.setText("HAIL PAPA MATRIX");
        //Util.clearConsole was here
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void preachingWeirdo() //_____PREACHING CHOICE____
    {
        ivStory.setImageResource(R.drawable.im_chavezranses_mallkid);

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
        isWon=false;

        ivStory.setImageResource(R.drawable.im_chavezranses_loser);

        //Util.clearConsole was here

        tvStoryText.setText("After some time your crush sees you preaching at the mall and blocks you on all social media");

        tvStoryText.setText("You live a sad life with the nickname Preaching Weirdo");

        //Util.clearConsole was here
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void youAreWeird()  //SAD VICTORY
    {
        isWon=true;
        ivStory.setImageResource(R.drawable.im_chavezranses_matrixworld);

        //Util.clearConsole was here
        tvStoryText.setText("Surprisingly people begin supporting you and start questioning their way of living");

        tvStoryText.setText("This forces global issues as people begin creating alliances in which you join against the forces trying to expose The Matrix");

        tvStoryText.setText("WW3 begins and everyone now live questioning everything.");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }


    //GOING PUBLIC PATH COMPLETED


    //VENTURING OUT PATH COMPLETED

    private void ventureOut()
    {
        ivStory.setImageResource(R.drawable.im_chavezranses_emojiquestion);

        //Util.clearConsole was here
        tvStoryText.setText("You have decided to venture out, where shall you go?");
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
        ivStory.setImageResource(R.drawable.im_chavezranses_area51);

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
        isWon=true;

        ivStory.setImageResource(R.drawable.im_chavezranses_boomba);

        //Util.clearConsole was here
        tvStoryText.setText("You take the underground path and fall into an underground civilization called the Bombaclats");

        tvStoryText.setText("A man named Boomba takes you in and you join the Boombaclat Resistance");

        tvStoryText.setText("Yous a proud brotha.");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void jumpFence()
    {
        ivStory.setImageResource(R.drawable.im_chavezranses_darkarea51);

        //Util.clearConsole was here
        tvStoryText.setText("You're in! It's so dark...where now?");
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

        ivStory.setImageResource(R.drawable.im_chavezranses_containedblackhole);

        //Util.clearConsole was here
        tvStoryText.setText("You notice a door and enter, inside the room you get hit with the presence of a contained black hole, do you touch it?");
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
        isWon=true;

        ivStory.setImageResource(R.drawable.im_chavezranses_multiverse);

        //Util.clearConsole was here
        tvStoryText.setText("You get sucked in and observe knowledge no man can bare to witness");

        tvStoryText.setText("You behold the power to travel between multiverses.");

        tvStoryText.setText("jjM4M8XtE4ChAEdXv9F5hg==");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }
    private void noTouch() //DEFEAT
    {
        isWon=false;
        ivStory.setImageResource(R.drawable.im_chavezranses_testdummy);

        //Util.clearConsole was here

        tvStoryText.setText("Because of your fear, you try turning back yet get trapped inside and get caught");

        tvStoryText.setText("You live a sad life as you become a test dummy for multiple experiments");

        //Util.clearConsole was here
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void wallHugger() //DEFEAT
    {
        isWon=false;
        ivStory.setImageResource(R.drawable.im_chavezranses_wallhugger);

        //Util.clearConsole was here

        tvStoryText.setText("You hug the wall and eventually discover a manlike figure");

        tvStoryText.setText("As you approach this he murders you, apparently he thought you were an ugly Alien");

        //Util.clearConsole was here
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void acrossSeas()  //_____ACROSS SEAS CHOICE___________
    {
        ivStory.setImageResource(R.drawable.im_chavezranses_acrossseas);

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
        isWon = true;
        ivStory.setImageResource(R.drawable.im_chavezranses_matrixtate);

        //Util.clearConsole was here
        tvStoryText.setText("He respects your directness and tells you everything he knows");

        tvStoryText.setText("You join his undercover team and become one of the Tate's.");

        tvStoryText.setText("God bless the future...");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void indirect() //SAD DEFEAT
    {
        ivStory.setImageResource(R.drawable.im_chavezranses_ponder);

        //Util.clearConsole was here
        tvStoryText.setText("Since you were indirect you can either choose a money distraction or physical distraction.");
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
        isWon = false;
        ivStory.setImageResource(R.drawable.im_chavezranses_strongtate);

        //Util.clearConsole was here

        tvStoryText.setText("Well... you tried flexing your money");

        tvStoryText.setText("Andrew calls you broke, beats you up, then makes a video about how you tried flexing your EBT card and 2 bucks");

        //Util.clearConsole was here
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }
    private void pushups() //DEFEAT
    {
        isWon=false;
        ivStory.setImageResource(R.drawable.im_chavezranses_fatloser);

        //Util.clearConsole was here

        tvStoryText.setText("You try doing 5 push-ups and eat the pavement after your third");

        tvStoryText.setText("He calls you fat and throws a cheese burger at you");

        tvStoryText.setText("You eat it in shame...");

        //Util.clearConsole was here
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });;
    }

    //VENTURING OUT PATH COMPLETED
    private void end()
    {
        if (isWon)
        {
            tvStoryText.setText("THE MATRIX CRUMBLES AGAINST YOU!");
        }
        else
        {
            numLives--;
            String text = "You wasted a life. GET UP.";
            tvStoryText.setText(text);
        }

        if (numLives > 0)
        {
            btn1.setText("Play again!");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start();
                }
            });
        }
        else
        {
            tvStoryText.setText("YOU LOST. WOMP WOMP!");
            btn1.setText("Back to menu");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(GameChavezRanses2.this, MainActivity.class));
                }
            });
        }
    }
}