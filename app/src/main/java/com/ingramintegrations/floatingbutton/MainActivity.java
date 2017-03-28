package com.ingramintegrations.floatingbutton;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/*
==================================================
In this project you will learn how to create a
floating action button and have it perform an
action. In this case, go to another activity.
==================================================
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Create a floating action button and hook it to your UI element.
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        //Create an OnClickListener just like you would any other button.
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create an Intent to go to another activity.
                //In this case, we are traveling to SecondActivity.
                Intent goToActivity = new Intent(getApplication(), SecondActivity.class);
                //Call startActivity and pass the Intent you created.
                startActivity(goToActivity);
            }
        });
    }
}
