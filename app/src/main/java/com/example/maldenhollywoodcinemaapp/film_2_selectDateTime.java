package com.example.maldenhollywoodcinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

public class film_2_selectDateTime extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Integer adultQuantity2[] = {0,1,2,3,4,5,6,7,8,9,10};
    Integer childQuantity2[] = {0,1,2,3,4,5,6,7,8,9,10};
    Integer studentQuantity2[] = {0,1,2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film2_select_date_time);
       Spinner adultQuan2 = findViewById(R.id.spinner);
       adultQuan2.setOnItemSelectedListener(this);
       ArrayAdapter adult2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, adultQuantity2);
       adult2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       adultQuan2.setAdapter(adult2);
       Spinner StudentQuan2 = findViewById(R.id.spinner2);
       ArrayAdapter student2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, studentQuantity2);
         student2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         StudentQuan2.setAdapter(student2);
         Spinner child2 = findViewById(R.id.spinner3);
         child2.setOnItemSelectedListener(this);
         ArrayAdapter childQuan2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, childQuantity2);
         childQuan2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         child2.setAdapter(childQuan2);
    }
    public void filmList1 (View view) {
        Intent filmIntent1 = new Intent(this, Films.class);
        startActivity(filmIntent1);
    }

    public void orderInfo1 (View view ) {
        Intent orderIntent2 = new Intent(this, seats_two.class);
        startActivity(orderIntent2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}