package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class o1 extends Activity {

    TextView oatsnet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o1);

        oatsnet = (TextView)findViewById(R.id.oatsnext);

        oatsnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(o1.this,o2.class);
                startActivity(intent);
            }
        });
    }

}
