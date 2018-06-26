package com.example.android.cookies;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Make the eatMore button visible
        Button eatMore = findViewById(R.id.eat_again);
        eatMore.setVisibility(eatMore.INVISIBLE);

    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.

        ImageView cookie = findViewById(R.id.android_cookie_image_view);
        cookie.setImageResource(R.drawable.after_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView status = findViewById(R.id.status_text_view);
        status.setText("I'm so full");

        //Make the eatMore button visible
        Button eatMore = findViewById(R.id.eat_again);
        eatMore.setVisibility(eatMore.VISIBLE);

        //Make the eatCookies button invisible
        Button eatCookie = findViewById(R.id.eat_cookie);
        eatCookie.setVisibility(eatCookie.INVISIBLE);



    }

    public void eatMore (View view){
         //Bring back the before the cookie image and text

        ImageView cookie = findViewById(R.id.android_cookie_image_view);
        cookie.setImageResource(R.drawable.before_cookie);

        TextView status = findViewById(R.id.status_text_view);
        status.setText("I'm so hungry");

        //Make the eatCookie button visible

        Button eatCookie = findViewById(R.id.eat_cookie);
        eatCookie.setVisibility(eatCookie.VISIBLE);

        //Make the eatMore button invisible
        Button eatMore = findViewById(R.id.eat_again);
        eatMore.setVisibility(eatMore.INVISIBLE);
    }
}