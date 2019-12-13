package com.example.dzikir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int dzikir = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void view(int num) {
        TextView view = findViewById(R.id.view);
        view.setText(String.valueOf(num));
    }

    public void tambah(View view) {
        dzikir = dzikir + 1;
        view(dzikir);
    }

    public void reset(View view) {
        dzikir = 0;
        view(dzikir);
    }
}
