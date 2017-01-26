package com.example.mnarain.mynotes.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.mnarain.mynotes.R;

import static com.example.mnarain.mynotes.util.MenuUtil.getSelectedItemIntent;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        startActivity(getSelectedItemIntent(this, item.getItemId()));
        return true;
    }

}
