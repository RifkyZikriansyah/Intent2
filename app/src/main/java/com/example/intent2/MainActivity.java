package com.example.intent2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button explicitIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         explicitIntent = (Button)findViewById(R.id.explicitIntent);
         explicitIntent.setOnClickListener((View.OnClickListener) this);


    }
    @Override
public void onClick(View v){


        Intent explicitIntent = new Intent(MainActivity.this, IntentActivity.class);
        startActivity(explicitIntent);



    }
}
