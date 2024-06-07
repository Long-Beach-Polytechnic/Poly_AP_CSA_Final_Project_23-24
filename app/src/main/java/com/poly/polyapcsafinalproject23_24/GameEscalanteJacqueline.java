package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;
import com.poly.polyapcsafinalproject23_24.R;

import java.util.Scanner;

public class GameEscalanteJacqueline extends GameActivity {

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;

    private Button btn1, btn2, btn3;
    private int numLives;

    private boolean isWon;



    public void run() {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);


        tvTitle.setText("PATHWAYS");
        tvSubtitle.setText("Poly Edition");

        ivStory.setImageResource(R.drawable.im_escalantejacqueline_choicefair);


        numLives = 4;
        start();
    }

        private void setAllBtnsVisible()
        {
            btn1.setVisibility(TextView.VISIBLE);
            btn2.setVisibility(TextView.VISIBLE);
            btn3.setVisibility(TextView.VISIBLE);

        }


    private void start()
    {
        tvStoryText.setText(" PATHWAYS -  POLY EDITION\nIts Choice Fair day, lets go!\nWhat pathway would you like to go to?");

        ivStory.setImageResource(R.drawable.im_escalantejacqueline_choicefair);
        setAllBtnsVisible();
        btn1.setText("BEACH");
        btn2.setText("PARTS");
        btn3.setText("MEDS");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToBeach();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPARTS();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToMeds();
            }
        });



    }
    //BEACH PATHWAY PATH
    private void goToBeach()
    {
      ivStory.setImageResource(R.drawable.im_escalantejacqueline_beachpathway);
        tvStoryText.setText("\nWhat Beach Strand would you like to enroll in?");
       btn1.setText(" Enroll in Engineering");
       btn2.setText("Enroll in Computer Science");
       btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enrollinEngineering();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enrollinComputerScience();
            }
        });

    }

    private void enrollinEngineering()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_engineering);
        tvStoryText.setText("\nYou have a choice, what do you do?");
        btn1.setText("  Go to EDD");
        btn2.setText("Go to Intro to design");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoEdd();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoIntrotoDesign();
            }
        });



    }
    private void gotoEdd()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_enginerringclass);
        tvStoryText.setText("You go to EDD with Ms.Echerri but you can't draw.You fail the class.");

        defeat();
    }
    private void gotoIntrotoDesign()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_introtodesign);
        tvStoryText.setText("You go to Intro to Design with Ms.Mulvaney, She loves you! but you never do the work.");

        defeat();
    }
    private void enrollinComputerScience()
    {

        tvStoryText.setText("\n You have a choice, what do you do?");
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_compsciandstudents);
        btn1.setText("Go to AP CSA");
        btn2.setText("Go to Intro to Computer Science");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoAPCSA();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoIntroToCS();
            }
        });

    }
    private void gotoIntroToCS()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_introtocompsci);
        tvStoryText.setText("You go to Intro to Computer Science with Mr.LaVecchio. You hate doing scratch and never attend class.");

        defeat();
    }
    private void gotoAPCSA()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_compsciclass);
        tvStoryText.setText("Your in AP CSA with Mr.Burke. You dont want to do the Choose you adventure project, so he calls Campus Security to kick you out.");

        defeat();
    }

    //PArts PATHWAY PATH
    private void goToPARTS()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_partspath);
        tvStoryText.setText("\nWhat PArts Strand would you like to enroll in?");
        btn1.setText("Enroll in Video and Photography");
        btn2.setText("Enroll in Digital Arts");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enrollinVideoandPhoto();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enrollinDigitalArts();
            }
        });

    }
    private void enrollinVideoandPhoto()
    {

        tvStoryText.setText("\nYou have a choice, what do you do?");
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_partspath);
        tvStoryText.setText("\nWhat PArts Strand would you like to enroll in?");
        btn1.setText("Go to Intro to Video");
        btn2.setText("Go to Theatre Arts");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoIntrotoVideo();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoTheatreArts();
            }
        });


    }
    private void gotoIntrotoVideo()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_introtovidclass);
        tvStoryText.setText("You go to Intro to Video with Ms.Stringer, but you don't own a camera.");

        defeat();
    }
    private void gotoTheatreArts()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_classdrama);
        tvStoryText.setText("You go to Theatre Arts with Ms.Bon but dont like improv.");

        defeat();
    }
    private void enrollinDigitalArts()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_digitalartsclass);
        tvStoryText.setText("\nYou have a choice, what do you do?");

        btn1.setText("Go to Ms.Vang");
        btn2.setText("Go to Ms.Laztin");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoIntrotoDrawing();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoCeramics();
            }
        });

    }
    private void gotoIntrotoDrawing()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_introtodraw);
        tvStoryText.setText("You are in Intro to Drawing,but you always color outside the lines :(." );

        defeat();
    }
    private void gotoCeramics()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_ceramics);
        tvStoryText.setText("Welcome to Ceramics with Laztin, You suck at Pottery...BYEEEEE FELISHAAAA." );

        defeat();
    }

    //MEDS PATHWAY PATH
    private void goToMeds()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_medspath);
        tvStoryText.setText("\nWhat MEDS Strand would you like to enroll in?");

        btn1.setText("Enroll in Patient Mental Health");
        btn2.setText("Enroll in Patient Physical Health");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enrollinPMH();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enrollinPPH();
            }
        });

    }
    private void enrollinPMH()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_medspath);
        tvStoryText.setText("\nYou have a choice, what do you do?");
        btn1.setText("Go to Health and Career Exploration");
        btn2.setText("Go to Mental and Behavioral Health Pro INT");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoHCE();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMBHPI();
            }
        });

    }
    private void gotoHCE()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_healthcarecareerex);
        tvStoryText.setText("You are in Health and Career Exploration, but Mr.Gray wants you to leave because your a class clown." );

        defeat();
    }
    private void gotoMBHPI()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_mentalbehaveclass);
        tvStoryText.setText("Welcome to MBHPI! You intern at a PSYCH WARD, but the patient is BFFS with Chucky." );

        defeat();
    }
    private void enrollinPPH()
    {

         ivStory.setImageResource(R.drawable.im_escalantejacqueline_patientmentalhealthclass);
        tvStoryText.setText("\nYou have a choice, what do you do?");
        btn1.setText("Go to Healthcare Admin Tech");
        btn2.setText("Go to Medical Occuption");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoHAT();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMO();
            }
        });

    }
    private void gotoHAT()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_healthcareadmin);
        tvStoryText.setText("You are in Healthcare Admin Tech!!! You think you are getting a raise from the hospital you intern at but you get fired!!!" );

        defeat();
    }

    private void gotoMO()
    {
        ivStory.setImageResource(R.drawable.im_escalantejacqueline_medicalocc);
        tvStoryText.setText("Welcome to Medical Occupation! You are working with Ms.Sawyer to get your CNA certifcate but you dropped out." );

        defeat();
    }



    private void defeat()
    {
        numLives--;
        //run method when defeated.

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //determine if player gets to play again
                if (numLives > 0)
                {
                    //if you still have lives, return to start()
                    tvStoryText.setText("Play again!");
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            start();
                        }
                    });
                }
                else
                {
                    //print game over message
                    tvStoryText.setText("Try a new pathway");
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            start();
                        }
                    });
                }
            }
        });


    }
}