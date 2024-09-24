package com.example.pract12;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CommonActivity extends AppCompatActivity {
    private Button backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        backBtn = findViewById(R.id.back);

        Intent intent = getIntent();
        String scriptName = intent.getStringExtra("name");
        String scriptColor = intent.getStringExtra("color");
        int picture = intent.getIntExtra("pic", 0);

        TextView nameTextView = findViewById(R.id.name);
        TextView colorTextView = findViewById(R.id.color);
        ImageView pictureView = findViewById(R.id.image);

        nameTextView.setText(scriptName);
        colorTextView.setText(scriptColor);
        pictureView.setImageResource(picture);

        backBtn.setOnClickListener(v -> {
            super.onBackPressed();
        });
    }

}
