package com.example.hrshg.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Thanks extends AppCompatActivity {
    TextView thank;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);

        thank = (TextView) findViewById(R.id.msg);
        if(MainActivity.answers>=4)
            thank.setText("Great Work. You answered "+MainActivity.answers+" answers correctly. You stand to win a prize");
        else
            thank.setText("Nice try. You answered "+MainActivity.answers+" answers correctly. Please try again to win a surprise");


        MainActivity.answers=0;
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        //startActivity(new Intent(Thanks.this, MainActivity.class));
        finish();

    }
}
