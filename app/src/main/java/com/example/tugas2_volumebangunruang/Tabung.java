package com.example.tugas2_volumebangunruang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tabung extends AppCompatActivity {

    private Button btnHasil;
    private EditText etR, etTinggi;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        btnHasil = findViewById(R.id.btnHasil);
        etR = findViewById(R.id.etR);
        etTinggi = findViewById(R.id.etTinggi);
        tvHasil = findViewById(R.id.tvHasil);

        btnHasil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    String sR = etR.getText().toString();
                    String sTinggi = etTinggi.getText().toString();

                    double R = Double.parseDouble(sR);
                    double tinggi = Double.parseDouble(sTinggi);

                    double hasil = 3.14*R*R*tinggi;

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
