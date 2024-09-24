package com.example.pract12;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<script> scripts = new ArrayList<script>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        scriptAdapter.OnStateClickListener stateClickListener = new scriptAdapter.OnStateClickListener() {
            @Override
            public void onStateClick(script script, int position) {

                onscriptClick(script, position);
            }
        };

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        scriptAdapter adapter = new scriptAdapter(stateClickListener,this, scripts);
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){
        scripts.add(new script("Амнезия", "Заставьврага забыться", R.drawable.script1));
        scripts.add(new script("Киберпсихоз", "Я психованный бегите", R.drawable.script3));
        scripts.add(new script("Перезагрузка", "Пусть ещё подумают", R.drawable.script2));
        scripts.add(new script("Амнезия", "Заставьврага забыться", R.drawable.script1));
        scripts.add(new script("Киберпсихоз", "Я психованный бегите", R.drawable.script3));
        scripts.add(new script("Перезагрузка", "Пусть ещё подумают", R.drawable.script2));
        scripts.add(new script("Амнезия", "Заставьврага забыться", R.drawable.script1));
        scripts.add(new script("Киберпсихоз", "Я психованный бегите", R.drawable.script3));
        scripts.add(new script("Перезагрузка", "Пусть ещё подумают", R.drawable.script2));
    }

    public void onscriptClick(script script, int position) {
        Intent intent = new Intent(MainActivity.this, CommonActivity.class);

        intent.putExtra("pic",script.getPicResource());
        intent.putExtra("name", script.getName());
        intent.putExtra("color", script.getColor());

        startActivity(intent);
    }

}