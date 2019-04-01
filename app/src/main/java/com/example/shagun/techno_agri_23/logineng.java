package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class
logineng extends Activity {


    EditText etun,etpass;
    Button lgn;
    TextView tvsignup;

    DatabaseHelper db;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logineng);

        db = new DatabaseHelper(this);


        etun = (EditText)findViewById(R.id.etlgengum);
        etpass =(EditText)findViewById(R.id.rtlgrngpass);
        lgn = (Button)findViewById(R.id.btlogineng);
        tvsignup = (TextView)findViewById(R.id.tvsignupeng);


        lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lgn();
            }
        });

        tvsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsignup();
            }
        });
    }


    public void lgn()
    {
        String urm = etun.getText().toString().trim();
        String upas = etpass.getText().toString().trim();



        boolean res = db.chkuser(urm,upas);

        //session.setLoggedin(true);
        if(res == true)
        {


            Toast.makeText(this,"Welcome !",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(logineng.this,seasoneng.class);
            startActivity(intent);
            //sp.edit().putBoolean("logged",true).apply();
        }
        else
        {
            Toast.makeText(this,"Wrong Username or Password !",Toast.LENGTH_LONG).show();

        }
    }


    public void  tvsignup()
    {
        Toast.makeText(this,"Redirecting !",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(logineng.this,signupenglish.class);
        startActivity(intent);
    }

}
