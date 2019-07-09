package com.example.polaris_2019.activity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.polaris_2019.R;

/*
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

// TODO: Authentication libraries to be added throughh imports and Gradle dependencies

*/

public class ConnectMyLampActivity extends AppCompatActivity {

    private SharedPreferences mPref;

    private String TAG = "001";

    private TextView EmailField;
    private TextView PassField;

    private String dEmail = "booga@sutd.edu.sg";
    private String dPass = "boogaboo";

    private Button LoginButton;
    private Button RegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        int PERMISSION_ALL = 1;
        String[] PERMISSIONS = {
                Manifest.permission.READ_CONTACTS,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.GET_ACCOUNTS
        };

        if(!hasPermissions(this, PERMISSIONS)){
            ActivityCompat.requestPermissions(this, PERMISSIONS, PERMISSION_ALL);
        }

        LoginButton = findViewById(R.id.LoginButton);
        RegisterButton = findViewById(R.id.RegisterButton);

        EmailField = findViewById(R.id.EmailField);
        PassField = findViewById(R.id.PassField);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConnectMyLampActivity.this, ConnectAnotherActivity.class));
            }
        });

        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConnectMyLampActivity.this, RegisterActivity.class));
            }
        });

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mEmail = EmailField.getEditableText().toString();
                String mPass = PassField.getEditableText().toString();
                signIn(mEmail,mPass);
            }
        });

        RegisterButton = findViewById(R.id.RegisterButton);
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConnectMyLampActivity.this, RegisterActivity.class));
            }
        });

    }

    public static boolean hasPermissions(Context context, String... permissions) {
        if (context != null && permissions != null) {
            for (String permission : permissions) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }


    protected void signIn(String email, String password){

        // TODO: remove when implementing database
        if(email.equals(dEmail) && password.equals(dPass)){
            finish();
            startActivity(new Intent(ConnectMyLampActivity.this, ConnectAnotherActivity.class));
        }else{
            Toast.makeText(ConnectMyLampActivity.this, "Authentication failed.",
                    Toast.LENGTH_SHORT).show();
        }

        // TODO: User LOGIN authentication
        /*
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmail:success");
                            finish();
                            startActivity(new Intent(LoginActivity.this, MainActivity.class));


                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(LoginActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
//                            finish();
//                            startActivity(new Intent(LoginActivity.this, MainActivity.class));
                        }

                    }
                });*/
    }

}
