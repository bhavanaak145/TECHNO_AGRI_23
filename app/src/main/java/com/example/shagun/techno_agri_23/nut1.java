package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class nut1 extends Activity {
    TextView n1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut1);

        n1 = (TextView)findViewById(R.id.n1);

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nut1.this,nut2.class);
                startActivity(intent);
            }
        });
    }

}
