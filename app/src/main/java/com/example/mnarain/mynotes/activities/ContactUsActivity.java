package com.example.mnarain.mynotes.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.mnarain.mynotes.R;

public class ContactUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Intent intent = null;
        //noinspection SimplifiableIfStatement

        switch (item.getItemId()) {
            case R.id.aboutUs:
                intent = new Intent(this, AboutUsActivity.class);
                break;
            case R.id.contactUs:
                intent = new Intent(this, ContactUsActivity.class);
                break;
            case R.id.logoutUser:
                intent = new Intent(this, LoginActivity.class);
                break;
        }

        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
