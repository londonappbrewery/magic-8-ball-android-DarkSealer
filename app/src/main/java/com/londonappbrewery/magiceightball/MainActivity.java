package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se face legatura cu butonul askButton
        Button askButton = findViewById(R.id.askButton);

        //se face legatura cu imaginea bilei
        final ImageView ballImage = findViewById(R.id.ball_image);

        final int[] balls = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomAnswer = new Random();
                int answer = randomAnswer.nextInt(4);

                ballImage.setImageResource(balls[answer]);
            }
        });

    }
}
