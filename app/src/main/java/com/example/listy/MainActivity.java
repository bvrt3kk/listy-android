package com.example.listy;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> jezykiArrayList;
    private ArrayAdapter<String> arrayAdapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        jezykiArrayList = new ArrayList<>();
        jezykiArrayList.add("Perl");
        jezykiArrayList.add("Ruby");
        jezykiArrayList.add("Kotlin");
        jezykiArrayList.add("Go");
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, jezykiArrayList);
        listView = findViewById(R.id.listViewJezyki);
        listView.setAdapter(arrayAdapter);
    }
}