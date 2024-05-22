package com.poly.polyapcsafinalproject23_24;

import java.util.Scanner;
public class GamePinedaJavier extends GameActivity {
    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
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
        System.out.println("\nFIFA CAREER!");

        System.out.println("Welcome to your fifa career where YOU, the player gets to choose what you do to have a succesful career. There are MULTIPLE endings to this game. Can you find them all???");
        Util.pauseConsole();
        System.out.println();
        Util.clearConsole();
        start();
    }
    private void start()
    {
        //start adventure here

        //create an Adventure object

        Util.pauseConsole();
        System.out.println("\nYou just got signed to LAFC, whats your way of celebrating?");
        System.out.println("1. Go party with fam and friends\n2. Train seriously\n3. show off on social media");
        int choice = Util.enterInt(1,3);

        if (choice == 1)
        {
            party();
        }
        else if (choice == 2)
        {
            train();
        }
        else if (choice == 3)
        {
            showOff();
        }

    }


    private void party()
    {
        Util.clearConsole();
        System.out.println("You have a party with your loved ones and decide you want to drink. yuhhh");
        System.out.println("\nWho are you drinking with to celebrate your achievment?");
        System.out.println("1. Drink with fam\n2. drink with friends");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            drinkWithFam();
        }
        else if (choice == 2)
        {
            drinkWithFriends();
        }
    }



    private void drinkWithFam()
    {
        Util.clearConsole();
        System.out.println("\nYou are drinking with fam and you get very sentimental :(");
        System.out.println("1. Give half your check to your mom\n2. tell your brother he's making it with you one day");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            momProud();
        }
        else if (choice == 2)
        {
            motivateBrother();
        }
    }

    private void momProud()
    {
        Util.clearConsole();
        System.out.println("She was so proud and thankful that she brought Lionel Messi to the party!!!!!!  *GOAT ENDING* ");
        Util.pauseConsole();
        defeat();
    }
    private void motivateBrother()
    {
        Util.clearConsole();
        System.out.println("You mad him so happy that he brought Lionel Messi to the party yuhhhh!! *GOAT ENDING* ");
        Util.pauseConsole();
        defeat();
    }
    private void drinkWithFriends()
    {
        Util.clearConsole();
        System.out.println("You decide to drink with your friends!");
        System.out.println(" But one of your friends drank a little TOO much and is now telling you to do some weird things.");
        System.out.println("1. Fight brother\n2. Talk smack to your brother, say that he inst going to be good as you.");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            fightBrother();
        }
        else if (choice == 2)
        {
            talkSmackBrother();
        }
    }
    private void fightBrother()
    {
        Util.clearConsole();
        System.out.println("You start fighting your brother and the fight gets intense... until bro really smacked you with a glass bottle. *DEAD ENDING* ");
        Util.pauseConsole();
        defeat();
    }

    private void talkSmackBrother()
    {
        Util.clearConsole();
        System.out.println(" You talk smack to your brother and bro just does a finshing move on you.    You got the Dead Ending");
        Util.pauseConsole();
        defeat();
    }
    private void train()
    {
        Util.clearConsole();
        System.out.println("You decide to train hard to make it to the top.. I like it");
        System.out.println(" You go to the training grounds and see your brother and a team member. Who do you train with?");
        System.out.println("1. Train with Brother\n2. Train with teammate  *hint he has experience*");

        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            trainWithBrother();
        }
        else if (choice == 2)
        {
            trainWithMember();
        }
    }



    private void trainWithMember()
    {
        Util.clearConsole();
        System.out.println("You decide to train with a teammate  *good choice*");
        System.out.println("While you were training with him, YOU get offers from international teams!!");
        System.out.println("1. Argentina\n2. France \n3. Mexico");
        int choice = Util.enterInt(1,3);

        if (choice == 1)
        {
            argentina();
        }
        else if (choice == 2)
        {
            france();
        }
        else if (choice == 3)
        {
            mexico();
        }
    }
    private void argentina()
    {
        Util.clearConsole();
        System.out.println("You took the Argentina offer *GREAT YOU PLAYED WITH LIONEL MESSI* but only twice. You were basiaclly benched your whole career and only won the Copa America   *GOOD ENDING* ");
        Util.pauseConsole();
        defeat();
    }

    private void france()
    {
        Util.clearConsole();
        System.out.println("You got signed but never in your career did you play a game. Theu even won the world cup without you :(  *WASTED PONTENTIAL ENDING* ");
        Util.pauseConsole();
        defeat();
    }

    private void mexico()
    {
        Util.clearConsole();
        System.out.println("You joined Mexico and you made history by carrying Mexico to the World Cup final and WINNING! You also win countless other trophies   *GREAT ENDING* ");
        Util.pauseConsole();
        defeat();
    }



    private void trainWithBrother()
    {
        Util.clearConsole();
        System.out.println("So basically..... your brother doesn't know how to play soccer and made you terrible. While he was quote on quote training you. There was scouts in the training grounds and just thought you were playing for fun  *GOOFY ENDING* ");
        Util.pauseConsole();
        defeat();
    }

    private void showOff()
    {
        Util.clearConsole();
        System.out.println("You go to your instagram to show off. What do you do?");
        System.out.println("1. show off your money\n2. Show off your skills");
        int choice = Util.enterInt(1,2);

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
        Util.clearConsole();
        System.out.println("You show off your money and got instant popularity. Whats your next viral clip? *dont mess this up*");
        System.out.println("1.Throw a microwaved honeybun at a homeless\n2. Donate to charity");
        int choice = Util.enterInt(1,2);

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
        Util.clearConsole();
        System.out.println("Damn you thought that was funny *it was* but people didn't like that!  *CANCELLED ENDING* ");
        Util.pauseConsole();
        defeat();
    }
    private void donateCharity()
    {
        Util.clearConsole();
        System.out.println("People saw your amazing video and will always love you!  *POPULAR ENDING* ");
        Util.pauseConsole();
        defeat();
    }
    private void showSkills()
    {
        Util.clearConsole();
        System.out.println("People saw your video and everyone now thinks you're the next messi! Now companies want to sponser you! What company do you choose?");
        System.out.println("1.Under Armour\n2.Nike");
        int choice = Util.enterInt(1,2);

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
        Util.clearConsole();
        System.out.println("No one likes under armour bruh. Now everyone thinks you weird lol. *FORGOTTEN ENDING*");
        Util.pauseConsole();
        defeat();
    }
    private void nike()
    {
        Util.clearConsole();
        System.out.println("People loveee your new drip. Now everyone is going to buy nike thanks to you.  *POPULAR ENDING* ");
        Util.pauseConsole();
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
            Util.clearConsole();
            start();

        }
        else
        {
            //print game over message
            System.out.println("GAME OVER");
        }
    }
}