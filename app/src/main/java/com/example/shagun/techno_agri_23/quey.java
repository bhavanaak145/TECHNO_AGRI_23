package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class quey extends Activity {


    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quey);

        btn = (Button) findViewById(R.id.btsubmitquery);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vtn();
            }
        });


    }

    public void vtn()
    {
        Toast.makeText(this,"Query Submitted Successfully !",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(quey.this,newtypes.class);
        startActivity(intent);
    }

}
