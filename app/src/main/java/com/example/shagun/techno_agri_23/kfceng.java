package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class kfceng extends Activity {

    TextView tvBaj,tvs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kfceng);


        tvBaj = (TextView)findViewById(R.id.tvbajara);
        tvs = (TextView)findViewById(R.id.tvcrice);

        tvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvs();
            }
        });



        tvBaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvBaj();
            }
        });


    }



    public void tvs()
    {
        Toast.makeText(this,"In Cereals welcome to Sugarcane",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(kfceng.this,sugarcane.class);
        startActivity(intent);
    }

    public void tvBaj()
    {
        Toast.makeText(this,"In Cereals welcome to Bajra",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(kfceng.this,bajara.class);
        startActivity(intent);
    }

}
