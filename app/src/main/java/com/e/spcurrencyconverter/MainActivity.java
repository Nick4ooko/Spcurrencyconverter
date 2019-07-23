package com.e.spcurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    String[] currency = {"Kenyashillings", "USdollars", "Euro"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting the instance of Spinner and applying OnItemSelectedListener on i

        Spinner spinspinner =(Spinner) findViewById(R.id.sp_select_id);
        spinspinner.setOnItemSelectedListener(this);

        Spinner jugglespinner =(Spinner) findViewById(R.id.sp_choose_id);
        jugglespinner.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,currency);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Setting the ArrayAdapter data on the Spinner

        spinspinner.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),currency[position] , Toast.LENGTH_LONG).show();

    }




    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }



}
