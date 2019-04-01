package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class typesofcropsinkharif extends Activity {
    TextView kfc,kfs,kfv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typesofcropsinkharif);



        kfc=(TextView)findViewById(R.id.tvkc);
        kfs=(TextView)findViewById(R.id.tvseedkharif);

        //kgf=(TextView)findViewById(R.id.tvfruitskharif);




        kfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kfc();
            }
        });


        kfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kfs();
            }
        });

        kfv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kfv();
            }
        });

    }




    public void kfv()
    {

        Toast.makeText(this,"Selected Vegetables !",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(typesofcropsinkharif.this,quey.class);
        startActivity(intent);

    }

    public void kfs()
    {
        Toast.makeText(this,"Selected SeedPlants !",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(typesofcropsinkharif.this,seedp.class);
        startActivity(intent);
    }






    public void kfc()
    {
        Toast.makeText(this,"selected Cereals !",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(typesofcropsinkharif.this,kfceng.class);
        startActivity(intent);

    }

}

