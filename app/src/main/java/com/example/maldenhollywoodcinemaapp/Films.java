package com.example.maldenhollywoodcinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Films extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films);
    }
    public void filmClickedZero (View view) {
        Intent filmZero = new Intent(this, SelectBooking.class);
        startActivity(filmZero);
    }
    public void filmClickedOne (View view) {
        Intent filmOne = new Intent(this, film_1_selectDateTime.class);
        startActivity(filmOne);
    }
    public void filmClickedTwo (View view) {
        Intent filmTwo = new Intent(this, film_2_selectDateTime.class);
        startActivity(filmTwo);
    }
    public void filmClickedThree (View view) {
        Intent filmThree = new Intent(this, film_3_selectDateTime.class);
        startActivity(filmThree);
    }
    public void filmClickedFour (View view) {
        Intent filmFour = new Intent(this, film_4_selectDateTime.class);
        startActivity(filmFour);
    }
    public void filmClickedFive (View view) {
       Intent filmFive = new Intent(this, film_5_selectDateTime.class);
       startActivity(filmFive);
    }
}