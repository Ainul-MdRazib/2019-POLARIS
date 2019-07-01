package com.example.polaris_2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class testORpairActivity extends AppCompatActivity {


    private Toolbar mToolbar;
    private Button TestMyLamp;
    private Button connectother;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testorpair);

        mToolbar = findViewById(R.id.testORrepairToolBar);
        setSupportActionBar(mToolbar);
        mToolbar.setTitle("Test/Pair");
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        mToolbar.setNavigationIcon(R.drawable.baseline_arrow_back_black_18dp);

        // activity_emoji.xml and TestUsingEmoji.class not created yet
        TestMyLamp = (Button) findViewById(R.id.test_my_lamp_button);

        TestMyLamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(testORpairActivity.this, TestMyLampActivity.class));
                finish();
            }
        });

        // activity_palette.xml and TestUsingPalette.class not created yet
        connectother = (Button) findViewById(R.id.pair_with_another_lamp_button);

        connectother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(testORpairActivity.this, ConnectAnotherActivity.class));
                finish();
            }
        });
    }

}


