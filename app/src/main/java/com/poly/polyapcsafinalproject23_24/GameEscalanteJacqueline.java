import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameEscalanteJacqueline extends GameActivity {

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;

    private Button btn1, btn2, btn3;

    private boolean isWon;



    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)


    public void run() {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_strong);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);


        tvTitle.setText("PATHWAYS");
        tvSubtitle.setText("Poly Edition");


        numLives = 4;
        start();
        }

        private void setAllBtnsVisable()
        {
            btn1.setVisibility(TextView.VISIBLE);
            btn2.setVisibility(TextView.VISIBLE);
            btn3.setVisibility(TextView.VISIBLE);

        }



        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Person(...)

        //display project title and description
        Util.clearConsole();
        System.out.println("---PATHWAY CHOICE FAIR---");
        System.out.println("...Poly's annual choice fair for pathways that are looking for you !...");

        Util.pauseConsole();
        start();
    }

    private void start()
    {
        Util.clearConsole();
        System.out.println(" PATHWAYS -  POLY EDITION");

        System.out.println("\nIts Choice Fair day, lets go!");
        Util.pauseConsole();
        System.out.println("What pathway would you like to go to?");
        System.out.println("1. BEACH\n2. PARTS\n3. MEDS");
        int choice = Util.enterInt(1,3);

        if(choice ==1)
        {
            goToBeach();
        }
        else if (choice == 2)
        {
            goToPARTS();
        }
        else if(choice == 3)
        {
            goToMeds();
        }

    }
    //BEACH PATHWAY PATH
    private void goToBeach()
    {
        Util.clearConsole();
        System.out.println("\nWhat Beach Strand would you like to enroll in?");
        System.out.println("1. Enroll in Engineering\n2. Enroll in Computer Science");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            enrollinEngineering();
        }
        else if(choice == 2);
        {
            enrollinComputerScience();
        }
    }

    private void enrollinEngineering()
    {
        Util.clearConsole();
        System.out.println("\nYou have a choice, what do you do?");
        System.out.println("1. Go to EDD\n2. Go to Intro to design");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            gotoEdd();
        }
        else if (choice == 2)
        {
            gotoIntrotoDesign();
        }
    }
    private void gotoEdd()
    {
        Util.clearConsole();
        System.out.println(" You go to EDD with Ms.Echerri but you can't draw.You fail the class");
        Util.pauseConsole();
        defeat();
    }
    private void gotoIntrotoDesign()
    {
        Util.clearConsole();
        System.out.println(" You go to Intro to Design with Ms.Mulvaney, She loves you! but you never do the work.");
        Util.pauseConsole();
        defeat();
    }
    private void enrollinComputerScience()
    {
        Util.clearConsole();
        System.out.println("\n You have a choice, what do you do?");
        System.out.println("1. Go to AP CSA\n2. Go to Intro to Computer Science");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            gotoAPCSA();
        }
        else if (choice == 2)
        {
            gotoIntroToCS();
        }
    }
    private void gotoIntroToCS()
    {
        Util.clearConsole();
        System.out.println(" You go to Intro to Computer Science with Mr.LaVecchio. You hate doing scratch and never attend class.");
        Util.pauseConsole();
        defeat();
    }
    private void gotoAPCSA()
    {
        Util.clearConsole();
        System.out.println(" Your in AP CSA with Mr.Burke. You dont want to do the Choose you adventure project, so he calls Campus Security to kick you out.");
        Util.pauseConsole();
        defeat();
    }

    //PArts PATHWAY PATH
    private void goToPARTS()
    {
        Util.clearConsole();
        System.out.println("\nWhat PArts Strand would you like to enroll in?");
        System.out.println("1. Enroll in Video and Photography\n2. Enroll in Digital Arts");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            enrollinVideoandPhoto();
        }
        else if(choice == 2);
        {
            enrollinDigitalArts();
        }
    }
    private void enrollinVideoandPhoto()
    {
        Util.clearConsole();
        System.out.println("\nYou have a choice, what do you do?");
        System.out.println("1. Go to Intro to Video\n2. Go to Theatre Arts");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            gotoIntrotoVideo();
        }
        else if (choice == 2)
        {
            gotoTheatreArts();
        }
    }
    private void gotoIntrotoVideo()
    {
        Util.clearConsole();
        System.out.println(" You go to Intro to Video with Ms.Stringer, but you don't own a camera");
        Util.pauseConsole();
        defeat();
    }
    private void gotoTheatreArts()
    {
        Util.clearConsole();
        System.out.println(" You go to Theatre Arts with Ms.Bon but dont like improv");
        Util.pauseConsole();
        defeat();
    }
    private void enrollinDigitalArts()
    {
        Util.clearConsole();
        System.out.println("\nYou have a choice, what do you do?");
        System.out.println("1. Go to Ms.Vang\n2. Go to Ms.Laztin");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            gotoIntrotoDrawing();
        }
        else if (choice == 2)
        {
            gotoCeramics();
        }
    }
    private void gotoIntrotoDrawing()
    {
        Util.clearConsole();
        System.out.println(" You are in Intro to Drawing,but you always color outside the lines :(" );
        Util.pauseConsole();
        defeat();
    }
    private void gotoCeramics()
    {
        Util.clearConsole();
        System.out.println(" Welcome to Ceramics with Laztin, You suck at Pottery...BYEEEEE FELISHAAAA" );
        Util.pauseConsole();
        defeat();
    }

    //MEDS PATHWAY PATH
    private void goToMeds()
    {
        Util.clearConsole();
        System.out.println("\nWhat MEDS Strand would you like to enroll in?");
        System.out.println("1 .Enroll in Patient Mental Health\n2. Enroll in Patient Physical Health");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            enrollinPMH();
        }
        else if(choice == 2);
        {
            enrollinPPH();
        }
    }
    private void enrollinPMH()
    {
        Util.clearConsole();
        System.out.println("\nYou have a choice, what do you do?");
        System.out.println("1. Go to Health and Career Exploration\n2. Go to Mental and Behavioral Health Pro INT");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            gotoHCE();
        }
        else if (choice == 2)
        {
            gotoMBHPI();
        }
    }
    private void gotoHCE()
    {
        Util.clearConsole();
        System.out.println(" You are in Health and Career Exploration, but Mr.Gray wants you to leave because your a class clown" );
        Util.pauseConsole();
        defeat();
    }
    private void gotoMBHPI()
    {
        Util.clearConsole();
        System.out.println(" Welcome to MBHPI! You intern at a PSYCH WARD, but the patient is BFFS with Chucky" );
        Util.pauseConsole();
        defeat();
    }
    private void enrollinPPH()
    {
        Util.clearConsole();
        System.out.println("\nYou have a choice, what do you do?");
        System.out.println("1. Go to Healthcare Admin Tech\n2. Go to Medical Occuption");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            gotoHAT();
        }
        else if (choice == 2)
        {
            gotoMO();
        }
    }
    private void gotoHAT()
    {
        Util.clearConsole();
        System.out.println(" You are in Healthcare Admin Tech!!! You think you are getting a raise from the hospital you intern at but you get fired!!!" );
        Util.pauseConsole();
        defeat();
    }
    private void gotoMO()
    {
        Util.clearConsole();
        System.out.println(" Welcome to Medical Occupation! You are working with Ms.Sawyer to get your CNA certifcate but you dropped out." );
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
            System.out.println("TRY A NEW PATHWAY");
        }

    }
}