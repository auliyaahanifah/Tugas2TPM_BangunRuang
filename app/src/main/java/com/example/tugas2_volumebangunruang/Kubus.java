package com.example.tugas2_volumebangunruang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kubus extends AppCompatActivity {

    private Button btnHasil;
    private EditText etSisi;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        btnHasil = findViewById(R.id.btnHasil);
        etSisi = findViewById(R.id.etSisi);
        tvHasil = findViewById(R.id.tvHasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sSisi = etSisi.getText().toString();

                    double sisi = Double.parseDouble(sSisi);

                    double hasil = sisi * sisi * sisi;

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
