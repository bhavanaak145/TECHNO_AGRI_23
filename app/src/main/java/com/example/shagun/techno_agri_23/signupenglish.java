package com.example.shagun.techno_agri_23;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signupenglish extends Activity {

    private EditText name,mob,aadhar,state,dist,tal,username,userpassword,email;
    private Button register;
    private TextView userlogin;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupenglish);


        db = new DatabaseHelper(this);
        name = (EditText)findViewById(R.id.et3namer);
        mob = (EditText)findViewById(R.id.et4mobr);
        aadhar = (EditText)findViewById(R.id.et5aadharr);
        email = (EditText)findViewById(R.id.et11emailr);
        state = (EditText)findViewById(R.id.et6stater);
        dist = (EditText)findViewById(R.id.et7distr);
        tal = (EditText)findViewById(R.id.et8talr);
        username = (EditText)findViewById(R.id.et9usrnmr);
        userpassword = (EditText)findViewById(R.id.et10passr);
        register = (Button)findViewById(R.id.btregeng);
        userlogin = (TextView)findViewById(R.id.tv2rl);


        userlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blogin();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                regval();
            }
        });

    }

    public  void blogin()
    {
        Toast.makeText(this,"Redirecting !",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(signupenglish.this,logineng.class);
        startActivity(intent);
    }


    private void regval()
    {
        //Boolean result = false;

        String rname = name.getText().toString().trim();
        String rmob = mob.getText().toString().trim();
        String raa = aadhar.getText().toString().trim();
        String emailr = email.getText().toString().trim();
        String rstate = state.getText().toString().trim();
        String rdist = dist.getText().toString().trim();
        String rtal = tal.getText().toString().trim();
        String rumr = username.getText().toString().trim();
        String urpas = userpassword.getText().toString().trim();

        if( (mob.length() ==  10 ) && (aadhar.length() == 12)  )
        {

            long val =  db.adduser(rumr,urpas);
            if(val > 0)
            {
                Toast.makeText(this,"Registered Successfully !",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(signupenglish.this,logineng.class);
                startActivity(intent);
            }
            else
            {
                Toast.makeText(this,"Enter Proper Username & Password to Create !",Toast.LENGTH_LONG).show();
            }

        }
        else
        {
            Toast.makeText(this,"Enter Proper information !",Toast.LENGTH_LONG).show();
        }

    }


}
