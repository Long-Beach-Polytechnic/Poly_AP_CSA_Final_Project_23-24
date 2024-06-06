package com.poly.polyapcsafinalproject23_24;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameBinghamDaniel extends GameActivity {

    //instance variables
    //variables you plan to use throughout the game
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
    private boolean isWon;
    private int numLives;

    @SuppressLint("SetTextI18n")
    public void run()
    {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);

        ivStory.setImageResource(R.drawable.im_binghamdaniel_plane);
        playAudio(R.raw.audio_binghamdaniel_epic_battle_logo);
        tvTitle.setText("Summer Vacation in Japan");
        tvSubtitle.setText("Dumb Version");

        //initialize number of lives
        numLives = 4;

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description

        playAudio(R.raw.audio_binghamdaniel_lite_saturation);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_airport);
        tvStoryText.setText("You've finished your freshman year of college and decide to treat yourself to a nice summer vacation. " +
                      "You decide to go to Japan because you've always wanted to visit there. What happens next is up to you. Good luck!");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    private void setAllBtnsVisible() {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
    }

    @SuppressLint("SetTextI18n")
    private void start()
    {
        isWon = false;

        ivStory.setImageResource(R.drawable.im_binghamdaniel_map);
        tvStoryText.setText("Time to visit Japan, where do you want to go visit?");

        setAllBtnsVisible();
        btn1.setText("Visit Tokyo");
        btn2.setText("Visit Osaka");
        btn3.setText("Visit Kyoto");
        btn4.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToTokyo();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToOsaka();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToKyoto();
            }
        });
    }

    //___Tokyo 東京 Path___
    private void goToTokyo()
    {
        tvTitle.setText("Tokyo (東京) Path");
        ivStory.setImageResource(R.drawable.im_binghamdaniel_akiba);
        tvStoryText.setText("What do you want to do while you are in Tokyo?");

        playAudio(R.raw.audio_binghamdaniel_wow2);
        setAllBtnsVisible();
        btn1.setText("Head to Akihabara");
        btn2.setText("Go to Tokyo Disneyland");
        btn3.setText("Head to Senso-Ji");
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                akihabara();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disneyLand();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sensoJi();
            }
        });
    }

    //Akihabara Branch
    private void akihabara()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvSubtitle.setText("Akihabara Branch");
        ivStory.setImageResource(R.drawable.im_binghamdaniel_akiba2);
        tvStoryText.setText("What do you do in Akihabara?");

        playAudio(R.raw.audio_binghamdaniel_wow_sound);
        setAllBtnsVisible();
        btn1.setText("Go to a cat cafe");
        btn2.setText("Go to a maid cafe");
        btn3.setText("Embrace your inner otaku/weeb");
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                catCafe();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maidCafe();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beGaijin();
            }
        });
    }

    private void catCafe()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvSubtitle.setText("Akihabara Branch");
        tvStoryText.setText("You have a great time and feel very wholesome petting cats. 猫も可愛いし漫画も読めます");

        playAudio(R.raw.audio_binghamdaniel_meow);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_catcafe);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    private void maidCafe()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvSubtitle.setText("Akihabara Branch");
        ivStory.setImageResource(R.drawable.im_binghamdaniel_maidcafe);
        tvStoryText.setText("You feel like you've committed a great sin, but you did have fun. メイドさんは可愛いすぎて、罪が重ねたかもしれないよ");

        playAudio(R.raw.audio_binghamdaniel_wow2);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void beGaijin()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvSubtitle.setText("Akihabara Branch");
        tvStoryText.setText("You embrace your inner otaku/weeb but then...");

        playAudio(R.raw.audio_binghamdaniel_waterphone_sound);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_weeb);
        setAllBtnsVisible();
        btn1.setText("Another tourist calls you out for cultural appropriation");
        btn2.setText("You decide to buy some manga");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whereItHurts();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                collectionBigger();
            }
        });
    }

    private void whereItHurts()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvSubtitle.setText("Akihabara Branch");
        tvStoryText.setText("You end up punching them in the face, accidentally (right?)");

        playAudio(R.raw.audio_binghamdaniel_punch6_sound);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_punch);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTokyo();
            }
        });
    }

    private void collectionBigger()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvSubtitle.setText("Akihabara Branch");
        tvStoryText.setText("You bought so many manga that you can't read, job well done. ただ僕は読めますから安心してね。いつか日本語上手になるはずだ");

        playAudio(R.raw.audio_binghamdaniel_success);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_manga);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    //Disneyland Branch
    private void disneyLand()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvSubtitle.setText("Disneyland Branch");
        tvStoryText.setText("What are you going to do at Disneyland Tokyo?");

        playAudio(R.raw.audio_binghamdaniel_ambient_piano_logo);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_disney);
        setAllBtnsVisible();
        btn1.setText("Commit a Johnny Somali");
        btn2.setText(" Be a normal tourist (or whatever)");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actLikeSomali();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beTourist();
            }
        });
    }

    private void actLikeSomali()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvSubtitle.setText("Disneyland Branch");
        tvStoryText.setText("You have two options, time to choose your fate:");

        playAudio(R.raw.audio_binghamdaniel_bang);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_somali);
        setAllBtnsVisible();
        btn1.setText("Knocked out and arrested?");
        btn2.setText("You escape but...");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                madaMada();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                surviveAnotherDay();
            }
        });
    }

    private void madaMada()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvSubtitle.setText("Disneyland Branch");
        tvStoryText.setText("As expected, an angry Japanese person knocks you out and you are later arrested for being a public disturbance. まだまだですね");

        playAudio(R.raw.audio_binghamdaniel_punch6_sound);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_somali2);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void surviveAnotherDay()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvSubtitle.setText("Disneyland Branch");
        tvStoryText.setText("Although you are punched in the face, you manage to barely escape. Unfortunately for you, as you are escaping someone trips you and a whole gang of angry people beat you up anyways.");

        playAudio(R.raw.audio_binghamdaniel_downfall3_sound);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_beatdown);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { defeat();}
        });
    }

    private void beTourist()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvSubtitle.setText("Disneyland Branch");
        tvStoryText.setText("You have the time of your life and feel you made a really good decision.");

        playAudio(R.raw.audio_binghamdaniel_success);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_disneytourist);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    //Senso-Ji Branch
    private void sensoJi()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvSubtitle.setText("Senso-Ji Branch");
        tvStoryText.setText("You head over to the extremely famous Senso-Ji temple in Tokyo and...");

        playAudio(R.raw.audio_binghamdaniel_cicadas);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_sensoji);
        setAllBtnsVisible();
        btn1.setText("You are overwhelmed by the crowd");
        btn2.setText("You eat some food and take pictures");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                famousTemple();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                streetStall();
            }
        });
    }

    private void famousTemple()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvSubtitle.setText("Senso-Ji Branch");
        tvStoryText.setText("Overwhelmed by the sheer amount of people present there, you decide to head back to the hotel because you didn't sign up for this.");

        playAudio(R.raw.audio_binghamdaniel_epic_battle_logo);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_crowdedtemple);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void streetStall()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvSubtitle.setText("Senso-Ji Branch");
        tvStoryText.setText("You head to the plethora of street vendors and stalls available near the temple and buy and eat some good food. You take a bunch of pictures and even make an offering at the temple, unfortunately there are way too many people. Either way, you feel like it was a pretty fruitful experience");

        playAudio(R.raw.audio_binghamdaniel_success);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_streetfood);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    //___Osaka 大阪 Path___
    private void goToOsaka()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvStoryText.setText("Alright, what do you want to do in Osaka?");

        playAudio(R.raw.audio_binghamdaniel_ambient_piano_logo);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_osaka);
        setAllBtnsVisible();
        btn1.setText("Go to Dotonbori District");
        btn2.setText("Go to Shinsaibashi-suji Shopping Street");
        btn3.setText("Go to Universal Studios Japan");
        btn4.setText("Go to Osaka Castle");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dotonbori();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shinsaibashi();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                universal();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coolCastle();
            }
        });
    }

    //Dotonbori District Branch
    private void dotonbori()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Dotonbori District Branch");
        tvStoryText.setText("Ok, what do you want to do in Dotonbori?");

        playAudio(R.raw.audio_binghamdaniel_wow_sound);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_dotonbori);
        setAllBtnsVisible();
        btn1.setText("Walk around");
        btn2.setText("Eat some good food and buy some stuff");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takeAStroll();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                consumer();
            }
        });
    }

    private void takeAStroll()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Dotonbori District Branch");
        tvStoryText.setText("You walk around taking in the sights and thinking about life and your vacation so far. Before you can think too much though...");

        playAudio(R.raw.audio_binghamdaniel_waterphone_sound);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_dotonbori2);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                streetInterview();
            }
        });
    }
    private void streetInterview()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Dotonbori District Branch");
        tvStoryText.setText("You encounter a wild street interviewer, what do you do?");

        playAudio(R.raw.audio_binghamdaniel_bang);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_streetinterview);
        setAllBtnsVisible();
        btn1.setText("Use your never before seen skills in the Japanese language");
        btn2.setText("Ignore them and live another day");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hiddenLinguist();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chad();
            }
        });
    }

    private void hiddenLinguist()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Dotonbori District Branch");
        tvStoryText.setText("You use your crazy Japanese to wow and please the interviewer");

        playAudio(R.raw.audio_binghamdaniel_wow_sound);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_japanese);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeSkip();
            }
        });
    }
    private void timeSkip()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Dotonbori District Branch");
        tvStoryText.setText("The interviewer is seriously interested and impressed, unfortunately you are basically stuck answering a million questions. You feel you must escape, what do you do? 4 hours later...");

        playAudio(R.raw.audio_binghamdaniel_scream);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_impatient);
        setAllBtnsVisible();
        btn1.setText("You use rasengan on the interviewer to escape");
        btn2.setText("You slap them like Will Smith to escape");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pissedOff();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                meltingPoint();
            }
        });
    }
    private void pissedOff()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Dotonbori District Branch");
        tvStoryText.setText("Having had enough of the interviewer's endless ramblings you use 螺旋丸, it is effective and the interviewer retreats! I think we can consider this a victory, time to head back to the hotel...");

        playAudio(R.raw.audio_binghamdaniel_success);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_boilingpoint);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToOsaka();
            }
        });
    }
    private void meltingPoint()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Dotonbori District Branch");
        tvStoryText.setText("You've had enough and you land a solid slap on the interviewer's face, Will Smith would be proud. The interviewer and their cameraman quickly retreat, job well done! Time to head back...");

        playAudio(R.raw.audio_binghamdaniel_punch6_sound);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_slap);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToOsaka();
            }
        });
    }

    private void chad()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Dotonbori District Branch");
        tvStoryText.setText("You've seen enough interview videos on YouTube to know where this is going to go, you choose to fight another day. The street interviewer is pissed to say the least. Very wise...");

        playAudio(R.raw.audio_binghamdaniel_epic_battle_logo);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_anotherday);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToOsaka();
            }
        });
    }

    //Shinsaibashi-suji Branch
    private void shinsaibashi()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Shinsaibashi Branch");
        tvStoryText.setText("よし, what do you do in Shinsaibashi-suji?");

        playAudio(R.raw.audio_binghamdaniel_ambient_piano_logo);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_shinsaibashi);
        setAllBtnsVisible();
        btn1.setText("Walk around");
        btn2.setText("Eat some good food and buy lots of stuff");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takeAStroll();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                consumer();
            }
        });
    }

    private void consumer()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Shinsaibashi Branch");
        tvStoryText.setText("You eat some good food and buy a few things along the way. Reality hits like a truck though...");

        playAudio(R.raw.audio_binghamdaniel_wompwomp);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_kaimono);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wentTooFar();
            }
        });
    }
    private void wentTooFar()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Shinsaibashi Branch");
        tvStoryText.setText("You spent too much money even though the food and the stuff you bought was good. I guess this is just a bit of a skill issue problem.");

        playAudio(R.raw.audio_binghamdaniel_wompwomp);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_broke);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    //Universal Studios Japan Branch
    private void universal()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Universal Studios Japan Branch");
        tvStoryText.setText("到着しました, now that you're here, what do you do?");

        playAudio(R.raw.audio_binghamdaniel_ambient_piano_logo);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_universal);
        setAllBtnsVisible();
        btn1.setText("Buy a bunch of souvenirs and merch");
        btn2.setText("Ride the rides and check out the attractions");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obsessedFan();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                feetDead();
            }
        });
    }

    private void obsessedFan()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Universal Studios Japan Branch");
        tvStoryText.setText("OK, you basically buy every plushie and thing you can see because why the heck not, then you realize...");

        playAudio(R.raw.audio_binghamdaniel_bang);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_merch);
        setAllBtnsVisible();
        btn1.setText("How much money you just spent.");
        btn2.setText("That money is not important, happiness is.");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ohCrap();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                revelation();
            }
        });
    }

    private void ohCrap()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Universal Studios Japan Branch");
        tvStoryText.setText("You realize that you just exceeded your budget twofold on this trip, unfortunately that means you will be walking more from here on out.");

        playAudio(R.raw.audio_binghamdaniel_wompwomp);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_broke2);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }
    private void revelation()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Universal Studios Japan Branch");
        tvStoryText.setText("You realize that money hardly matters when you're having fun so you decide to just go along with the flow. Broke as you may be, it's a simple as pressing restart");

        playAudio(R.raw.audio_binghamdaniel_last_piano);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_reset);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    private void feetDead()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Universal Studios Japan Branch");
        tvStoryText.setText("Waiting in lines for hours on end doesn't really make up for the rides, but they were fun so all's good, right? You put in more steps today than you have done in months back home, maybe you lost a few pounds too, wait...");

        playAudio(R.raw.audio_binghamdaniel_downfall3_sound);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_universal2);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    //Osaka Castle Branch
    private void coolCastle()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Osaka Castle Branch");
        tvStoryText.setText("Oh brave soul, what do you do at Osaka Castle?");

        playAudio(R.raw.audio_binghamdaniel_ambient_piano_logo);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_osakacastle);
        setAllBtnsVisible();
        btn1.setText("Take pictures, leaving as quickly as possible");
        btn2.setText("That money is not important, happiness is.");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trueIntrovert();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                extrovert();
            }
        });
    }

    private void trueIntrovert()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Osaka Castle Branch");
        tvStoryText.setText("As an introvert, you avoid spending too much time in this popular place with people everywhere. Who knows if an interviewer will show up out of nowhere or lest you see a popular YouTuber livestreaming");

        playAudio(R.raw.audio_binghamdaniel_last_piano);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_castleintrovert);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    private void extrovert()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvSubtitle.setText("Osaka Castle Branch");
        tvStoryText.setText("You summon your inner courage 勇気 and truly enjoy the sights before you, even a Johnny Somali impersonator/copycat couldn't faze you. What a fulfilling day, now off to your next adventure...");

        playAudio(R.raw.audio_binghamdaniel_epic_battle_logo);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_castle_extrovert);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    //___Kyoto 京都 Path___
    private void goToKyoto()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvStoryText.setText("Now that you're in Kyoto, what are you going to do?");

        playAudio(R.raw.audio_binghamdaniel_ambient_piano_logo);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_kyoto);
        setAllBtnsVisible();
        btn1.setText("Go to Gion District");
        btn2.setText("Go to Fushimi Inari-taisha Shrine");
        btn3.setText("Go to Kyoumizu-dera Temple");
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gion();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                omgShrine();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anotherTemple();
            }
        });
    }

    //Gion Branch
    private void gion()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Gion Branch");
        tvStoryText.setText("You know the drift, now what are you gonna do?");

        playAudio(R.raw.audio_binghamdaniel_bang);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_gion);
        setAllBtnsVisible();
        btn1.setText("Find a geisha");
        btn2.setText("Walk around and admire the views");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                geisha();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stunned();
            }
        });
    }

    private void geisha()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Gion Branch");
        tvStoryText.setText("Ok, so you found a geisha, what are you going to do?");

        playAudio(R.raw.audio_binghamdaniel_wow_sound);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_geisha);
        setAllBtnsVisible();
        btn1.setText("Take a billion pictures");
        btn2.setText("Walk right past");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pictureBomb();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chadOrIdiot();
            }
        });
    }

    private void pictureBomb()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Gion Branch");
        tvStoryText.setText("You procede to take a bunch of pictures, unfortunately you didn't know that you need to get the person's consent first. People around you give you the stare and a nearby police officer notices you...oh crap.");

        playAudio(R.raw.audio_binghamdaniel_waterphone_sound);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_nosy_tourist);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }
    private void chadOrIdiot()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Gion Branch");
        tvStoryText.setText("Ok, I've had enough with all this encapsulation; so many methods. I guess that's why you also just walked past the geisha after looking at them for a few seconds. Not that big of a deal I suppose, feels nice...");

        playAudio(R.raw.audio_binghamdaniel_epic_battle_logo);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_cool_tourist);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToKyoto();
            }
        });
    }

    private void stunned()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Gion Branch");
        tvStoryText.setText("\"Wow\" is the only thing on your mind, so much so that you feel...");

        playAudio(R.raw.audio_binghamdaniel_wow2);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_amazed_tourist);
        setAllBtnsVisible();
        btn1.setText("You're about to awaken something previously inert inside you");
        btn2.setText("Japan is so much better than your home country");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                awakening();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ahMan();
            }
        });
    }

    private void awakening()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Gion Branch");
        tvStoryText.setText("You undergo an epic transformation, what do you awaken?");

        playAudio(R.raw.audio_binghamdaniel_inspirational);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_transformation);
        setAllBtnsVisible();
        btn1.setText("Filthy Frank");
        btn2.setText("Master Oogway");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                filthyWho();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                believe();
            }
        });
    }

    private void filthyWho()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Gion Branch");
        tvStoryText.setText("You unintentionally wreak havoc as you turn into Filthy Frank. Is this a good or bad thing? I don't even know at this point.");

        playAudio(R.raw.audio_binghamdaniel_boom_spam_sound);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_filthy_frank);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToKyoto();
            }
        });
    }
    private void believe()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Gion Branch");
        tvStoryText.setText("Taking inspiration from Master Oogway, you find a suitable place to transcend this plane of existence and turn into flower blossoms. Goodbye world, goodbye cruel world. Wait, that doesn't sound quite right");

        playAudio(R.raw.audio_binghamdaniel_last_piano);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_ascending);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void ahMan()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Gion Branch");
        tvStoryText.setText("You realize you would really like to live in Japan because it is so nice. Is this where the poor college student saga ends? No, this is only the beginning, you can't fall here.");

        playAudio(R.raw.audio_binghamdaniel_last_piano);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_reset);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    //Fushimi Inari-taisha Shrine Branch
    private void omgShrine()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Fushimi Inari-taisha Shrine Branch");
        tvStoryText.setText("Wow, what a nice shrine, what are you going to do here though?");

        playAudio(R.raw.audio_binghamdaniel_cicadas);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_fushimi_shrine);
        setAllBtnsVisible();
        btn1.setText("Walk around and take pictures");
        btn2.setText("Use rasengan on unsuspecting passersby");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                classicTourist();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rasengan();
            }
        });
    }

    private void classicTourist()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Fushimi Inari-taisha Shrine Branch");
        tvStoryText.setText("Nothing quite like just being a regular ol' tourist and walking through and experiencing beautiful places. That's a win in my book, onto the next adventure...");

        playAudio(R.raw.audio_binghamdaniel_success);
        ivStory.setImageResource(R.drawable.im_binghamdaniel_reset_shrine);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }
    private void rasengan()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Fushimi Inari-taisha Shrine Branch");
        tvStoryText.setText("You've had enough of this bulls**t and you use 螺旋丸 on unsuspecting people nearby. Not a good idea since other rasengan users are also present. They all proceed to unleash their rasengan at the same time at you. Utterly defeated, you pack up and head home.");
        ivStory.setImageResource(R.drawable.im_binghamdaniel_rasengan);

        playAudio(R.raw.audio_binghamdaniel_boom_spam_sound);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    //Kiyomizu-dera Temple
    private void anotherTemple()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Kiyomizu-dera Temple Branch");
        tvStoryText.setText("Now that you're at this fine temple on a hill, what do you do?");
        ivStory.setImageResource(R.drawable.im_binghamdaniel_kiyomizu_dera);

        playAudio(R.raw.audio_binghamdaniel_wow2);
        setAllBtnsVisible();
        btn1.setText("Evolve into a Pokemon (don't question it)");
        btn2.setText("Take pictures and then glide down");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evolution();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showOff();
            }
        });
    }

    private void evolution()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Kiyomizu-dera Temple Branch");
        tvStoryText.setText("At this point, you just decide to evolve into a Pokemon, who knows which one but you've seen enough to know which one. You no longer have the ability to speak but hey, you can shoot fireballs and stuff. やばい、これは終わりかもしれないですね");
        ivStory.setImageResource(R.drawable.im_binghamdaniel_evolution);

        playAudio(R.raw.audio_binghamdaniel_bang);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }
    private void showOff()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvSubtitle.setText("Kiyomizu-dera Temple Branch");
        tvStoryText.setText("So you take some pictures and then pull out this crazy wind glider and fly down and away from everyone and everything. You should have seen the looks on people's faces, it was hysterical. What a show-off, eh? I guess it's off to the next destination now.");
        ivStory.setImageResource(R.drawable.im_binghamdaniel_glider);

        playAudio(R.raw.audio_binghamdaniel_downfall3_sound);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    //END OF THE ADVENTURE (良かった、ホントに疲れたんだ)

    private void defeat()
    {
        //run method when defeated
        //lose a life
        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            numLives--;

            //clear console, display text, etc
            playAudio(R.raw.audio_binghamdaniel_game_over);
            tvTitle.setText("YOU LOST A LIFE");
            ivStory.setImageResource(R.drawable.im_binghamdaniel_oh_no);
            String text = "OH CRAP, you died. You have " + numLives + " lives remaining. It's a war zone out there, be careful brave traveler.";
            tvStoryText.setText(text);
            numLives--;

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start();
                }
            });
        }
        else if (numLives == 0)
        {
            //print game over message
            tvTitle.setText("GAME OVER");
            tvSubtitle.setText("0 LIVES REMAINING");
            ivStory.setImageResource(R.drawable.im_binghamdaniel_reflection);
            playAudio(R.raw.audio_binghamdaniel_angelical_pad_sound);
            tvStoryText.setText("Your trip is over. You're done...but if only you had another chance...do you even deserve another chance? Of course you do brave traveler, go get them...");

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn1.setText("Back to menu");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(GameBinghamDaniel.this, MainActivity.class));
                }
            });
        }
    }
}