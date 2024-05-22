package com.poly.polyapcsafinalproject23_24;

import java.util.Scanner;

public class GameMcGuinnessMichael extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    private boolean isDude;
    private int points;
    //private Player player; (optional)


    public void run()
    {
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        Util.clearConsole();
        System.out.println("Hit on Hot person");
        System.out.println("You see an hot person. You think the look really good and you want to get their number. What do you do?");

        Util.pauseConsole();
        start();
    }

    private void start()
    {
        points = 0;
        //start adventure here

        //set points = 0      ask mr burke

        System.out.println("""
    What do you want to do?
    1. Use one of your top tier pickup lines
    2. Use Comedy
    3. Smolder
     """);

        int option = Util.enterInt(1,3);
        if (option == 1)
        { //pickup line
            points += 100;
            lines();
        }
        else if (option == 2)
        { //comedy
            points += 200;
            comedy();
        }
        else if (option == 3)
        { //smolder line 65
            points += 300;
            smolder();
        }

    }

    //SMOLDER PATH
    private void smolder() {
        Util.clearConsole();
        System.out.println("""
    How do you want to smolder?
    1. Smolder into the distance
    2. Smolder at them
    """);
        int option = Util.enterInt(1,2);
        if (option == 2)
        { //smolder at them
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

        else if (option == 1)
        { //smolder into distance
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
    }

    private void noticeYou() {
        System.out.println("""
          They notice you and they are intrigued by the smoldering. They aproach you. What do you do?
          1. Break the stance and ask for their number
          2. Say nothing. Smolder even harder
          """);
        int option = Util.enterInt(1,2);
        if (option == 1)
        {
            System.out.println("You break the look and try to ask for their number but your voice cracks and you sound like an elderly goose. They are disgusted and lose all interest in you");
            points -= 25;
            defeat();
        }
        else if (option == 2)
        {
            System.out.println("You don't react to them approaching you. They are about to talk to you but get intimidated by the intensity of the look on your face. They are about to leave but suddenly you smolder harder. They fall apart and cant belive how powerful you look. They write down their number and stick it in your pocket and whisper 'call me' in your ear before walking away. ");
            points += 575;
            success();

        }
    }

    //comedy path
    private void comedy() {
        Util.clearConsole();
        System.out.println("""
    What joke do you want to use?
      1. I just got rid of my vacuum cleaner. It sucked.
      2. Cosmetic surgery use to be such a touchy subject. Now you talk about botox and nobody raises an eyebrow.
      """);
        int option = Util.enterInt(1,2);
        if (option == 1) { //vacuum
            points += 25;
            weird();
        }
        else if (option == 2) { //botox
            points += 50;
            if (Math.random() > 0.5) {
                System.out.println("They think you are insulting their appearance. They yell at you for being misogynistic and superficial and walk away");
                points -= 15;
                defeat();

            }
            else {
                botox();
                //line 160- ***
            }

        }
    }

    private void botox() {
        System.out.println("They ask you if you think that they actually look like they have gotten work done. What do you respond? \n1. Be nice and tell them they are beautiful \n2. Tell them they look like Caitlyn Jenner");
        int option = Util.enterInt(1,2);
        if (option == 1){
            System.out.println("They think you're sweet and they give you their number");
            points += 115;
            success();
        }

        else {
            System.out.println("They start yelling at you and start calling you terrible names and storm away in disgust. You probably meant Kylie or Kendall but now you blundered it");
            points -= 30;
            defeat();
        }

    }

    private void weird() {
        points += 10;
        System.out.println("""
        They think you are trying to be funny and laugh a bit uncomfortably. This is your last chance, what do you say?
          1. How does a hot dog show apreciation? It franks you
          2. When does Thor like pop rap? When it's hammer time
          """);
        int option = Util.enterInt(1,2);
        if (option == 1){
            System.out.println(" They feel bad for you and give you their number out of pity");
            points += 3;
            success();

        }

        else {
            System.out.println("They are visibly not interested. they tell you they have a boyfriend");
            points += 8;
            defeat();
        }


    }

    //Pickup Lines path
    private void lines() {
        Util.clearConsole();
        System.out.println("""
    Which of your top tier pickup lines do you want to use?
    1. Do you live in a corn field? Beacuse I'm stalking you
    2. I just pooped in my bed, can I sleep in yours?
    """);
        int option = Util.enterInt(1,2);
        if (option == 1) {
            color();
        }

        else {
            weird();
        }
    }

    private void color() {
        System.out.println("""
        They are kind of scared of you. They ask you what color their car is to see if you actually are stalking them. How do you respond?
        1. Blue
        2. Brown
        3. Ignore the question and try another pickup line
          """);
        int option = Util.enterInt(1,3);
        if (option == 1) {
            System.out.println("OMG you guessed correct! They call the cops on you and you go to prison for a long time. YOU LOSE! You don't get another chance. GAME OVER!");
            points -= 350;
            numLives -=5;
            System.out.println("You got " + points + " points");
        }
        else if (option == 2){
            confuse();
        }
        else {
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
    }

    private void confuse() {
        System.out.println("You are wrong and they are really confused. Last chance. What do you do? \n1. Cry\n2. Tell them you love them");
        int option = Util.enterInt(1,2);
        if (option == 1) {
            System.out.println("You start crying. They take pity on you and give you their number.");
            points += 7;
            success();
        }
        else {
            System.out.println("You tell them you love them. They get visibly disgusted. They tell you they have a boyfriend and walk away. Now you start to cry for real.");
            points -= 13;
            defeat();
        }
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
        Util.pauseConsole();
        start();
    }

    private void displayPoints()
    {
        System.out.println("Points:\t" + points);
    }

}