package com.example.loginapp;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void handleText(View v){
        EditText userName =findViewById(R.id.username);
        String usernameInput=userName.getText().toString();
        ((TextView)findViewById(R.id.usernameOutput)).setText(usernameInput);

        EditText email=findViewById(R.id.email);
        String emailInput=email.getText().toString();
        ((TextView)findViewById(R.id.emailOutput)).setText(emailInput);

        EditText phone =findViewById(R.id.phone);
        String phoneInput=phone.getText().toString();
        ((TextView)findViewById(R.id.phoneOutput)).setText(phoneInput);

        EditText city =findViewById(R.id.city);
        String cityInput=city.getText().toString();
        ((TextView)findViewById(R.id.cityOutput)).setText(cityInput);

        EditText passWord =findViewById(R.id.password);
        String passwordInput=passWord.getText().toString();
        ((TextView)findViewById(R.id.passwordOutput)).setText(passwordInput);

        Toast.makeText(this,"Thank you!", Toast.LENGTH_LONG).show();
    }
}