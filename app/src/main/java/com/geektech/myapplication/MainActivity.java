package com.geektech.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> contactList;
    private ContactAdapter adapter;

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_contacts);
        loadData();
        adapter = new ContactAdapter(contactList);
        recyclerView.setAdapter(adapter);


    }

    private void loadData() {
        contactList = new ArrayList<>();
        contactList.add("Кыргызстан");
        contactList.add("Россия");
        contactList.add("Сша");
        contactList.add("Африка");
        contactList.add("Канада");
        contactList.add("Казахстан");
        contactList.add("Афганистан");
        contactList.add("Армамяния");
        contactList.add("Украина");
        contactList.add("Япония");
        contactList.add("Германия");
        contactList.add("Узбекистан");
        contactList.add("Италия");
        contactList.add("Израиль");
    }
}

