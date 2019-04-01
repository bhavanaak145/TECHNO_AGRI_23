package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class spk extends Activity {


    TextView mango,banana,queryspk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spk);



        mango = (TextView)findViewById(R.id.mangospk);

        banana =(TextView)findViewById(R.id.bananspk);

        queryspk = (TextView)findViewById(R.id.queryspk);


        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(spk.this,m1.class);
                startActivity(intent);
            }
        });


        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(spk.this,b1.class);
                startActivity(intent);
            }
        });

        queryspk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(spk.this,quey.class);
                startActivity(intent);
            }
        });

    }

}
