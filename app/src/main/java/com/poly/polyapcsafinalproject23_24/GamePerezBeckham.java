package com.poly.polyapcsafinalproject23_24;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GamePerezBeckham extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
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
        ivStory.setImageResource(R.drawable.im_perezbeckham_kidwalking);



        tvStoryText.setText("GET TO YOUR FRIENDS HOUSE SAFE!");



        tvStoryText.setText("On your way to the house you decide to eat a chocolate bar.What will you do with the wrapper?");


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
        ivStory.setImageResource(R.drawable.im_perezbeckham_wrapperintrash);


        tvStoryText.setText("THROW WRAPPER IN TRASH");

        tvStoryText.setText("!");

        tvStoryText.setText(" What will you do next ?");

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
        ivStory.setImageResource(R.drawable.im_perezbeckham_wrapperpocket);

        tvStoryText.setText("You put the wrapper in your pocket.");

        tvStoryText.setText("\n! A Wild lion that just escaped the zoo smells the wrapper in you pocket and charges straight at you,what do you do?");



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
        ivStory.setImageResource(R.drawable.im_perezbeckham_runfromlion);


        tvStoryText.setText("You Ran from lion");

        tvStoryText.setText("\n! The lion  is chasing you as you approach a big wall,what do you do?");



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
        ivStory.setImageResource(R.drawable.im_perezbeckham_runaroundwall);

        tvStoryText.setText("You ran around the wall");


        tvStoryText.setText("The lion was way faster than you and caught you way before you made it around. ");

        defeat();
    }




    private void jumpWall()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_jumpwall);

        tvStoryText.setText("You jumped the wall");

        tvStoryText.setText("\n! The lion scratches you on your way over the wall leaving you with a big wound on you leg,what do you do?");



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
        ivStory.setImageResource(R.drawable.im_perezbeckham_medicaltreatment);

        tvStoryText.setText("You got medical treatment");

        tvStoryText.setText("\n! Great choice they patched you up lickity split and were on your way in less than 5 minutes!! ");



        tvStoryText.setText("YOU WIN");

        start();
    }


    private void keepWalking()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_keepwalking);

        tvStoryText.setText("You Keeped Walking");


        tvStoryText.setText("You collapsed from blood loss! ");

        defeat();
    }






    private void standGround()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_standground);

        tvStoryText.setText("You stood your ground");

        tvStoryText.setText("\n! The lions Bites you right were your pocket is leaving you a flesh wound, what do you do next?");



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
        ivStory.setImageResource(R.drawable.im_perezbeckham_sitinpain);

        tvStoryText.setText("You sat in pain");


        tvStoryText.setText("You sat in pain until you bleed out! ");

        defeat();
    }


    private void goToHospital()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_hospital);

        tvStoryText.setText("You go to the hospital");

        tvStoryText.setText("\n! The doctors inform you, you got a bad infection from the lion bite, what do you do next?");


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
        ivStory.setImageResource(R.drawable.im_perezbeckham_nomerdic);

        tvStoryText.setText("You denied any medical assistance");


        tvStoryText.setText("You Died due to the infection and blood loss! ");

        defeat();
    }

    private void walkItOff()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_walkitoff);

        tvStoryText.setText("You Walk it off");

        tvStoryText.setText("\n! Somehow walking helped and you were cured!! ");



        tvStoryText.setText("YOU WIN");

        start();
    }



    private void amputateLeg()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_oneleg);

        tvStoryText.setText(" You cut off your leg");


        tvStoryText.setText("The procedure went worng!!");

        defeat();
    }










    private void throwWrapperOnStreet()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_streettrash);

        tvStoryText.setText("Throw wrapper on Street");

        tvStoryText.setText(" You threw the wrapper on the street and the Sheriff saw you, what do you do next? ");



        btn1.setText("Run from the Sherrif");
        btn2.setText("Hide in a bush");
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
        ivStory.setImageResource(R.drawable.im_perezbeckham_sheriffrun);

        tvStoryText.setText("You run from the sheriff.");

        tvStoryText.setText("\nYou find a weapon with blood on it, what do you do?");



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
        ivStory.setImageResource(R.drawable.im_perezbeckham_bushhide);


        tvStoryText.setText("The Sheriff found you quite easily!");

        defeat();
    }

    private void talkWithSheriff()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_sherifftalk);


        tvStoryText.setText("You stayed and Talked with the sheriff");

        tvStoryText.setText("\n He try's to put you in hand cuffs, what do you do next?");



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
        ivStory.setImageResource(R.drawable.im_perezbeckham_freedom);

        tvStoryText.setText("You Ran");

        tvStoryText.setText("\n There is a fence in front of your escape route with a yard on the other side, what do you do?");


        btn1.setText("Jump over fence");
        btn2.setText("Avoid fence by going around");
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
        ivStory.setImageResource(R.drawable.im_perezbeckham_jumpfence);

        tvStoryText.setText("You Jumped the fence.");


        tvStoryText.setText("A pitbull named cupcake took you out! ");

        defeat();
    }


    private void aroundFence()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_aroundfence);

        tvStoryText.setText("You ran around the fence.");

        tvStoryText.setText("\n You escaped the police and see a penny on the ground, what do you do?");


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
        ivStory.setImageResource(R.drawable.im_perezbeckham_leavepenny);

        tvStoryText.setText("You did not grab the penny.");

        tvStoryText.setText("\n! Great choice you countinued the journey and reached your friend house!! ");



        tvStoryText.setText("YOU WIN");

        start();
    }



    private void pickUpPenny()
    {
        ivStory .setImageResource(R.drawable.im_perezbeckham_pickpenny);

        tvStoryText.setText("You pick up the Penny.");


        tvStoryText.setText("It was tails side up and a brick comes out of nowhere and hit you on the head.");

        defeat();
    }


    private void getArrested()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_kidarrested);


        tvStoryText.setText("You got Arrested.");


        tvStoryText.setText("You did not make it to your friends house");

        defeat();
    }

    private void grabWeapon()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_pickupweapon);

        tvStoryText.setText("You grabbed the Weapon.");


        tvStoryText.setText("You were caught holding a weapon with blood on it!");

        defeat();
    }


    private void noTouchWeapon()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_leaveweapon);

        tvStoryText.setText("You did not grab the weapon");

        tvStoryText.setText(" Great choice!! ");



        tvStoryText.setText("YOU WIN");

        start();
    }







    private void giveHome()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_givehome);

        tvStoryText.setText("Give homeless man money");

        tvStoryText.setText(" A homless man asks for 5 dollars and you refuse then he starts to square up, what do you do?");


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
        ivStory.setImageResource(R.drawable.im_perezbeckham_misstrash);

        tvStoryText.setText("THROW WRAPPER IN TRASH");

        tvStoryText.setText("\nYou miss the trash and hear sirens, what do you do next? ");


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
        ivStory.setImageResource(R.drawable.im_perezbeckham_talkpolice);

        tvStoryText.setText("You Talk to police");

        tvStoryText.setText("\n! While talking to police you notice some white stuff on the ground, what do you do next? ");



        btn1.setText("Touch the stuff");
        btn2.setText("Choose not to touch it");
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
        ivStory.setImageResource(R.drawable.im_perezbeckham_runpolice);

        tvStoryText.setText("Run from Police");


        tvStoryText.setText("WHY WOULD YOU RUN FROM THE POLICE");

        defeat();

    }

    private void touchStuff()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_touchstuff);


        tvStoryText.setText("Touch the White stuff");


        tvStoryText.setText("The police arrest you on the spot");

        defeat();
    }
    private void dontTouchStuff()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_leavestuff);

        tvStoryText.setText("Leave the white stuff Alone");


        tvStoryText.setText("The police see the white stuff and arrest you because you look suspicous");

        defeat();
    }







    private void callFriend()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_callfriend);

        tvStoryText.setText("Call friend");

        tvStoryText.setText("\n You called your friend great choice! ");



        tvStoryText.setText("YOU WIN");

        start();
    }


    private void fight()
    {
        ivStory.setImageResource(R.drawable.im_perezbeckham_homelessfight);


        tvStoryText.setText("You Lost the fight");
        defeat();

    }



    private void defeat()
    {


        setAllBtnsVisible();
        btn1.setText("Play again");
        btn2.setText("Back to menu");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GamePerezBeckham.this, MainActivity.class));
            }
        });

    }
}

