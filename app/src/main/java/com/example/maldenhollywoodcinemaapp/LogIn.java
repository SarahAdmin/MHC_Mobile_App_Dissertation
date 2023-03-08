package com.example.maldenhollywoodcinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;
import android.text.TextUtils;

public class LogIn extends AppCompatActivity {
    EditText email;
    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        email = (EditText) findViewById(R.id.email_password);
        password = (EditText) findViewById(R.id.password_input);
    }
    boolean isEmpty(EditText logText) {
        CharSequence signStr = logText.getText().toString();
        return TextUtils.isEmpty(signStr);
    }
    void userChecked() {
        if(isEmpty(email)) {
            email.setError("Please enter your email.");
        }
        if (isEmpty(password)) {
            password.setError("Please enter your password.");
        }
    }
    public void LogIn1 (View view) {
        Intent intentMember = new Intent (this, OrderDetails.class);
        intentMember.putExtra("EMAIL", email.getText().toString());
        startActivity(intentMember);
        Toast.makeText(this,"Your login are successful.", Toast.LENGTH_LONG).show();
        userChecked();

        }
    }
