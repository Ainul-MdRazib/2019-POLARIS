package com.example.polaris_2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class TestUsingEmoji extends AppCompatActivity {

    private Toolbar mToolbar;
    private ImageButton hapiness;
    private ImageButton sad;
    private ImageButton angry;
    private ImageButton indifferent;
    private ImageButton embarrassed;
    private ImageButton kiss;
    private ImageButton dead;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connectother);

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

        hapiness = (ImageButton) findViewById(R.id.emoji_hapiness);
        sad = (ImageButton) findViewById(R.id.emoji_sad);
        angry = (ImageButton) findViewById(R.id.emoji_angry);
        indifferent = (ImageButton) findViewById(R.id.emoji_indifferent);
        embarrassed = (ImageButton) findViewById(R.id.emoji_embarrassed);
        kiss = (ImageButton) findViewById(R.id.emoji_kiss);
        dead = (ImageButton) findViewById(R.id.emoji_dead);

        hapiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestUsingEmoji.this, TestUsingEmoji.class));
                finish();
            }
        });
        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestUsingEmoji.this, TestUsingEmoji.class));
                finish();
            }
        });
        angry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestUsingEmoji.this, TestUsingEmoji.class));
                finish();
            }
        });
        indifferent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestUsingEmoji.this, TestUsingEmoji.class));
                finish();
            }
        });
        hapiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestUsingEmoji.this, TestUsingEmoji.class));
                finish();
            }
        });
        kiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestUsingEmoji.this, TestUsingEmoji.class));
                finish();
            }
        });
        dead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestUsingEmoji.this, TestUsingEmoji.class));
                finish();
            }
        });


    }

}


