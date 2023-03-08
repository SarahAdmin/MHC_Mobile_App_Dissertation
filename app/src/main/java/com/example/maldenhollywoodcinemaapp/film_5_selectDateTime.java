package com.example.maldenhollywoodcinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

public class film_5_selectDateTime extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner adult5;
    Spinner student5;
    Spinner child5;
    Integer adultArray1[] = {0,1,2,3,4,5,6,7,8,9,10};
    Integer studentArray1[] = {0,1,2,3,4,5,6,7,8,9,10};
    Integer childArray1[] = {0,1,2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film5_select_date_time);
        adult5 = findViewById(R.id.fabelmans_spinner);
        adult5.setOnItemSelectedListener(this);
        ArrayAdapter aQuan = new ArrayAdapter(this,android.R.layout.simple_spinner_item,adultArray1);
        aQuan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adult5.setAdapter(aQuan);
        student5 = findViewById(R.id.fabelmans_spinner2);
        student5.setOnItemSelectedListener(this);
        ArrayAdapter sQuan = new ArrayAdapter(this,android.R.layout.simple_spinner_item,studentArray1);
        sQuan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        student5.setAdapter(sQuan);
        child5 = findViewById(R.id.fabelmans_spinner3);
        child5.setOnItemSelectedListener(this);
        ArrayAdapter cQuan = new ArrayAdapter(this,android.R.layout.simple_spinner_item,childArray1);
        cQuan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        child5.setAdapter(cQuan);
    }
    public void filmList1 (View view) {
        Intent filmIntent1 = new Intent(this, Films.class);
        startActivity(filmIntent1);
    }

    public void orderInfo1 (View view ) {
        Intent orderIntent2 = new Intent(this, seats_five.class);
        startActivity(orderIntent2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}