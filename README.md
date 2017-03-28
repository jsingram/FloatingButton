# FloatingButton
In this project you will learn how to create a Floating Action Button in Android Studio.

# Requirments
In order to use Floating Buttons, you must add the following to your app.Gradel file.

compile 'com.android.support:design:25.3.1'

# Add a floating button to your layout

<android.support.design.widget.FloatingActionButton
        android:id="@+id/fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="10dp"
        app:srcCompat="@android:drawable/ic_dialog_email" />
        
        *Tip*
        Wondering how to change the color of your button? Go into your colors.xml file
        and change "colorAccent" color to your desired color.
        
# Add the java code

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
        
And that's it! If you would like to see a video tutorial on this project, check out the video tutorial on my YouTube channel.
https://youtu.be/3AdSrZZhVnk
