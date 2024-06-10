package com.poly.polyapcsafinalproject23_24;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameLaborDayAdventure extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
    private boolean isWon;
    private int numLives;

    @Override
    protected void run() {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);


        tvTitle.setText("Get To Friend House Safe");
        tvSubtitle.setText("Make it to your friends house safe");

        numLives = 4;
        start();
    }


    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);

    }



        //create a player object (optional)
        //player = new Player(...)

        //display project title and description




    private void start()
    {



        tvStoryText.setText("GET TO YOUR FRIENDS HOUSE SAFE!");



        tvStoryText.setText("\nOn your way to the house you decide to eat a chocolate bar.What will you do with the wrapper?");


        setAllBtnsVisible();
        btn1.setText("Throw wrapper in trash");
        btn2.setText("Throw wrapper on the street");
        btn3.setText(" Put wrapper in your pocket");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){throwWrapperInTrash();}
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){throwWrapperOnStreet();}
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){putWrapperInPocket();}
        });




    }

    private void throwWrapperInTrash()
    {

        tvStoryText.setText("THROW WRAPPER IN TRASH");

        tvStoryText.setText("\n!");

        tvStoryText.setText("\nOn What will you do next ?");

        setAllBtnsVisible();
        btn1.setText("Give homless man money");
        btn2.setText("Miss the Trash can entirely");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){giveHome();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){missTrash();}
        });


    }

    private void putWrapperInPocket()
    {

        tvStoryText.setText("You put the wrapper in your pocket");

        tvStoryText.setText("\n! A Wild lion that just escaped the zoo smells the wrapper in you pocket and charges straight at you");

        tvStoryText.setText("\nOn What will you do next ?");

        btn1.setText("Run from Lion");
        btn2.setText("Stand your ground");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){runFromLion();}
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {standGround();}
        });


    }


    private void runFromLion()
    {

        tvStoryText.setText("You Ran from lion");

        tvStoryText.setText("\n! The lion  is chasing you as you approach a big wall");

        tvStoryText.setText("\nOn What will you do next ?");

        btn1.setText("Jump over wall");
        btn2.setText("Go around the wall");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {jumpWall();}
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {aroundWall();}
        });




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

        tvStoryText.setText("You jumped the wall");

        tvStoryText.setText("\n! The lion scratches you on your way over the wall leaving you with a big wound on you leg");

        tvStoryText.setText("\n What will you do next ?");

        btn1.setText("Go get medical treatment");
        btn2.setText("Walk it off");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {getTreatmentMedical();}
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {keepWalking();}
        });




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

        tvStoryText.setText("You stood your ground");

        tvStoryText.setText("\n! The lions Bites you right were your pocket is leaving you a flesh wound");

        tvStoryText.setText("\nOn What will you do next ?");

        btn1.setText("Go to the hospital");
        btn2.setText("Sit there moaning in pain");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {goToHospital();}
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {sitInPain();}
        });




    }

    private void sitInPain()
    {

        tvStoryText.setText("You sat in pain");


        tvStoryText.setText("You sat in pain until you bleed out! ");
        tvStoryText.setText();
        defeat();
    }


    private void goToHospital()
    {

        tvStoryText.setText("You go to the hospital");

        tvStoryText.setText("\n! The doctors inform you, you got a bad infection from the lion bite");

        tvStoryText.setText("\nOn What will you do next ?");

        btn1.setText("Cut off your Leg");
        btn2.setText("Try to walk it off");
        btn3.setText("Deny any medical care");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {amputateLeg();}
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {walkItOff();}
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {denyMedical();}
        });


    }

    private void denyMedical()
    {

        tvStoryText.setText("you denied any medical assistance");

        Util.clearConsole();
        tvStoryText.setText("You Died due to the infection and blood loss! ");

        defeat();
    }

    private void walkItOff()
    {

        tvStoryText.setText("You Walk it off");

        tvStoryText.setText("\n! Somehow walking helped and you were cured!! ");



        tvStoryText.setText("YOU WIN");

        start();
    }



    private void amputateLeg()
    {

        tvStoryText.setText(" You cut off your leg");


        tvStoryText.setText("The procedure went worng!!");
        tvStoryText.setText();
        defeat();
    }










    private void throwWrapperOnStreet()
    {

        tvStoryText.setText("Throw wrapper on Street");

        tvStoryText.setText("\n! You threw the wrapper on the street and the Sheriff saw you ");

        tvStoryText.setText("\nOn What will you do next ?");

        btn1.setText("Run from the Sherrif");
        btn2.setText("hide in a bush");
        btn3.setText("Talk to the sheriff");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {runFromSheriff();}
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {hideInBush();}
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {talkWithSheriff();}
        });


    }

    private void runFromSheriff()
    {

        tvStoryText.setText("You run from the sheriff");

        tvStoryText.setText("\n!You find a weapon with blood on it");

        tvStoryText.setText("\nOn What will you do next ?");

        btn1.setText("Grab the weapon");
        btn2.setText("Dont touch the weapon");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {grabWeapon();}
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {noTouchWeapon();}
        });



    }
    private void hideInBush()
    {


        System.out.println("The Sheriff found you quite easily");
        System.out.println();
        defeat();
    }

    private void talkWithSheriff()
    {

        tvStoryText.setText("You stayed and Talked with the sheriff");

        tvStoryText.setText("\n! He try's to put you in hand cuffs");

        tvStoryText.setText("\nOn What will you do next ?");

        btn1.setText("Run for freedom");
        btn2.setText("Allow youself to be arrested");
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {runForFreedom();}
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {getArrested();}
        });



    }


    private void runForFreedom()
    {

        tvStoryText.setText("You Ran");

        tvStoryText.setText("\n! There is a fence in front of your escape route with a yard on the other side");

        tvStoryText.setText("\nOn What will you do next ?");
        btn1.setText("Jump over fence");
        btn2.setText("avoid fence by going around");
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {jumpFence();}
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {aroundFence();}
        });



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

        tvStoryText.setText("You ran around the fence");

        tvStoryText.setText("\n! You escaped the police and see a penny on the ground");

        tvStoryText.setText("\nOn What will you do next ?");
        btn1.setText("Pick up the penny");
        btn2.setText("Leave the penny on the ground");
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {pickUpPenny();}
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {leavePenny();}
        });



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

        tvStoryText.setText("Give homeless man money");

        tvStoryText.setText("\n! A homless man asks for 5 dollars and you refuse then he starts to square up.");

        tvStoryText.setText("\nOn What will you do next ?");
        btn1.setText("Fight Him");
        btn2.setText("Call the homie to help");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {fight();}
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {callFriend();}
        });





    }

    private void missTrash()
    {

        tvStoryText.setText("THROW WRAPPER IN TRASH");

        tvStoryText.setText("\n! You miss the trash and hear sirens ");

        tvStoryText.setText("\nOn What will you do next ?");
        btn1.setText("Talk to the police officers");
        btn2.setText("Run from police");
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {talkToPolice();}
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {runFromPolice();}
        });


    }
    private void talkToPolice()
    {

        tvStoryText.setText("You Talk to police");

        tvStoryText.setText("\n! While talking to police you notice some white stuff on the ground ");

        tvStoryText.setText("\nOn What will you do next ?");

        btn1.setText("Touch the stuff");
        btn2.setText("choose not to touch it");
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {touchStuff();}
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {dontTouchStuff();}
        });



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

