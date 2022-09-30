package com.example.examenunidad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class escenarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escenarios);
    }

    public void esc1 (View view) {
        Intent sig = new Intent(this, Escenario1.class);
        startActivity(sig);
    }

    public void esc2 (View view) {
        Intent sig = new Intent(this, Escenario2.class);
        startActivity(sig);
    }

    public void esc3 (View view) {
        Intent sig = new Intent(this, Escenario3.class);
        startActivity(sig);
    }
}