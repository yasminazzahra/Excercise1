package com.example.excercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TampilanKontak extends AppCompatActivity {
    TextView tvNama, tvNomor;
    String nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_kontak);

        Bundle bundle = getIntent().getExtras();
        nama = bundle.getString("a");

        tvNama = (TextView) findViewById(R.id.tvKontak);
        tvNomor = (TextView) findViewById(R.id.tvtelepon);

        switch (nama)
        {
            case "Sungjin":
                tvNama.setText("Kim Sungjin");
                tvNomor.setText("08232382887");
                break;
            case "Young K":
                tvNama.setText("Young K");
                tvNomor.setText("083487388239");
                break;
            case "Jae" :
                tvNama.setText("Jae Park");
                tvNomor.setText("08397487232");
                break;
            case "Dowoon" :
                tvNama.setText("Yoon Dowoon");
                tvNomor.setText("089648734882");
                break;
            case"Wonpil":
                tvNama.setText("Kim Wonpil");
                tvNomor.setText("0812239284929");
                break;
            case "Karen":
                tvNama.setText("Anisa .N .A");
                tvNomor.setText("0852238382928233");
                break;
            case "Nataya":
                tvNama.setText("Denise Nataya");
                tvNomor.setText("0853238288924924");
                break;
            case "Sekara":
                tvNama.setText("Sekar Putri");
                tvNomor.setText("0812329382224");
                break;
            case "Jeno":
                tvNama.setText("Lee Jeno");
                tvNomor.setText("089623939923");
                break;
            case "Sungchan":
                tvNama.setText("Sungchannn");
                tvNomor.setText("08248282829292");
                break;
        }
    }
}