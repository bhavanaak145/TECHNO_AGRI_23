package com.example.shagun.techno_agri_23;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class sugar1 extends Activity {


    TextView tvarea,tvcal;
    EditText etarea;
    TextView videos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugar1);


        videos=(TextView)findViewById(R.id.textView39);
        videos.setMovementMethod(LinkMovementMethod.getInstance());
        tvcal = (TextView) findViewById(R.id.tvcal);
        tvarea = (TextView)findViewById(R.id.tvarea);
        etarea = findViewById(R.id.etareafarm);



        tvcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvcal();


            }
        });

    }


    @SuppressLint("SetTextI18n")
    public void tvcal()
    {
        //String eta = etarea.getText().toString().trim();
        int val = Integer.parseInt(etarea.getText().toString().trim());

        int sum = 60 * val;

        tvarea.setText(Integer.toString(sum));

    }
}
