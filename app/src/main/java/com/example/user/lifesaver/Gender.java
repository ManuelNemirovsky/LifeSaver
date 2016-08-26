package com.example.user.lifesaver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Gender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        ImageButton ibtnMale = (ImageButton)findViewById(R.id.ibtnMale);
        ImageButton ibtnFemale = (ImageButton)findViewById(R.id.ibtnMale);

        ibtnMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Gender.this , Age.class));
            }
        });

        ibtnFemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Gender.this , Age.class));
            }
        });

    }
}
