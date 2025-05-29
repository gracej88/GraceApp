package com.example.graceapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KalkulatorGrace extends AppCompatActivity {
    EditText edtNilaiPertama, edtNilaiKedua;
    Button btnTambah, btnKali, btnBagi;
    TextView txvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator_grace);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edtNilaiPertama = findViewById(R.id.edtNilaiPertama);
        edtNilaiKedua = findViewById(R.id.edtNilaiKedua);
        btnTambah = findViewById(R.id.btnTambah);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        txvHasil = findViewById(R.id.txvHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double a = Double.parseDouble(edtNilaiPertama.getText().toString());
                double b = Double.parseDouble(edtNilaiKedua.getText().toString());
                txvHasil.setText (String.valueOf (a + b));
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double a = Double.parseDouble(edtNilaiPertama.getText().toString());
                double b = Double.parseDouble(edtNilaiKedua.getText().toString());
                txvHasil.setText(String.valueOf (a * b));
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double a = Double.parseDouble(edtNilaiPertama.getText().toString());
                double b = Double.parseDouble(edtNilaiKedua.getText().toString());
                txvHasil.setText(String.valueOf (a / b));
            }
        });
    }
}
