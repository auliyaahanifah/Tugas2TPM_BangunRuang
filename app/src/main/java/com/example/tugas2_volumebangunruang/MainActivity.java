package com.example.tugas2_volumebangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnTabung, btnKubus, btnBalok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTabung = findViewById(R.id.btnTabung);
        btnKubus = findViewById(R.id.btnKubus);
        btnBalok = findViewById(R.id.btnBalok);

        btnTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(MainActivity.this, Tabung.class);
                startActivity(moveIntent);
            }
        });

        btnKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(MainActivity.this, Kubus.class);
                startActivity(moveIntent);
            }
        });

        btnBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(MainActivity.this, Balok.class);
                startActivity(moveIntent);
            }
        });
    }
}