package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void onClick(View view){

        EditText editText1=findViewById(R.id.editText1); //pound view

        Log.i("Value in Pounds",editText1.getText().toString());

        String amountPound=editText1.getText().toString();
        double amountPoundDouble=Double.parseDouble(amountPound);

        double amountDollarDouble=amountPoundDouble*1.3;
        String amountDollar=String.format("%.2f",amountDollarDouble);

        TextView textView1=findViewById(R.id.textView1);
        textView1.setText(amountDollar + " dollars");


        //Toast.makeText(this, "Amount in Dollars = "+ amountDollar, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

