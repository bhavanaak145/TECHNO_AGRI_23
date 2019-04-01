package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button bteng,btmar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bteng = (Button)findViewById(R.id.btenglish);
        btmar = (Button)findViewById(R.id.btmarathi);


        bteng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bteng();
            }
        });


        btmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btmar();
            }
        });
    }


    public  void bteng()
    {
        Toast.makeText(this,"You have selected English !",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,logineng.class);
        startActivity(intent);
    }


    public void btmar()
    {

        Toast.makeText(this,"तू निवडला आहेस मराठी !",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,loginmar.class);
        startActivity(intent);

    }
}
