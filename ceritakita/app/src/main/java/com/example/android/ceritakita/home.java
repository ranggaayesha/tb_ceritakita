package com.example.android.ceritakita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onKita(View view) {
            Toast.makeText(this, "Cerita kita semua", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
    }

    public void onKu(View view) {
        Toast.makeText(this, "Aktifitasku", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ListToDoActivity.class);
        startActivity(intent);
    }

}
