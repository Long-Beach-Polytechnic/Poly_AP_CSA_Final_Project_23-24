package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameSengSambat extends GameActivity
{
 private TextView tvTitle, tvSubtitle, tvStoryText;
 private ImageView ivStory;
 private Button btn1, btn2, btn3;
 private boolean isWon;
 private int numLives;

 @Override
 protected void run() {
     setContentView(R.layout.activity_game_3_button);

     tvTitle = findViewById(R.id.tv_title_txt);
     tvSubtitle = findViewById(R.id.tv_subtitle);
     tvStoryText = findViewById(R.id.tv_story);
     ivStory = findViewById(R.id.iv_story);
     btn1 = findViewById(R.id.btn_1);
     btn2 = findViewById(R.id.btn_2);
     btn3 = findViewById(R.id.btn_3);

     tvTitle.setText("EERIE WOODLANDS");
     tvSubtitle.setText("Made by Sambat");

     //initialize number of lives
     numAttempts = 3;
     //create a scanner object for user input


     //create a player object (optional)
     //player = new Player(...)

     //display project title and description
     tvStoryText.setText("Eerie Woodlands");




     tvStoryText.setText("You currently have " +  numAttempts + " attempts. You have " + numAttempts + " attempts left to survive the forest");

     tvStoryText.setText("\nTime: 11:07 PM Location: Somewhere in Alberta, Canada \n \nIt's getting dark and you're in the woods trying to get to a campsite. While navigating your way through the forest you hear a screech that creeps you out. What do you do?");



     start();
 }
    //instance variables
    //   variables you plan to use throughout the adventure
    private int numAttempts;
    private int shootResult;
    private int leaveResult;
    //private Player player; (optional)


    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);

    }

    private void start()
    {
        //start adventure here
        setAllBtnsVisible();
        btn1.setText("Keep walking forward");
        btn2.setText("Investigate the noise");
        btn3.setText("Turn around and run away");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goForward(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                investigateNoise();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                runAway();
            }


            });
        }


    private void goForward()
    {
        tvStoryText.setText("You keep walking forward hoping to find a way out of the forest, but you see an eyeless monster, he notices your footsteps and walks towards you. What do you do?");
        setAllBtnsVisible();
        btn1.setText("Hide in a bush");
        btn2.setText("Keep walking forward");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hideInBush(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                keepWalkingForward();
            }
        });
    }
    private void hideInBush()
    {
        tvStoryText.setText("You hide in the bush for a while and it seems like the monster has wandered off somewhere close. What do you do?");

        setAllBtnsVisible();
        btn1.setText("Wait longer");
        btn2.setText("Try to leave");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { waitLonger(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tryToLeave();
            }
        });

    }
    private void waitLonger()
    {

        tvStoryText.setText("You wait longer and the monster eventually wanders off somewhere far, you left the forest surviving");
        btn3.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);

        btn1.setText("Continue");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endAdventure();
            }
        });




    }

    private void tryToLeave()
    {
        tvStoryText.setText("Choose a direction to walk towards");
        btn1.setText("North");
        btn2.setText("South");
        btn3.setText("East");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goNorth(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goSouth();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goEast();
            }


        });
    }

    private void goNorth()

    {
        tvStoryText.setText("After heading north you walk into a bear and it ends up eating you. You died");
        btn3.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);

        btn1.setText("Continue");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endAdventure();
            }
        });

    }

    private void goSouth()
    {
        tvStoryText.setText("After heading south, you end up walking into the monster again and it eats you. You died");
        btn3.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);

        btn1.setText("Continue");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });

    }

    private void goEast()
    {


       tvStoryText.setText("After heading east you walk into a group of hikers and they take you somewhere safe. You lived");
       btn3.setVisibility(View.INVISIBLE);
       btn2.setVisibility(View.INVISIBLE);

       btn1.setText("Continue");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endAdventure();
            }
        });




    }

    private void keepWalkingForward() {
        tvStoryText.setText("You keep walking forward but at this point the monster finds where you are and is very near. What do you do?");
        btn1.setText("Attack the monster");
        btn2.setText("Stay still and be quiet");
        btn3.setText("Run Away as fast as you can");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attackMonster();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beQuiet();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                runAway();
            }


        });
    }
    private void beQuiet()
    {


        tvStoryText.setText("You stay still without making a noise, the monster can't detect you and eventually wanders off. What do you do?");
        setAllBtnsVisible();
        btn1.setText("Wait longer");
        btn2.setText("Try to leave");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { waitLonger(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tryToLeave();
            }
        });
    }


    private void investigateNoise() {
        tvStoryText.setText("You investigate the noise and see a horrific eyeless monster in front of you. What do you do?");
        btn1.setText("Stay still and don't make a noise");
        btn2.setText("Try to run away");
        btn3.setText("Throw a rock at it");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beQuiet();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                runAway();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                throwRock();
            }


        });
    }

    private void throwRock()
    {


        tvStoryText.setText("You throw a rock at the monster, he responds by brutally beating you to death");
        btn3.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);

        btn1.setText("Continue");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });




    }

    private void runAway()
    {

        tvStoryText.setText("While you're running away you notice the monster catching up. What do you do?");
        btn1.setText("Attack the monster");
        btn2.setText("Run west");
        btn3.setText("Keep running");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attackMonster();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                runWest();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                keepRunning();
            }


        });
    }

    private void keepRunning()
    {


       tvStoryText.setText("The monster catches up and kills you. You died");
        btn3.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);

        btn1.setText("Continue");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });



    }

    private void runWest()
    {

        ivStory.setImageResource(R.drawable.im_sengsambat_tunnel);
        tvStoryText.setText(" You run west and find a cave, there are two tunnels in front of you. What do you do");
        btn1.setText("Hide in left tunnel");
        btn2.setText("Hide in right tunnel");
        btn3.setText("Hide behind a rock");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftTunnel();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rightTunnel();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                hideBehindRock();
            }


        });

    }

    private void hideBehindRock()
    {


        tvStoryText.setText("You hide behind the rock and see it walk past you, you can use this as your chance to escape. What do you do?");
        btn1.setText("Make a run for it");
        btn2.setText("Walk silently out");
        btn3.setText("Attack the monster");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOut();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                walkSilently();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                attackMonster();
            }


        });
    }

    private void runOut()
    {


        tvStoryText.setText("You try to run out of the cave but the monster chases you and kills you. You died");
        btn3.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);

        btn1.setText("Continue");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { defeat(); }
        });



    }
    private void walkSilently()
    {

        tvStoryText.setText("You walk silently out of the cave and make it out the forest without the monster noticing");
        btn3.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);

        btn1.setText("Continue");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { endAdventure(); }
        });


        endAdventure();
    }
    private void leftTunnel()
    {
        tvStoryText.setText("The monster headed to the right tunnel and couldn't find you. What do you do?");

        setAllBtnsVisible();
        btn1.setText("Stop hiding and try to leave");
        btn2.setText("Hide for longer");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { stopHiding(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideForLonger();
            }
        });
    }
    private void rightTunnel()
    {


        tvStoryText.setText("The monster headed to the right tunnel and found you. You died");

        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setText("Continue");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }

        });
    }
    private void hideForLonger()
    {


        tvStoryText.setText("The monster wanders off somewhere far and you leave safely");

        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setText("Continue");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                endAdventure();
            }

        });


    }
    private void stopHiding()
    {


        int leaveResult = (int) (1 + Math.random()*100);
        if (leaveResult <= 50)
        {
            tvStoryText.setText("The monster wanders off somewhere far and you leave safely");

            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setText("Continue");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                endAdventure();
            }
        });


        }
        else
        {
            tvStoryText.setText("You walk into the monster again and it eats you.  You died.");

            btn1.setText("Continue");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    defeat();
                }

            });


        }
    }
    private void attackMonster()
    {

        tvStoryText.setText("What will will you attack it with");
        setAllBtnsVisible();
        btn1.setText("Gun");
        btn2.setText("Knife");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { useGun(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                useKnife();
            }
        });
    }

    private void useGun()
    {


        int shootResult = (int) (1 + Math.random()*100);
        if (shootResult <= 50)
        {
            tvStoryText.setText("You shoot the monster and it dies. You escaped the forest");
            btn3.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);

            btn1.setText("Continue");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    endAdventure();
                }
            });


            endAdventure();

        }
        else
        {
            tvStoryText.setText("Oh no! your gun ends up jamming and the monster eats you.");
            btn3.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);

            btn1.setText("Continue");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }
            });

        }
    }


    private void useKnife()
    {


        tvStoryText.setText("You try to attack it with a knife but it isn't very effective, it angers the monster and you die a horrible painful death");
        btn3.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);

        btn1.setText("Continue");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });



    }






    private void endAdventure()
    {


        tvStoryText.setText("You have won! Try again?");

        start();

    }

    private void defeat()
    {
        //run method when defeated

        //lose a life
        //numLives--;
        numAttempts--;



        //clear console, display text, etc


        //System.out.println(...)
        tvStoryText.setText("You failed to survive, you now have " + numAttempts + " attempts left");


        //determine if player gets to play again
        if (numAttempts > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else
        {
            //print game over message


            tvStoryText.setText("Game over! you ran out of attempts");
        }
    }
}
