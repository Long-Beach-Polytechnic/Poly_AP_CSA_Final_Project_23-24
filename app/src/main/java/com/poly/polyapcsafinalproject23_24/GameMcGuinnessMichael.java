package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;

public class GameMcGuinnessMichael extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;

    private int points;
    //private Player player; (optional)
    private TextView tvTitle, tvSubtitle, tvStoryText;

    private ImageView ivStory;

    private Button btn1, btn2, btn3;

    public void run()
    {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
         //util wuz hear
        tvTitle.setText("Hit On Hot Person");
        tvSubtitle.setText("");
        tvStoryText.setText("You see an hot person. You think they are really good looking and you want to get their number. What do you do?")

        System.out.println("Hit on Hot person");
        System.out.println("You see an hot person. You think they are really good looking and you want to get their number. What do you do?");

         //util wuz hear
        start();
    }

    private void start()
    {
        points = 0;
        //start adventure here

        //set points = 0      ask mr burke

        tvStoryText.setText("What do you want to do?");
        btn1.setText("Use one of your top tier pickup lines");
        btn2.setText("Use Comedy");
        btn3.setText("Smolder");
        System.out.println("""
    What do you want to do?
    1. Use one of your top tier pickup lines
    2. Use Comedy
    3. Smolder
     """);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points += 100;
                lines();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points += 200;
                comedy();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points += 300;
                smolder();
            }
        });

    }

    //SMOLDER PATH
    private void smolder() {
         //util wuz hear
        System.out.println("""
    How do you want to smolder?
    1. Smolder into the distance
    2. Smolder at them
    """);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Math.random() > 0.5)
                {
                    System.out.println("They think you are staring at them. They are not interested in a stalker");
                    points -= 15;
                    defeat();
                }
                else
                {
                    System.out.println("They are into the smoldering. They give you their number and walk away");
                    points += 100;
                    success();
                }
            }
        });


         //util wuz hear
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Math.random() > 0.5)
                {
                    System.out.println("They don't notice you. Fail.");
                    points -= 10;
                    defeat();
                }
                else
                {
                    points += 50;
                    noticeYou();

                    //line 106
                }
            }
        });


    }

    private void noticeYou() {
        System.out.println("""
          They notice you and they are intrigued by the smoldering. They aproach you. What do you do?
          1. Break the stance and ask for their number
          2. Say nothing. Smolder even harder
          """);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                System.out.println("You break the look and try to ask for their number but your voice cracks and you sound like an elderly goose. They are disgusted and lose all interest in you");
                points -= 25;
                defeat();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                System.out.println("You don't react to them approaching you. They are about to talk to you but get intimidated by the intensity of the look on your face. They are about to leave but suddenly you smolder harder. They fall apart and cant belive how powerful you look. They write down their number and stick it in your pocket and whisper 'call me' in your ear before walking away. ");
                points += 575;
                success();
            }
        });

    }

    //comedy path
    private void comedy() {
        //util wuz hear
        System.out.println("""
    What joke do you want to use?
      1. I just got rid of my vacuum cleaner. It sucked.
      2. Cosmetic surgery use to be such a touchy subject. Now you talk about botox and nobody raises an eyebrow.
      """);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points += 25;
                weird();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points += 50;
                if (Math.random() > 0.5) {
                    System.out.println("They think you are insulting their appearance. They yell at you for being misogynistic and superficial and walk away");
                    points -= 15;
                    defeat();

                }
                else {
                    botox();
            }
        });




    private void botox() {
        System.out.println("They ask you if you think that they actually look like they have gotten work done. What do you respond? \n1. Be nice and tell them they are beautiful \n2. Tell them they look like Caitlyn Jenner");
        //util wuz hear

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("They think you're sweet and they give you their number");
                points += 115;
                success();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("They start yelling at you and start calling you terrible names and storm away in disgust. You probably meant Kylie or Kendall but now you blundered it");
                points -= 30;
                defeat();
            }
        });


    }

    private void weird() {
        points += 10;
        System.out.println("""
        They think you are trying to be funny and laugh a bit uncomfortably. This is your last chance, what do you say?
          1. How does a hot dog show apreciation? It franks you
          2. When does Thor like pop rap? When it's hammer time
          """);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(" They feel bad for you and give you their number out of pity");
                points += 3;
                success();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("They are visibly not interested. they tell you they have a boyfriend");
                points += 8;
                defeat();
            }
        });


    }

    //Pickup Lines path
    private void lines() {
         //util wuz hear
        System.out.println("""
    Which of your top tier pickup lines do you want to use?
    1. Do you live in a corn field? Beacuse I'm stalking you
    2. I just pooped in my bed, can I sleep in yours?
    """);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weird();
            }
        });

    }

    private void color() {
        System.out.println("""
        They are kind of scared of you. They ask you what color their car is to see if you actually are stalking them. How do you respond?
        1. Blue
        2. Brown
        3. Ignore the question and try another pickup line
          """);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("OMG you guessed correct! They call the cops on you and you go to prison for a long time. YOU LOSE! You don't get another chance. GAME OVER!");
                points -= 350;
                numLives -=5;
                System.out.println("You got " + points + " points");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confuse();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("You ask them 'Are you a parking ticket? Because I want to jam you under a car windshield' ");
                if (Math.random() > 0.75) {
                    System.out.println(" Fail. What did you think would happen with a line like that?");
                    points -= 8;
                    defeat();
                }
                else {
                    System.out.println(" They like that? They give you their number? WHAT? What kind of idiot who has never talked to someone wrote this stupid quiz?");
                    points += 40;
                    success();
                }
            }
        });


    }

    private void confuse() {
        System.out.println("You are wrong and they are really confused. Last chance. What do you do? \n1. Cry\n2. Tell them you love them");
        //util wuz hear

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("You start crying. They take pity on you and give you their number.");
                points += 7;
                success();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("You tell them you love them. They get visibly disgusted. They tell you they have a boyfriend and walk away. Now you start to cry for real.");
                points -= 13;
                defeat();
            }
        });

    }












    private void defeat() {
        //run method when defeated
//lose a life
        numLives--;
        //clear console, display text, etc
        System.out.println("\nFailure. Try Again. " + numLives + " lives left\n");
        //determine if player gets to play again
        if (numLives > 0) {
            //if you still have lives, return to start()
            start();
        }
        else {
            //print game over message
            System.out.println("GAME OVER!!");
            System.out.println(points + " Points");
        }

        //no touchie
    }

    private void success() {
        System.out.println("You successfully go their phone number, congratulations! You Win");
        System.out.println("You got " + points + " points");
         //util wuz hear
        start();
    }

    private void displayPoints()
    {
        System.out.println("Points:\t" + points);
    }

}