package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class sugarcanenext extends Activity {

    TextView tvsugarprod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugarcanenext);


        tvsugarprod = (TextView)findViewById(R.id.tvsugarprod);

        tvsugarprod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsugarprod();
            }
        });
    }

    public void tvsugarprod()

    {
        Intent intent = new Intent(sugarcanenext.this, sugar1.class);
        startActivity(intent);
    }
}
