package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;

public class GamePadilloDamien extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
    private int playCount;

    public void run()
    {
        //create a scanner object for user input
        scan = new Scanner(System.in);
        playCount = 0;

        //display project title and description
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);

        start();

        tvTitle.setText("Don't Scream");
        tvSubtitle.setText("by Damien Padillo");

        tvStoryText.setText("Play an interactive spin off version of the 'Scream' franchise... ");

        ivStory.setImageResource(R.drawable.im_padillodamien_title);

        setAllBtnsVisible();
        btn1.setText("Play");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
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

    private void start()
    {
        ivStory.setImageResource(R.drawable.im_padillodamien_title);

        if (playCount == 0)
        {
            tvStoryText.setText("First time here?");
        }
        else if (playCount == 1)
        {
            tvStoryText.setText("Play more or you're racist");
        }
        else if (playCount == 2)
        {
            tvStoryText.setText("You're not racist anymore, but you're still homophobic, keep playing to change that");
        }
        else if (playCount == 3)
        {
            tvStoryText.setText("You're still kind of homophobic... Maybe one more time?");
        }
        else if (playCount == 4)
        {
            tvStoryText.setText("Okay good job, you can keep playing though");
        }

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next();
            }
        });


    }





    private void next()
    {
        playCount++;
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_landline);
        String text ="\n(Your name is Blake Heaven)" +
      "\nYou’re in your bedroom on a FaceTime call with your best friend Luxury. (Lux for short) Suddenly the landline rings from the kitchen. “Who the hell is calling the landline?” You ask her rhetorically. “People still use landlines?” Lux asks over the phone. What do you do?";
        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("See who's calling you");
        btn2.setText("Ignore the phone call");
        btn3.setText("Lock your door");
        btn4.setText("Leave the game (loser)");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                seeWhosCallingYou();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ignoreCall();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lockDoor();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                leaveTheGame();
            }
        });

    }




    private void leaveTheGame()
    {
        //start adventure here

        String text = "Yeah… That’s not happening… Anyway, you decide to go investigate. You make it to the kitchen. “Who called?” She asked confused. “I don’t know, it’s an unknown number.” You say. What next?";
        ivStory.setImageResource(R.drawable.im_padillodamien_investigate);
        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Pick up the phone");
        btn2.setText("Don't answer the phone");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                answerPhone2();
            }
        });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    dontAnswerPhone2();
                }
        });

        }

    private void answerPhone2()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_landline);
        String text = "Hello?” You ask. No answer.“That’s a horrible sound.” Lux says through the phone.";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Ask again");
        btn2.setText("Put the phone down");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                askAgain2();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dontAnswerPhone2();
            }
        });

    }





    private void dontAnswerPhone2() {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_landline);
        String text = "You hear a noise back in your room. “Who is that behind you?!” Lux asks.";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Hide in a cabinet");
        btn2.setText("Investigate");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hideInCabinet2();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                investigate();
            }
        });
    }




    private void investigate2() {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_plotarmor);
        String text = "You unlocked the plot armor ending. You walked into your room, and a masked killer was standing right there. You tried to run, but tripped on nothing. Idiot. The killer ended up tripping over your body, and landing on their knife. Suddenly, a second killer came running at you, but tripped, and got the same fate. Why are you weird? You still lived though I guess.";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Yay, I'm gonna play again");
        btn2.setText("I'm done (You're racist)");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });
    }






    private void hideInCabinet2() {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_investigate);
        String text = "You unlocked the Idiot Ending. The killer found you because they literally watched you go into the cabinet. Are you dumb? Just kidding, do you want to try again?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Okay sure");
        btn2.setText("No (You're homophobic against men but not women because you're one of those weird people)");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });
    }


    private void askAgain2()
    {
        //start adventure here
        String text = "“Hello?” You ask again, more impatiently this time. A voice spoke, “Hello.” The voice was low and raspy as it responded. “Girl, hang up now.” Lux says, worried. “Who is this?” You ask. “Someone who likes scary movies.” They say hauntingly. Oh, so you’re ghostface? Wow! Actually, I’m not confused.” You say sarcastically, hanging up. “You’re so cool.” Lux says, proud. Her expression suddenly changed. “Wait, there’s someone behind you!”";
        ivStory.setImageResource(R.drawable.im_padillodamien_landline);
        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Leave the house and call the police");
        btn2.setText("Attack that loser");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                leaveCallPolice2();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                attackLoser();
            }
        });

    }


    private void attackLoser()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_samantha);
        String text = "You unlocked the Samantha Carpenter ending. “Where?” You ask. You sound upset, but not scared. “In your room! I saw them down the hallway!” She shouted. “Fun.” You say sarcastically, charging down the hall and into your room. A masked killer was there, not expecting you yet. You tackled him, took his knife, and stabbed him in the face. “Oh my god! Behind you.!” Feet away, the second killer was there. You grabbed his knife holding arm, and stabbed him with it. Lux screams over the phone at the sight of blood, and you survive.";
        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Play again");
        btn2.setText("I hate Millessa Berrera and I'm glad she was fired from Scream 7");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

    }


    private void leaveCallPolice2()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_tara);
        String text = "You unlocked the Anti Tara ending. You managed to avoid any injuries, and ran down the street with Lux in your hand. The police pulled up later, arresting the two killers hiding in your house. There are more endings to unlock. Do you want to play again?.";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Yeah");
        btn2.setText("No, I'm sexist to women");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

    }
    private void lockDoor()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_locked);
        String text = "Yeah… That’s not happening…” You say dismissively, locking the door. “What?” Lux asks over the FaceTime call, having no idea what you’re talking about. You suddenly hear something fall in your closet. “What the-” The closet opens quickly, and a masked killer charges at you with a knife. What do you do?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Get out of there");
        btn2.setText("Fight that b!t%$");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                leave3();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fight2();
            }
        });

    }

    private void fight2()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_happydeathday);
        String text = "You unlocked the Happy Death Day ending.“Oh hell to the no!” You scream. You don’t even get to fight him because he stabs you in the face…";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Continue? Sure!");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                yeahContinue();
            }

        });

    }

    private void yeahContinue()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_investigate);
        String text = "You scream, processing what just happened. “What!?” Lux screamed, startled and confused by your sudden outburst. You were back on your bed, holding your iPhone on a FaceTime call with Lux. Your door was opened, and your closet was closed. “I thought-” The landline wrang again, interrupting you. “Thought what?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Check the closet");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checkTheCloset();
            }

        });

    }

    private void checkTheCloset()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_closetreal);
        String text = "You looked at the closet across the room. “I just um…” Lux was squinting in confusion. “I thought someone was in here, and they…” You open the doors slowly, and the masked killer was still there. You screamed again, slamming the doors closed, and booking it. The killer charged out of your room, close behind.";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Leave the house");
        btn2.setText("Run around the kitchen island");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                endLeave();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                island();
            }
        });

    }

    private void island()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_billie);
        String text = "You unlocked the Billie Eilish ending. The killer jumped onto, and over the kitchen island, shoving your head into the sink which was conveniently plugged, and full of water. You tried to scream… But your head was under water… Do you want to try again?.";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Yes");
        btn2.setText("No (Okay then, bye lmaoo");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

    }

    private void endLeave()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_stillalive);
        String text = "You unlocked THE ENDING. You ran out the door, and screamed when you saw another killer there. He wasn't expecting you yet. He jumped at you with his knife, but accidentally stabbed the other killer that was after you. They both fell over, and you got away. “What the hell is going on?” Lux asked You did it, you're still alive... There are still more endings, would you like to play again?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Yes");
        btn2.setText("No");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

    }

    private void ignoreCall()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_hangup);
        String text = "You end up ignoring the call, and talking with Luxury. The landline rang again. Annoyed, you stand up, but seconds later, you hear something fall in your closet. It opened slowly, and a masked man with a knife walked out. What do you do?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Fight");
        btn2.setText("Run");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fight1();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                run1();
            }
        });

    }

    private void fight1()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_fight);
        String text = "Oh my god, run!” Lux shouts through the Facetime call. You panic, and decide to grab a pillow and tackle the killer with it. The pillow is too thick and large to stab through. He drops the knife.";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Keep fighting");
        btn2.setText("Listen to Luxury");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                keepFighting();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                run1();
            }
        });

    }

    private void run1()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_run);
        String text = "Get out of there!” Lux shouts through the Facetime call. You panic, and run out as quick as you can, the killer only steps behind. What do you do?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Lock yourself in the bathroom");
        btn2.setText("Leave the house");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                lockSelfBathroom();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                leave3();
            }
        });

    }

    private void leave3()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_investigate);
        String text = "You unlocked the third party ending. On your way out the door, you run straight into the knife of the second killer. He was waiting for you outside. There are still more endings, would you like to try again?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Yes");
        btn2.setText("No (That's why yo clumsy ahh died.)");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

    }

    private void lockSelfBathroom()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_locked);
        String text = "You manage to lock the door seconds before they reach you. “Blake get out of there! I’m calling the police.” Lux says. What do you do?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Crawl out of the window");
        btn2.setText("Stay and fight");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bathroomWindow();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stayAndFight();
            }
        });

    }

    private void stayAndFight()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_pam);
        String text = "You unlocked the Pam Hues ending. You had nothing to defend yourself with when the killer kicked the door down. You didn’t make it…";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Try again");
        btn2.setText("Cry in real life");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

    }

    private void bathroomWindow()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_olovia);
        String text = "You unlocked the Olivia Morris ending. You climbed out of the window, but were impaled by the knife of the second killer. They were waiting for you. There are still more endings. Would you like to try again?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Yes");
        btn2.setText("No");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

    }

    private void keepFighting()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_sydney);
        String text = "You unlocked the Sydney Prescott ending. You managed to grab his knife while he was down, and stab him through the eye of the mask. You noticed another masked killer outside, they tried to run but you got to them first…";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Yes");
        btn2.setText("No");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

    }

    private void seeWhosCallingYou()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_investigate);
        String text = "You make it to the kitchen. “Who is it?” She asked intrigued. “Unknown Caller ID.” You say. What do you do?…";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Answer the phone");
        btn2.setText("Don't answer the phone");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                answerPhone();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dontAnswerPhone();
            }
        });

    }

    private void answerPhone()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_landline);
        String text = "You make it to the kitchen. “Who is it?” She asked intrigued. “Unknown Caller ID.” You say. What do you do?…";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Answer the phone");
        btn2.setText("Don't answer the phone");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                askAgain();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hangUp();
            }
        });

    }

    private void dontAnswerPhone()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_audio);
        String text = "You hear a thud back in your room. Something fell. “What was that?” Lux asks.";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Hide in an empty cabinet");
        btn2.setText("Investigate");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cabinet2();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                investigate();
            }
        });

    }

    private void cabinet2()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_cabinet);
        String text = "You unlocked the Camper Ending. The killer never found you because they didn't think you had a reason to hide, the police arrested two masked men, one hiding in your closet, the other found wandering around the sides of your house. There are still more endings, would you like to play again?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Yes");
        btn2.setText("No");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

    }

    private void investigate()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_whitegirl);
        String text = "You unlocked the White Girl ending. Before you even walked into your room, a masked killer ran out, and stabbed you. He was waiting for you. There are still more endings, would you like to try again?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Yes");
        btn2.setText("No");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

    }

    private void askAgain()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_hangup);
        String text = "“Hello?” You ask again, more impatiently this time. A voice spoke, “Hello.” The voice was low and raspy as it responded. “Girl, hang up now.” Lux says worried. “Who is this?” You ask. “This is the last person you’re ever gonna see alive.” They say hauntingly. Oh no, I’m so scared.” You say sarcastically, hanging up. “Good call.” Lux says. You suddenly hear a thud from your room. Something fell.";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Leave the house and call the police");
        btn2.setText("Hide in an empty cabinet");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                leaveCallPolice();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cabinet1();
            }
        });

    }

    private void leaveCallPolice()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_tobeymaguire);
        String text = "You unlocked the Tobey Maguire ending. On your way out, the killer stabbed you in the back. He was waiting outside. There are still more endings, would you like to try again?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Yes");
        btn2.setText("No");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

    }

    private void cabinet1()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_cabinet);
        String text = "You unlocked the hopeless ending. The killer found you because they knew you would be hiding after the call. There are still more endings, would you like to try again?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Yes");
        btn2.setText("No");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start();
            }
        });

    }

    private void hangUp()
    {
        //start adventure here
        ivStory.setImageResource(R.drawable.im_padillodamien_hangup);
        String text = "You hear a thud back in your room. “What was that?” Lux asks. What do you do?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Hide in an empty cabinet, calling the police over your suspicions");
        btn2.setText("Investigate");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cabinet2();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                investigate();
            }
        });

    }

}