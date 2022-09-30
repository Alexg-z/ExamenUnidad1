package com.example.examenunidad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText txUsr, txPsw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txUsr = (EditText) findViewById(R.id.txtUsr);
        txPsw = (EditText) findViewById(R.id.txtPsw);
    }

    public void login (View view) {
        Intent escenarios = new Intent(this, escenarios.class);
        startActivity(escenarios);
    }
}