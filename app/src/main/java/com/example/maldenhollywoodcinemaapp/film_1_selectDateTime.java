package com.example.maldenhollywoodcinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;


public class film_1_selectDateTime extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
     Integer adultQuantity[] = {0,1,2,3,4,5,6,7,8,9,10};
     Integer studentQuantity[] = {0,1,2,3,4,5,6,7,8,9,10};
     Integer childQuantity[] = {0,1,2,3,4,5,6,7,8,9,10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film1_select_date_time);
        Spinner adult1 = findViewById(R.id.adult_quantity_1);
        adult1.setOnItemSelectedListener(this);
        ArrayAdapter adultQuan = new ArrayAdapter(this, android.R.layout.simple_spinner_item, adultQuantity);
        adultQuan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adult1.setAdapter(adultQuan);
        Spinner student1 = findViewById(R.id.student_quantity_1);
        student1.setOnItemSelectedListener(this);
        ArrayAdapter studentQuan = new ArrayAdapter(this, android.R.layout.simple_spinner_item, studentQuantity);
        studentQuan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        student1.setAdapter(studentQuan);
        Spinner child1 = findViewById(R.id.child_quantity_1);
        child1.setOnItemSelectedListener(this);
        ArrayAdapter childQuan = new ArrayAdapter(this, android.R.layout.simple_spinner_item, childQuantity);
        childQuan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        child1.setAdapter(childQuan);





    }
    public void filmList1 (View view) {
        Intent filmIntent1 = new Intent(this, Films.class);
        startActivity(filmIntent1);
    }

    public void orderInfo1 (View view ) {
        Intent orderIntent2 = new Intent(this, seatsOne.class);
        startActivity(orderIntent2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }
}