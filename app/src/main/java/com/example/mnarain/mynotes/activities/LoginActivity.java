package com.example.mnarain.mynotes.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mnarain.mynotes.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginUser(View view) {
        EditText usernameText = (EditText) findViewById(R.id.username);
        EditText passwordText = (EditText) findViewById(R.id.password);
        String username = String.valueOf(usernameText.getText());
        String password = String.valueOf(passwordText.getText());

        String message = null;

        if (username.equals("su") && password.equals("su")) {
            message = "Welcome " + username;
            Intent intent = new Intent(this, DashboardActivity.class);
            intent.putExtra("message", message);
            startActivity(intent);
        } else if (username.isEmpty() && password.isEmpty()) {
            message = "Please enter a username and password.";

            if (!username.equals("su") || !password.equals("su")) {
                message = "The username or password is incorrect";
            }

            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }
}
