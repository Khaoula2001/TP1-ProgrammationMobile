package com.emsi.tp1_mobile_aitbelmehdi_khaoula;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String nom = getIntent().getStringExtra("nom");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        String genre = getIntent().getStringExtra("genre");
        String ville = getIntent().getStringExtra("ville");

        TextView textNom = findViewById(R.id.nom);
        TextView textEmail = findViewById(R.id.email);
        TextView textPhone = findViewById(R.id.phone);
        TextView textVille = findViewById(R.id.textView7);
        TextView textGenre = findViewById(R.id.textView8);

        textNom.setText(nom);
        textEmail.setText(email);
        textPhone.setText(phone);
        textVille.setText(ville);
        textGenre.setText(genre);
    }
}