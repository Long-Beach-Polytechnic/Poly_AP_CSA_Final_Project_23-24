import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GamePerezAdan extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)
    private TextView tvtitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;
    private int numLives;

    @Override
    protected void run() {}
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivstory = findviewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findviewById(R.id.btn_3);

        tvtitle.setText("")


    public void run()
    {
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Person(...)
        start();
    }

    private void start()
    {

        Util.clearConsole();
        String text = """
      GRADUATED HIGH SCHOOL EDITION

      We graduated high school, lets go!
      """;
        System.out.println(text);

        Util.pauseConsole();

        text = """
      Where would you like to go?
      1. College
      2. Get a job
      3. Stay at parent's house
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,3);

        if (choice == 1)
        {
            college();
        }
        else if (choice == 2)
        {
            getJob();//getJob();
        }
        else if (choice == 3)
        {
            stayAtParents();//stayAtParents();
        }
    }

    private void college()
    {
        Util.clearConsole();
        String text = """
      How are you doing in your classes?
      1. You are doing very well.
      2. You are struggling.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            veryWell();
        }
        else if (choice == 2)
        {
            struggle();//struggle();
        }
    }

    private void veryWell()
    {
        Util.clearConsole();
        String text = """
      Do you keep on doing well in your classes?
      1. Keep doing well.
      2. Lose motivation.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            graduate();
        }
        else if (choice == 2)
        {
            loseMotivation();
        }
    }

    private void loseMotivation()
    {
        Util.clearConsole();
        String text = """
      You are losing motivation and struggling
      """;
        System.out.println(text);
        struggle();
    }



    private void graduate()
    {
        Util.clearConsole();
        String text = """
      Congrats,you graduated! What do you want to do?
      1. Work for a successful company.
      2. Get a normal job.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            System.out.println("You work for a successful company and get paid a lot...YOU WIN!!!");
            Util.pauseConsole();
            System.out.println("Play again!");
            start();
        }
        else if (choice == 2)
        {
            getJob();//getJob();
        }
    }

    private void struggle()
    {
        Util.clearConsole();
        String text = """
      You are struggling and thinking of dropping out...
      1. keep trying.
      2. drop out.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            keepTrying();
        }
        else if (choice == 2)
        {
            dropOut();//dropout();
        }
    }

    private void keepTrying()
    {
        Util.clearConsole();
        String text = """
      You keep on trying does it end up paying off?
      1.Yes,you go on to graduate.
      2.No,you end up dropping out of school.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            graduate();
        }
        else if (choice == 2)
        {
            dropOut();//dropout();
        }
    }


    private void dropOut()
    {
        Util.clearConsole();
        String text = """
      You dropped out of college, what do you do now?
      1.Get a job.
      2.Stay at parent's house.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            getJob();
        }
        else if (choice == 2)
        {
            stayAtParents();//dropout();
        }
    }

    private void getJob()
    {
        Util.clearConsole();
        String text = """
      Where would you like to work at?
      1. A stay at home job that pays good money.
      2. Mcdonalds.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            homeJob();
        }
        else if (choice == 2)
        {
            badJob();//struggle();
        }
    }

    private void homeJob()
    {
        Util.clearConsole();
        String text = """
      You get a big opportunity at the job do you take it?
      1. Yes,and start to get paid millions.
      2. No,but continue to make good money.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            bigOpportunity();
        }
        else if (choice == 2)
        {
            start();//struggle();
        }
    }

    private void badJob()
    {
        Util.clearConsole();
        String text = """
      You start your job but things aren't looking the best
      what do you do?
      1. Get fired for being lazy on the job.
      2. Quit,and go live with your parents.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            jobOrLazy();
        }
        else if (choice == 2)
        {
            stayAtParents();//struggle();
        }
    }

    private void bigOpportunity()
    {
        Util.clearConsole();
        String text = """
      You took it and make a lot of money,but are you smart
      with it?
      1. Yes,and you life live to its best.
      2. No,gamble all your money away.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            System.out.println("You retired early with all the money you made and live life to its best...YOU WIN!!!");
            Util.pauseConsole();
            System.out.println("Play again!");
            start();
        }
        else if (choice == 2)
        {
            stayAtParents();//struggle();
        }
    }

    private void jobOrLazy()
    {
        Util.clearConsole();
        String text = """
      You got fired for being lazy,do you look for another
      job or stay lazy.
      1. No one wants to hire you,stay at parent's house.
      2. Stay lazy and don't look for another job.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            stayAtParents();
        }
        else if (choice == 2)
        {
            start();//struggle();
        }
    }

    private void stayAtParents()
    {
        Util.clearConsole();
        String text = """
      You stay at your parents house, do you help around the
      house?
      1. Yes,you do help around the house.
      2. You do not help around the house and your parent's
         are getting fed up with you.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            helpWithHouse();
        }
        else if (choice == 2)
        {
            parentsFedUp();//struggle();
        }
    }

    private void helpWithHouse()
    {
        Util.clearConsole();
        String text = """
      You help out with the house but do you also cook
      dinner?
      1. Yes,you do chores and dinner.
      2. No,you only do chores.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            makeParentsProud();
        }
        else if (choice == 2)
        {
            chores();//struggle();
        }
    }

    private void makeParentsProud()
    {
        Util.clearConsole();
        String text = """
      They suggest you finally get a job,do you agree with
      them?
      1. Yes,and decide to get a job.
      2. No,and parent's finally have enough of you and kick
         you out.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            getJob();
        }
        else if (choice == 2)
        {
            start();//struggle();
        }
    }

    private void chores()
    {
        Util.clearConsole();
        String text = """
      You start doing chores around the house
      1. Do you continue only doing chores?
      2. You finally give in and also start making dinner
         aswell.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            helpWithHouse();
        }
        else if (choice == 2)
        {
            helpWithHouse();//struggle();
        }
    }

    private void parentsFedUp()
    {
        Util.clearConsole();
        String text = """
      Do you change your mind about helping with the house
      or do you continue to be lazy?
      1. You changed your mind and start helping with the
         house.
      2. You do not and continue to be lazy.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            helpWithHouse();
        }
        else if (choice == 2)
        {
            continueBeingLazy();//struggle();
        }
    }

    private void continueBeingLazy()
    {
        Util.clearConsole();
        String text = """
      You are now kicked out of your parents house what do
      you do?
      1. Live in the streets.
      2. Live in the homeless shelter.
      3. Find a job.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,3);
        if (choice == 1)
        {
            System.out.println("Now you are on the streets");
            Util.pauseConsole();
            start();
        }
        else if (choice == 2)
        {
            start();//struggle();
        }
        else if (choice == 3)
        {
            getJob();
        }
    }

    private void defeat()
    {
        //run method when defeated

    /*
    //lose a life
    //numLives--;

    //clear console, display text, etc
    //System.out.println(...)

    //determine if player gets to play again
    if (numLives > 0)
    {
      //if you still have lives, return to start()
      start();
    }
    else
    {
      //print game over message
    }
    */
    }
}