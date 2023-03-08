package com.example.maldenhollywoodcinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.app.DatePickerDialog;
import java.text.DateFormat;
import java.util.Calendar;




public class SelectBooking extends AppCompatActivity  implements
AdapterView.OnItemSelectedListener {
    Integer[] CQuantity = {0, 1 , 2, 3, 4, 5, 6, 7, 8, 9 , 10 };
    Integer[] AQuantity = {0, 1 , 2, 3, 4, 5, 6, 7, 8, 9 , 10 };
    Integer[] SQuantity = {0, 1 , 2, 3, 4, 5, 6, 7, 8, 9 , 10 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_booking);
       Spinner adult = findViewById(R.id.avatar_spinner);
       adult.setOnItemSelectedListener(this);
       ArrayAdapter adultQuan = new ArrayAdapter(this, android.R.layout.simple_spinner_item, AQuantity);
       adultQuan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       adult.setAdapter(adultQuan);
       Spinner student = findViewById(R.id.avatar_spinner2);
       student.setOnItemSelectedListener(this);
       ArrayAdapter studentQuan = new ArrayAdapter(this, android.R.layout.simple_spinner_item, SQuantity);
       studentQuan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       student.setAdapter(studentQuan);
       Spinner child = findViewById(R.id.avatar_spinner3);
       child.setOnItemSelectedListener(this);
       ArrayAdapter childQuan = new ArrayAdapter(this, android.R.layout.simple_spinner_item, CQuantity);
       childQuan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       child.setAdapter(childQuan);

    }


    public void filmList1 (View view) {
        Intent filmIntent1 = new Intent(this, Films.class);
        startActivity(filmIntent1);
    }

    public void orderInfo1 (View view ) {
        Intent orderIntent2 = new Intent(this, Seats.class);
        startActivity(orderIntent2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}