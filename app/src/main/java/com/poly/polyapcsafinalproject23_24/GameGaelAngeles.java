package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameGaelAngeles extends GameActivity{
    import java.util.Scanner;

    public class Adventure{

        private TextView tvTitle, tvSubtitle, tvStoryText;
        private ImageView ivStory;
        private Button btn1, btn2, btn3, btn4;
        private boolean isWon;

        //instance variables
        //   variables you plan to use throughout the adventure
        private Scanner scan;
        private int numLives;
        //private Player player; (optional)

        @Override
        protected void run()
        {
            setContentView(R.layout.activity_game_4_button);

            tvTitle = findViewById(R.id.tv_title_txt);
            tvSubtitle = findViewById(R.id.tv_subtitle);
            tvStoryText = findViewById(R.id.tv_story);
            ivStory = findViewById(R.id.iv_story);
            btn1 = findViewById(R.id.btn_1);
            btn2 = findViewById(R.id.btn_2);
            btn3 = findViewById(R.id.btn_3);

            tvTitle.setText("Protect The President");

            numLives = 5;
            start();
        }

        private void setAllBtnsVisible()
        {
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);
        }


        public void run()
        {
            //initialize number of lives
            numLives = 5;
            //create a scanner object for user input
            scan = new Scanner(System.in);

            //create a player object (optional)
            //player = new Person(...)

            //display project title and description
            Util.clearConsole();
            System.out.println("Protect The President");
            System.out.println("Your objective is to protect the president. Find routes were you think is safe for the president to go through. Good Luck!!");

            Util.pauseConsole();
            start();
        }

        private void start()
        {
            isWon = false;

            ivStory.setImageResource(R.drawable.im_laborday_title);
            playAudio(R.raw.audio_bass);

            tvStoryText.setText("");

            setAllBtnsVisible();
            btn1.setText("Richard Nixon");
            btn2.setText("John F Kennedy");
            btn3.setText("William McKinley");
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) { richardNixon(); }
                                    });
            //start adventure here
            System.out.println("Story");
            System.out.println("options\n1. Richard Nixon\n2. John F Kennedy\n3. William McKinley");
            int option = Util.enterInt(1,3);

            if (option == 1)
            {
                nixon();
            }
            else if (option == 2)
            {
                kennedy();
            }
            else if (option == 3)
            {
                william();
            }
        }



        //______Nixon Path________
        private void nixon()
        {
            Util.clearConsole();
            System.out.println("\nYou chose President Richard Nixon. Choose the best place were Nixon is at.");
            System.out.println("1. Go to a Back Alley way \n2. Go to a police station");
            int option = Util.enterInt(1,2);

            if (option == 1)
            {
                backAlley();
            }
            else if (option == 2)
            {
                policeStation();
            }
        }

        //______Police Statiion Path______
        private void policeStation()
        {
            Util.clearConsole();
            System.out.println("\nYou chose to go to a police station you stay there until back up arives. But there is a officer that wants to help. What should you do?");
            System.out.println("1. Stay at the police station \n2. Talk to a officer");
            int option = Util.enterInt(1,2);

            if (option == 1)
            {
                safe();
            }
            else if (option == 2)
            {
                officer();
            }
        }

        //______Officer Path______
        private void officer()
        {
            System.out.println("You chose to talk to the officer. You find out the officer is corrupt and hates President Nixon and draws out his weapon and kill you and Nixon.");
            Util.pauseConsole();
            defeat();
        }

        //______Stay At Police Station Path______
        private void safe()
        {
            Util.clearConsole();
            System.out.println("\nYou chose to stay at the police station and now you are safe.");
            Util.pauseConsole();
        }

        //______Back Alley Path______
        private void backAlley()
        {
            Util.clearConsole();
            System.out.println("\nYou see a harmless homeless guy seem nice. Then next to him there is a sketchy guy near him. Go up to one of them if they could help you out.");
            System.out.println("1. Go up to the Homeless Guy \n2. Go up to the Skechy Guy");
            int option = Util.enterInt(1,2);

            if (option == 1)
            {
                homelessGuy();
            }
            else if (option == 2)
            {
                sketchyGuy();
            }
        }

        //______Homeless Guy Path______
        private void homelessGuy()
        {
            Util.clearConsole();
            System.out.println("You chose to go up to the Homeless Guy. He asks for money, you refuse to give money. The homeless gets mad pulls out a gun and shoots you and President Nixon.");
            Util.pauseConsole();
            defeat();
        }

        //______Sketchy Guy Path______
        private void sketchyGuy()
        {
            Util.clearConsole();
            System.out.println("You chose to go up to the Sketchy Guy. He gives you fentanyl with out you knowing. You start to combolse and die of overdose and the homeless guy shoots President Nixon.");
            Util.pauseConsole();
            defeat();



        }



        //______Kennedy Path______
        private void kennedy()
        {
            Util.clearConsole();
            System.out.println("You chose John F Kennedy protect him. Choose the right path and he lives.");
            System.out.println("1. Go Through a nieghborhood \n2. Go through a city");
            int option = Util.enterInt(1,2);

            if (option == 1)
            {
                neighborhood();
            }
            else if (option == 2)
            {
                city();
            }

        }

        //______Neighborhood Path______
        private void neighborhood()
        {
            Util.clearConsole();
            System.out.println("You chose to go through a neighborhood. You Kennedy got shot in the head while driving down the ");
            Util.pauseConsole();
            defeat();
        }

        //______City Path______
        private void city()
        {
            Util.clearConsole();
            System.out.println("You chose the city path. Its crowded with many people. The presidnet and you blend with the people. You find a safe place and wait for escorts to be taken to the white house.");
            Util.pauseConsole();
        }



        //______William Path______
        private void william()
        {
            Util.clearConsole();
            System.out.println("You chose William McKinley protect him. A man walks up to the president he wants to shake his hand. Choose if the president should shake his hand or not.");
            System.out.println("1. Shake the mans hand \n2. Don't shake the mans hand");
            int option = Util.enterInt(1,2);

            if (option == 1)
            {
                dontShakeManHand();
            }
            else if (option == 2)
            {
                shakeManHand();
            }
        }

        //______Don't Shake Man Hand Path______
        private void dontShakeManHand()
        {
            Util.clearConsole();
            System.out.println("You tell the president not to shake his hand. The president turns his back on the man. You noticed something strange about the man you see him taking a gun out. He shoots you jump in front of the bullet saving the president.");
            Util.pauseConsole();
        }

        //______Shake Man Hand Path______
        private void shakeManHand()
        {
            Util.clearConsole();
            System.out.println("You tell the president to shake his hand. The president shakes the mans hand and dies with 2 bullets in his chest.");
            Util.pauseConsole();
            defeat();
        }


        private void defeat()
        {
            //run method when defeated


            //lose a life
            numLives--;

            //clear console, display text, etc
            System.out.println("...");

            //determine if player gets to play again
            if (numLives > 0)
            {
                //if you still have lives, return to start()
                start();
            }
            else
            {
                //print game over message
                System.out.println("!!!Womp Womp You Lose!!!");
            }




        }
    }
}
