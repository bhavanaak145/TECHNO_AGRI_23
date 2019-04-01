package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class seasoneng extends Activity {


    Button kharif,rabi,zaid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasoneng);


        kharif = (Button)findViewById(R.id.bt1season);
        rabi = (Button)findViewById(R.id.bt2season2);
        zaid = (Button)findViewById(R.id.bt3season);


        kharif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                kharif();
            }
        });


        rabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rabi();
            }
        });



        zaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zaid();
            }
        });

    }

    public void kharif()
    {
        Toast.makeText(this,"You have selected Kharif Season !",Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(seasoneng.this,District.class);
        startActivity(intent);
    }

    public void rabi()
    {
        Toast.makeText(this,"You have selected Rabi Season !",Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(seasoneng.this,District.class);
        startActivity(intent);
    }

    public void zaid() {
        Toast.makeText(this, "You have selected Zaid Season !", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(seasoneng.this, District.class);
        startActivity(intent);

    }
}
