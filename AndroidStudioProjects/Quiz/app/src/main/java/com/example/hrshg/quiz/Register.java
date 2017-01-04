package com.example.hrshg.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Config;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;


public class Register extends AppCompatActivity {
    public static final String FIREBASE_URL = "https://my-first-firebase-app-26981.firebaseio.com/";
    public EditText name,age,email;
    public Button b1;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mDatabase = FirebaseDatabase.getInstance().getReference();

        b1 = (Button) findViewById(R.id.button5);
        name = (EditText) findViewById(R.id.editText);
        age = (EditText) findViewById(R.id.editText1);
        email = (EditText) findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String n = name.getText().toString();
                final String a = age.getText().toString();
                final String e = email.getText().toString();
                //Toast.makeText(this, "Posting...", Toast.LENGTH_SHORT).show();
                //final String userId = getUid();
                //String key = mDatabase.child("Person").push().getKey();

                //Map<String, String> postValues = new HashMap<>();
                //postValues.put("name", n);
                //postValues.put("age", a)
                //Map<String, Object> childUpdates = new HashMap<>();
                //childUpdates.put("/posts/" + key, postValues);
                //childUpdates.put("/user-posts/" + userId + "/" + key, postValues);

                //mDatabase.updateChildren(childUpdates);

                mDatabase.child("Person").child("name").push().setValue(n);
                mDatabase.child("Person").child("age").push().setValue(a);
                mDatabase.child("Person").child("email").push().setValue(e);
                //finishActivity(1);
                Intent i = new Intent(getApplicationContext(),Question1.class);

                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(Register.this, MainActivity.class));
        finish();

    }


    }

