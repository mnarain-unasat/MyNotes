package com.example.mnarain.mynotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        TextView welcomeText = (TextView) findViewById(R.id.welcomeMessage);
        welcomeText.setText(message);
    }

}
