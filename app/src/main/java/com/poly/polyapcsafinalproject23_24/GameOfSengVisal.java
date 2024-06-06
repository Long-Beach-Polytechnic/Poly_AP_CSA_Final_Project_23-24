package com.poly.polyapcsafinalproject23_24;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameOfSengVisal extends GameActivity {


    private TextView tvSubtitle, tvNameVal, tvWeightVal, tvBodyFatVal, tvBodyMassVal, tvMaxBenchVal, tvMaxSquatVal, tvMaxRunVal, tvMain;

    private ImageView ivMain;
    private EditText etMain;

    private int day, numDays;

    private Button btn1, btn2, btn3, btn4;

    /**
     *fat body type preset
     */
    private SengMan bodyType1;
    /**
     *skinny body type preset
     */
    private SengMan bodyType2;
    /**
     *average body type preset
     */
    private SengMan bodyType3;
    /**
     *choosebody(); must be run before use
     *tracks the current body type chosen
     */
    private SengMan currentBodyType; //tracks which body type is currently being used

    @Override
    protected void run() {
        setContentView(R.layout.activity_seng_visal_main);

        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvMain = findViewById(R.id.tv_main);
        tvNameVal = findViewById(R.id.tv_name_val);
        tvWeightVal = findViewById(R.id.tv_weight_val);
        tvBodyFatVal = findViewById(R.id.tv_body_fat_val);
        tvBodyMassVal = findViewById(R.id.tv_body_mass_val);
        tvMaxBenchVal = findViewById(R.id.tv_max_bench_val);
        tvMaxSquatVal = findViewById(R.id.tv_max_squat_val);
        tvMaxRunVal = findViewById(R.id.tv_max_run_val);
        etMain = findViewById(R.id.et_main);
        ivMain = findViewById();

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);

        etMain.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        ivMain.setImageResource(R.drawable.im_sengvisal_muscleman);



        btn1.setText("Continue");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                welcomeScreen();
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

    private void continueVisibility()
    {
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.VISIBLE);
    }




    /**
     *method for the pre-game screen
     */
    private void welcomeScreen() {

        tvSubtitle.setText("Welcome to the body improvement simulator!");

        tvMain.setText("You can choose between 3 body types\n There are some exercises you can perform, your maxes are recorded and you can increase them by pushing your limits bit by bit\n Diet is important too! There are several foods you can eat to manipulate your body's appearance\n Good luck!");

        btn1.setText("Continue");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initialize();
            }
        });
    }

    /**
     *initialization of body types and the character name
     */
    private void initialize() {


        tvMain.setText("Enter your name");

        btn1.setVisibility(View.INVISIBLE);

        etMain.setVisibility(View.VISIBLE);

        etMain.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                btn4.setVisibility(View.VISIBLE);
                btn4.setText("Continue");
                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        chooseBody(etMain.getText().toString());

                    }
                });
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }

    /**
     *decision by the user to choose one of the three given body types
     */
    private void chooseBody(String characterName) {

        etMain.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        this.bodyType1 = new SengMan(characterName, 200.0, 30.0, 70.0, 150, 170, 1, 0);
        this.bodyType2 = new SengMan(characterName, 100, 10.0, 90.0, 90, 100, 3, 0);
        this.bodyType3 = new SengMan(characterName, 140, 15.0, 85.0, 120, 140, 2, 0);


        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);

        tvMain.setText("Pick a body type!");

        btn1.setText("Fat");
        btn2.setText("Skinny");
        btn3.setText("Average");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentBodyType = bodyType1;
                decision();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentBodyType = bodyType2;
                decision();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentBodyType = bodyType3;
                decision();
            }
        });



    }

    /**
     *contents inside this method will loop for the majority of the game
     */
    private void decision() { //block variable, you cannot use day outside of this for loop

        tvMain.setText("How many days do you want to give yourself for your best you?");

        etMain.setInputType(InputType.TYPE_CLASS_NUMBER);
        etMain.setHint("");

        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        etMain.setVisibility(View.VISIBLE);
        etMain.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                btn4.setVisibility(View.VISIBLE);
                btn4.setText("Continue");
                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        numDays = Integer.parseInt(etMain.getText().toString());
                        day = 1;
                        options();
                    }
                });
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void options() {

        if (day <= numDays) {


            tvMain.setText("You have " + numDays + " days to fulfill your goals, " + currentBodyType.getName() + ". What do you want to do?");

            tvNameVal.setText(""+currentBodyType.getName());
            tvWeightVal.setText(""+currentBodyType.getWeight());
            tvBodyFatVal.setText(""+currentBodyType.getFatPercentage());
            tvBodyMassVal.setText(""+currentBodyType.getLbmPercentage());
            tvMaxBenchVal.setText(""+currentBodyType.getMaxBench());
            tvMaxSquatVal.setText(""+currentBodyType.getMaxSquat());
            tvMaxRunVal.setText(""+currentBodyType.getMaxRunDistance());

            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);

            btn1.setText("Go to the Gym");
            btn2.setText("Eat food");
            btn3.setText("Go for a run");
            btn4.setText("Rest for the day");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    gym();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    eat();
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    goForRun();
                }
            });

            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    rest();
                }
            });


        } else {
            endScreen();
        }
    }

    private void rest() {
        tvMain.setText("You rested for the day.");

        currentBodyType.setConsecutiveWorkoutDays(0);
        currentBodyType.addFatPercentage(- 0.5);
        currentBodyType.addLbmPercentage(+ 0.5);

        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.VISIBLE);

        etMain.setVisibility(View.INVISIBLE);


        btn4.setText("Continue");

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numDays--;
                options();

            }
        });


    }

    private void gym() {



        tvMain.setText("What do you want to do at the gym?");

        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setText("Bench Press");
        btn2.setText("Squat");
        btn3.setText("Treadmill");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                benchPress();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                squat();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goForRun();
            }
        });

    }

    private void eat() {
            tvMain.setText("What do you want to eat?");

            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            btn1.setText("Chicken");
            btn2.setText("Salad");
            btn3.setText("Burger");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    currentBodyType.addWeight(+ 5);
                    currentBodyType.addFatPercentage(- 0.5);
                    currentBodyType.addLbmPercentage(+ 0.5);
                    numDays--;
                    options();

                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    currentBodyType.addWeight(- 3);
                    numDays--;
                    options();

                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    currentBodyType.addWeight(+ 10);
                    currentBodyType.addFatPercentage(+ 0.7);
                    currentBodyType.addLbmPercentage(- 0.7);
                    numDays--;
                    options();

                }
            });
        }

        private void goForRun() {

            tvMain.setText("Enter how much miles you want to run.");

            etMain.setInputType(InputType.TYPE_CLASS_NUMBER);
            etMain.setHint("");

            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            etMain.setVisibility(View.VISIBLE);


            etMain.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                continueVisibility();
                btn4.setText("Continue");
                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        int miles = Integer.parseInt(etMain.getText().toString());
                        if (miles > currentBodyType.getMaxRunDistance() + 1){
                            tvMain.setText("You cannot run that far! One day has been wasted");

                        }
                        else {
                            currentBodyType.addWeight( - 4);
                            currentBodyType.addLbmPercentage(+ 0.5);
                            currentBodyType.addFatPercentage(- 0.5);
                            tvMain.setText("LBM increased by 0.5\nFat decreased by 0.5\nWeight decreased by 4");




                        }

                        if (miles > currentBodyType.getMaxRunDistance() - 1) {
                            currentBodyType.setMaxRunDistance(miles);
                            tvMain.setText("Your max distance has increased to " + currentBodyType.getMaxRunDistance() + "!");
                        }

                        continueVisibility();
                        btn4.setText("Continue");



                        btn4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                numDays--;
                                options();

                            }
                        });
                    }
                });
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });









        }

        private void benchPress() {
            tvMain.setText("Enter how much lbs you want to bench. Your current max is: " + currentBodyType.getMaxBench());

            etMain.setInputType(InputType.TYPE_CLASS_NUMBER);
            etMain.setHint("");

            ivMain.setImageResource(R.drawable.im_sengvisal_benchpress);

            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            etMain.setVisibility(View.VISIBLE);

            etMain.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    continueVisibility();
                    btn4.setText("Continue");
                    btn4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int bench = Integer.parseInt(etMain.getText().toString());

                            if (currentBodyType.getConsecutiveWorkoutDays() >= 5) {
                                tvMain.setText("You have not been taking enough rest! You wasted one day.");
                                etMain.setVisibility(View.INVISIBLE);
                            }

                            else if (bench > currentBodyType.getMaxBench() + 5) {
                                tvMain.setText("You can't bench that much! You are injured in the process\n LBM decreased by 0.5\nFat increased by 0.5\nWeight decreased by 2");
                                etMain.setVisibility(View.INVISIBLE);
                                currentBodyType.addLbmPercentage(- 0.5);
                                currentBodyType.addFatPercentage(+ 0.5);
                                currentBodyType.addWeight(- 0.5);
                            } else {
                                currentBodyType.addWeight(-4);
                                currentBodyType.addLbmPercentage(+0.5);
                                currentBodyType.addFatPercentage(-0.5);
                                tvMain.setText("LBM increased by 0.5\nFat decreased by 0.5\nWeight decreased by 4");
                                currentBodyType.addConsecutiveWorkoutDays(+ 1);
                                etMain.setVisibility(View.INVISIBLE);
                                if (bench > currentBodyType.getMaxBench() - 5) {
                                    currentBodyType.setMaxBench(bench);
                                    tvMain.setText("Max benchpress increased to " + currentBodyType.getMaxBench());
                                }

                            }


                            continueVisibility();
                            btn4.setText("Continue");



                            btn4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    numDays--;
                                    options();

                                }
                            });
                        }
                    });
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });



    }


    private void squat() {
        tvMain.setText("Enter how much lbs you want to squat. Your current max is: " + currentBodyType.getMaxSquat());

        etMain.setInputType(InputType.TYPE_CLASS_NUMBER);
        etMain.setHint("");

        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        etMain.setVisibility(View.VISIBLE);

        etMain.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                continueVisibility();
                btn4.setText("Continue");
                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int squat = Integer.parseInt(etMain.getText().toString());
                        if (currentBodyType.getConsecutiveWorkoutDays() >= 5) {
                            tvMain.setText("You have not been taking enough rest! You wasted one day.");
                            etMain.setVisibility(View.INVISIBLE);
                        }


                            else if (squat > currentBodyType.getMaxSquat() + 5) {
                            tvMain.setText("You can't squat that much! You are injured in the process\n LBM decreased by 0.5\nFat increased by 0.5\nWeight decreased by 2");
                            etMain.setVisibility(View.INVISIBLE);
                            currentBodyType.addLbmPercentage(- 0.5);
                            currentBodyType.addFatPercentage(+ 0.5);
                            currentBodyType.addWeight(- 0.5);

                        } else {
                            currentBodyType.addWeight(-4);
                            currentBodyType.addLbmPercentage(+0.5);
                            currentBodyType.addFatPercentage(-0.5);
                            tvMain.setText("LBM increased by 0.5\nFat decreased by 0.5\nWeight decreased by 4");
                            currentBodyType.addConsecutiveWorkoutDays(+ 1);
                            etMain.setVisibility(View.INVISIBLE);
                            if (squat > currentBodyType.getMaxSquat() - 5) {
                                currentBodyType.setMaxSquat(squat);
                                tvMain.setText("Max squat increased to " + currentBodyType.getMaxBench());
                            }

                        }


                        continueVisibility();
                        btn4.setText("Continue");



                        btn4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                numDays--;
                                options();

                            }
                        });
                    }
                });
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



    }




    /**
     *Precondition:
     *decision() must be completely run before this method
     *Postcondition:
     *prints game over screen
     */
    private void endScreen() {

        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        tvMain.setText("You have reached the deadline of your goal!\n Your final stats are:\n " + currentBodyType + "\n\n Your old stats are: ");

        if (currentBodyType == bodyType1) {
            tvMain.setText("You have reached the deadline of your goal!\n Your final stats are:\n " + currentBodyType + "\n\n Your old stats are: Name: " + currentBodyType.getName() + "\nWeight: 200\nBody Fat %: 30.0\nLean Body Mass %: 70.0\nMax Bench: 150\nMax Squat: 170\nMax Run Distance: 1");
        } else if (currentBodyType == bodyType2) {
            tvMain.setText("You have reached the deadline of your goal!\n Your final stats are:\n " + currentBodyType + "\n\n Your old stats are: Name: " + currentBodyType.getName() + "\nWeight: 100\nBody Fat %: 10.0\nLean Body Mass %: 90.0\nMax Bench: 90\nMax Squat: 100\nMax Run Distance: 3");
        } else if (currentBodyType == bodyType3) {
            tvMain.setText("You have reached the deadline of your goal!\n Your final stats are:\n " + currentBodyType + "\n\n Your old stats are: Name: " + currentBodyType.getName() + "\nWeight: 140\nBody Fat %: 15.0\nLean Body Mass %: 75.0\nMax Bench: 120\nMax Squat: 140\nMax Run Distance: 2");
        }

        etMain.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                continueVisibility();
                btn4.setText("Continue");
                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        initialize();
                    }
                });
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }





}










