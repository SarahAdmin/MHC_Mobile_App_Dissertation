package com.example.maldenhollywoodcinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
public class film_4_selectDateTime extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner adult4;
    Spinner student4;
    Integer adultQuantity[] = {0,1,2,3,4,5,6,7,8,9,10};
    Integer studentQuantity[] = {0,1,2,3,4,5,6,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film4_select_date_time);
        adult4 = findViewById(R.id.spinner_megan_1);
        adult4.setOnItemSelectedListener(this);
        ArrayAdapter quanOne = new ArrayAdapter(this,android.R.layout.simple_spinner_item,adultQuantity);
        quanOne.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adult4.setAdapter(quanOne);
        student4 = findViewById(R.id.spinner_megan_2);
        student4.setOnItemSelectedListener(this);
        ArrayAdapter quanTwo = new ArrayAdapter(this,android.R.layout.simple_spinner_item, studentQuantity);
        quanTwo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        student4.setAdapter(quanTwo);

    }
    public void filmList1 (View view) {
        Intent filmIntent1 = new Intent(this, Films.class);
        startActivity(filmIntent1);
    }

    public void orderInfo1 (View view ) {
        Intent orderIntent2 = new Intent(this, seats_four.class);
        startActivity(orderIntent2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}