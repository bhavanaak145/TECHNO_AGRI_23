package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class ck extends Activity {


    TextView wheat,jowar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ck);



        wheat = (TextView)findViewById(R.id.wheat);
        jowar = (TextView)findViewById(R.id.jowar);


        wheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ck.this,w1.class);
                startActivity(intent);
            }
        });


        jowar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ck.this,j1.class);
                startActivity(intent);
            }
        });

    }

}
