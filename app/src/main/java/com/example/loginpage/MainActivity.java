package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.PrimitiveIterator;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login (View view){
            Button buttonLogin= (Button) findViewById(R.id.buttonLogin);
            EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
            EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);

            if (editTextEmail.getText().toString().equals("fatimenur@akdeniz.edu.tr") && editTextPassword.getText().toString().equals("abcd")){
                        Intent i = new Intent(MainActivity.this, afterlogin.class);
                        i.putExtra("id",editTextEmail.getText().toString());
                        startActivity(i);
            }else{
                        //Toast.makeText(getApplicationContext(),"Wrong name or password",Toast.LENGTH_SHORT).show();
                        TextView textViewYazdir = (TextView) findViewById(R.id.textViewYazdir);
                        textViewYazdir.setText("username or password wrong!!") ;
            }
    }
}

