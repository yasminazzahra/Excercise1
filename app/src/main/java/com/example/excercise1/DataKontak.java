package com.example.excercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;

import java.util.ArrayList;

public class DataKontak extends AppCompatActivity {
    private ListView list;
    private ListViewAdapter adapter;
    String[] listNama;
    public static ArrayList<ClassNaam>classNamaArrayList = new ArrayList();
    Bundle bundle = new Bundle();
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_kontak);

        listNama = new String[]{"Sungjin", "Young K", "Jae", "Dowoon","Wonpil", "Karen", "Nataya", "Sekara", "Jeno", "Sungchan"};
        list = findViewById(R.id.ListKontak);
        classNamaArrayList = new ArrayList<>();
        for (int i = 0; i < listNama.length; i++) {
            ClassNaam classNama = new ClassNaam(listNama[i]);
            classNamaArrayList.add(classNama);
        }
        adapter = new ListViewAdapter(this);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nama = classNamaArrayList.get(position).getNama();
                bundle.putString("a", nama.trim());
                PopupMenu pm = new PopupMenu(getApplicationContext(), view);
                pm.inflate(R.menu.popupmenu);
                pm.show();
            }
        });

    }
}