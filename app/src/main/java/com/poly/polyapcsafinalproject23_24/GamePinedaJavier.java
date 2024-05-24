package com.poly.polyapcsafinalproject23_24;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GamePinedaJavier extends GameActivity {
    //instance variables
    //   variables you plan to use throughout the adventure

    private TextView tvTitle, tvSubtitle, tvStoryText;

    private ImageView ivStory;

    private Button btn1, btn2, btn3, btn4;

    private boolean isWon;
    private int numLives;
    //private Player player; (optional)

    public void run()
    {
        setContentView(R.layout.activity_game_3_button)

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);

        tvTitle.setText("FIFA CAREER");
        tvSubtitle.setText("LAFC edition");

        numLives = 4;
        start();
    }

        private void setAllBtnsVisible()
        {
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);
    }


    private void start()
    {
        isWon = false;
        ivStory.setImageResource(R.drawable.im_laborday_title);

        //start adventure here

        //create an Adventure object

        tvStoryText.setText("You just got signed to one of the newest clubs in the MLS,the Los Angeles football Club (LAFC). You worked so hard to be chosen to play for the club and everyone is so proud of you. what is your way of celebrating?");

        setAllBtnsVisible();
        btn1.setText("Go party with friends and family");
        btn2.setText("Start training");
        btn3.setText("Show off on social media");
        btn4.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                party();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                train();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showOff();
            }
        });


    }


    private void party()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("You have a party with your loved ones and decide you want to drink yuhhh. Who are you drinking with to celebrate your achievment?");

        setAllBtnsVisible();
        btn1.setText("Drink with the family");
        btn2.setText("Drink with friends");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drinkWithFam();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drinkWithFriends();
            }
        });
    }


    private void drinkWithFam()
    {

        tvStoryText.setText("You are drinking with the family and you get very sentimental and can't think straight :(");

        ivStory.setImageResource(R.drawable.im_laborday_swimming);

        setAllBtnsVisible();
        btn1.setText("Give half your check to your mom");
        btn2.setText("tell your brother he's making it with you one day");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                momProud();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                motivateBrother();
            }
        });

    }

    private void momProud()
    {

        isWon = true;
        tvStoryText.setText("She was so proud and thankful that she brought Lionel Messi to the party!!!!!!  *GOAT ENDING* ");

        ivStory.setImageResource(R.drawable.im_laborday_lifeguard_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });

    }
    private void motivateBrother()
    {

        tvStoryText.setText("You mad him so happy that he brought Lionel Messi to the party yuhhhh!! *GOAT ENDING*");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { defeat();
            }
        });
    }

    private void drinkWithFriends()
    {

        tvStoryText.setText("You decide to drink with your friends! But one of your friends drank a little TOO much and is now telling you to do some weird things.");

        ivStory.setImageResource(R.drawable.im_laborday_arrive_at_beach);

        setAllBtnsVisible();
        btn1.setText("Fight brother");
        btn2.setText("Talk smack to your brother, say that he inst going to be good as you.");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fightBrother();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                talkSmackBrother();
            }
        });
    }

    private void fightBrother()
    {

        isWon = false;
        tvStoryText.setText("You start fighting your brother and the fight gets intense... until bro really smacked you with a glass bottle. *DEAD ENDING*");

        ivStory.setImageResource(R.drawable.im_laborday_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void talkSmackBrother()
    {

        isWon = false;
        tvStoryText.setText(" You talk smack to your brother and bro just does a finshing move on you.    You got the Dead Ending");

        ivStory.setImageResource(R.drawable.im_laborday_tan5hours);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });

    }

    private void train()
    {

        tvStoryText.setText("You decide to train hard to make it to the top.. I like it.  You go to the training grounds and see your brother and a team member. Who do you train with?");

        ivStory.setImageResource(R.drawable.im_laborday_whaley_park);

        setAllBtnsVisible();
        btn1.setText(" Train with Brother");
        btn2.setText(" Train with teammate  *hint he has experience*");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { trainWithBrother();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { trainWithMember();
            }
        });
    }





    private void trainWithMember()
    {

        tvStoryText.setText("You decided to train with a team member, great choice. While you were training with him, YOU get offers from international teams!! ");

        ivStory.setImageResource(R.drawable.im_laborday_soccer_baby);

        setAllBtnsVisible();
        btn1.setText("Argentina");
        btn2.setText("France");
        btn3.setText("Mexico");
        btn4.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                argentina();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                france();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mexico();
            }
        });
    }

    private void argentina()
    {

        System.out.println("You took the Argentina offer *GREAT YOU PLAYED WITH LIONEL MESSI* but only twice. You were basiaclly benched your whole career and only won the Copa America   *GOOD ENDING* ");

        defeat();
    }

    private void france()
    {

        System.out.println("You got signed but never in your career did you play a game. Theu even won the world cup without you :(  *WASTED PONTENTIAL ENDING* ");

        defeat();
    }

    private void mexico()
    {

        System.out.println("You joined Mexico and you made history by carrying Mexico to the World Cup final and WINNING! You also win countless other trophies   *GREAT ENDING* ");

        defeat();
    }



    private void trainWithBrother()
    {

        System.out.println("So basically..... your brother doesn't know how to play soccer and made you terrible. While he was quote on quote training you. There was scouts in the training grounds and just thought you were playing for fun  *GOOFY ENDING* ");

        defeat();
    }

    private void showOff()
    {

        System.out.println("You go to your instagram to show off. What do you do?");
        System.out.println("1. show off your money\n2. Show off your skills");


        if (choice == 1)
        {
            showMoney();
        }
        else if (choice == 2)
        {
            showSkills();
        }
    }
    private void showMoney()
    {

        System.out.println("You show off your money and got instant popularity. Whats your next viral clip? *dont mess this up*");
        System.out.println("1.Throw a microwaved honeybun at a homeless\n2. Donate to charity");


        if (choice == 1)
        {
            throwHoneyBun();
        }
        else if (choice == 2)
        {
            donateCharity();
        }
    }
    private void throwHoneyBun()
    {

        System.out.println("Damn you thought that was funny *it was* but people didn't like that!  *CANCELLED ENDING* ");

        defeat();
    }
    private void donateCharity()
    {

        System.out.println("People saw your amazing video and will always love you!  *POPULAR ENDING* ");

        defeat();
    }
    private void showSkills()
    {

        System.out.println("People saw your video and everyone now thinks you're the next messi! Now companies want to sponser you! What company do you choose?");
        System.out.println("1.Under Armour\n2.Nike");


        if (choice == 1)
        {
            underArmour();
        }
        else if (choice == 2)
        {
            nike();
        }
    }

    private void underArmour()
    {

        System.out.println("No one likes under armour bruh. Now everyone thinks you weird lol. *FORGOTTEN ENDING*");

        defeat();
    }
    private void nike()
    {

        System.out.println("People loveee your new drip. Now everyone is going to buy nike thanks to you.  *POPULAR ENDING* ");

        defeat();
    }



    private void defeat()
    {
        //run method when defeated



        //lose a life
        numLives--;


        //clear console, display text, etc
        System.out.println("Thanks for playing your FIFA career :) ");

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()

            start();

        }
        else
        {
            //print game over message
            System.out.println("GAME OVER");
        }
    }
}