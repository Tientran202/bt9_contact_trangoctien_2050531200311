package com.example.bt9_contact_tranngoctien_2050531200311;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView name, phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        phone = findViewById(R.id.phone);
        name = findViewById(R.id.name);

        name.setText(intent.getStringExtra("name"));
        phone.setText(intent.getStringExtra("phone"));

    }
}