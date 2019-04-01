package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class sugarcane extends AppCompatActivity {


    TextView tvsgrnext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugarcane);


        tvsgrnext = (TextView)findViewById(R.id.tvsugarcanenext);
        tvsgrnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsgrnext();
            }
        });
    }


    public void tvsgrnext()
    {
        Intent intent = new Intent(sugarcane.this,sugarcanenext.class);
        startActivity(intent);
    }

}
