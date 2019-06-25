package com.example.polaris_2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class TestUsingPalette extends AppCompatActivity {

    private Toolbar mToolbar;
    private ImageButton palette;
    private ImageButton emoji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connectother);

        mToolbar = findViewById(R.id.TestMyLampToolBar);
        setSupportActionBar(mToolbar);
        mToolbar.setTitle("Test MyLamp");
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        mToolbar.setNavigationIcon(R.drawable.baseline_arrow_back_black_18dp);

        emoji = (ImageButton) findViewById(R.id.emoji_imagebutton);

        emoji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestUsingPalette.this, TestUsingEmoji.class));
                finish();
            }
        });

        palette = (ImageButton) findViewById(R.id.palette_imagebutton);

        palette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestUsingPalette.this, TestUsingPalette.class));
                finish();
            }
        });


    }

}


