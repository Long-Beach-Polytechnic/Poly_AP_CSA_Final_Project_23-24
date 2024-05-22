package com.poly.polyapcsafinalproject23_24;


import com.poly.polyapcsafinalproject23_24.GameActivity;


public class GameTrujilloJose extends GameActivity {

  //instance variables
  //   variables you plan to use throughout the adventure
  private int numLives;
  //private Player player; (optional)


  public void run()
  {
    setContentView(R.layout.activity_game_3_button);

    tvTitle = findViewById((R.id.tv_title_txt));
    tvSubTitle = findViewById((R.id.tv_subtitle));


    //initialize number of lives
    numLives = 5;
    //create a scanner object for user input

    //create a player object (optional)
    //player = new Player(...)

    //display project title and description

    start();
  }

  private void start()
  {
    //start adventure here

    String artText = TextColor.PURPLE + """
       _______  _______  _______  _______  _______    _______  __   __  _______  ___      _______  ______    _______  _______  ___   _______  __    _
      |       ||       ||   _   ||       ||       |  |       ||  |_|  ||       ||   |    |       ||    _ |  |   _   ||       ||   | |       ||  |  | |
      |  _____||    _  ||  |_|  ||       ||    ___|  |    ___||       ||    _  ||   |    |   _   ||   | ||  |  |_|  ||_     _||   | |   _   ||   |_| |
      | |_____ |   |_| ||       ||       ||   |___   |   |___ |       ||   |_| ||   |    |  | |  ||   |_||_ |       |  |   |  |   | |  | |  ||       |
      |_____  ||    ___||       ||      _||    ___|  |    ___| |     | |    ___||   |___ |  |_|  ||    __  ||       |  |   |  |   | |  |_|  ||  _    |
       _____| ||   |    |   _   ||     |_ |   |___   |   |___ |   _   ||   |    |       ||       ||   |  | ||   _   |  |   |  |   | |       || | |   |
      |_______||___|    |__| |__||_______||_______|  |_______||__| |__||___|    |_______||_______||___|  |_||__| |__|  |___|  |___| |_______||_|  |__|
      """ + TextColor.RESET;
    System.out.println(artText);
    System.out.println("...description...");

    String text = TextColor.BLUE + """
    Your team's job is to map out the endless void of
    space.
    What do you want to do?

    1. explore unknown planets
    2. travel outside the galaxy
    3. go inside a black hole
      """ + TextColor.RESET;
    System.out.println(text);
    if (option == 1)
    {
      exploreUnknownPlanets();
    }
    else if (option == 2)
    {
      leaveGalaxy();
    }
    else if (option == 3)
    {
      enterBlackHole();
    }

  }

  private void leaveGalaxy()
  {
    String text = """
    After a longgggg time we finally left the galaxy
    while checking our communications we see a distress
    call being made what should
    we do

    1.Ignore the call
    2.Respond to the call
      """;
    System.out.println(text);
    if (option == 1)
    {
      ignore();
    }
    else if (option == 2)
    {
      respond();
    }

  }
  private void respond()
  {
    String text = """
    You and your team fly into action thinking someone is in
    trouble,....little did you think it was all a trap by an
    alien civilization what should we do


    1.Fight back
    2.RUNNNN
      """;
    System.out.println(text);
    if (option == 1)
    {
      fightBack();
    }
    else if (option == 2)
    {
      runAway();
    }

  }
  private void runAway()
    {
      String text = """
      While making your best attemp to run your spaceship runs
      out of fuel and the bandits claim there new belongings
        """;
      System.out.println(text);
      defeat();
    }

  private void fightBack()
  {
    String text = """
    Our ship plunges into a maelstrom of laser fire and
    explosive chaos.After barely surviving that fight what
    nexts

    1.Revenge
    2.Seek help
      """;
    System.out.println(text);
    if (option == 1)
    {
      revenge();
    }
    else if (option == 2)
    {
      seekHelp();
    }

  }
  private void seekHelp()
  {
    String text = """
    Using a distressed call an advaced alien civilization
    offers help in destroying these space bandits should we
    accept?


    1.Yes team up with these guys
    2.Betray them after the job is done
      """;
    System.out.println(text);
    if (option == 1)
    {
      destroybadGuys();
    }
    else if (option == 2)
    {
      betrayThem();
    }

  }
  private void betrayThem()
  {
    String text = """
    After obliterating the bandits you quickly take out the
    leader of this civilization and order them to serve under
    you with this power you can do anything

      """;
    System.out.println(text);
  }
  private void destroybadGuys()
  {
    String text = """
    They help you take down these space bandits but in return
    they decided to enslave you not sure what you expedited
    was gonna happen
      """;
    System.out.println(text);
    defeat();
  }
  private void revenge()
  {
    String text = """
    I don't know why going for revenge sounded like a great
    idea after barely surviving the first time, lets just say
    you didn't get so lucky the second time
      """;
    System.out.println(text);
    defeat();
  }
  private void ignore()
  {
    String text = """
    You and your team just travel into the empty void of
    space till you relize we are out of fuel what should
    we do

    1.Send out a distress call
    2.Drift in space
      """;
    System.out.println(text);
    if (option == 1)
    {
      sendDistressCall();
    }
    else if (option == 2)
    {
      driftAway();
    }

  }
  private void driftAway()
  {
    String text = """
    After month of drifting in the endless void of space you
    guys crashed landed into a rogue moon killing you all
      """;
    System.out.println(text);
    defeat();
  }
  private void sendDistressCall()
  {
    String text = """
    An Alien civilization rescues you guys and offers to
    take you to there planet


    1.Accept the offer
    2.Delicne the offer
      """;
    System.out.println(text);
    if (option == 1)
    {
      accept();
    }
    else if (option == 2)
    {
      sayNo();
    }

  }
   private void sayNo()
    {
      String text = """
      Declining the offer the aliens attempt to raid your ship
      what should we do

      1.Attck back
      2.Try to bribe them
        """;
      System.out.println(text);
      if (option == 1)
      {
        //attackThemBack();
      }
      else if (option == 2)
      {
        //bribeThem();
      }
    }
      private void decline()
        {
          String text = """
          Your team opens fire defensively and have a brutal
          fight to the death against these aliens your ship
          was heavily damaged so you decide to steal there’s

          1.
          2.
            """;
          System.out.println(text);
          if (option == 1)
          {
            //();
          }
          else if (option == 2)
          {
            //bribeThem();
          }
      }

  private void accept()
  {
    String text = """
    The aliens welcome you to there planet with opens arms and
    show you around, after staying for a while you decide to

    1.Accept the offer
    2.Delicne the offer
      """;
    System.out.println(text);
    if (option == 1)
    {
      //accept();
    }
    else if (option == 2)
    {
      //decline();
    }

  }
  private void enterBlackHole()
  {
    String text = """
    Your team  goes through a black hole and inside it
    you have to go either left or right

    1.Left
    2.Right
      """;
    System.out.println(text);
    if (option == 1)
    {
      left();
    }
    else if (option == 2)
    {
      right();
    }

  }
  private void right()
  {
    String text = """
    Going right you find a small universe, these small beings
    treat you as Gods, what should you do

    1.Kill them all
    2.Enslave them for more power by playing God
      """;
    System.out.println(text);
    if (option == 1)
    {
      killThem();
    }
    else if (option == 2)
    {
      enslaveThem();
    }

  }
  private void enslaveThem()
  {
    String text = """
    You make this universe work for you in your new journey to
    conquer the multiverse what should we do with this power

    1.Invade a nerby gallaxy
    2.Build up your army
      """;
    System.out.println(text);
    if (option == 1)
    {
      inVade();
    }
    else if (option == 2)
    {
      buildUpArmy();
    }

  }
  private void buildUpArmy()
  {
    String text = """
    You decide to be smart and build up your army and, you are
    now powerful enough to destroy galaxy


    1.Concur the galaxy
    2.Go after the Gods
      """;
    System.out.println(text);
    if (option == 1)
    {
      concur();
    }
    else if (option == 2)
    {
      destroyGods();
    }

  }
  private void concur()
  {
    String text = """
    After invading countless galaxies you are now feared by
    all in this universe
      """;
    System.out.println(text);
  }
  private void destroyGods()
  {
    String text = """
    You enslaved small humans and thought you were powerfull enough to defeat the Gods.
      """;
    System.out.println(text);
    defeat();
  }
  private void inVade()
  {
    String text = """
    You got to cocky and decided to go straight into it like a
    horrible leader, everyone got killed
      """;
    System.out.println(text);
    defeat();
  }

  private void killThem()
  {
    String text = """
    You decide to massacure this universe but doing so you
    realise that this small universe has defences for this
    what should we do

    1.Continue
    2.Enslave them by playing God
      """;
    System.out.println(text);
    if (option == 1)
    {
      keepGoing();
    }
    else if (option == 2)
    {
      enslaveThem();
    }
  }
  private void keepGoing()
  {
    String text = """
    After destroying an entire universe the Gods themselves
    couldn't let you leave with this going unseen
      """;
    System.out.println(text);
    defeat();
  }

  private void left()
  {
    String text = """
    Going left you encounter a huge alien spacecraft
    what should we do

    1.Shoot Them
    2.Be friendly
      """;
    System.out.println(text);
    if (option == 1)
    {
      shootThem();
    }
    else if (option == 2)
    {
      beFriendly();
    }
  }
  private void beFriendly()
  {
    String text = """
    You try to be friendly to the unknown spacecraft, little did you
    these guys are the most wonted beings
      """;
    System.out.println(text);
    defeat();
  }

  private void shootThem()
  {
    String text = """
    You get into a huge gun fight the alien spacecraft
    after a long hard fought battle we win what's next

    1.Steal there spaceship
    2.flee the area
      """;
    System.out.println(text);
    if (option == 1)
    {
      stealSpaceShip();
    }
    else if (option == 2)
    {
      flee();
    }

  }

  private void flee()
    {
      String text = """
    You and your team don't know what problems you
    might get into next so we decide to leave the
    scene, in doing space police catches you guys
    going to fast should we stop

    1.Yes
    2.No
      """;
      System.out.println(text);
      if (option == 1)
      {
        yes();
      }
      else if (option == 2)
      {
        no();
      }
    }
    private void yes()
    {
    String text = """
    After stopping the police ask you a few questions
    from where you came from they didn't believe
    anything you said and labeled you insane and ordered
    to have you locked up for life
    """;
    System.out.println(text);
    defeat();
  }
  private void no()
    {
    String text = """
    You decide not to stop and get into a high speed
    chase with space cops and they had no choice but to
    shoot you down
    """;
    System.out.println(text);
    defeat();
  }

  private void stealSpaceShip()
    {
      String text = """
    We jump on board to the spaceship to steal all their supplies and weapons, inside you a distress call is being made what should we do?

    1.Stay
    2.Run away
        """;
      System.out.println(text);
      if (option == 1)
      {
        stay();
      }
      else if (option == 2)
      {
        flee();
      }

    }

  private void stay()
    {
      String text = """
    A HUGEEEEE alien spaceship comes out of a wormhole
    and nuke you

        """;
      System.out.println(text);
     defeat();

    }


  private void exploreUnknownPlanets()
  {
    String text = """
    Landing on this unknown place, a strange  cosmic
    entity appears in front of you and gives you two
    choices

    1.Play
    2.Dont play

      """;
    System.out.println(text);
    if (option == 1)
    {
      play();
    }
    else if (option == 2)
    {
      DontPlay();
    }

  }

  private void play()
  {
    String text = """
    You decided to play I will tell you 3 riddles answer
    correctly and i’ll give you all my knowlege of the
    cosmos
      """;
    System.out.println(text);
      firstRiddle();
  }
  private void DontPlay()
  {
    String text = """
    You chose not to play and this cosmic being
    wasnt happy about it

      """;
    System.out.println(text);
    defeat();

  }

  private void firstRiddle()
  {
    String text = """
    I can be cracked, made, told, and played. I can make
    some people happy while others feel betrayed.

    What am I

    1. A secret
    2. A joke
    3. A lie
    """;
    System.out.println(text);
    if (option == 1)
    {
      aSecret();
    }
    else if (option == 2)
    {
      aJoke();
    }
    else if (option == 3)
    {
      aLie();
    }

  }

  private void aSecret()
  {
    String text = """
    Wrong ill tell you a secret about death

      """;
    System.out.println(text);
    defeat();

  }

  private void aJoke()
  {
    String text = """
    CORRECT moving on

      """;
    System.out.println(text);
    secondRiddle();
  }

  private void aLie()
  {
    String text = """
    I would lie and say you were correct but you arnt
      """;
    System.out.println(text);
    defeat();

  }

  private void secondRiddle()
  {
    String text = """
    The more you take, the more you leave behind.
    What am I

    1.A memmory
    2.A road
    3.Footsteps
      """;
    System.out.println(text);
    if (option == 1)
    {
      aMemmory();
    }
    else if (option == 2)
    {
      aRoad();
    }
    else if (option == 3)
    {
      footSteps();
    }

  }
  private void aMemmory()
  {
    String text = """
    I'll remember you in my memory
      """;
    System.out.println(text);
    defeat();

  }
  private void aRoad()
  {
    String text = """
    It’s the end of the road for you
      """;
    System.out.println(text);
    defeat();

  }
  private void footSteps()
  {
    String text = """
    CORRECT on to the final riddle
      """;
    System.out.println(text);
    thirdRiddle();

  }
  private void thirdRiddle()
  {
    String text = """
    show you a different face each time you look at me.
    I'm always moving, but I never leave my place.

    What am I

    1.A Clock
    2.A photograph
    3.A mirror
      """;
    System.out.println(text);
    if (option == 1)
    {
      aClock();
    }
    else if (option == 2)
    {
      aPhotograph();
    }
    else if (option == 3)
    {
      aMirror();
    }

  }
  private void aClock()
  {
    String text = """
    CORRECT now heres one final question do you wish to
    know all my knowledge or leave this place and never
    return

    1.Get his knowledge
    2.Leave and never return
      """;
    System.out.println(text);
    if (option == 1)
    {
      knowledge();
    }
    else if (option == 2)
    {
      leave();
    }
  }
  private void knowledge()
  {
    String text = """
    A cosmic being mind shouldn’t be shared with a
    human, you dropped dead within seconds
      """;
    System.out.println(text);
    defeat();
  }
  private void leave()
  {
    String text = """
    Congrats you survived
      """;
    System.out.println(text);
    defeat();
  }

  private void aPhotograph()
  {
    String text = """
    Here is a picture of your finale momments alive
      """;
    System.out.println(text);
    defeat();

  }
  private void aMirror()
  {
    String text = """
    I showed you a mirror and you died.
      """;
    System.out.println(text);
    defeat();

  }


  private void defeat()
  {
    //run method when defeated


    //lose a life
    numLives--;

    //clear console, display text, etc
    System.out.println(TextColor.RED + "YOU DIED");


    //determine if player gets to play again
    if (numLives > 0)
    {
      //if you still have lives, return to start()
      start();
    }
    else
    {
    System.out.println("GAME OVER");
    }

  }
}