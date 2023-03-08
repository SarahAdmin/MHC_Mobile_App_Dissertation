package com.example.maldenhollywoodcinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

public class film_3_selectDateTime extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner adult3;
    Spinner student3;
    Integer AdultArray[] = {0,1,2,3,4,5,6,7,8,9,10};
    Integer StudentArray[] ={0,1,2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film3_select_date_time);
        adult3 = findViewById(R.id.spinner_unwelcome);
        adult3.setOnItemSelectedListener(this);
        ArrayAdapter ArrayOne = new ArrayAdapter(this,android.R.layout.simple_spinner_item,AdultArray);
        ArrayOne.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adult3.setAdapter(ArrayOne);
        student3 = findViewById(R.id.spinner2_unwelcome);
        student3.setOnItemSelectedListener(this);
        ArrayAdapter ArrayTwo = new ArrayAdapter(this,android.R.layout.simple_spinner_item, StudentArray);
        ArrayTwo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        student3.setAdapter(ArrayTwo);


    }
    public void filmList1 (View view) {
        Intent filmIntent1 = new Intent(this, Films.class);
        startActivity(filmIntent1);
    }

    public void orderInfo1 (View view ) {
        Intent orderIntent2 = new Intent(this, seats_three.class);
        startActivity(orderIntent2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}