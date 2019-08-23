package com.stationdomain.ejemplo01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvUno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUno = findViewById(R.id.tvUno);
    }

    public void irSiguiente(View view){

        Intent intent = new Intent(this, DosActivity.class);
        startActivity(intent);
        finish();

        Log.i("MainActivity","Onclick");

        Toast.makeText(this, "Onclick", Toast.LENGTH_SHORT).show();

        tvUno.setText("Actividad Uno");
    }
}
