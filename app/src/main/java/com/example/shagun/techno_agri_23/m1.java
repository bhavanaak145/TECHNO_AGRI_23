package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.TextView;

public class m1 extends Activity {

    TextView nextm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1);


        nextm = (TextView)findViewById(R.id.mangonext);

        nextm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(m1.this,m2.class);
                startActivity(intent);
            }
        });
    }

}
