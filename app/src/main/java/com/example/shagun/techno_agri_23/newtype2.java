package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class newtype2 extends Activity {

    TextView carrot,oats,queryr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newtype2);


        carrot = (TextView)findViewById(R.id.carrottv);
        oats = (TextView)findViewById(R.id.Oatsrabi);
        queryr = (TextView)findViewById(R.id.queryrabi);

        carrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(newtype2.this,c1.class);
                startActivity(intent);
            }
        });

        oats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(newtype2.this,o1.class);
                startActivity(intent);
            }
        });

        queryr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(newtype2.this,quey.class);
                startActivity(intent);
            }
        });

    }

}
