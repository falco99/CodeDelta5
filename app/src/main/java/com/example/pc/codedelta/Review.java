package com.example.pc.codedelta;

import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.RatingBar.OnRatingBarChangeListener;

public class Review extends AppCompatActivity {

    RatingBar ratingBar;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        ratingBar  = (RatingBar) findViewById(R.id.ratingBar);
        //ratingBar.setMax(5);
        btn = (Button) findViewById(R.id.button10);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public  void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(Review.this, "Stars: " + v, Toast.LENGTH_SHORT).show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(Review.this,"Stars: " + ratingBar.getRating(), Toast.LENGTH_SHORT).show();
            }
        });

    }


}
