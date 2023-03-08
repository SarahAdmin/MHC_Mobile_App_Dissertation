package com.example.maldenhollywoodcinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.text.TextUtils;
import android.widget.AdapterView;
import android.widget.Toast;

public class Payment extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String cardArray[] = {"MasterCard", "Visa", "American Express", "Stripe"};
    String monthArray[] = {"00","01","02","03","04","05","06","07","08","09","10","11","12"};
    Integer yearArray[] = {2023,2024,2025,2026,2027,2028,2029,2030,2031,2032};

    EditText cardholderName;
    EditText cardNo;
    EditText cvv;
    Spinner card_type;
    Spinner month;
    Spinner year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        card_type = findViewById(R.id.select_card_type);
        card_type.setOnItemSelectedListener(this);
        ArrayAdapter FinCard = new ArrayAdapter(this,android.R.layout.simple_spinner_item,cardArray);
        FinCard.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        card_type.setAdapter(FinCard);
        month = findViewById(R.id.month_selected);
        month.setOnItemSelectedListener(this);
        ArrayAdapter IntMonth = new ArrayAdapter(this,android.R.layout.simple_spinner_item, monthArray);
        IntMonth.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        month.setAdapter(IntMonth);
         year = findViewById(R.id.year_selected);
         year.setOnItemSelectedListener(this);
         ArrayAdapter IntYear = new ArrayAdapter(this,android.R.layout.simple_spinner_item, yearArray);
         IntYear.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         year.setAdapter(IntYear);
        cardholderName = findViewById(R.id.cardholder_name_input);
        cardNo = findViewById(R.id.card_number_input);
        cvv = findViewById(R.id.cvv_input);

    }
    boolean isEmpty(EditText payDetails) {
        CharSequence str = payDetails.getText().toString();
        return TextUtils.isEmpty(str);
    }
    void paymentInfoChecked() {
        if(isEmpty(cardholderName)) {
            cardholderName.setError("Please enter your cardholder name");
        }
        if(isEmpty(cardNo)) {
            cardNo.setError("Please enter your card number");
        }
        if(isEmpty(cvv)) {
        cvv.setError("Please enter your cvv");
        }
    }


    public void backPage (View view ) {
        Intent backOrder = new Intent(this, OrderDetails.class);
        startActivity(backOrder);
    }
    public void nextPage (View view) {
        Intent paymentIntent = new Intent(this, PaymentSucceed.class);
        startActivity(paymentIntent);
        Toast.makeText(this,"Payment Successful",Toast.LENGTH_LONG).show();
        paymentInfoChecked();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}