package com.acrony.ratingbarjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RatingBar ratingBar;
Button btnCLick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar=(RatingBar)findViewById(R.id.ratingBar);

        btnCLick=(Button)findViewById(R.id.btnClick);

        btnCLick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating=String.valueOf(ratingBar.getRating());

                Toast.makeText(getApplicationContext(),rating,Toast.LENGTH_LONG).show();
            }
        });

    }
}
