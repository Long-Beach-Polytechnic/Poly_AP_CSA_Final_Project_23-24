package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;

import java.util.Scanner;

public class GameManaloYzabela extends GameActivity
{
    private int numLives;

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
    @Override
    protected void run()
    {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4)

        tvTitle.setText("A PATHETIC SOULMATE QUEST");
        tvSubtitle.setText("TINDER EDITION");

        String text = "A complex game that will make you go \"WHAT JUST HAPPENED?\"." +
                "You navigate the unpredictable world of dating as you encounter four eccentric characters on Tinder." +
                " Each potential match comes with their own quirks,challenges,and unique storylines.Your desperate quest for love leads you through a series of hilarious and unexpected scenarios,forcing you to make choices that will determine the fate of your romantic endeavors. " +
                "Will you end up dead or miserably rotting in a nursing home alone? " +
                "Well, Goodluck! I hope you find love.";
        tvStoryText.setText(text);


        numLives = 5;

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disclaimer();
            }
        });

    }

    private void disclaimer()
    {
        String text = "\nDisclaimer: VIOLENCE and NEGATIVITY\nThis game contains content that may induce frustration,disappointment,and a general sense of negativity. " +
                "Player discretion is advised as you embark in a journey where challenges are designed to be relentless, and success often feels elusive. " +
                "This game is not for the faint of heart and might cause emotional distress. " +
                "Play at your own risk.\n\n      " +
                "EVERYTHING IN THIS GAME IS SATIRE!. " +
                "I BEG YOU NOT TAKE THIS GAME SERIOUSLY.";

        tvStoryText.setText(text);
        setAllBtnsVisible();
        btn1.setText("START");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });

    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
    }


    private void start()
    {
        String title = """
      A PATHETIC SOULMATE QUEST - TINDER EDITION
      """;
        tvStoryTitle.setText(title);


        System.out.println("You are a pathetic lonely human being who decided to find love so you don’t end up dying alone in a nursing home.You decided to scroll through tinder hoping to find your one and only true love to be with and spend your money with during your whole pathetic lowly life. As you were hoping to find a match, you were beguiled by this one particular person and decided to swipe right.");

        String ant = """
      Who would you want to spend the rest of your sad life with?
      """;

      tvStoryText.setText(ant);


        String btn1Text = """1.Ryan Burke
      -High School Teacher with very outstanding Master’s Degree
      -Lives in Long Beach
      -Less than 3 miles away

      """;

        btn1.setText(btn1Text);

        String btn2Text = """
      2.Sofia Ramos
      -Registered Nurse
      -Lives in Long Beach
      -Less than 5 miles away
     """;

        btn2.setText(btn2Text);

        String btn3Text = """
      3.Koichi Hirose
      -Head Chef
      -Lives in Carson
      -Less than 9 miles away
     """;

        btn3.setText(btn3Text);

        String btn4Text = """
      4.Yara Lopez
      -Bartender
      -Lives in Lakewood
      -Less than 16 miles away
     """;

        btn4.setText(btn4Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ryanBurke();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sofiaRamos();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                koichiHirose();

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yaraLopez();

            }
        });
    }

    //..........RYAN BURKE PATH..............................................................
    private void ryanBurke()
    {

        String butterfly =  """
      You saw his profile picture and you were like OMG with a shocked face. How could God let a perfect creature like this roam around. He looked like the perfect match for you and you decided to give it all your shot to make him yours. He messaged you “Good morning, How’s your weekend?”. Your heart skipped a beat and you panicked like a shy anime girl. What should you say back?
      """;
        tvStoryText.setText(butterfly);

        String btn1Text = "1.Send him a very cute pick up line.";
        btn1.setText(btn1Text);

        String btn2Text = "2.Tell him “Bad, because you weren’t with me”. He’ll definitely feel flustered,loved, and wanted.";
        btn2.setText(btn2Text);

        String btn3Text = "3.Ask him if he wants to go to the movies with you.(Be wild, Be straightforward, and Shoot your shot.“He who is not courageous enough to take risks will accomplish nothing in life” - Muhammad Ali.)";
        btn3.setText(btn3Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickUpLine();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                badWeekend();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goMovies();

            }
        });
    }

    //........PICK UP LINE PATH..............................................................
    private void pickUpLine()
    {

        String cat = """
      What pick up line should you send him?
      """;
        tvStoryText.setText(cat);

        String btn1Text = "1.“You look so fine up close than through my binoculars”.";
        btn1.setText(btn1Text);

        String btn2Text = "2.“Baby, my love for you is like diarrhea, I just cannot hold it in”.";
        btn2.setText(btn2Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binoculars();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diarrhea();

            }
        });

    }
    //..........BAD WEEKEND PATH..............
    private void badWeekend()
    {

        String dog = """
      He felt shy when you said that and told you he blushed, What is your next step?
      """;
        tvStoryText.setText(dog);

        String btn1Text = "1.Bribe him to fall in love with you using a pack of dried seaweed.";
        btn1.setText(btn1Text);

        String btn2Text = " 2.Bribe him to fall in love with you using dino nuggets.";
        btn2.setText(btn2Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                giveSeaweed();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                giveDinoNuggets();

            }
        });
    }

    //..........GO TO THE MOVIES PATH.........
    private void goMovies()
    {

        String dog = """
      He agreed to go to the movies with you but you will have to wait outside for him.
      """;
        tvStoryText.setText(dog);

        String btn1Text = "1.Agree to it, Anything for my pretty pink princess.";
        btn1.setText(btn1Text);

        String btn2Text = "2.Disagree to it and know your worth. You don’t deserve to be treated like that.";
        btn2.setText(btn2Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agree();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disagree();

            }
        });
    }
    //.........BINOCULARS PATH................
    private void binoculars()
    {

        String elephant = """
      What's your next step?
      Pick a scenario:)
      """;
        tvStoryText.setText(elephant);

        String btn1Text = "1.He felt threatened like “OMG! For real?” when you told him that. Tell him it’s just a joke.";
        btn1.setText(btn1Text);

        String btn2Text = "2.He got attracted to you and filed a restraining order. Tell him he can’t do that because why would he? Its extra work.";
        btn2.setText(btn2Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                justJoking();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restrainingOrder();

            }
        });
    }
    //.........DIARRHEA PATH...............
    private void diarrhea()
    {

        String fish =  """
      What's your next step?
      Pick a scenario:)
      """;
        tvStoryText.setText(fish);

        String btn1Text = "1.He got attracted to you and filed a restraining order. Tell him he can’t do that because why would he? Its extra work.";
        btn1.setText(btn1Text);

        String btn2Text = "2.He asked you to send proof. You forced yourself to have diarrhea.";
        btn2.setText(btn2Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restrainingOrder();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendProof();

            }
        });
    }
    //.........GIVING SEAWEED PATH............
    private void giveSeaweed()
    {


            String iguana = """
        CONGRATULATIONS! You two are instantly married. Obviously not rotting in a nursing home because seaweed is LIFE!.

        Press \"Play Again\" to play again (definetely try to see other outcomes,It's obviously great)
        """;
          tvStoryText.setText(iguana);

            setAllBtnsVisible();
            btn1.setText("Play Again");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    start();
                }
            });

    }
    //.........GIVING DINO NUGGETS.............
    private void giveDinoNuggets()
    {

        String jaguar =  """
      What's your next step?
      Pick a scenario:)
      """;

        String btn1Text = "1.He said “aww sure”. Give the Dino Nuggets but bite all the heads off to assert dominance.";
        btn1.setText(btn1Text);

        String btn2Text = "2.He said “yayyy”. Give the Dino nuggets because he’s gonna die of hunger already.";
        btn2.setText(btn2Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                biteHead();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                giveDinoNuggetsAlready();

            }
        });
    }
    //.........AGREE TO THE MOVIES PATH........
    private void agree()
    {

        String kangaroo = """
      He admired your desperation for his love.
      """;

        String btn1Text = "1.You approached him and decided to buy popcorn and drinks.";
        btn1.setText(btn1Text);

        String btn2Text = "2.You meet up with him and instantly fainted because you want him to give you a CPR.";
        btn2.setText(btn2Text);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buyPopcorn();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youFainted();

            }
        });

    }
    //.......DISAGREE TO THE MOVIES PATH.......
    private void disagree()
    {

        String lion = "It did not went great, He got furious and told you “Never settling for less,organisms like me deserve princess treatment only” with a smug looking emoji then he blocked you. Obviously rotting in a nursing home because you respect yourself too much.";
        tvStoryText.setText(lion);

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });
    }
    //......JUST JOKING PATH..................
    private void justJoking()
    {

        String monkey = "He took it seriously and he flew to Alaska. You got heartbroken and decided you are going to change for the better. So you followed him to Alaska to be a full-time stalker. Obviously not rotting in a nursing home because you’re ending up in jail.";
        tvStoryText.setText(monkey);
        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });
    }
    //.......RESTRAINING ORDER PATH...........
    private void restrainingOrder()
    {

        String nightingale = TextColor.RED_BOLD_BRIGHT + "He did it anyways and said \"Haha Deserve\". You are now rotting in jail and when your sentence is finished, you are now obviously rotting in a nursing home single and sad.";
        tvStoryText.setText(nightingale);

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });
    }
    //........SEND PROOF PATH.................
    private void sendProof()
    {

        String octopus = TextColor.RED_BOLD_BRIGHT + "He sold it online to creeps and made money out of it. Later on you realize he’s just taking advantage of you because of your poop. Obviously rotting pathetically in a nursing home.";
        tvStoryText.setText(octopus);

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });
    }
    //.........BITE HEAD PATH.............
    private void biteHead()
    {

        String penguin = TextColor.RED_BOLD_BRIGHT + "You are a horrible cook but he ignored that because he thought the way you asserted dominance over him was hot. You got weirded out by his behavior and decided you’d rather be single and rotting in a nursing home.";
        tvStoryText.setText(penguin);
        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });
    }
    //.....GIVE DINO NUGGETS ALREADY PATH.....
    private void giveDinoNuggetsAlready()
    {

        String quail = TextColor.RED_BOLD_BRIGHT + "You are a bad cook. It tasted horrible and he made sure to run to your bed and carpet to vomit. Obviously rotting in a nursing home.";
        tvStoryText.setText(quail);

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });
    }
    //.......BUY POPCORN PATH...............
    private void buyPopcorn()
    {

        String rat = TextColor.GREEN_BOLD_BRIGHT + """
      You were waiting for him patiently for 2 hours and he came out jolly. He told you “The plot twist was so good, Wish you could’ve seen it haha”. He told you afterwards that he could not see anyone as his future partner other than you. Obviously not rotting in a nursing home because you succeed.

      Press \"Play again\" to play again (definitely try to see other outcomes,It's obviously great)
      """;
        tvStoryText.setText(rat);
        setAllBtnsVisible();
        btn1.setText("Play again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });
    }
    //.........YOU FAINTED PATH...............
    private void youFainted()
    {

        String quail = TextColor.RED_BOLD_BRIGHT + "He forgot to brush his teeth so he refused to do it and called 911 instead. Turns out you got diagnosed with Leukemia. You only have 5 years left to live,very sad.Obviously not rotting in a nursing home because you won’t make it. ( Additional 1 live earned because I pity you )";
        tvStoryText.setText(quail);
        numLives++;

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });
    }
    //........................................
    //........................................
    //..........SOFIA RAMOS PATH..............
    private void sofiaRamos()
    {

        String A = """

                PLEASE READ THE FOLLOWING TRIGGERS FOR SOFIA
                (Remember the following hints:This will help you win her heart)
                -Loves the color red
                -Hates going out
                -Hates Rebecca
                -Has shrimp allergy
                -Loves Strawberries
                """;
        tvStoryText.setText(A);

        String yay = """
                You are currently chatting with Sofia and you want to her to  fall in love with you, What should you do?
                """;
        tvStoryText.setText(yay);

        String btn1Text = "1.Tell her you look ugly all the time (She will definitely compliment you more and fall in love with how humble you are).";
        btn1.setText(btn1Text);

        String btn2Text = "2.Tell her you have an orange cat.";
        btn2.setText(btn2Text);

        String btn3Text = "3.Tell her your great great great great grandmother’s tempura recipe.";
        btn3.setText(btn3Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imSoUgly();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orangeCat();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempuraRecipe();

            }
        });
    }
    //.........IM SO UGLY PATH...............
    private void imSoUgly()
    {

        String B = "She got icked by you and decided to block you, You are now single and ugly, waiting for the time you’re going to rot alone in a nursing home.You suck. Obviously rotting in a nursing home.";
        tvStoryText.setText(B);

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });
    }
    //........ORANGE CAT PATH................
    private void orangeCat()
    {
        String C = """
      What's your next step?
      Pick a scenario:)
      """;
        tvStoryText.setText(C);

        String btn1Text = "1.She loves you instantly and invites you over to her house.";
        btn1.setText(btn1Text);

        String btn2Text = "2.You piqued her interest and you decided to ask her if she wants to go out for dinner.";
        btn2.setText(btn2Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                invitesYouOver();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goOutDinner();

            }
        });
    }
    //.........INVITES YOU OVER PATH.........
    private void invitesYouOver()
    {

        String D = """
      What's your next step?
      Pick a scenario:)
      """;

        String btn1Text = "1.Bring over fresh strawberries you stole from the Grocery outlet, dipped in white chocolate.";
        btn1.setText(btn1Text);

        String btn2Text = "2.Surprise her with white roses because you are so the most romantic person in the world.";
        btn2.setText(btn2Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strawberries();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whiteRoses();

            }
        });
    }
    //.........GO OUT DINNER PATH.............
    private void goOutDinner()
    {

        String E =  "She hates going out for dinner but she said sure and ditched you.Obviously rotting in a nursing home.";
        tvStoryText.setText(E);

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });

    }
    //..........STRAWBERRIES PATH.............
    private void strawberries()
    {
        String F =  """
      She liked the strawberries and gave you your first kiss, You win. Obviously not rotting in a nursing home.

      Press \"Enter\" to play again (definitely try to see other outcomes,It's obviously great)
      """;

        tvStoryText.setText(F);

        setAllBtnsVisible();
        btn1.setText("Play Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });

    }
    //..........WHITE ROSES PATH..............
    private void whiteRoses()
    {

        String G =  "She did not like the white roses because red is her favorite color, She buried you in her backyard. Obviously not rotting in a nursing home because you’re dead.";
        tvStoryText.setText(G);
        numLives--;

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });



    }
    //..........TEMPURA RECIPE PATH...........
    private void tempuraRecipe()
    {

        String H = """
      She got mad because she can’t eat shrimp. You try changing the topic and decided to talk about your:
      """;
        tvStoryText.setText(H);

        String btn1Text = "beloved great great great great great great grandmother.";
        btn1.setText(btn1Text);

        String btn2Text = "first crush on kindergarten.";
        btn2.setText(btn2Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                greatGrandma();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aboutCrush();

            }
        });
    }
    //...........GREAT GRANDMA PATH............
    private void greatGrandma()
    {

        String I ="Your great great great great great great grandma’s name is REBECCA!. She poisoned you because she hates Rebecca.Obviously not rotting in a nursing home because you’re dead.";
        tvStoryText.setText(I);
        numLives--;

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });
    }
    //...........ABOUT CRUSH PATH...............
    private void aboutCrush()
    {

        String J =  "She got jealous and devastated when she heard that your crush’s name is REBECCA! She stabbed your kindergarten crush and blamed it on you.Obviously not rotting in a nursing home because you are in jail.";
        tvStoryText.setText(J);
        numLives--;

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });

    }
    //........................................
    //........................................
    //.........KOICHI HIROSE PATH.............
    private void koichiHirose()
    {
        String Aaa = """

      PLEASE READ THE FOLLOWING TRIGGERS FOR KOICHI
      (Remember the following hints:This will help you win his heart)
      -Does not like K-dramas
      -Hates his father
      -Loves birds
      -Scared of heights
      -Always goes to the gym
      -Loves blue
      """;
        tvStoryText.setText(Aaa);

        String yayyay = "You like him and wants to impress him, What should you do?";
        tvStoryText.setText(yayyay);

        String btn1Text = "1.Tell him you like \\\"My Hero Academia\\\" and he looks so Kawaii desu, Also randomly slip \\\"Arigatou Gozaimasu Senpai\\\" during the conversation. (He needs to know that you appreciate his culture).";
        btn1.setText(btn1Text);

        String btn2Text = " 2.Tell him you have 10 sacks of rice in your home. (Bribe him with rice and he’ll definitely fall in love with you, with how much rice you have in your home)";
        btn2.setText(btn2Text);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kawaiiDesu();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rice();

            }
        });
    }
    //..........KAWAII DESU PATH.............
    private void kawaiiDesu()
    {

        String Bbb = """
      He got icked by you but decided to still give you a chance.What should you ask him?
      """;
        tvStoryText.setText(Bbb);

        String btn1Text = "1.Ask him if he wants to go to a rock climbing gym.";
        btn1.setText(btn1Text);

        String btn2Text = "2.Ask him if he wants to eat sushi with maple syrup while watching K-dramas.";
        btn2.setText(btn2Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rockClimbing();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sushi();

            }
        });
    }

    //...........ROCK CLIMBING PATH...........
    private void rockClimbing()
    {
        String Ccc = "He agreed and once you started climbing he cut your rope off and you had a concussion. He managed to make everyone believe that it's your fault somehow because he hates his father. Obviously rotting in a nursing home.";
        tvStoryText.setText(Ccc);
        numLives--;

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });
    }
    //..........SUSHI PATH...................
    private void sushi()
    {

        String Ddd = """
      He got disappointed about watching K-dramas but decided to give it a chance, Which K-drama should you pick?
      """;
        tvStoryText.setText(Ddd);

        String btn1Text = "1.Watch \"Love in the moonlight\"";
        btn1.setText(btn1Text);

        String btn2Text = " 2.Watch \"Come and Hug Me\"";
        btn2.setText(btn2Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loveInTheMoonlight();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comeAndHugMe();

            }
        });
    }

    //.......LOVE IN THE MOONLIGHT PATH.......
    private void loveInTheMoonlight()
    {

        String Eee = "He got mad about the girl not choosing the second lead. He cried for days straight and refused to eat. He eventually died of hunger and its your fault. Obviously rotting in a nursing home with guilt in your heart.";
        tvStoryText.setText(Eee);
        numLives--;

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });
    }
    //........COME AND HUG ME PATH............
    private void comeAndHugMe()
    {
        String Fff = "He has Daddy Issues and got enraged with how the father loves his son. He fed you a tube of wasabi as revenge and you ended up in the hospital. Obviously rotting in a nursing home.";
        tvStoryText.setText(Fff);
        numLives--;

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });

    }
    //.........RICE PATH......................
    private void rice() {

        String Ggg = """
        He fell in love with you instantly because you have so much rice in your house and called you the most attractive person he met.What should you ask him?
        """;

        tvStoryText.setText(Ggg);
        String btn1Text = "1.Ask him if he wants to go to the gym with you.";
        btn1.setText(btn1Text);

        String btn2Text = "2.Ask him how his family is.";
        btn2.setText(btn2Text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goGym();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                family();
            }
        });
      }

      //.........GO GYM PATH....................
      private void goGym()
      {

          String Hhh = """
      You two had fun helping each other.He wants to go on a second date. He asked you to wear red on the second date.
      """;
        tvStoryText.setText(Hhh);

          String btn1Text = "1.Say \"Sure,I will\".";
          btn1.setText(btn1Text);

          String btn2Text = "2.Say you'll wear something else.";
          btn2.setText(btn2Text);

          btn1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  saySure();

              }
          });

          btn2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  somethingElse();

              }
          });
    }
    //..........FAMILY PATH..................
    private void family()
    {

        String Iii = "He got furious that you asked about his family and his father came jumping out of nowhere and overfed you with uncooked rice and you choked.Obviously not rotting in a nursing home because you’re six feet underground.";
        tvStoryText.setText(Iii);
        numLives--;

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });
    }
    //........SAY SURE PATH...................
    private void saySure()
    {

        String Jjj = "He lifted a 100 kg plate and it accidentally fell into your head. Obviously not rotting in a nursing home because you’re dead.";
        tvStoryText.setText(Jjj);
        numLives--;

        setAllBtnsVisible();
        btn1.setText("you Suck");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youSuck();
            }
        });

    }
    //.......SOMETHING ELSE PATH..............
    private void somethingElse()
    {

        String Kkk = """
      He appreciates that you remembered his favorite color is blue. He smelled your armpits and declared you two are officially dating. Obviously not rotting in a nursing home.

      Press \"Enter\" to play again (definitely try to see other outcomes,It's obviously great)
      """;
        tvStoryText.setText(Kkk);

        setAllBtnsVisible();
        btn1.setText("Play Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });
    }
    //........................................
    //........................................
    //.........YARA LOPEZ PATH................
    private void yaraLopez()
    {
        String Antartica = """
      Long story short, you like her and you want to go on a date with her.You want to get closer with her, What should you do?
      """;

       tvStoryText.setText(Antartica);

      1.Ask her about how her day went and before she says something rant to her about how annoying your day was and tell her “Wish you were beside me to comfort me rn” with a cringe pouting emoji.

      2.Tell her you’re very rich in dollars and give her 5 bucks.

      3.Keep telling her to send you pics, girls like it when you force them to because they like getting complimented. Also always do it when it's late at night, when she’s about to sleep.Girls love it when men wants to see their natural beauty.
      """;
        System.out.println(Antartica);
        int choice = Util.enterInt(1,3);

        if (choice == 1)
        {
            cringe();
        }
        else if (choice == 2)
        {
            dollars();
        }
        else if (choice == 3)
        {
            sendPics();
        }
    }
    //.............CRINGE PATH..............
    private void cringe()
    {
        Util.clearConsole();
        String Bahrain = TextColor.CYAN + """
      What's your next step?
      Pick a scenario:)

      1.She said ew disgusting. Respond with “I’m sorry for being so dumb, It’s all my fault, Everything is always my fault”.

      2.She choked on her drink when she read that and asked you if she can come over to cuddle and comfort you.
      """;
        System.out.println(Bahrain);
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            ew();
        }
        else if (choice == 2)
        {
            comeOver();
        }
    }
    //.............EW YUK PATH..............
    private void ew()
    {
        Util.clearConsole();
        String California = TextColor.CYAN + """
      What's your next step?
      Pick a scenario:)

      1.She got pissed so you decided to invite her over to your house to watch movies.

      2.Honestly somethings wrong with her, She didn’t tell me “no it’s not your fault, I was too sensitive”. So you decided to block her

      3.She asked for your phone number. Give her your phone number.

      """;
        System.out.println(California);
        int choice = Util.enterInt(1,3);

        if (choice == 1)
        {
            watchMovies();
        }
        else if (choice == 2)
        {
            blockHer();
        }
        else if (choice == 3)
        {
            giveNumber();
        }
    }
    //..........COME OVER PATH..............
    private void comeOver()
    {
        Util.clearConsole();
        String Denmark = TextColor.RED_BOLD_BRIGHT + "She decided to come over to your house, She cuddled with you and once you went to the bathroom to poop, she immediately took one of each pair of footwear you own and ditched you. Now you have only one piece of footwear with the other ones forever missing. Obviously rotting in a nursing home because you’re pathetic. ";

        System.out.println(Denmark);

        Util.pauseConsole();
        youSuck();
    }
    //........WATCH MOVIES PATH............
    private void watchMovies()
    {
        Util.clearConsole();
        String England= TextColor.RED_BOLD_BRIGHT + "I don’t know why but you suddenly have diarrhea and you rushed to the bathroom. She loosened the seams in all your pants and shorts and ditched you. Now whenever you sit, they rip open.Obviously rotting in a nursing home with ripped pants.";

        System.out.println(England);

        Util.pauseConsole();
        youSuck();
    }
    //.........BLOCK HER...................
    private void blockHer()
    {
        Util.clearConsole();
        String Finland= TextColor.RED_BOLD_BRIGHT + "She was very petty and decided to give mammals like you a lesson. She broke into your house and put prawns in your curtain poles. Your house smelled like rotten garbage for years and you have no idea why so you just sold it because you’re miserable and no one likes your house. You ended up homeless,depressed,and broke. Obviously not rotting in a nursing home because you can’t afford it.";

        System.out.println(Finland);

        Util.pauseConsole();
        youSuck();
    }
    //............GIVE NUMBER PATH..........
    private void giveNumber()
    {
        Util.clearConsole();
        String Ghana= TextColor.RED_BOLD_BRIGHT + "She gave your number to creepy men and therefore you kept getting texts and calls from random men asking for feet and armpit pictures.Obviously and definitely rotting in a nursing home.";

        System.out.println(Ghana);

        Util.pauseConsole();
        youSuck();
    }
    //........DOLLARS PATH...................
    private void dollars()
    {
        Util.clearConsole();
        String Hawaii = TextColor.CYAN + """
      What's your next step?
      Pick a scenario:)

      1.She choked on her drink when she read that and asked you if she can come over to cuddle and comfort you.

      2.She called you broke and you were genuinely hurt and got mad she wasn’t grateful for the 5 bucks.
      Give her a dollar to make it 6 bucks so she’ll be happy.

      3.She got pissed and asked for your Social Security Number.Give her your Social Security Number.


      """;
        System.out.println(Hawaii);
        int choice = Util.enterInt(1,3);

        if (choice == 1)
        {
            comeOver();
        }
        else if (choice == 2)
        {
            broke();
        }
        else if (choice == 3)
        {
            giveSNN();
        }
    }
    //..........BROKE PATH....................
    private void broke()
    {
        Util.clearConsole();
        String Indiana = TextColor.RED_BOLD_BRIGHT + "She decided to come over to your house, She cuddled with you and once you went to the bathroom to poop, she immediately took one of each pair of footwear you own and ditched you. Now you have only one piece of footwear with the other ones forever missing. Obviously rotting in a nursing home because you’re pathetic. ";

        System.out.println(Indiana);

        Util.pauseConsole();
        youSuck();
    }
    //...........GIVE SSN PATH................
    private void giveSNN()
    {
        Util.clearConsole();
        String Jakarta = TextColor.CYAN + """
      She signed you up for military, Congratulations you are a soldier now.

      1.Go to war,sacrifice your pathetic life for US and A.

      2.Do not go to war.

      """;
        System.out.println(Jakarta);
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            yesWar();
        }
        else if (choice == 2)
        {
            doNotWar();
        }
    }
    //..........YES WAR PATH..................
    private void yesWar()
    {
        Util.clearConsole();
        String Korea = TextColor.GREEN_BOLD_BRIGHT + """
      You came back from the war and she admired how brave you were. She instantly married you and had 3 kids with her. You are living your best life and is obviously happy to not be rotting in a nursing home like you imagined.

      Press \"Enter\" to play again (definitely try to see other outcomes,It's obviously great)
      """;
        System.out.println(Korea);
        Util.pauseConsole();
        start();
    }
    //..........DO NOT WAR PATH....................
    private void doNotWar()
    {
        Util.clearConsole();
        String London = TextColor.RED_BOLD_BRIGHT + "You ended up not going to war because you love your parents, your siblings, your siblings’ spouses,your siblings’ in-laws and your neighbor’s cat. You are convinced they want you in their lives so therefore you chose to live longer but as you were crossing the streets, your neighbor’s cat tripped you over and you got ran over by a truck.Obviously not rotting in a nursing home because you’re six feet underground and your siblings’ in-laws does not love you.";

        System.out.println(London);

        Util.pauseConsole();
        youSuck();
    }
    //...........SEND PICS PATH..............
    private void sendPics()
    {
        Util.clearConsole();
        String Manila = TextColor.CYAN + """
      She got pissed and asked for your Social Security Number.

      1.Give her your Social Security Number.

      2.Refuse to give her your Social Security Number.

      """;
        System.out.println(Manila);
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            giveSNN();
        }
        else if (choice == 2)
        {
            notGiveSSN();
        }
    }
    //...........NOT GIVE SSN PATH............
    private void notGiveSSN()
    {
        Util.clearConsole();
        String Nevada = TextColor.RED_BOLD_BRIGHT + "She responded with “If you really love me you would give me your Social Security Number”.Therefore she broke into your house and took apart all of your Lego sets and donated them to very sad children with no more parents.Obviously rotting in a nursing home.";

        System.out.println(Nevada);

        Util.pauseConsole();
        youSuck();
    }

    ///////////////////////////////////////////////////
    ///////////////////////////////////////////////////
    ///////////////////////////////////////////////////

    private void youSuck()
    {
        numLives--;

        Util.clearConsole();

        System.out.println("You have " + numLives + " left,Do you want to play again for the sake of finding a fitting relationship to end your pathetic and lonely life?");

        System.out.println();

        eheh();

        Util.pauseConsole();

        if(numLives > 0)
        {
            start();
        }
        else
        {
            System.out.println("GAME OVER:( You are probably dead or rotting in a nursing home, doesn't matter, We are all gonna end up dead anyways.\n");
            memeCat();
        }


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

    private void eheh()
    {
        if (numLives == 4)
        {
            System.out.println("It's alright, you still have 4 lives left.");
        }
        else if (numLives == 3)
        {
            System.out.println("Don't worry you still have 3 lives left.Make horrible choices! You can do it!");
        }
        else if (numLives == 2)
        {
            System.out.println("Now you have to worry,Make more horrible choices! Rooting for you!");
        }
        else if (numLives == 1)
        {
            System.out.println("You're on edge,This is your last chance to make horrible decisions.Sucks for you...");
        }
    }

    private void memeCat()
    {
        String memeCat = TextColor.RED_BOLD_BRIGHT + """

    @@@@/
    @@   #@@#                                                       @@@@@
    @@      *@@@                                           /@@@@@*   /@&
     @@          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@%/.    @@@@%          &@&
    &@.                                         *%#       .@@    @@.
      /@/                                              @@@      *@@
       .@#                                          @@@#       @@&
        .@%                                            (&     @@
         @@                                                 &@@
        @@                                                 @@,
       @@    @@@@&             *@@@@ @*                   @@.
      (@#                    /@@@@@@                     @@
    /@@@                                                  @@/
      @@    .#   ((,#@@                                   &@@
    ,(&@@&%(*,     .@@&            #&/                     /@@
      @@      .    @         %&@@@@@&%(*.                 *@@
    .#@@@@         *@@@,          ,%.                       #@@
      @@        @@@@&@@,@@@             .#                %@@
     .@%            /&@@@%,                               &@@
      @@                                                  &@@
      (@/                                               .%@@@
       #@/                     .                .....,,*/#%@@@@@@&%%#(//*,
    .,**////*,,,..

    """;

        System.out.println(memeCat);
    }


}