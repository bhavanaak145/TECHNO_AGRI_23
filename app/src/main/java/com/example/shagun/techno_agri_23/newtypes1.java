package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class newtypes1 extends Activity {


    TextView c,q,s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newtypes1);

        s = (TextView)findViewById(R.id.spk);
        c = (TextView)findViewById(R.id.ck);
        q = (TextView)findViewById(R.id.query);


        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(newtypes1.this,spk.class);
                startActivity(intent);
            }
        });


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(newtypes1.this,ck.class);
                startActivity(intent);

            }
        });


        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent intent = new Intent(newtypes1.this,quey.class);
                 startActivity(intent);
            }
        });
    }

}
