package com.example.polaris_2019.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.polaris_2019.R;

public class ConnectMyLampActivity extends AppCompatActivity {

    private Button ConnectMyLampButton;
    private EditText LampIdField;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_my);

        toolbar = findViewById(R.id.maintoolbar);
        setActionBar(toolbar);

        LampIdField = findViewById(R.id.lampIdField);

        ConnectMyLampButton = findViewById(R.id.connectMyLampButton);
        ConnectMyLampButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myLampId = LampIdField.toString();
                if(myLampId.equals("")){
                    Toast.makeText(ConnectMyLampActivity.this, "Please type in your" +
                            " Lamp ID", Toast.LENGTH_LONG).show();
                } else {
                    // TODO: check db if myLampId exists
                    startActivity(new Intent(ConnectMyLampActivity.this,
                            TestOrPairActivity.class));
                }
            }
        });

    }
}
