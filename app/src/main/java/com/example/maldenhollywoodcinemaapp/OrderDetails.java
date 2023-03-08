package com.example.maldenhollywoodcinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
public class OrderDetails extends AppCompatActivity {
    TextView emailUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        emailUser = (TextView) findViewById(R.id.email_output);
        Intent userIntent = getIntent();
        String email = userIntent.getStringExtra("EMAIL");
        emailUser.setText(email);
    }
    public void ReturnMenu1 (View view) {
        Intent returnTwo = new Intent (this, Menu.class);
        startActivity(returnTwo);
    }
}