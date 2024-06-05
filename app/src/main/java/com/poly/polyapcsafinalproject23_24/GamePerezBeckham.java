package com.poly.polyapcsafinalproject23_24;





public class GameLaborDayAdventure extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure

    private int numLives;
    //private Player player; (optional)


    public void run() {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);

        tvTitle.setText("Make it to your Bros Home");
        tvSubtitle.setText("Be Carefull!");

        //create a scanner object for user input

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description

        System.out.println("Get To Friend House Safe");
        System.out.println("Make it to your friends house safe");


        start();
    }

    private void start()
    {

        System.out.println("GET TO YOUR FRIENDS HOUSE SAFE!");

        System.out.println("\nLets head out, lets go!");

        System.out.println("\nOn your way to the house you decide to eat a chocolate bar.What will you do with the wrapper?");
        System.out.println("1.Throw wrapper in the trash\n2.Throw wrapper on the street\n3.Put wrapper in your pocket");
        int choice = Util.enterInt(1,3);

        if(choice == 1)
        {
            throwWrapperInTrash();
        }
        else if (choice == 2)
        {
            throwWrapperOnStreet();
        }
        else if (choice == 3)
        {
            putWrapperInPocket();
        }
    }

    private void throwWrapperInTrash()
    {

        System.out.println("THROW WRAPPER IN TRASH");

        System.out.println("\n!");

        System.out.println("\nOn What will you do next ?");
        System.out.println("1.Give homeless man money\n2.Miss the trash entirely");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            giveHome();
        }
        else if (choice == 2)
        {
            missTrash();
        }
    }

    private void putWrapperInPocket()
    {

        System.out.println("You put the wrapper in your pocket");

        System.out.println("\n! A Wild lion that just escaped the zoo smells the wrapper in you pocket and charges straight at you");

        System.out.println("\nOn What will you do next ?");
        System.out.println("1.Run \n2.Stand your ground");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            runFromLion();
        }
        else if (choice == 2)
        {
            standGround();
        }
    }


    private void runFromLion()
    {

        System.out.println("You Ran from lion");

        System.out.println("\n! The lion  is chasing you as you approach a big wall");

        System.out.println("\nOn What will you do next ?");
        System.out.println("1.Attempt to jump the wall \n2.Run around wall");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            jumpWall();
        }
        else if (choice == 2)
        {
            aroundWall();
        }
    }

    private void aroundWall()
    {

        System.out.println("You ran around the wall");


        System.out.println("The lion was way faster than you and caught you way before you made it around. ");
        System.out.println();
        defeat();
    }




    private void jumpWall()
    {

        System.out.println("You jumped the wall");

        System.out.println("\n! The lion scratches you on your way over the wall leaving you with a big wound on you leg");

        System.out.println("\n What will you do next ?");
        System.out.println("1.Get medical treatment \n2.Keep on walking to the house");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            getTreatmentMedical();
        }
        else if (choice == 2)
        {
            keepWalking();
        }
    }

    private void getTreatmentMedical()
    {

        System.out.println("You got medical treatment");

        System.out.println("\n! Great choice they patched you up lickity split and were on your way in less than 5 minutes!! ");
        System.out.println();


        System.out.println("YOU WIN");

        start();
    }


    private void keepWalking()
    {

        System.out.println("You Keeped Walking");


        System.out.println("You collapsed from blood loss! ");
        System.out.println();
        defeat();
    }






    private void standGround()
    {

        System.out.println("You stood your ground");

        System.out.println("\n! The lions Bites you right were your pocket is leaving you a flesh wound");

        System.out.println("\nOn What will you do next ?");
        System.out.println("1.Go to the hospital \n2.Sit in pain and yell");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            goToHospital();
        }
        else if (choice == 2)
        {
            sitInPain();
        }
    }

    private void sitInPain()
    {

        System.out.println("You sat in pain");


        System.out.println("You sat in pain until you bleed out! ");
        System.out.println();
        defeat();
    }


    private void goToHospital()
    {

        System.out.println("You go to the hospital");

        System.out.println("\n! The doctors inform you, you got a bad infection from the lion bite");

        System.out.println("\nOn What will you do next ?");
        System.out.println("1.amputate your leg \n2.Walk it off\n3.Deny all medical assistance becuase you dont trust the goverment");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            amputateLeg();
        }
        else if (choice == 2)
        {
            walkItOff();
        }
        else if (choice == 3)
        {
            denyMedical();
        }
    }

    private void denyMedical()
    {

        System.out.println("you denied any medical assistance");

        Util.clearConsole();
        System.out.println("You Died due to the infection and blood loss! ");
        System.out.println();
        defeat();
    }

    private void walkItOff()
    {

        System.out.println("You Walk it off");

        System.out.println("\n! Somehow walking helped and you were cured!! ");
        System.out.println();


        System.out.println("YOU WIN");

        start();
    }



    private void amputateLeg()
    {

        System.out.println(" You cut off your leg");


        System.out.println("The procedure went worng!!");
        System.out.println();
        defeat();
    }










    private void throwWrapperOnStreet()
    {

        System.out.println("Throw wrapper on Street");

        System.out.println("\n! You threw the wrapper on the street and the Sheriff saw you ");

        System.out.println("\nOn What will you do next ?");
        System.out.println("1.Run from the Sheriff\n2.Hide in a bush\n3 Stay and talk to the sheriff ");
        int choice = Util.enterInt(1,3);

        if(choice == 1)
        {
            runFromSheriff();
        }
        else if (choice == 2)
        {
            hideInBush();
        }
        else if (choice == 3)
        {
            talkWithSheriff();
        }
    }

    private void runFromSheriff()
    {

        System.out.println("You run from the sheriff");

        System.out.println("\n!You find a weapon with blood on it");

        System.out.println("\nOn What will you do next ?");
        System.out.println("1.Grab the weapon and hand it the officer  \n2.leave it alone");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            grabWeapon();
        }
        else if (choice == 2)
        {
            noTouchWeapon();
        }
    }
    private void hideInBush()
    {


        System.out.println("The Sheriff found you quite easily");
        System.out.println();
        defeat();
    }

    private void talkWithSheriff()
    {

        System.out.println("You stayed and Talked with the sheriff");

        System.out.println("\n! He try's to put you in hand cuffs");

        System.out.println("\nOn What will you do next ?");
        System.out.println("1.Run\n2.Stay and allow him to arrest you");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            runForFreedom();
        }
        else if (choice == 2)
        {
            getArrested();
        }
    }


    private void runForFreedom()
    {

        System.out.println("You Ran");

        System.out.println("\n! There is a fence in front of your escape route with a yard on the other side");

        System.out.println("\nOn What will you do next ?");
        System.out.println("1.Jump over fence and cut acroos yard\n2.Go arounf fence and yard");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            jumpFence();
        }
        else if (choice == 2)
        {
            aroundFence();
        }
    }

    private void jumpFence()
    {

        System.out.println("You Jumped the fence");


        System.out.println("A pitbull named cupcake took you out! ");
        System.out.println();
        defeat();
    }


    private void aroundFence()
    {

        System.out.println("You ran around the fence");

        System.out.println("\n! You escaped the police and see a penny on the ground");

        System.out.println("\nOn What will you do next ?");
        System.out.println("1.Grab the penny \n2.Leave the penny on the ground");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            pickUpPenny();
        }
        else if (choice == 2)
        {
            leavePenny();
        }
    }

    private void leavePenny()
    {

        System.out.println("You did not grab the penny");

        System.out.println("\n! Great choice you countinued the journey and reached your friend house!! ");
        System.out.println();


        System.out.println("YOU WIN");

        start();
    }



    private void pickUpPenny()
    {

        System.out.println("You pick up the Penny");


        System.out.println("It was tails side up and a brick comes out of nowhere and hit you on the head");
        System.out.println();
        defeat();
    }


    private void getArrested()
    {

        System.out.println("You got Arrested");


        System.out.println("You did not make it to your friends house");
        System.out.println();
        defeat();
    }

    private void grabWeapon()
    {

        System.out.println("You grabbed the Weapon");


        System.out.println("You were caught holding a weapon with blood on it!");
        System.out.println();
        defeat();
    }


    private void noTouchWeapon()
    {

        System.out.println("You did not grab the weapon");

        System.out.println("\n! Great choice!! ");
        System.out.println();


        System.out.println("YOU WIN");

        start();
    }







    private void giveHome()
    {

        System.out.println("Give homeless man money");

        System.out.println("\n! A homless man asks for 5 dollars and you refuse then he starts to square up.");

        System.out.println("\nOn What will you do next ?");
        System.out.println("1.call your friend \n2.Fight");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            fight();
        }
        else if (choice == 2)
        {
            callFriend();
        }
    }

    private void missTrash()
    {

        System.out.println("THROW WRAPPER IN TRASH");

        System.out.println("\n! You miss the trash and hear sirens ");

        System.out.println("\nOn What will you do next ?");
        System.out.println("1.Talk to police\n2.Run from police");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            talkToPolice();
        }
        else if (choice == 2)
        {
            runFromPolice();
        }
    }
    private void talkToPolice()
    {

        System.out.println("You Talk to police");

        System.out.println("\n! While talking to police you notice some white stuff on the ground ");

        System.out.println("\nOn What will you do next ?");
        System.out.println("1.Touch the white stuff\n2.leave the white stuff alone");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            touchStuff();
        }
        else if (choice == 2)
        {
            dontTouchStuff();
        }
    }


    private void runFromPolice()
    {

        System.out.println("Run from Police");


        System.out.println("WHY WOULD YOU RUN FROM THE POLICE");
        System.out.println();
        defeat();

    }

    private void touchStuff()
    {

        System.out.println("Touch the White stuff");


        System.out.println("The police arrest you on the spot");
        System.out.println();
        defeat();
    }
    private void dontTouchStuff()
    {

        System.out.println("Leave the white stuff Alone");


        System.out.println("The police see the white stuff and arrest you becuae you look suspicous");
        System.out.println();
        defeat();
    }







    private void callFriend()
    {

        System.out.println("Call friend");

        System.out.println("\n! You called your friend great choice ");
        System.out.println();


        System.out.println("YOU WIN");

        start();
    }


    private void fight()
    {

        System.out.println("You Lost the fight");
        System.out.println();
        defeat();

    }



    private void defeat()
    {

        System.out.println("Game Over");

        start();

    }
}

