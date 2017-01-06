package com.example.hrshg.quiz;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class Question1 extends AppCompatActivity {
    Button b1,b2,b3;
    TextView t1;
    int click=0;
    int check=1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        t1=(TextView) findViewById(R.id.textView);
       //t1.setLayoutParams(new RelativeLayout.LayoutParams(200, 100));
        final String[] questions={"Which is the largest continent?",
        "Which is the largest ocean?",
        "The southernmost point of peninsular India, that is, Kanyakumari, is",
        "The territory of Porus who offered strong resistance to Alexander was situated between the rivers of",
        "Which scientist discovered the radioactive element radium?"};
        final String[] option1={"Asia","Indian","North of Tropic Cancer","Jhelum and Chanab","Isaac Newton"};
        final String[] option2={"Africa","Pacific","North of the Equator","Sutlej and Beas","Albert Einsten"};
        final String[] option3={"Antarctica","Arctic","South of the Equator","Ganga and Yamuna","Marie Curie"};
        final HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        hm.put(1,2);
        hm.put(2,2);
        hm.put(3,1);
        hm.put(4,3);


        b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                 check=1;
                if(check==hm.get(click))
                {
                    //b1.setBackgroundColor(Color.GREEN);
                    Toast.makeText(Question1.this, "Correct", Toast.LENGTH_SHORT).show();
//                    AlertDialog alertDialog = new AlertDialog.Builder(v.getContext()).create(); //Read Update
//                    alertDialog.setTitle("Alert!!!");
//                    alertDialog.setMessage("Well done!!!");
//                    alertDialog.show();
                   final  Dialog settingsDialog = new Dialog(Question1.this);
                    settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
                    settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.image_layout
                            , null));
                    settingsDialog.show();

                    final Timer timer2 = new Timer();
                    timer2.schedule(new TimerTask() {
                        public void run() {
                            settingsDialog.dismiss();
                            timer2.cancel(); //this will cancel the timer of the system
                        }
                    }, 2000); // the timer will count 5 seconds....
                    MainActivity.answers++;




                }
                else
                {
                   // b1.setBackgroundColor(Color.RED);
                    Toast.makeText(Question1.this, "Wrong", Toast.LENGTH_SHORT).show();
                    final Dialog settingsDialog = new Dialog(Question1.this);
                    settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
                    settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.image_layout
                            , null));
                    settingsDialog.show();
                    final Timer timer2 = new Timer();
                    timer2.schedule(new TimerTask() {
                        public void run() {
                            settingsDialog.dismiss();
                            timer2.cancel(); //this will cancel the timer of the system
                        }
                    }, 2000); // the timer will count 5 seconds....

//
//                    AlertDialog alertDialog = new AlertDialog.Builder(v.getContext()).create(); //Read Update
//                    alertDialog.setTitle("Alert!!!");
//                    alertDialog.setMessage("Wrong Answer!!!");
//                    alertDialog.show();

                }
                //b1.setBackgroundColor(Color.GREEN);





                //
                click++;
                if(click==5)
                {
                    click=0;
                    Intent i = new Intent(getApplicationContext(),Thanks.class);
                    startActivity(i);
                    finish();
                    return;
                }else {


                    t1.setText(questions[click]);
                    b1.setText(option1[click]);
                    b2.setText(option2[click]);
                    b3.setText(option3[click]);
                }

                //finishActivity(img1);//<-- See This!
                //Intent i = new Intent(getApplicationContext(),Question2.class);

                //startActivity(i);
                //finish();
            }
        });

        b2=(Button)findViewById(R.id.button3);
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                check=2;
                if(check==hm.get(click))
                {
                   // b2.setBackgroundColor(Color.GREEN);
                    final Dialog settingsDialog = new Dialog(Question1.this);
                    settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
                    settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.image_layout
                            , null));
                    settingsDialog.show();
                    final Timer timer2 = new Timer();
                    timer2.schedule(new TimerTask() {
                        public void run() {
                            settingsDialog.dismiss();
                            timer2.cancel(); //this will cancel the timer of the system
                        }
                    }, 2000); // the timer will count 5 seconds....
                    Toast.makeText(Question1.this, "Correct", Toast.LENGTH_SHORT).show();
//                    AlertDialog alertDialog = new AlertDialog.Builder(v.getContext()).create(); //Read Update
//                    alertDialog.setTitle("Alert!!!");
//                    alertDialog.setMessage("Well done!!!");
//                    alertDialog.show();
                    MainActivity.answers++;

                }
                else
                {
                   // b2.setBackgroundColor(Color.RED);
                    Toast.makeText(Question1.this, "Wrong", Toast.LENGTH_SHORT).show();
//                    AlertDialog alertDialog = new AlertDialog.Builder(v.getContext()).create(); //Read Update
//                    alertDialog.setTitle("Alert!!!");
//                    alertDialog.setMessage("Wrong Answer!!!");
//                    alertDialog.show();
                    final Dialog settingsDialog = new Dialog(Question1.this);
                    settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
                    settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.image_layout
                            , null));
                    settingsDialog.show();

                    final Timer timer2 = new Timer();
                    timer2.schedule(new TimerTask() {
                        public void run() {
                            settingsDialog.dismiss();
                            timer2.cancel(); //this will cancel the timer of the system
                        }
                    }, 2000); // the timer will count 5 seconds....

                }



                //alertDialog.show();
                click++;
                if(click==5)
                {
                    click=0;
                    Intent i = new Intent(getApplicationContext(),Thanks.class);

                    startActivity(i);
                    finish();
                    return;
                }

                t1.setText(questions[click]);
                b1.setText(option1[click]);
                b2.setText(option2[click]);
                b3.setText(option3[click]);

            }
        });

        b3=(Button)findViewById(R.id.button4);
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                check=3;

                if(check==hm.get(click))
                {
                   // b3.setBackgroundColor(Color.GREEN);
                    Toast.makeText(Question1.this, "Correct", Toast.LENGTH_SHORT).show();
//                    AlertDialog alertDialog = new AlertDialog.Builder(v.getContext()).create(); //Read Update
//                    alertDialog.setTitle("Alert!!!");
//                    alertDialog.setMessage("Well done!!!");
//                    alertDialog.show();
                    MainActivity.answers++;
                    final Dialog settingsDialog = new Dialog(Question1.this);
                    settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
                    settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.image_layout
                            , null));
                    settingsDialog.show();

                    final Timer timer2 = new Timer();
                    timer2.schedule(new TimerTask() {
                        public void run() {
                            settingsDialog.dismiss();
                            timer2.cancel(); //this will cancel the timer of the system
                        }
                    }, 2000); // the timer will count 5 seconds....

                }
                else
                {
                    //b3.setBackgroundColor(Color.RED);
//                    AlertDialog alertDialog = new AlertDialog.Builder(v.getContext()).create(); //Read Update
//                    alertDialog.setTitle("Alert!!!");
//                    alertDialog.setMessage("Wrong Answer!!!");
//                    alertDialog.show();
                    Toast.makeText(Question1.this, "Wrong", Toast.LENGTH_SHORT).show();
                    final Dialog settingsDialog = new Dialog(Question1.this);
                    settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
                    settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.image_layout
                            , null));
                    settingsDialog.show();

                    final Timer timer2 = new Timer();
                    timer2.schedule(new TimerTask() {
                        public void run() {
                            settingsDialog.dismiss();
                            timer2.cancel(); //this will cancel the timer of the system
                        }
                    }, 2000); // the timer will count 5 seconds....


                }


                click++;
                if(click==5)
                {
                    click=0;
                    Intent i = new Intent(getApplicationContext(),Thanks.class);

                    startActivity(i);
                    finish();
                    return;
                }


                t1.setText(questions[click]);
                b1.setText(option1[click]);
                b2.setText(option2[click]);
                b3.setText(option3[click]);

            }
        });
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        //startActivity(new Intent(Question1.this, MainActivity.class));
        finish();

    }

    // Check screen orientation or screen rotate event here
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen for landscape and portrait
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
           // setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
            //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }

}
