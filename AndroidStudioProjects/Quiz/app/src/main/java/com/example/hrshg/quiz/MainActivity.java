package com.example.hrshg.quiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
    Button button;
    public static  int answers=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Intent myIntent = new Intent(MainActivity.this, Question1.class);
        //myIntent.putExtra("key", value); //Optional parameters
        //MainActivity.this.startActivity(myIntent);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),Register.class);

                startActivity(i);
            }
        });
    }
}
