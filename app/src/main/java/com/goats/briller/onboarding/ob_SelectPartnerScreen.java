package com.goats.briller.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.goats.briller.R;

public class ob_SelectPartnerScreen extends AppCompatActivity {

    Button dog_button;
    Button cat_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ob_select_partner_screen);

        dog_button = findViewById(R.id.f2_dog_button);
        cat_button = findViewById(R.id.f2_cat_button);

        dog_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ob_selected_dog.class);

                startActivity(intent);
            }
        });

        cat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ob_selected_cat.class);

                startActivity(intent);
            }
        });
    }
}