package com.example.polaris_2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ConnectAnotherActivity extends AppCompatActivity {


    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connectother);

        mToolbar = findViewById(R.id.connectothertoolbar);
        setSupportActionBar(mToolbar);
        mToolbar.setTitle("Pair with another Lamp");
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        mToolbar.setNavigationIcon(R.drawable.baseline_arrow_back_black_18dp);
    }
}
