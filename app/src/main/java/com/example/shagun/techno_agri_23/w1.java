package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class w1 extends Activity {


    TextView wnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w1);



        wnext = (TextView)findViewById(R.id.wheatnext);

        wnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(w1.this,w2.class);
                startActivity(intent);
            }
        });
    }

}
