package com.example.ryanwilliamconnor.myappportfolio;

import android.os.Bundle;
//import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
//import android.widget.Button;
import android.content.Context;
import android.widget.Toast;

public class myAppPortfolio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        Button appButtonOne = (Button) findViewById(R.id.button);
        appButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Launch the Spotify Streamer app", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button appButtonTwo = (Button) findViewById(R.id.button2);
        appButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Launch the Football Scores app", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button appButtonThree = (Button) findViewById(R.id.button3);
        appButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Launch the Library app", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button appButtonFour = (Button) findViewById(R.id.button4);
        appButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Launch the Build It Bigger app", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button appButtonFive = (Button) findViewById(R.id.button5);
        appButtonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Launch the XYZ Reader app", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button appButtonSix = (Button) findViewById(R.id.button6);
        appButtonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Launch the Capstone: TDB app", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        CharSequence text = "";

        if (view.getId() == R.id.button) {
            text = "This button will launch the Spotify Streamer app";
        }
        else if (view.getId() == R.id.button2) {
            text = "This button will launch the Football Scores app";
        }
        else if (view.getId() == R.id.button3) {
            text = "This button will launch the Library app";
        }
        else if (view.getId() == R.id.button4) {
            text = "This button will launch the Build It Bigger app";
        }
        else if (view.getId() == R.id.button5) {
            text = "This button will launch the XYZ Reader app";
        }
        else if (view.getId() == R.id.button6) {
            text = "This button will launch my capstone project!";
        }

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
