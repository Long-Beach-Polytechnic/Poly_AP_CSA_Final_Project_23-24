package com.poly.polyapcsafinalproject23_24;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameContrerasSarai extends GameActivity {

    private int numLives;
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
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

        tvTitle.setText("VISIT TO ANIMAL SAFARI");
        tvSubtitle.setText("High School Edition");
        numLives = 5;
        start();
    }

    private void setAllBtnsVisible() {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
    }

    public void start() {
        isWon = false;
        ivStory.setImageResource(R.drawable.im_contrerassarai_safarititle);

        tvStoryText.setText("While visiting the safari you will be met with different situations. Hopefully you make the right choices to make this visit fun!!");
        tvStoryText.setText("Now that you've entered the safari, you are introduced with your tour group. You are supposed to stay with them at all time during the visit. The guide lady asks - What animal section would you like to visit first?");

        setAllBtnsVisible();
        btn1.setText("Go to the lions");
        btn2.setText("Go to the elephants");
        btn3.setText("Go to the giraffes");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLions();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToElephants();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToGiraffes();
            }
        });

    }

    //____LION PATH____
    private void goToLions() {
        ivStory.setImageResource(R.drawable.im_contrerassarai_lionsone);
        tvStoryText.setText("You chose the lions, you see a cute family laying by the water so you decide to take a picture with the cool lions!");

        setAllBtnsVisible();
        btn1.setText("Just take a picture from a safe distance");
        btn2.setText("Go a little closer for a much better angle");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                safePhoto();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                riskyPhoto();
            }
        });
    }

    private void safePhoto() {
        tvStoryText.setText("You decide to just stay away, not wanting to risk it. Now how would you like this picture?");
        ivStory.setImageResource(R.drawable.im_contrerassarai_farlions);

        setAllBtnsVisible();
        btn1.setText("Take a selfie with them?");
        btn2.setText("Just a picture of the lions by themselves");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lionSelfie();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lionsPic();
            }
        });
    }


    private void riskyPhoto() {
        ivStory.setImageResource(R.drawable.im_contrerassarai_liontwo);

        tvStoryText.setText("You are now closer to the lions :o what would you decide?");

        setAllBtnsVisible();
        btn1.setText("Take a closer and cooler selfie with the lions");
        btn2.setText("Change your mind and decide to just observe?");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                betterSelfie();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                observeLions();
            }
        });

    }


    private void lionSelfie() {
        isWon = false;
        tvStoryText.setText("While trying to take the picture the bystanders around start walking by blocking your picture and making the lions walk away. Tough luck");
        ivStory.setImageResource(R.drawable.im_contrerassarai_blockedlions);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });

    }

    private void lionsPic() {
        isWon = false;
        System.out.println("...Kind of a boring picture, I mean it would have been much cooler if you posted a selfie with lions. Boringgg Yawnnn!");
        ivStory.setImageResource(R.drawable.im_contrerassarai_lionyawn);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });

    }

    private void betterSelfie() {
        ivStory.setImageResource(R.drawable.im_contrerassarai_lionselfie);

        tvStoryText.setText("Wow! Such a good picture! You'll definitely get a lot of likes. But obviously something had to happen");
        tvStoryText.setText("After you take your amazing picture, one of the lions unexpectedly roars making you jump and drop your phone in the process... so clumsy. But most importantly, what are you going to do?");

        setAllBtnsVisible();
        btn1.setText(" Go get your phone duh!");
        btn2.setText("Just leave it there");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rescuePhone();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abandonPhone();
            }
        });
    }


    private void observeLions() {
        isWon = false;
        tvStoryText.setText("You decide to observe the lions but one seems to make straight eye contact with you... so nervous you don't think of looking away making it jump and launch at you. Rip!");
        ivStory.setImageResource(R.drawable.im_contrerassarai_lionlaunch);
    }

    private void rescuePhone() {
        ivStory.setImageResource(R.drawable.im_contrerassarai_lostphone);


        tvStoryText.setText("You decide to go rescue your phone hopefully being saved from your mom's scolding. Thankfully the phone is not that close to the lions so how are you going to decide to approach the situation?");

        setAllBtnsVisible();
        btn1.setText("Make a run for it - be as quick as the flash");
        btn2.setText("Move slow and steady - like a ninja");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runToPhone();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slowToPhone();
            }
        });
    }

    private void abandonPhone() {
        isWon = false;
        tvStoryText.setText("Your group starts walking away and not wanting to be left behind you go follow them, leaving your phone with the dear lions and a big scolding from your mom when you get home");
        ivStory.setImageResource(R.drawable.im_contrerassarai_abandonedphone);
    }

    private void runToPhone() {
        isWon = false;
        tvStoryText.setText("You make a run for it making the lions go on mode alert to see what's the sudden movement, you don't even realize you are being chased until you feel a scratch on your leg... ouch!");
        ivStory.setImageResource(R.drawable.im_contrerassarai_lionattack);
    }

    private void slowToPhone() {
        isWon = true;
        tvStoryText.setText("You take the safe way and move slowly towards your phone, always keeping your eye on the pride of lions a few feet away. Once you use your ninja skills to grab the phone and walk back slow and steady you make it back with your group safe and sound. Hooray!");
        System.out.println("Play Again??");
        ivStory.setImageResource(R.drawable.im_contrerassarai_lioncheer);
    }

    //ELEPHANTS!!!
    private void goToElephants() {

        ivStory.setImageResource(R.drawable.im_contrerassarai_elephantsone);

        tvStoryText.setText("Your group decides to go visit the Elephants, how exciting! Your guide lets you know that you guys will be feeding the elephants and afterwards just observe while she gives fun facts. but she gives a warning... Will you remember it? Choose correctly");

        setAllBtnsVisible();
        btn1.setText("Feed Elephants");
        btn2.setText("Observe the elephants");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feedElephants();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                observeElephants();
            }
        });
    }

    private void feedElephants() {
        ivStory.setImageResource(R.drawable.im_contrerassarai_choosefood);

        tvStoryText.setText("You decide to go feed the elephants so the guide gives you two types of food - choose wisely, remember elephants are biggg animals");

        setAllBtnsVisible();
        btn1.setText("Feed them peanuts");
        btn2.setText("Feed them lemons");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feedPeanuts();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feedLemons();
            }
        });
    }

    private void feedPeanuts() {
        isWon = true;
        tvStoryText.setText("You chose the correct answer congrats! You hold out the peanuts in your hand as the elephants slowly approaches you, he takes a sniff of it proceding to eat it with his trunk. You made the elephant happy and the guide congradulates you - Good Job!!");
        ivStory.setImageResource(R.drawable.im_contrerassarai_elephantspeanuts);
    }

    private void feedLemons() {

        isWon = false;
        tvStoryText.setText("Wrong answer... The elephants takes the lemons in his trunks and after a few seconds he's running around the area like crazy, you move away being close to getting stomped. ELephants hate lemons! The guide gets you in trouble for not asking before feeding so now you're sad and the elephant is mad");
        ivStory.setImageResource(R.drawable.im_contrerassarai_wrongfood);
    }

    private void observeElephants() {
        ivStory.setImageResource(R.drawable.im_contrerassarai_observeelephants);

        tvStoryText.setText("While standing and observing the amusing elephants you hear some people talking really loudly, actually more like screaming. Right when you turn around you see a monkey running at full speed with what seemed to be a purse in his hands. You see the poor stressed lady trying to get her purse back. What will you decide, be a hero or just act like you didn't see anything?");

        setAllBtnsVisible();
        btn1.setText("Chase the running monkey");
        btn2.setText("Just stay observing the animals");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chaseMonkey();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stayObserving();
            }
        });
    }

    private void chaseMonkey() {
        isWon = false;
        tvStoryText.setText("You choose to chase the thief of that monkey, once you catch up taking the purse back, the monkey continues running scared. You go back to give the lady her purse but then get framed of being apart of it accussing you of stealing her money. It will be a veryyy long day");
        ivStory.setImageResource(R.drawable.im_contrerassarai_thiefmonkey);
    }

    private void stayObserving() {
        isWon = false;
        tvStoryText.setText("You zone out and lose the group you were with, they are no where is sight, you wasted so much time you didn't realize they left to other animal sections. After what felt forever you find the group but get in trouble with the guide...");
        ivStory.setImageResource(R.drawable.im_contrerassarai_upsetguide);
    }

    //GIRAFFES!!!
    private void goToGiraffes() {
        ivStory.setImageResource(R.drawable.im_contrerassarai_giraffesone);

        tvStoryText.setText("Your guide takes you to the giraffe section, you see the tall giraffes eating leaves, how cute! The guide offers two options: participate in a giraffe quiz or decide to pass. What will you choose");

        setAllBtnsVisible();
        btn1.setText("Participate in quiz");
        btn2.setText("Nah pass");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takeQuiz();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noQuiz();
            }
        });
    }

    private void takeQuiz() {

        ivStory.setImageResource(R.drawable.im_contrerassarai_giraffequiz);

        tvStoryText.setText("You take the quiz, fun! Alright so there are two questions, which one do you want to take?");

        setAllBtnsVisible();
        btn1.setText("What color are giraffes' tongues?");
        btn2.setText("Average how many years do giraffes' live?");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                giraffeTongue();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                giraffeYears();
            }
        });

    }

    private void giraffeTongue() {

        ivStory.setImageResource(R.drawable.im_contrerassarai_giraffetongue);

        tvStoryText.setText("You choose question number one: What color is a giraffe's tongue?");

        setAllBtnsVisible();
        btn1.setText("Purple");
        btn2.setText("Pink");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                purpleAnswer();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pinkAnswer();
            }
        });

    }

    private void purpleAnswer() {
        isWon = true;
        tvStoryText.setText("You are 100% correct, their tongues are a purple black-ish color due to their diet. Congrats You Win!!");
        ivStory.setImageResource(R.drawable.im_contrerassarai_purpleanswer);
    }

    private void pinkAnswer() {
        isWon = false;
        tvStoryText.setText("...Wrong, come on now this was an elementary school level question. You lose!");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }


    private void giraffeYears() {
        ivStory.setImageResource(R.drawable.im_contrerassarai_giraffetwo);

        tvStoryText.setText("You choose question number two: In average how many years does a giraffe live?");

        setAllBtnsVisible();
        btn1.setText("40 years");
        btn2.setText("25 years");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourtyYears();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentyFiveYears();
            }
        });

    }

    private void noQuiz() {
        isWon = false;
        tvStoryText.setText("You have to be the most boring person alive. Booo tomato tomato");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void fourtyYears() {
        isWon = false;
        tvStoryText.setText("Wrong!! According to google usually giraffes live around 25 years. Good luck next time!\nPlay Again?");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }


    private void twentyFiveYears() {
        isWon = true;
        System.out.println("Correct!! According to google usually giraffes live around 25 years. Sadly not thattt long");
        ivStory.setImageResource(R.drawable.im_contrerassarai_giraffetwo);
    }

    private void end() {
        if (isWon) {
            tvStoryText.setText("Its a safari trip miracle! You get to live the whole day over again!");

            ivStory.setImageResource(R.drawable.im_contrerassarai_giraffeage);
        } else {
            numLives--;
            String text = "You wasted an entire trip at the safari visit. You have " + numLives + " visits remaining";
            tvStoryText.setText(text);
        }

        if (numLives > 0) {
            btn1.setText("Play again!");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start();
                }
            });
        }
        else {
            tvStoryText.setText("Safari trip is over. Permanent Game over.");
            btn1.setText("Back to menu");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(GameContrerasSarai.this, MainActivity.class));
                }
            });

        }
    }
}