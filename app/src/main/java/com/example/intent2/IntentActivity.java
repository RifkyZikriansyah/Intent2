package com.example.intent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        // TODO AUTO-GENERATED METHOD STUB
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);
        final Intent nextpage = new Intent(IntentActivity.this,IntentActivity2.class);

        findViewById(R.id.explicitIntent2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextpage);
            }
        });
    }



}

