package com.example.polaris_2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ConnectAnotherActivity extends AppCompatActivity {


    private Toolbar mToolbar;

    private EditText OtherUsernameField;
    private EditText OtherIdField;
    private Button ConnectOtherButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connectother);

        mToolbar = findViewById(R.id.connectothertoolbar);
        setSupportActionBar(mToolbar);
        mToolbar.setTitle("Pair with another Lamp");
        mToolbar.setNavigationOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        mToolbar.setNavigationIcon(R.drawable.baseline_arrow_back_black_18dp);

        OtherUsernameField = (EditText) findViewById(R.id.OtherUsernameField);
        OtherIdField = (EditText) findViewById(R.id.OtherIDField);
        ConnectOtherButton = (Button) findViewById(R.id.ConnectOtherButton);
        ConnectOtherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String otherUsername = OtherUsernameField.getText().toString();
                String otherId = OtherIdField.getText().toString();

                if (!otherUsername.equals("") && !otherId.equals("")) {
                    Toast.makeText(ConnectAnotherActivity.this,
                            "Please fill in only one field", Toast.LENGTH_LONG).show();
                } else if (otherUsername.equals("") && otherId.equals("")) {
                    Toast.makeText(ConnectAnotherActivity.this,
                            "Please fill in one field", Toast.LENGTH_LONG).show();
                } else {
                    if (!otherUsername.equals("")){
                        // TODO: Set receiver username as otherUsername
                    } else {
                        // TODO: Set receiver ID as otherId
                    }
                }
            }
        });

    }
}
