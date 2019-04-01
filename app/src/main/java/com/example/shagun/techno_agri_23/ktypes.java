package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ktypes extends Activity {


    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ktypes);




        btn =(Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ktp();
            }
        });
    }


    public void ktp()
    {
        Toast.makeText(this,"Types of Crops in kharif Season  !",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ktypes.this,newtypes.class);
        startActivity(intent);
    }
}
