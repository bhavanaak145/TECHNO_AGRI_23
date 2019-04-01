package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class seedp extends Activity {


    TextView soybean,groundnut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seedp);



        soybean = (TextView)findViewById(R.id.soybean);
        groundnut = (TextView)findViewById(R.id.groundnut);

        soybean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soybean();

            }
        });


        groundnut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                groundnut();
            }
        });
    }


    public void soybean()
    {
        Toast.makeText(this,"Selected SeedPlant !",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(seedp.this,bean.class);
        startActivity(intent);
    }

    public void groundnut()
    {
        Toast.makeText(this,"Selected SummerGroundnut !",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(seedp.this,nut.class);
        startActivity(intent);
    }
}
