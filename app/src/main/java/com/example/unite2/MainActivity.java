package com.example.unite2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uyg2Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2Activity.class);
        startActivity(i);
    }

    public void uyg4Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg4Activity.class);
        startActivity(i);
    }

    public void SS64GOSTER(View view) {
        Intent i = new Intent(MainActivity.this, SS64Activity.class);
        startActivity(i);
    }

    public void tamamgoster(View view) {

        Intent i = new Intent(MainActivity.this, ss65Activity.class);
        startActivity(i);
    }

    public void uyg8Goster(View view) {
        Intent i = new Intent(MainActivity.this, UYG8Activity.class);
        startActivity(i);
    }

    public void uyg9Goster(View view) {
        Intent i = new Intent(MainActivity.this, UYG9Activity.class);
        startActivity(i);
    }
        public void uyg10goster(View view) {
            Intent i = new Intent(MainActivity.this, uyg10Activity.class);
            startActivity(i);

    }
}

