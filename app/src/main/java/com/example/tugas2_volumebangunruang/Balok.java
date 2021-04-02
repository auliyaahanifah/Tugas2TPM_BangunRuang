package com.example.tugas2_volumebangunruang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Balok extends AppCompatActivity {

    private Button btnHasil;
    private EditText etPjg, etLebar, etTinggi;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        btnHasil = findViewById(R.id.btnHasil);
        etPjg = findViewById(R.id.etPjg);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        tvHasil = findViewById(R.id.tvHasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    String sPjg = etPjg.getText().toString();
                    String sLebar = etLebar.getText().toString();
                    String sTinggi = etTinggi.getText().toString();

                    double Pjg = Double.parseDouble(sPjg);
                    double Lebar = Double.parseDouble(sLebar);
                    double Tinggi = Double.parseDouble(sTinggi);

                    double hasil = Pjg * Lebar * Tinggi;

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);

                    /*double sPjg = Double.parseDouble(etPjg.getText().toString());
                    double sLebar = Double.parseDouble(etLebar.getText().toString());
                    double sT = Double.parseDouble(etT.getText().toString());

                    double hasil =  sPjg*sLebar*sT;

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);*/
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
