package com.example.shagun.techno_agri_23;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class bean2 extends Activity {


    EditText etb;
    TextView tvpdg,tvcal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bean2);
        etb = (EditText)findViewById(R.id.etb);
        tvpdg = (TextView)findViewById(R.id.tvpdg);
        tvcal = (TextView)findViewById(R.id.tvcal);

        tvcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int val = Integer.parseInt(etb.getText().toString().trim());

                int sum = 4900 * val;

                tvpdg.setText(Integer.toString(sum) kg);

            }
        });

    }

}
