package com.example.polaris_2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import yuku.ambilwarna.AmbilWarnaDialog;

public class TestUsingPalette extends AppCompatActivity {

    private Toolbar mToolbar;
    private ImageButton palette;
    private ImageButton emoji;
    ConstraintLayout mLayout;
    int mDefaultcolour;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testusingpalette);

        mToolbar = findViewById(R.id.TestUsingPaletteToolBar);
        setSupportActionBar(mToolbar);
        mToolbar.setTitle("Test MyLamp");
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        mToolbar.setNavigationIcon(R.drawable.baseline_arrow_back_black_18dp);

        // colour picker code
        mLayout = (ConstraintLayout) findViewById(R.id.testusingpalette);
        mDefaultcolour = ContextCompat.getColor(TestUsingPalette.this, R.color.colorPrimary);
        mButton = (Button) findViewById(R.id.colour_pick_button);
        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openColourPicker();
            }
        });
    }

    // colour picker code
    public void openColourPicker(){
        AmbilWarnaDialog colourPicker = new AmbilWarnaDialog(this, mDefaultcolour, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int colour) {
                mDefaultcolour = colour;
                mLayout.setBackgroundColor(mDefaultcolour);
            }
        });
        colourPicker.show();
    }
}


