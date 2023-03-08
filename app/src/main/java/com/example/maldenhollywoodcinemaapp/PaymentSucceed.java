package com.example.maldenhollywoodcinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class PaymentSucceed extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_succeed);
    }
    public void goBacktoMenu1 (View view) {

        Intent menuIntent7 = new Intent (this, Menu.class);
        startActivity(menuIntent7);
    }

}