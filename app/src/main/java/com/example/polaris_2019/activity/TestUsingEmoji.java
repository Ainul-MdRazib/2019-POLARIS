package com.example.polaris_2019.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.polaris_2019.R;

public class TestUsingEmoji extends AppCompatActivity {

    private Toolbar mToolbar;
    private ImageButton happiness;
    private ImageButton sad;
    private ImageButton angry;
    private ImageButton indifferent;
    private ImageButton embarrassed;
    private ImageButton kiss;
    private ImageButton dead;
    TextView NewText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testusingemoji);

        mToolbar = findViewById(R.id.TestUsingEmojiToolBar);
        setSupportActionBar(mToolbar);
        mToolbar.setTitle("Emoji Test");
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        mToolbar.setNavigationIcon(R.drawable.baseline_arrow_back_black_18dp);

        happiness = (ImageButton) findViewById(R.id.emoji_hapiness);
        sad = (ImageButton) findViewById(R.id.emoji_sad);
        angry = (ImageButton) findViewById(R.id.emoji_angry);
        indifferent = (ImageButton) findViewById(R.id.emoji_indifferent);
        embarrassed = (ImageButton) findViewById(R.id.emoji_embarrassed);
        kiss = (ImageButton) findViewById(R.id.emoji_kiss);
        dead = (ImageButton) findViewById(R.id.emoji_dead);

        NewText = (TextView)findViewById(R.id.test_emoji_name);

        happiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewText.setText("Happy");
            }
        });
        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewText.setText("Sad");
            }
        });
        angry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewText.setText("Angry");
            }
        });
        indifferent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewText.setText("Indifferent");
            }
        });
        kiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewText.setText("Lovely");
            }
        });
        dead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewText.setText("Dead");
            }
        });
        embarrassed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewText.setText("Embarrassed");
            }
        });


    }

}


