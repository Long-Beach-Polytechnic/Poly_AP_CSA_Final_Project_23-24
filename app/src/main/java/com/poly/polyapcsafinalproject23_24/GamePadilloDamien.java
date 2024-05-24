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

        tvTitle.setText("LABOR DAY");
        tvSubtitle.setText("High School Edition");

        numLives = 4;
        start();


        tvTitle.setText("Don't Scream");

        tvStoryText.setText("Play an interactive spin off version of the 'Scream' franchise... ");

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
        btn1.setText("Start");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn2.setOnClickListener(new View.OnClickListener() {
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

        String text = """
      (Your name is Blake Heaven)
      You’re in your bedroom on a FaceTime call with your best friend Luxury. (Lux for short) Suddenly the landline rings from the kitchen. “Who the hell is calling the landline?” You ask her rhetorically. “People still use landlines?” Lux asks over the phone. What do you do?
      """;
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

        String text = """
    Yeah… That’s not happening… Anyway, you decide to go investigate. You make it to the kitchen. “Who called?” She asked confused. “I don’t know, it’s an unknown number.” You say. What next?
      """;

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Pick up the phone");
        btn2.setText("Don't answer the phone");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvStoryText.setText(text);

        if (choice == 1)
        {
            answerPhone2();
        }
        else if (choice == 2)
        {
            dontAnswerPhone2();
        }

    }



    private void answerPhone2()
    {
        //start adventure here

        String text = """
    “Hello?” You ask. No answer.“That’s a horrible sound.” Lux says through the phone.
    1. Ask again
    2. Put the phone down
      """;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            askAgain2();
        }
        else if (choice == 2)
        {
            dontAnswerPhone2();
        }

    }




    private void dontAnswerPhone2()
    {
        //start adventure here

        String text = """
    You hear a noise back in your room. “Who is that behind you?!” Lux asks.
    1. Hide in the empty cabinet
    2. Investigate
      """;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            hideInCabinet2();
        }
        else if (choice == 2)
        {
            investigate2();
        }

    }




    private void investigate2()
    {
        //start adventure here

        String text = TextColor.GREEN + """
    You unlocked the plot armor ending. You walked into your room, and a masked killer was standing right there. You tried to run, but tripped on nothing. Idiot. The killer ended up tripping over your body, and landing on their knife. Suddenly, a second killer came running at you, but tripped, and got the same fate. Why are you weird? You still lived though I guess.
    1. Yay, I'm gonna play again
    2. I'm done (You're racist)
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            start();
        }
        else if (choice == 2)
        {
            start();
        }

    }




    private void hideInCabinet2()
    {
        //start adventure here

        String text = TextColor.RED + """
      ⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠋⠉⠁⠄⠄⠈⠙⠻⣿⣿⣿⣿
      ⣿⣿⣿⣿⣿⣿⠟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢿⣿
      ⣿⣿⣿⣿⡿⠃⠄⠄⠄⢀⣀⣀⡀⠄⠄⠄⠄⠄⠄⠄⠈⢿
      ⣿⣿⣿⡟⠄⠄⠄⠄⠐⢻⣿⣿⣿⣷⡄⠄⠄⠄⠄⠄⠄⠈
      ⣿⣿⣿⠃⠄⠄⠄⢀⠴⠛⠙⣿⣿⡿⣿⣦⠄⠄⠄⠄⠄⠄
      ⣿⣿⠃⠄⢠⡖⠉⠄⠄⠄⣠⣿⡏⠄⢹⣿⠄⠄⠄⠄⠄⢠
      ⣿⠃⠄⠄⢸⣧⣤⣤⣤⢾⣿⣿⡇⠄⠈⢻⡆⠄⠄⠄⠄⣾
      ⠁⠄⠄⠄⠈⠉⠛⢿⡟⠉⠉⣿⣷⣀⠄⠄⣿⡆⠄⠄⢠⣿
      ⠄⠄⠄⠄⠄⠄⢠⡿⠿⢿⣷⣿⣿⣿⣿⣿⠿⠃⠄⠄⣸⣿
      ⠄⠄⠄⠄⠄⢀⡞⠄⠄⠄⠈⣿⣿⣿⡟⠁⠄⠄⠄⠄⣿⣿
      ⠄⠄⠄⠄⠄⢸⠄⠄⠄⠄⢀⣿⣿⡟⠄⠄⠄⠄⠄⢠⣿⣿
      ⠄⠄⠄⠄⠄⠘⠄⠄⠄⢀⡼⠛⠉⠄⠄⠄⠄⠄⠄⣼⣿⣿
      ⠄⠄⠄⠄⠄⡇⠄⠄⢀⠎⠄⠄⠄⠄⠄⠄⠄⠄ ⠙⢿⣿
      ⠄⠄⠄⠄⠄⢰⠃⠄⢀⠎⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿⣿
    You unlocked the Idiot Ending. The killer found you because they literally watched you go into the cabinet. Are you dumb? Just kidding, do you want to try again?
    1. Okay sure
    2. No (You're homophobic against men but not women because you're one of those weird people)
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            start();
        }
        else if (choice == 2)
        {
            start();
        }

    }






    private void askAgain2()
    {
        //start adventure here

        String text = """
    “Hello?” You ask again, more impatiently this time. A voice spoke, “Hello.” The voice was low and raspy as it responded. “Girl, hang up now.” Lux says, worried. “Who is this?” You ask. “Someone who likes scary movies.” They say hauntingly. Oh, so you’re ghostface? Wow! Actually, I’m not confused.” You say sarcastically, hanging up. “You’re so cool.” Lux says, proud. Her expression suddenly changed. “Wait, there’s someone behind you!”
    1. Leave the house and call the police
    2. Attack that loser
      """;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            leaveCallPolice2();
        }
        else if (choice == 2)
        {
            attackLoser();
        }

    }




    private void attackLoser()
    {
        //start adventure here

        String text = TextColor.GREEN + """
    You unlocked the Samantha Carpenter ending. “Where?” You ask. You sound upset, but not scared. “In your room! I saw them down the hallway!” She shouted. “Fun.” You say sarcastically, charging down the hall and into your room. A masked killer was there, not expecting you yet. You tackled him, took his knife, and stabbed him in the face. “Oh my god! Behind you.!” Feet away, the second killer was there. You grabbed his knife holding arm, and stabbed him with it. Lux screams over the phone at the sight of blood, and you survive.
    1. Play again
    2. I hate Millessa Berrera and I'm glad she was fired from Scream 7
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            start();
        }
        else if (choice == 2)
        {
            start();
        }

    }




    private void leaveCallPolice2()
    {
        //start adventure here

        String text = TextColor.GREEN + """
    You unlocked the Anti Tara ending. You managed to avoid any injuries, and ran down the street with Lux in your hand. The police pulled up later, arresting the two killers hiding in your house. There are more endings to unlock. Do you want to play again?
    1. Yeah
    2. No I'm sexist to women
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            start();
        }
        else if (choice == 2)
        {
            start();
        }

    }




    private void lockDoor()
    {
        //start adventure here

        String text = """
    “Yeah… That’s not happening…” You say dismissively, locking the door. “What?” Lux asks over the FaceTime call, having no idea what you’re talking about. You suddenly hear something fall in your closet. “What the-” The closet opens quickly, and a masked killer charges at you with a knife. What do you do?
    1. Get out
    2. Fight
      """;

        System.out.println(text);

        if (choice == 1)
        {
            getOut();
        }
        else if (choice == 2)
        {
            fight2();
        }

    }




    private void fight2()
    {
        //start adventure here

        String text = TextColor.BLUE + """
      You unlocked the Happy Death Day ending.
      “Oh hell to the no!” You scream. You don’t even get to fight him because he stabs you in the face…
    1. Continue???
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            yeahContinue();
        }

    }




    private void getOut()
    {
        //start adventure here

        String text = TextColor.BLUE + """
      You unlocked the Baby Face ending. “Oh hell to the no!” You scream. You tried to open the door, but forgot that you locked it. The killer stabbed you against the door.
    1. Continue???
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            yeahContinue();
        }

    }




    private void yeahContinue()
    {
        //start adventure here

        String text = """
    You scream, processing what just happened. “What!?” Lux screamed, startled and confused by your sudden outburst. You were back on your bed, holding your iPhone on a FaceTime call with Lux. Your door was opened, and your closet was closed. “I thought-” The landline wrang again, interrupting you. “Thought what?”
    1. Check the closet
      """;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            checkTheCloset();
        }

    }




    private void checkTheCloset()
    {
        //start adventure here

        String text = """
    You looked at the closet across the room. “I just um…” Lux was squinting in confusion. “I thought someone was in here, and they…” You open the doors slowly, and the masked killer was still there. You screamed again, slamming the doors closed, and booking it. The killer charged out of your room, close behind.
    1. Leave the house
    2. Run around the kitchen island
      """;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            endLeave();
        }
        else if (choice == 2)
        {
            island();
        }

    }




    private void island()
    {
        //start adventure here

        String text = TextColor.RED + """
      ⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠋⠉⠁⠄⠄⠈⠙⠻⣿⣿⣿⣿
      ⣿⣿⣿⣿⣿⣿⠟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢿⣿
      ⣿⣿⣿⣿⡿⠃⠄⠄⠄⢀⣀⣀⡀⠄⠄⠄⠄⠄⠄⠄⠈⢿
      ⣿⣿⣿⡟⠄⠄⠄⠄⠐⢻⣿⣿⣿⣷⡄⠄⠄⠄⠄⠄⠄⠈
      ⣿⣿⣿⠃⠄⠄⠄⢀⠴⠛⠙⣿⣿⡿⣿⣦⠄⠄⠄⠄⠄⠄
      ⣿⣿⠃⠄⢠⡖⠉⠄⠄⠄⣠⣿⡏⠄⢹⣿⠄⠄⠄⠄⠄⢠
      ⣿⠃⠄⠄⢸⣧⣤⣤⣤⢾⣿⣿⡇⠄⠈⢻⡆⠄⠄⠄⠄⣾
      ⠁⠄⠄⠄⠈⠉⠛⢿⡟⠉⠉⣿⣷⣀⠄⠄⣿⡆⠄⠄⢠⣿
      ⠄⠄⠄⠄⠄⠄⢠⡿⠿⢿⣷⣿⣿⣿⣿⣿⠿⠃⠄⠄⣸⣿
      ⠄⠄⠄⠄⠄⢀⡞⠄⠄⠄⠈⣿⣿⣿⡟⠁⠄⠄⠄⠄⣿⣿
      ⠄⠄⠄⠄⠄⢸⠄⠄⠄⠄⢀⣿⣿⡟⠄⠄⠄⠄⠄⢠⣿⣿
      ⠄⠄⠄⠄⠄⠘⠄⠄⠄⢀⡼⠛⠉⠄⠄⠄⠄⠄⠄⣼⣿⣿
      ⠄⠄⠄⠄⠄⡇⠄⠄⢀⠎⠄⠄⠄⠄⠄⠄⠄⠄ ⠙⢿⣿
      ⠄⠄⠄⠄⠄⢰⠃⠄⢀⠎⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿⣿
      You unlocked the Billie Eilish ending. The killer jumped onto, and over the kitchen island, shoving your head into the sink which was conveniently plugged, and full of water. You tried to scream… But your head was under water… Do you want to try again?
    1. Yes
    2. No (Okay then, bye lmaoo)
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            start();
        }
        else if (choice == 2)
        {
            start();
        }

    }




    private void endLeave()
    {
        //start adventure here

        String text = TextColor.GREEN + """
    You unlocked THE ENDING. You ran out the door, and screamed when you saw another killer there. He wasn't expecting you yet. He jumped at you with his knife, but accidentally stabbed the other killer that was after you. They both fell over, and you got away. “What the hell is going on?” Lux asked, while you disappeared into the distance or something. There are still more endings, would you like to play again?
    1. Yes
    2. No (loser kid)
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            start();
        }
        else if (choice == 2)
        {
            start();
        }

    }




    private void ignoreCall()
    {
        //start adventure here

        String text = """
    You end up ignoring the call, and talking with Luxury. The landline rang again. Annoyed, you stand up, but seconds later, you hear something fall in your closet. It opened slowly, and a masked man with a knife walked out. What do you do?
    1. Fight
    2. Run
      """;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            fight1();
        }
        else if (choice == 2)
        {
            run1();
        }

    }




    private void fight1()
    {
        //start adventure here

        String text = """
    “Oh my god, run!” Lux shouts through the Facetime call. You panic, and decide to grab a pillow and tackle the killer with it. The pillow is too thick and large to stab through. He drops the knife.
    1. Keep fighting
    2. Listen to Luxury
      """;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            keepFighting();
        }
        else if (choice == 2)
        {
            run1();
        }

    }




    private void run1()
    {
        //start adventure here

        String text = """
    “Get out of there!” Lux shouts through the Facetime call. You panic, and run out as quick as you can, the killer only steps behind. What do you do?
    1. Lock yourself in the bathroom
    2. Leave the house
      """;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            lockSelfBathroom();
        }
        else if (choice == 2)
        {
            leave3();
        }

    }




    private void leave3()
    {
        //start adventure here

        String text = TextColor.RED + """
      ⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠋⠉⠁⠄⠄⠈⠙⠻⣿⣿⣿⣿
      ⣿⣿⣿⣿⣿⣿⠟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢿⣿
      ⣿⣿⣿⣿⡿⠃⠄⠄⠄⢀⣀⣀⡀⠄⠄⠄⠄⠄⠄⠄⠈⢿
      ⣿⣿⣿⡟⠄⠄⠄⠄⠐⢻⣿⣿⣿⣷⡄⠄⠄⠄⠄⠄⠄⠈
      ⣿⣿⣿⠃⠄⠄⠄⢀⠴⠛⠙⣿⣿⡿⣿⣦⠄⠄⠄⠄⠄⠄
      ⣿⣿⠃⠄⢠⡖⠉⠄⠄⠄⣠⣿⡏⠄⢹⣿⠄⠄⠄⠄⠄⢠
      ⣿⠃⠄⠄⢸⣧⣤⣤⣤⢾⣿⣿⡇⠄⠈⢻⡆⠄⠄⠄⠄⣾
      ⠁⠄⠄⠄⠈⠉⠛⢿⡟⠉⠉⣿⣷⣀⠄⠄⣿⡆⠄⠄⢠⣿
      ⠄⠄⠄⠄⠄⠄⢠⡿⠿⢿⣷⣿⣿⣿⣿⣿⠿⠃⠄⠄⣸⣿
      ⠄⠄⠄⠄⠄⢀⡞⠄⠄⠄⠈⣿⣿⣿⡟⠁⠄⠄⠄⠄⣿⣿
      ⠄⠄⠄⠄⠄⢸⠄⠄⠄⠄⢀⣿⣿⡟⠄⠄⠄⠄⠄⢠⣿⣿
      ⠄⠄⠄⠄⠄⠘⠄⠄⠄⢀⡼⠛⠉⠄⠄⠄⠄⠄⠄⣼⣿⣿
      ⠄⠄⠄⠄⠄⡇⠄⠄⢀⠎⠄⠄⠄⠄⠄⠄⠄⠄ ⠙⢿⣿
      ⠄⠄⠄⠄⠄⢰⠃⠄⢀⠎⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿⣿
      You unlocked the third party ending. On your way out the door, you run straight into the knife of the second killer. He was waiting for you outside. There are still more endings, would you like to try again?
    1. Yes
    2. No
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            start();
        }
        else if (choice == 2)
        {
            start();
        }

    }




    private void lockSelfBathroom()
    {
        //start adventure here

        String text = """
    You manage to lock the door seconds before they reach you. “Blake get out of there! I’m calling the police.” Lux says. What do you do?
    1. Crawl out of the window
    2. stayAndFight
      """;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            bathroomWindow();
        }
        else if (choice == 2)
        {
            stayAndFight();
        }

    }




    private void stayAndFight()
    {
        //start adventure here

        String text = TextColor.RED + """
    You unlocked the Pam Hues ending. You had nothing to defend yourself with when the killer kicked the door down. You didn’t make it…
    1. Try again
    2. Cry in real life
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            start();
        }
        else if (choice == 2)
        {
            start();
        }

    }




    private void bathroomWindow()
    {
        //start adventure here

        String text = TextColor.RED + """
      ⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠋⠉⠁⠄⠄⠈⠙⠻⣿⣿⣿⣿
      ⣿⣿⣿⣿⣿⣿⠟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢿⣿
      ⣿⣿⣿⣿⡿⠃⠄⠄⠄⢀⣀⣀⡀⠄⠄⠄⠄⠄⠄⠄⠈⢿
      ⣿⣿⣿⡟⠄⠄⠄⠄⠐⢻⣿⣿⣿⣷⡄⠄⠄⠄⠄⠄⠄⠈
      ⣿⣿⣿⠃⠄⠄⠄⢀⠴⠛⠙⣿⣿⡿⣿⣦⠄⠄⠄⠄⠄⠄
      ⣿⣿⠃⠄⢠⡖⠉⠄⠄⠄⣠⣿⡏⠄⢹⣿⠄⠄⠄⠄⠄⢠
      ⣿⠃⠄⠄⢸⣧⣤⣤⣤⢾⣿⣿⡇⠄⠈⢻⡆⠄⠄⠄⠄⣾
      ⠁⠄⠄⠄⠈⠉⠛⢿⡟⠉⠉⣿⣷⣀⠄⠄⣿⡆⠄⠄⢠⣿
      ⠄⠄⠄⠄⠄⠄⢠⡿⠿⢿⣷⣿⣿⣿⣿⣿⠿⠃⠄⠄⣸⣿
      ⠄⠄⠄⠄⠄⢀⡞⠄⠄⠄⠈⣿⣿⣿⡟⠁⠄⠄⠄⠄⣿⣿
      ⠄⠄⠄⠄⠄⢸⠄⠄⠄⠄⢀⣿⣿⡟⠄⠄⠄⠄⠄⢠⣿⣿
      ⠄⠄⠄⠄⠄⠘⠄⠄⠄⢀⡼⠛⠉⠄⠄⠄⠄⠄⠄⣼⣿⣿
      ⠄⠄⠄⠄⠄⡇⠄⠄⢀⠎⠄⠄⠄⠄⠄⠄⠄⠄ ⠙⢿⣿
      ⠄⠄⠄⠄⠄⢰⠃⠄⢀⠎⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿⣿
      You unlocked the Olivia Morris ending. You climbed out of the window, but were impaled by the knife of the second killer. They were waiting for you. There are still more endings. Would you like to try again?
    1. Yes
    2. No
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            start();
        }
        else if (choice == 2)
        {
            start();
        }

    }

    private void keepFighting()
    {
        //start adventure here

        String text = TextColor.GREEN + """
    You unlocked the Sydney Prescott ending. You managed to grab his knife while he was down, and stab him through the eye of the mask. You noticed another masked killer outside, they tried to run but you got to them first…
    1. Play some more
    2. Quit (Loser)
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            start();
        }
        else if (choice == 2)
        {
            start();
        }

    }




    private void seeWhosCallingYou()
    {
        //start adventure here

        String text = """
    You make it to the kitchen. “Who is it?” She asked intrigued. “Unknown Caller ID.” You say. What do you do?
    1. Answer the phone
    2. Don't answer the phone
      """;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            answerPhone();
        }
        else if (choice == 2)
        {
            dontAnswerPhone();
        }

    }




    private void answerPhone()
    {
        //start adventure here

        String text = """
    “Hello?” You ask. No answer.“Is that what the landline sounds like?” Lux asks through the phone. What do you do?
    1. Ask again
    2. Hang up
      """;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            askAgain();
        }
        else if (choice == 2)
        {
            hangUp();
        }

    }




    private void dontAnswerPhone()
    {
        //start adventure here

        String text = """
    You hear a thud back in your room. Something fell. “What was that?” Lux asks.
    1. Hide in an empty cabinet
    2. Investigate
      """;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            cabinet2();
        }
        else if (choice == 2)
        {
            investigate();
        }

    }




    private void cabinet2()
    {
        //start adventure here

        String text = TextColor.GREEN + """
    You unlocked the Camper Ending. The killer never found you because they didn't think you had a reason to hide, the police arrested two masked men, one hiding in your closet, the other found wandering around the sides of your house. There are still more endings, would you like to play again?
    1. Yes
    2. No
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            start();
        }
        else if (choice == 2)
        {
            start();
        }

    }




    private void investigate()
    {
        //start adventure here

        String text = TextColor.RED + """
      ⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠋⠉⠁⠄⠄⠈⠙⠻⣿⣿⣿⣿
      ⣿⣿⣿⣿⣿⣿⠟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢿⣿
      ⣿⣿⣿⣿⡿⠃⠄⠄⠄⢀⣀⣀⡀⠄⠄⠄⠄⠄⠄⠄⠈⢿
      ⣿⣿⣿⡟⠄⠄⠄⠄⠐⢻⣿⣿⣿⣷⡄⠄⠄⠄⠄⠄⠄⠈
      ⣿⣿⣿⠃⠄⠄⠄⢀⠴⠛⠙⣿⣿⡿⣿⣦⠄⠄⠄⠄⠄⠄
      ⣿⣿⠃⠄⢠⡖⠉⠄⠄⠄⣠⣿⡏⠄⢹⣿⠄⠄⠄⠄⠄⢠
      ⣿⠃⠄⠄⢸⣧⣤⣤⣤⢾⣿⣿⡇⠄⠈⢻⡆⠄⠄⠄⠄⣾
      ⠁⠄⠄⠄⠈⠉⠛⢿⡟⠉⠉⣿⣷⣀⠄⠄⣿⡆⠄⠄⢠⣿
      ⠄⠄⠄⠄⠄⠄⢠⡿⠿⢿⣷⣿⣿⣿⣿⣿⠿⠃⠄⠄⣸⣿
      ⠄⠄⠄⠄⠄⢀⡞⠄⠄⠄⠈⣿⣿⣿⡟⠁⠄⠄⠄⠄⣿⣿
      ⠄⠄⠄⠄⠄⢸⠄⠄⠄⠄⢀⣿⣿⡟⠄⠄⠄⠄⠄⢠⣿⣿
      ⠄⠄⠄⠄⠄⠘⠄⠄⠄⢀⡼⠛⠉⠄⠄⠄⠄⠄⠄⣼⣿⣿
      ⠄⠄⠄⠄⠄⡇⠄⠄⢀⠎⠄⠄⠄⠄⠄⠄⠄⠄ ⠙⢿⣿
      ⠄⠄⠄⠄⠄⢰⠃⠄⢀⠎⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿⣿
      You unlocked the White Girl ending. Before you even walked into your room, a masked killer ran out, and stabbed you. He was waiting for you. There are still more endings, would you like to try again?
    1. Yes
    2. No
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            start();
        }
        else if (choice == 2)
        {
            start();
        }

    }




    private void askAgain()
    {
        //start adventure here

        String text = """
    “Hello?” You ask again, more impatiently this time. A voice spoke, “Hello.” The voice was low and raspy as it responded. “Girl, hang up now.” Lux says worried. “Who is this?” You ask. “This is the last person you’re ever gonna see alive.” They say hauntingly. Oh no, I’m so scared.” You say sarcastically, hanging up. “Good call.” Lux says. You suddenly hear a thud from your room. Something fell.
      1. Leave the house and call the police
      2. Hide in an empty cabinet
      """;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            leaveCallPolice();
        }
        else if (choice == 2)
        {
            cabinet1();
        }

    }




    private void leaveCallPolice()
    {
        //start adventure here

        String text = TextColor.RED + """
      ⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠋⠉⠁⠄⠄⠈⠙⠻⣿⣿⣿⣿
      ⣿⣿⣿⣿⣿⣿⠟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢿⣿
      ⣿⣿⣿⣿⡿⠃⠄⠄⠄⢀⣀⣀⡀⠄⠄⠄⠄⠄⠄⠄⠈⢿
      ⣿⣿⣿⡟⠄⠄⠄⠄⠐⢻⣿⣿⣿⣷⡄⠄⠄⠄⠄⠄⠄⠈
      ⣿⣿⣿⠃⠄⠄⠄⢀⠴⠛⠙⣿⣿⡿⣿⣦⠄⠄⠄⠄⠄⠄
      ⣿⣿⠃⠄⢠⡖⠉⠄⠄⠄⣠⣿⡏⠄⢹⣿⠄⠄⠄⠄⠄⢠
      ⣿⠃⠄⠄⢸⣧⣤⣤⣤⢾⣿⣿⡇⠄⠈⢻⡆⠄⠄⠄⠄⣾
      ⠁⠄⠄⠄⠈⠉⠛⢿⡟⠉⠉⣿⣷⣀⠄⠄⣿⡆⠄⠄⢠⣿
      ⠄⠄⠄⠄⠄⠄⢠⡿⠿⢿⣷⣿⣿⣿⣿⣿⠿⠃⠄⠄⣸⣿
      ⠄⠄⠄⠄⠄⢀⡞⠄⠄⠄⠈⣿⣿⣿⡟⠁⠄⠄⠄⠄⣿⣿
      ⠄⠄⠄⠄⠄⢸⠄⠄⠄⠄⢀⣿⣿⡟⠄⠄⠄⠄⠄⢠⣿⣿
      ⠄⠄⠄⠄⠄⠘⠄⠄⠄⢀⡼⠛⠉⠄⠄⠄⠄⠄⠄⣼⣿⣿
      ⠄⠄⠄⠄⠄⡇⠄⠄⢀⠎⠄⠄⠄⠄⠄⠄⠄⠄ ⠙⢿⣿
      ⠄⠄⠄⠄⠄⢰⠃⠄⢀⠎⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿⣿
      You unlocked the Tobey Maguire ending. On your way out, the killer stabbed you in the back. He was waiting outside. There are still more endings, would you like to try again?
    1. Yes
    2. No
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            start();
        }
        else if (choice == 2)
        {
            start();
        }

    }




    private void cabinet1()
    {
        //start adventure here

        String text = TextColor.RED + """
      ⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠋⠉⠁⠄⠄⠈⠙⠻⣿⣿⣿⣿
      ⣿⣿⣿⣿⣿⣿⠟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢿⣿
      ⣿⣿⣿⣿⡿⠃⠄⠄⠄⢀⣀⣀⡀⠄⠄⠄⠄⠄⠄⠄⠈⢿
      ⣿⣿⣿⡟⠄⠄⠄⠄⠐⢻⣿⣿⣿⣷⡄⠄⠄⠄⠄⠄⠄⠈
      ⣿⣿⣿⠃⠄⠄⠄⢀⠴⠛⠙⣿⣿⡿⣿⣦⠄⠄⠄⠄⠄⠄
      ⣿⣿⠃⠄⢠⡖⠉⠄⠄⠄⣠⣿⡏⠄⢹⣿⠄⠄⠄⠄⠄⢠
      ⣿⠃⠄⠄⢸⣧⣤⣤⣤⢾⣿⣿⡇⠄⠈⢻⡆⠄⠄⠄⠄⣾
      ⠁⠄⠄⠄⠈⠉⠛⢿⡟⠉⠉⣿⣷⣀⠄⠄⣿⡆⠄⠄⢠⣿
      ⠄⠄⠄⠄⠄⠄⢠⡿⠿⢿⣷⣿⣿⣿⣿⣿⠿⠃⠄⠄⣸⣿
      ⠄⠄⠄⠄⠄⢀⡞⠄⠄⠄⠈⣿⣿⣿⡟⠁⠄⠄⠄⠄⣿⣿
      ⠄⠄⠄⠄⠄⢸⠄⠄⠄⠄⢀⣿⣿⡟⠄⠄⠄⠄⠄⢠⣿⣿
      ⠄⠄⠄⠄⠄⠘⠄⠄⠄⢀⡼⠛⠉⠄⠄⠄⠄⠄⠄⣼⣿⣿
      ⠄⠄⠄⠄⠄⡇⠄⠄⢀⠎⠄⠄⠄⠄⠄⠄⠄⠄ ⠙⢿⣿
      ⠄⠄⠄⠄⠄⢰⠃⠄⢀⠎⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿⣿
      You unlocked the hopeless ending. The killer found you because they knew you would be hiding after the call. There are still more endings, would you like to try again?
      Yes
      No
      """ + TextColor.RESET;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            start();
        }
        else if (choice == 2)
        {
            start();
        }

    }




    private void hangUp()
    {
        //start adventure here

        String text = """
      You hear a thud back in your room. “What was that?” Lux asks. What do you do?
      1. Hide in an empty cabinet, calling the police over your suspicions
      2. Investigate
      """;

        tvStoryText.setText(text);

        if (choice == 1)
        {
            cabinet2();
        }
        else if (choice == 2)
        {
            investigate();
        }

    }




}