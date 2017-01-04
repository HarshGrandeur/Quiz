package com.example.hrshg.quiz;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Question1 extends AppCompatActivity {
    Button b1,b2,b3;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                AlertDialog alertDialog = new AlertDialog.Builder(v.getContext()).create(); //Read Update
                alertDialog.setTitle("Alert!!!");
                alertDialog.setMessage("Well done!!!");
                MainActivity.answers++;


                alertDialog.show();
                finishActivity(1);//<-- See This!
                Intent i = new Intent(getApplicationContext(),Question2.class);

                startActivity(i);
            }
        });

        b2=(Button)findViewById(R.id.button3);
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                AlertDialog alertDialog = new AlertDialog.Builder(v.getContext()).create(); //Read Update
                alertDialog.setTitle("Alert!!!");
                alertDialog.setMessage("Wrong Answer!!!");



                alertDialog.show();
                finishActivity(1);//<-- See This!
                Intent i = new Intent(getApplicationContext(),Question2.class);

                startActivity(i);
            }
        });

        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                AlertDialog alertDialog = new AlertDialog.Builder(v.getContext()).create(); //Read Update
                alertDialog.setTitle("Alert!!!");
                alertDialog.setMessage("Wrong Answer!!!");



                alertDialog.show();
                finishActivity(1);//<-- See This!
                Intent i = new Intent(getApplicationContext(),Question2.class);

                startActivity(i);
            }
        });
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(Question1.this, MainActivity.class));
        finish();

    }

}
