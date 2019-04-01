package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class b1 extends Activity {


    TextView bnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1);


        bnext = (TextView)findViewById(R.id.banananext);

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(b1.this,b2.class);
                startActivity(intent);
            }
        });
    }

}
