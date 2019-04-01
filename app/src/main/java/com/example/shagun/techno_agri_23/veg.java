package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class veg extends Activity {


    TextView tvo,tvt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg);


        tvo = (TextView)findViewById(R.id.tvo);
        tvt = (TextView)findViewById(R.id.tvtam);

        tvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvo();
            }
        });


        tvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvt();
            }
        });
    }

    public void tvo()
    {
        Intent intent = new Intent(veg.this,veg.class);
        startActivity(intent);

    }
    public void tvt()
    {
        Intent intent = new Intent(veg.this,tomato.class);
        startActivity(intent);

    }

}
