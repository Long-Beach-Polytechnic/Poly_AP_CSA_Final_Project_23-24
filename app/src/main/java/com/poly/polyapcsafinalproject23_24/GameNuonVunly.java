package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;



public class GameNuonVunly extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    NuonPlayer player = new NuonPlayer("YourPlayerName");
    private int money;
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;




    public void run()
    {
        //initialize number of lives
        numLives = 5;
        money = 100;
        //create a scanner object for user input
        //create a player object (optional)
        //player = new Person(...)
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);

        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);


        tvTitle.setText("It's HALLOWEEN!");
        tvSubtitle.setText("For some reason in your universe, Halloween is a holiday!. You have nothing to do but play video game");

        //display project title and description

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
        System.out.println("So....Where do you want to do?");
        System.out.println("\n1. Play Videogame...\n2. PLAY VIDEO GAME...\n3. play video games again");

        if (choice == 1)
        {
            videoGame();
        }
        else if (choice == 2)
        {
            videoGame();
        }
        else if (choice == 3)
        {
            videoGame();
        }

    }


    public void videoGame()
    {
        chooseAPresent();
    }




    public void chooseAPresent()
    {
        System.out.println("You decided to stay home and play games.");
        System.out.println("Moment later, Your uncle shown up and want to give you an early present for your birth. But He can't decide.");
        System.out.println("\"just pick one between these two\" \n1. $1,000 \n2. a blaster and a spaceship from starwar");
        if (choice == 1)
        {
            player.addMoney(1000.00);
            System.out.println("You get $1,000 from your uncle, Now you have $" + player.getMoney());
        }
        else if (choice == 2)
        {
            player.getGift();
            System.out.println("You received a blaster and a spaceship from Star Wars.");


        }
        gamingTime();
    }


    private void gamingTime()
    {
        System.out.println("After that, you hop on a new game...similar to detroit become human.");
        System.out.println("However! AS soon as you open it, Your Monitor START FLASHIN-----");
        final int ROWS = 10;
        final int COLS = 40;
        for (int row=0; row<ROWS; row++)
        {
            for (int col=0; col<COLS; col++)
            {
                System.out.print(TextColor.WHITE_BACKGROUND + " ");
            }

        }
        System.out.println(TextColor.WHITE_BACKGROUND +image());
        System.out.println(TextColor.RESET);
        System.out.println(TextColor.RED_BOLD +  image1());
        glichingMetrex();
    }



    private void glichingMetrex()
    {
        System.out.println("\n \n" + TextColor.RESET + "");
        System.out.print("\"You now have " + numLives +  " lives left\"");
        System.out.println("\nThis is the moment when you realizing that your're now stuck in a game. when you respawn back, you see right in front of you two paths: \n1. Left \n2. Right");
        if (choice == 1)
        {
            left();
        }
        else
        {
            right();
        }

    }




    private void right()
    {
        System.out.println("As soon as you turn right, You see 3 three path:\n1. A small alleyway to your left. \n2. A road infront of you with sign \"DO NOT ENTER\". \n3. a road to the right");
        int choice = Util.enterInt(1, 3);
        if (choice == 1)
        {
            itemDrop();
        }
        else if (choice == 2)
        {
            jumpOverFence();
        }
        else if (choice == 3)
        {
            rightToDead();
        }

    }



    private void itemDrop()
    {
        System.out.println();
        System.out.println("*DING* you recieved:");
        System.out.println("+1 Dessert Engle, +2 magazine (30 ammos)");
        System.out.println("As soon as you pick up the items, The monster is about 30 feet away and going to charge on you");
        System.out.println("\n1. Are you gonna shoot it. \n2. continue to run");
        int choice = Util.enterInt(1, 2);
        if (choice == 1)
        {
            continueToShoot();
        }
        else if (choice == 2)
        {
            continueToRun();
        }

    }





    private void continueToShoot()
    {
        System.out.println();
        System.out.println("*BANG* *BANG* *BANG* *BANG*.....");
        System.out.println("You shot the \"Monster\" until you ran out of the 1st magazine. but It's seem to work because it has that thing SCREAMING screaming. While it stay still and screaming and bleeding, what would you dodnext? \n1. Shoot again \n2. Runaway");
        int choice = Util.enterInt(1, 2);
        {
            if (choice == 1)
            {
                System.out.println();
                System.out.println("*you continue to shoot it* \n Little did you know...The monster slowly stand up and walk toward you...all its blood start to faint out. With just a blink of an eye, it jump to you...");
                defeatGame();
            }
            else if (choice == 2)
            {
                runAway();
            }
        }
    }





    private void runAway()
    {
        System.out.println();
        System.out.println("You decided not to shoot it because you thought that you might miss it");
        System.out.println("After you took about 4 steps, you see a left turn next to you. What would you do? \n1. turn left \n2. continue straight");
        int choice = Util.enterInt(1, 2);
        if (choice == 1)
        {
            System.out.println();
            System.out.println("The moment you turn, You see a light shine upward coming from a \"place\". fortunately, The monster is still stationary, allowing to get to there. It's a shop");
            if (player.showGift())
            {
                lightSaberAndShip();
            }
            else
            {
                store();
            }


        }
        else if (choice == 2)
        {
            System.out.println();
            System.out.println("\nYou decided to continue forward, but it's seem like you have been running on a straight line forever. About 2 minute later, see somthing...behind you...and it's approaching you fast. *As It get closer and closer you realized* It's the monster. In a flash, It already catch up to you and then... ");
            defeatGame();
        }
    }





    private void lightSaberAndShip()
    {
        System.out.println("\n \" You got a starter pack. a light saber and a spaceship. but you can only choose one of these. SO? \" \n1. Light Saber \n2. SpaceShip ");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            bossFight();
        }
        else if (choice == 2 )
        {
            gotTelepot();
        }
    }

    private void gotTelepot()
    {
        System.out.println(" \nThought a spaceship going to spawn? \nA light coming from above and shine dirctly at you. and the closer you look, You realized a ship coming down and abducting you");
        System.out.println("*CONGRATULATION YOU WIN* \nThe moment you open your eye again, you'll forget everything.");
    }


    private void bossFight()
    {
        System.out.println("\n *+1 light saber* *change scene to arena* *telepot Jeff*");
        System.out.println("Jeff, the Monster appear to have human-like body with superhuman-strength. Its right arm is long and big hand, similar to the normal devil arm usually see in game, skinny and flesh skin, and small left arm");
        System.out.println("FIGHT");
        System.out.println("\nImmediately, Jeff approach at you in fast pace and about to swing right ");
        System.out.println("1. block \n2. dodge");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            defeatGame();
        }
        else if (choice == 2 )
        {
            piercingIt();
        }
    }




    private void piercingIt()
    {
        System.out.println("\n *Dodge forward* \n1. stab \n2. move");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            stabJeff();
        }
        else if (choice == 2 )
        {
            defeatGame();
        }

    }

    private void stabJeff()
    {
        System.out.println("\nYou stabbed it in the stomach, lashing out a loud scream. \n*see the opportunity to hit it again...* \n1. pull out and slash it \n2. dodge back");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            System.out.println("\nAs you about to slashing it, Jeff's right hand was able to move then proceed to grab your head and crush it ");
            defeatGame();
        }
        else if (choice == 2 )
        {
            backward();
        }

    }



    private void backward()
    {
        System.out.print("\n*Take steps back to give more space* not even a second later, Jeff rushing at you about swing right again, but this time slower and seem weaker than last time....however it still fast.\n1. try to block...\n2. dodge again...\n3. rush at him and try to slashing its stomach");
        int choice = Util.enterInt(1,3);
        if (choice == 1)
        {
            System.out.println("\nYou were able to block the attack, but its superstrength enable it to left kick you at the stomach and start comboing you.");
            defeatGame();
        }
        else if (choice == 2 )
        {
            dodgeAgain();
        }
        else if (choice == 3)
        {
            System.out.println("\nYou're rushing at him back and even dodge the attack. but as you about to swing, Jeff using sacrifice its left hand to successfully block the light Saber. then proceed grap you by the neck, and choking you to .... ");
            defeatGame();
        }

    }


    private void dodgeAgain()
    {
        System.out.println("\nYou dodge and try to do like time, but this time your aim for the neck. At the same time, Jeff's left hand was about to swing. \n1. risk it \n2. dodge \n3. change aim to the left hand");
        int choice = Util.enterInt(1,3);
        if (choice == 1)
        {
            System.out.println("\nIt's a battle of time. But You Won...You piered him in a throat and kill it.");
            System.out.println("Congratulation YOU WIN");
            run();
        }
        else if (choice == 2 )
        {
            System.out.println("\nYou dodged right but Jeff swing around, back slapping you and...");
            defeatGame();
        }
        else if (choice == 3)
        {
            System.out.println("\nYou're rushing at him back and even dodge the attack. but as you about to swing, Jeff using sacrifice its left hand to successfully block the light Saber. then proceed grap you by the neck, and choking you to .... ");
            defeatGame();
        }
    }





    private void store()
    {
        System.out.println("\nYou 3 options: \n1. speed potions ($1050) \n2. ak-47 ($600) \n3. mystery box ($900)");
        int choice = Util.enterInt(1,3);
        if (choice == 1)
        {
            speedPotion();
        }
        else if (choice == 2)
        {
            ak_47();
        }
        else if (choice == 3)
        {
            mysteryBox();
        }
    }



    private void speedPotion()
    {
        System.out.println("The potion give you insane speed and immortality for 1:30min. skipping most of the obstacle. \n*TIME SKIP TO WHERE THE AFFECT STOP* You stop and face three paths. \n1. Left path \n2. straight path \n3. The inB etween path");
        int choice = Util.enterInt(1, 3);
        if (choice == 1)
        {
            leftPath();
        }
        else if (choice == 2)
        {
            straightPath();
        }
        else if (choice == 3)
        {
            inBetween();
        }
    }





    private void leftPath()
    {
        System.out.println("You see a portal and run into it.");
        System.out.println("\"CONGRATULATION YOU WIN\"");
        System.out.println("You wake up in your bed and don't remeber anything");
        run();


    }

    private void straightPath()
    {
        System.out.println("\nAs you continue to run straight, A message pop up");
        System.out.println("\"Opp!!! The games haven’t yet so this is a bug\" \nWe going to send you back to nearly the start");
        right();

    }

    private void inBetween()
    {
        System.out.println("As you continue to run, There is a deadend and a door infront...");
        System.out.println("As you approach to the door, It need password to open. (This is a dlc path, it's should not be appear right now)...So that mean you stuck here, waiting for dead");
        defeatGame();
    }







    private void ak_47()
    {
        System.out.println("+1 Gun, +5 Mag \nYou shoot the monster finished 1st Mag. However, AS you try to shoot try to it, The monster's regeneration power getting more stronger and stronger, to the point of bullet become useless...");
        defeatGame();
    }




    private void mysteryBox()
    {
        int chances = (int) (Math.random() * 3) + 1;
        if (chances == 1 || chances == 3)
        {
            grenade();
        }
        else if (chances == 2)
        {
            bossFight();
        }

    }



    private void grenade()
    {
        System.out.println("wow...one single grenade...\n1. end yourself \n2. throw to the monster");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            System.out.println("You open the trigger and rush to the monster....");
            defeatGame();
        }
        else if (choice == 2)
        {
            System.out.println("You throw it to the monster....It dodged.....");
            defeatGame();
        }
    }







    private void continueToRun()
    {
        System.out.println();
        System.out.println("You decided not to shoot it because you thought that you might miss it");
        System.out.println("After you took about 4 steps, you see a left turn next to you. What would you do? \n1. turn left \n2. continue straight");
        int choice = Util.enterInt(1, 2);
        if (choice == 1)
        {
            System.out.println();
            System.out.println("The moment you turn, You see a light shine upward coming from a \"place\". unfortunately, you're too slow and the \"thing\" catch up to you....");
            defeatGame();
        }
        else if (choice == 2)
        {
            System.out.println();
            System.out.println("You decided to continue forward, but what you don't realized is how fast the \"monster\" is. In a flash, It already catch up to you and then...");
            defeatGame();
        }
    }








    private void jumpOverFence()
    {
        System.out.println();
        int chances = (int) (Math.random() * 5) + 1;
        if (chances == 1 || chances == 2 || chances == 4 || chances == 5)
        {
            System.out.println("A sign placed there for a reason.... You then proceed to fall off a climb");
            defeatGame();
        }
        else
        {
            System.out.println("WOW, NO WAY!! You actually so lucky. Congrat, You won");
            run();
        }
    }




    private void rightToDead()
    {
        System.out.println();
        System.out.println("\"You're at the starting line\"");
        System.out.println("Turn out there a barrier at a starting line, unfortunate...");
        defeatGame();

    }




    private void left()
    {
        System.out.println("You took left and then see a split way again, Which way you going? \n1. left \n2. right");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            System.out.println("You're at a starting line");
            System.out.println(image());
            defeatGame();
        }
        else if (choice == 2)
        {
            firstObstacle();
        }
    }



    private void firstObstacle()
    {
        System.out.println("\nAs soon as you turned, You see: \n1. A fence that you might able to jump over \n2. A wall with broken bottom part");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            secondObstacle();
        }

        else if (choice == 2)
        {
            System.out.println("\nthe wall is too close to slide in and too small to roll over. which allow the monster to catch up");
            defeatGame();
        }
    }


    private void secondObstacle()
    {
        System.out.println("\nAfter jump across, the road getting smaller, barely fit two person. and there is a do-- \n *quick time event* \n1. dropping planks on your right to block way...\n2. grab a crowbar and throw at the monster... ");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            System.out.println("\nYou dropped all the planks down and not realized they connect to a big rock above. dropping the plank meaning that a big rock also fall down and it fail on the monster, knocking it out for a moment ");
            door();
        }
        else if (choice == 2)
        {
            System.out.println("\nWhen you threw that crowber, It hit its throat which is a jekpot (because it's the monster's weak point), knocking the monster out for a mmonet");
            door();
        }
    }

    private void door()
    {
        System.out.print("\nThis giving you time to rush to the door. beside you there: \n1. A key \n2. An axe");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            randomKey();
        }
        else if (choice == 2)
        {
            anAxe();
        }
    }

    private void randomKey()
    {
        System.out.println();
        int chances = (int) (Math.random() * 4) + 1;
        if (chances == 1 || chances == 2 || chances == 4 )
        {
            System.out.println("Oh oh! wrong key...");
            defeatGame();
        }
        else
        {
            System.out.println("*Door unlocked*");
            triviaQuestions();
        }
    }



    private void anAxe()
    {
        System.out.println("\nYou pick up the axe and immediately axing the door viciously. after 30second of cutting the door, The monster wake up. and you start panicking \n1. continue \n2. facing the monster");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            System.out.println("\nAnd then the door crack a huge hole. with no time less, You hurry and go through ");
            triviaQuestions();
        }
        else if (choice == 2)
        {
            System.out.println("You try charging toward the monster but he just launch to you and grab by the head first. and crushing it.");
            defeatGame();
        }
    }


    private void triviaQuestions()
    {
        System.out.println("*TRIVIA TIME* TIME REMAIN STOP UNTIL YOU ANSWER THE QUESTION. \nWhat was the first Disney animated feature movie that was not based on an already existing story? \n1. Lion King \n2. Cinderella \n3. Bambi");
        int choice = Util.enterInt(1,3);
        if (choice == 1)
        {
            System.out.println("Correct");
            finalDestination();
        }
        else if (choice == 2)
        {
            System.out.println("WRONG!");
            defeatGame();
        }
        else if (choice == 3)
        {
            System.out.println("Close but WRONG");
            defeatGame();
        }
    }

    private void finalDestination()
    {
        System.out.println("After answer the question and go to the door, you see see two path. \n1. right lane \n2. diagonal line to the right");
        int choice = Util.enterInt(1, 2);
        if (choice == 1)
        {
            System.out.println("As you continue to run, There is a deadend and a door infront...");
            System.out.println("As you approach to the door, It need password to open. (This is a DLC path, it's should not be appear right now)...So that mean you stuck here, waiting for dead");
            defeatGame();
        }
        else if (choice == 2)
        {
            System.out.println("You see a portal and run into it.");
            System.out.println("\"CONGRATULATION YOU WIN\"");
            System.out.println("You wake up in your bed and don't remeber anything");
            run();
        }

    }
























    private void defeatGame()
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
            System.out.println(TextColor.RED_BOLD + "YOU DIE");
            glichingMetrex();

        }
        else
        {
            System.out.println(TextColor.RED_BACKGROUND_BRIGHT + "GAME OVER");
        }

    }







    private String image()
    {
        return
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "      @@@@@@@@@@@@@@@@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "      @@@@@@@@@@@@@@@@&@&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "      @@@@@@@@@@@@%&@@%&&%%@@@@@@@@@@@@@@@@@@@@@@@&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "      @@@@@@@@@@@@@&%@@&&%#&@@@@@@@@@@@@@@@@@@#(#(*,,...*(%&@@@@&%@@@@@@@@@@@@@@@@@@@@\n" +
                        "      @@@@@@@@@@@@@@%%&&%&%%@@@@@@@@@@@@@@(                  ,/&@@@&@@@@@@@@@@@@@@@@@@\n" +
                        "      @@@@@@@@@@@@@@@%#%&%&%@@@@@@@@@@#.                       ,/&@@@@@@@@@@@@@@@@@@@@\n" +
                        "      @@@@@@@@@@@@@@@&#%%%&##&@@@@@@,                          .*/&@@@@@@@@@@@@@@@@@@@\n" +
                        "      @@@@@@@@@@@@@@@@%%(##@@@@@@@,                              ((#@@@@@@@@@@@@@@@@@@\n" +
                        "      @@@@@@@&@@@@@@@@@%((#@@@@@@/                 .               ../@@@@@@@@@@@@@@@@\n" +
                        "      @@@@@@@&&@@@@@@@@@@@&@@@@@@/                        .****,,     ,(@@@&&@@@@@@@@@\n" +
                        "      @@@@@@@%@@@@@@@@@@@@@@@@@@@*                       .*&%  .&@/     .#@@#%@@@@@@@@\n" +
                        "      @@@@@@@%&@@@@@@@@@@@@@@@@@@     ,*#%&%(.            %&  /  %,      .(@@&@@@@@@@@\n" +
                        "      @@@@@@@%@@@@@@@@@@@@@@@@@@@(   **@& %( (.            /%##/.         .#@@@@@@@@@@\n" +
                        "      @@@@@@@@@@@@@@@@@@@@@@@@@@@@    .&@&##%(.          .........         ,%@@@@@@@@@\n" +
                        "      @@@@@@@@@@@@@@@@@@@@@@@@@@@&     ..........    ..                    ./@@@@@@@,%\n" +
                        "      @@@@@@@@@@@@@@@@@@@@@@@@@@@/        ....                             .*#@@@@@&. \n" +
                        "      @@@@@@@@@@@@@@@@@@@@@@@@@@@,                                          .,&@@@@@  \n" +
                        "      @@@@@@@@@@@@@@@@@@@@@@@@@@@/                                   ,((.     (@@@@@  \n" +
                        "      @@@@@@@@@@@@@@@&@@@@@@@@@@@@,                               *%&%/.     .#@@@@@. \n" +
                        "      @@@@@@@@@&&@@@@@@@@@@@@@@@@@@(     .//.                 .*(#%#(,       *@@@@@@. \n" +
                        "      @@@@@@@@@&&%&@@&&@@@@@@@@@@@@@@*     ,/#%(. .**,..       ,%%#*        *@@@@@@(  \n" +
                        "      @@@@@@@@@&&&%%@@@@@@@@@@@@@@@@@@&,    ./(#%, ..       ,/###(*.     .,/@@@@@@@/  \n" +
                        "      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@&/,   .*(##///.,(/*,/,/#(,. .   ,/(@@@,@@@%,  \n" +
                        "      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@//@(@% ,%*.. .(%%#..    /%(#%/(**,.,(#%@@@./*@@%,. \n" +
                        "      @@@@@@@@@@@@@@@@&, .%@@@@@@@@*,%&#@.   /&%#,/%%&%#%%%%%&#&&/,.,*&@@@@@..,*&#/...";


    }

    private String image1()
    {
        return "   / \\      / \\      / \\      / \\  | | | | | | | | | | | | | | | | | | |\n" +
                "  / _ \\    / _ \\    / _ \\    / _ \\ | |_| | |_| | |_| | |_| | |_| | |_| |\n" +
                " / ___ \\  / ___ \\  / ___ \\  / ___ \\|  _  |  _  |  _  |  _  |  _  |  _  |\n" +
                "/_/   \\_\\/_/   \\_\\/_/   \\_\\/_/   \\_\\_| |_|_| |_|_| |_|_| |_|_| |_|_| |_|";
    }
}