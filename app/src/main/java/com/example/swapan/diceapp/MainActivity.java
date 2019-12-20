package com.example.swapan.diceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // Button leftRollButton = findViewById(R.id.roll_left_button);
    // Button rightRollButton = findViewById(R.id.roll_right_button);
    ImageView leftDice;
    ImageView rightDice;
    final int[] diceArray = {
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leftDice = findViewById(R.id.left_dice);
        rightDice = findViewById(R.id.righr_dice);


/*
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenaragor = new Random();
                int randomNumber = randomNumberGenaragor.nextInt(6);
                leftDice.setImageResource(diceArray[randomNumber]);
                randomNumber = randomNumberGenaragor.nextInt(6);
                rightDice.setImageResource(diceArray[randomNumber]);
            }
        });
*/
    }
    public void rollLeft(View view){
        Random randomNumberGeneragor = new Random();
        int number = randomNumberGeneragor.nextInt(6);
        leftDice.setImageResource(diceArray[number]);

    }
    public void rollRight(View view){
        Random randomNumberGeneragor = new Random();
        int number2 = randomNumberGeneragor.nextInt(6);
        rightDice.setImageResource(diceArray[number2]);
    }


    }

