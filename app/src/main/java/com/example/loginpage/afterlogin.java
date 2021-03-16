package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.TextView;

public class afterlogin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterlogin);

        TextView textViewYazdir = (TextView) findViewById(R.id.textViewYazdir);
        textViewYazdir.setText("Welcome " + getIntent().getExtras().getString("id"));
    }
}