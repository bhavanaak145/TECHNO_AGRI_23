package com.example.shagun.techno_agri_23;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class District extends Activity {


    Spinner spinner;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district);


        spinner = (Spinner) findViewById(R.id.spinnerdist);
        txt = (TextView) findViewById(R.id.tvdist);


        List<String> list = new ArrayList<String>();
        list.add("Select Talukas !");
        list.add("Akkalkot");
        list.add("Karmala");
        list.add("Pandharpur");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i) {
                    case 1:
                        txt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(District.this, newtypes.class);
                                startActivity(intent);
                            }
                        });
                        break;

                    case 2:
                        txt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(District.this, newtypes1.class);
                                startActivity(intent);
                            }
                        });
                        break;


                    case 3:

                        txt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(District.this, newtype2.class);
                                startActivity(intent);
                            }
                        });
                        break;
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}

