package com.example.logintest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText usernameET=findViewById(R.id.usernameET);
    EditText passwordET=findViewById(R.id.passwordET);
    String username=usernameET.getText().toString();
    String password=usernameET.getText().toString();
if(checkIdentity(username,password))
    {
        Intent userIntent= new Intent(packageContext this, UserActivity.class);
        startActivity(userIntent);
    }
else{
        Toast.makeText(context: this, text"Wrong username & password",Toast.LENGTH_SHORT).show();
    }
private boolean checkIdentity(String username,String password){
 if(username.equals("admin") && password.equals("admin"))
     return true;
 else
     return false;
}
}
