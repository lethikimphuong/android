package com.example.logintest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Intent intent = getIntent();
        String usernameStr = intent.getStringExtra(name:"username");
        TextView usernameTV = findViewById(R.id.usernameET);
        usernameTV.setText(usernameStr);
    }
}