package com.example.maldenhollywoodcinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class seats_four extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seats_four);
    }

    public void filmList1 (View view) {
        Intent filmIntent1 = new Intent(this, Films.class);
        startActivity(filmIntent1);
    }

    public void orderInfo1 (View view ) {
        Intent orderIntent2 = new Intent(this, OrderDetails.class);
        startActivity(orderIntent2);
    }
}