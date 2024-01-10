 package com.rathoreraja.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView cardView=findViewById(R.id.cardView);
        cardView.setRadius(11.0f);
        cardView.setCardElevation(11.0f);

    }
}