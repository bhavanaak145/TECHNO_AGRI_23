package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class bajara extends Activity {

    TextView go;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bajara);


        go = (TextView)findViewById(R.id.tvbajarac);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go();
            }
        });


    }

    public void go()
    {
        Intent intent = new Intent(bajara.this,bajara2.class);
        startActivity(intent);

    }

}
