package com.example.intent2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class IntentActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        // TODO AUTO-GENERATED METHOD STUB
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent4);
        final Intent nextpage = new Intent(IntentActivity3.this,IntentActivity4.class);

        findViewById(R.id.explicitIntent4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextpage);
            }
        });
    }



}