package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class newtypes extends Activity {

    TextView sp,c,q;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newtypes);


        sp =(TextView)findViewById(R.id.seedplants);
        c = (TextView)findViewById(R.id.cereals);
        q = (TextView)findViewById(R.id.query);


        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(newtypes.this,seedp.class);
                startActivity(intent);
            }
        });


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(newtypes.this,kfceng.class);
                startActivity(intent);
            }
        });


        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(newtypes.this,quey.class);
                startActivity(intent);
            }
        });

    }

}
