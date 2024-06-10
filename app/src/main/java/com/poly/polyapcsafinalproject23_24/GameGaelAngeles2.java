package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameGaelAngeles2 extends GameActivity{

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;

    private Button btn1, btn2, btn3;
    private boolean isWon;

    //instance variables
    //   variables you plan to use throughout the adventure
    private int numLives;
    //private Player player; (optional)

    @Override
    protected void run()
    {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("Protect The President");

        numLives = 1;
        start();
    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }

    private void start()
    {
        isWon = false;

        ivStory.setImageResource(R.drawable.jfk_stand_with_other_u_s_presidents_like_nixon_and_mckinley);

        tvStoryText.setText("There is a killer on the loose protect the president!!");

        setAllBtnsVisible();
        btn1.setText("Richard Nixon");
        btn2.setText("John F Kennedy");
        btn3.setText("William McKinley");

        btn1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) { nixon(); }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) { kennedy(); }
        });

        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) { william(); }
        });
    }

    //______Nixon Path________
    private void nixon()
    {
        tvStoryText.setText("You chose President Richard Nixon. Choose the best place were Nixon is safe at.");

        ivStory.setImageResource(R.drawable.jfk_stand_with_other_u_s_presidents_like_nixon_and_mckinley);

        setAllBtnsVisible();
        btn1.setText("Go to Back Alley way");
        btn2.setText("Go to a police station");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) { backAlley(); }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) { policeStation(); }
        });
    }

    //______Police Statiion Path______
    private void policeStation()
    {
        tvStoryText.setText("You chose to go to a police station you stay there until back up arives. But there is a officer that wants to help. What should you do?");

        ivStory.setImageResource(R.drawable.police_station_with_cars);

        setAllBtnsVisible();
        btn1.setText("Stay at the police station");
        btn2.setText("Talk to a officer");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) { safe(); }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) { officer(); }
        });

    }

    //______Officer Path______
    private void officer()
    {
        tvStoryText.setText("You chose to talk to the officer. You find out the officer is corrupt and hates President Nixon and draws out his weapon and kill you and Nixon.");

        ivStory.setImageResource(R.drawable.jfk_talking_to_a_police_offi);

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });

    }

    //______Stay At Police Station Path______
    private void safe()
    {
        tvStoryText.setText("You chose to stay at the police station and now you are safe.");

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    //______Back Alley Path______
    private void backAlley()
    {
        tvStoryText.setText("You see a harmless homeless guy seem nice. Then next to him there is a sketchy guy near him. Go up to one of them if they could help you out.");

        ivStory.setImageResource(R.drawable.dark_alley_way_at_night);

        setAllBtnsVisible();
        btn1.setText("Go up to the Homeless Guy");
        btn2.setText(" Go up to the Skechy Guy");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) { homelessGuy(); }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) { sketchyGuy(); }
        });

    }

    //______Homeless Guy Path______
    private void homelessGuy()
    {
        tvStoryText.setText("You chose to go up to the Homeless Guy. He asks for money, you refuse to give money. The homeless gets mad pulls out a gun and shoots you and President Nixon.");

        ivStory.setImageResource(R.drawable.backalley_with_a_homeless_guy_nightti);

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    //______Sketchy Guy Path______
    private void sketchyGuy()
    {
        tvStoryText.setText("You chose to go up to the Sketchy Guy. He gives you fentanyl with out you knowing. You start to combolse and die of overdose and the homeless guy shoots President Nixon.");

        ivStory.setImageResource(R.drawable.back_alley_with_a_sketchy_guy);

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    //______Kennedy Path______
    private void kennedy()
    {
        tvStoryText.setText("You chose John F Kennedy protect him. Choose the right path and he lives");

        ivStory.setImageResource(R.drawable.president_jfk);

        setAllBtnsVisible();
        btn1.setText("Go Through a nieghborhood");
        btn2.setText("Go through a city");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) { neighborhood(); }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) { city(); }
        });
    }

    //______Neighborhood Path______
    private void neighborhood()
    {
        tvStoryText.setText("You chose to go through a neighborhood. You Kennedy got shot in the head while driving down the ");

        ivStory.setImageResource(R.drawable.car_driving_through_a_nieghborhood);


        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    //______City Path______
    private void city()
    {
        tvStoryText.setText("You chose the city path. Its crowded with many people. The presidnet and you blend with the people. You find a safe place and wait for escorts to be taken to the white house.");

        ivStory.setImageResource(R.drawable.a_street_full_of_people);


        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    //______William Path______
    private void william()
    {
        tvStoryText.setText("You chose William McKinley protect him. A man walks up to the president he wants to shake his hand. Choose if the president should shake his hand or not.");

        ivStory.setImageResource(R.drawable.president_mckinley);

        setAllBtnsVisible();
        btn1.setText("Shake the mans hand");
        btn2.setText("Don't shake the mans hand");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) { dontShakeManHand(); }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) { shakeManHand(); }
        });
    }

    //______Don't Shake Man Hand Path______
    private void dontShakeManHand()
    {
        tvStoryText.setText("You tell the president not to shake his hand. The president turns his back on the man. You noticed something strange about the man you see him taking a gun out. He shoots you jump in front of the bullet saving the president.");

        ivStory.setImageResource(R.drawable.mckinley_doesn_t_shake_someo);

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    //______Shake Man Hand Path______
    private void shakeManHand()
    {
        tvStoryText.setText("You tell the president to shake his hand. The president shakes the mans hand and dies with 2 bullets in his chest.");

        ivStory.setImageResource(R.drawable.mckinley_shaking_someones_han);

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    private void defeat()
    {

        setAllBtnsVisible();
        btn3.setVisibility(View.INVISIBLE);

        //run method when defeated


        //lose a life
        numLives--;

        //clear console, display text, etc

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            start();

            btn1.setText("Play again");
            btn2.setText("Quit");
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
                    startActivity(new Intent(GameGaelAngeles2.this, MainActivity.class));
                }
            });
        }
        else
        {
            //print game over message

            tvStoryText.setText("!!!Womp Womp You Lose!!!");

            btn1.setText("Leeave");

            btn2.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(GameGaelAngeles2.this, MainActivity.class));
                }
            });
        }




    }
}


